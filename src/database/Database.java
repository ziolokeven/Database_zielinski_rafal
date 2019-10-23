
package database;

import WyjatekLog.WyjatekLog;
import temp.Temp;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private final Connection db;
    private final Statement st;
    private ResultSet rs;
    private final ArrayList<String> schemas,tables,columns;
    private final HashMap<String,HashMap<String,ArrayList<String>>> table_column_data;
    private final DatabaseMetaData md;
    private String currentScheme;
    

    
    public Database(Temp user) throws ClassNotFoundException,SQLException{
        Class.forName("org.postgresql.Driver");
        try{
            db = DriverManager.getConnection("jdbc:postgresql://"+ user.getIp() +":"+ user.getPort() +"/"+ user.getUsername(), user.getUsername(), user.getPassword());
            //db = DriverManager.getConnection("jdbc:postgresql://195.150.230.210:5434/2019_zielinski_rafal", "2019_zielinski_rafal", "ziolokeven");
        }catch(Exception e){
            throw new WyjatekLog("Nie można zalogować użytkownika : " + user.getUsername(),e);
        }
        st = db.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        schemas = new ArrayList<>();
        tables = new ArrayList<>();
        columns = new ArrayList<>();
        table_column_data= new HashMap<>();
        md = db.getMetaData();
    }
    public void updateData() throws SQLException{
        setTablesName(currentScheme);
        
        //pobieranko danych do kolumn
        for(int i=0; i < tables.size();i++){
            setColumnsName(currentScheme,tables.get(i));
            HashMap<String, ArrayList<String>> tmp = new HashMap<>();
            
            
            for(int j=0; j < columns.size(); j++){
                tmp.put(columns.get(j), setColumnData(currentScheme, tables.get(i), columns.get(j)));
                
            }
            table_column_data.put(tables.get(i), tmp);
            columns.clear();
        }
    }
    private ArrayList<String> setColumnData(String scheme_name, String table_name, String column_name) throws SQLException{
        
        ArrayList<String> data = new ArrayList();
        
        rs = st.executeQuery("SELECT * FROM "+ scheme_name +"." + table_name);
        rs.beforeFirst();
        while(rs.next()){
            data.add(rs.getString(column_name));
        }
        return data;
    }
    private void setColumnsName(String scheme, String table_name) throws SQLException{
        rs = md.getColumns(null, scheme, table_name, "%");
        rs.beforeFirst();
        while(rs.next()){
            columns.add(rs.getString(4));
        }
    }
    private void setTablesName(String scheme) throws SQLException{
        final String[] types = {"TABLE"};
        rs = md.getTables(null, scheme, "%", types);
        rs.beforeFirst();
        while(rs.next()){
            tables.add(rs.getString(3));
        }
    }
    private void setSchemasName() throws SQLException{
        rs = md.getSchemas(null, "%");
        rs.beforeFirst();
        while(rs.next()){
            if(!rs.getString(1).equalsIgnoreCase("pg_catalog") && !rs.getString(1).equalsIgnoreCase("information_schema")){
                schemas.add(rs.getString(1));
            }  
        }
    }
    public void closeConnection() throws SQLException{
        st.close();
        db.close();
        //czyczenie wartosci
        schemas.clear();
        clearArrays();
    }
    public void clearArrays(){
        columns.clear();
        table_column_data.clear();
        tables.clear();
    }
    public void setCurrentScheme(String scheme){
        currentScheme = scheme;
    }
    public String[] getTableNames(){
        return tables.toArray(new String[tables.size()]);
    }
    
    public String[] getColumnsNames(String table_name){
        ArrayList<String> key = new ArrayList<>();
        table_column_data.get(table_name).forEach((k,v) -> key.add(k));
        
        return key.toArray(new String[key.size()]);
    }
    public int getCountTables(){
        return tables.size();
    }
    
    public String[][] getRecords(String table_name, String first_column){
        
        ArrayList<String> key = new ArrayList<>();
        ArrayList<ArrayList<String>> val = new ArrayList<>();
        
        table_column_data.get(table_name).forEach((k,v) -> key.add(k));
        table_column_data.get(table_name).forEach((k,v) -> val.add(v));
        
        int row = key.size();
        int col = val.get(0).size();
                
        String[][] tmp = new String[col][row];
        
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                tmp[i][j] = val.get(j).get(i);
            }
        }

        return tmp;
    }

    public ArrayList<String> getSchemas() {
       
        return schemas;
    }
}
