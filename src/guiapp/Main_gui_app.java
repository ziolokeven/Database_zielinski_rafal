
package guiapp;

import WyjatekLog.WyjatekLog;
import database.Database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mail.MailSender;
import temp.Keep;
import temp.Temp;



/**
 *
 * @author Rafal
 */
public class Main_gui_app extends javax.swing.JFrame {
    
    private Database db;
    private Temp user;
    private Boolean isItemChanged = false;
    
    public Main_gui_app() {
        initComponents();
        disconnect_button.setVisible(false);
        schema_combo_box.removeAllItems();
        schema_combo_box.setVisible(false);
        
        
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        ip_label = new javax.swing.JLabel();
        port_label = new javax.swing.JLabel();
        user_input = new javax.swing.JTextField();
        ip_input = new javax.swing.JTextField();
        port_input = new javax.swing.JTextField();
        password_input = new javax.swing.JPasswordField();
        connect_button = new javax.swing.JButton();
        disconnect_button = new javax.swing.JButton();
        base_panel = new javax.swing.JTabbedPane();
        schema_combo_box = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mail_button = new javax.swing.JButton();
        sender_input = new javax.swing.JTextField();
        addressee_input = new javax.swing.JTextField();
        subject_input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contents_input = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        pass_input = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user_label.setText("Użytkownik:");

        password_label.setText("Hasło:");

        ip_label.setText("Adres IP:");

        port_label.setText("Port:");

        user_input.setText("2019_zielinski_rafal");

        ip_input.setText("195.150.230.210");

        port_input.setText("5434");

        password_input.setText("ziolokeven");
        password_input.setMinimumSize(new java.awt.Dimension(15, 24));

        connect_button.setForeground(new java.awt.Color(51, 255, 0));
        connect_button.setText("Connect");
        connect_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connect_buttonMouseClicked(evt);
            }
        });

        disconnect_button.setBackground(new java.awt.Color(255, 255, 255));
        disconnect_button.setForeground(new java.awt.Color(255, 0, 0));
        disconnect_button.setText("DisConnect");
        disconnect_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconnect_buttonMouseClicked(evt);
            }
        });
        disconnect_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnect_buttonActionPerformed(evt);
            }
        });

        schema_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        schema_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schema_combo_boxActionPerformed(evt);
            }
        });

        jLabel5.setText("Nadawca:");

        jLabel6.setText("Adresat:");

        jLabel8.setText("Temat:");

        jLabel9.setText("Treść:");

        mail_button.setForeground(new java.awt.Color(0, 0, 204));
        mail_button.setText("Wyslij");
        mail_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_buttonActionPerformed(evt);
            }
        });

        sender_input.setText("ziolokevenxxx@gmail.com");
        sender_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sender_inputActionPerformed(evt);
            }
        });

        addressee_input.setText("ronnie1127@onet.pl");

        subject_input.setText("tematix");
        subject_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_inputActionPerformed(evt);
            }
        });

        contents_input.setColumns(20);
        contents_input.setRows(5);
        contents_input.setText("bla bla bla");
        jScrollPane1.setViewportView(contents_input);

        jLabel10.setText("hasło");

        pass_input.setText("keven123");
        pass_input.setMinimumSize(new java.awt.Dimension(15, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(port_label)
                            .addComponent(password_label)
                            .addComponent(ip_label)
                            .addComponent(user_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_input)
                            .addComponent(ip_input, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(port_input, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(password_input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disconnect_button)
                            .addComponent(connect_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schema_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sender_input, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(pass_input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addressee_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(subject_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mail_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sender_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(connect_button)
                        .addGap(47, 47, 47)
                        .addComponent(disconnect_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pass_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressee_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password_label)
                            .addComponent(password_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ip_label)
                            .addComponent(ip_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(port_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(port_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(schema_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(mail_button)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
    
    private void disconnect_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnect_buttonActionPerformed
         isItemChanged = false;
        
        try {
            db.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Main_gui_app.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect_button.setVisible(true);
        disconnect_button.setVisible(false);
        schema_combo_box.setVisible(false);
        schema_combo_box.removeAllItems();
        
        password_input.setText("");
        user_input.setText("");
        clean();
    }//GEN-LAST:event_disconnect_buttonActionPerformed
    private void clean(){
        //usuwanie zakładek
        base_panel.removeAll();  
    }
    private void mail_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_buttonActionPerformed
        String a = sender_input.getText();
        String b = addressee_input.getText();
        String c = subject_input.getText();
        String d = contents_input.getText();
        String e = pass_input.getText();
        
        Keep keep = new Keep (a,b,c,d,e);
        
        MailSender mailsender = new MailSender(keep);
       
    }//GEN-LAST:event_mail_buttonActionPerformed

    private void disconnect_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnect_buttonMouseClicked
       
    }//GEN-LAST:event_disconnect_buttonMouseClicked
      
    
    private void schema_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schema_combo_boxActionPerformed
        if(isItemChanged){
            db.setCurrentScheme(schema_combo_box.getSelectedItem().toString());
            try {
                db.clearArrays();
                db.updateData();
                clean();
                
                makeTabs();
               // isItemChanged = false;
                
            } catch (SQLException ex) {
                Logger.getLogger(Main_gui_app.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_schema_combo_boxActionPerformed

    private void connect_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connect_buttonMouseClicked
        if(checkInputFields()){
           setDatabaseConnection();
       }  
    }//GEN-LAST:event_connect_buttonMouseClicked

    private void sender_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sender_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sender_inputActionPerformed

    private void subject_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject_inputActionPerformed
    private void setDatabaseConnection(){
         try {
            db = new Database(user);

            
            //buttons visibility
            disconnect_button.setVisible(true);
            connect_button.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main_gui_app.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main_gui_app.class.getName()).log(Level.SEVERE, null, ex);
        } catch(WyjatekLog ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        
        base_panel.setVisible(true);
        
        //combo box
        schema_combo_box.setVisible(true);
        
        ArrayList<String> tmp_schemas = db.getSchemas();
        //setting combox list
        tmp_schemas.forEach((i)-> schema_combo_box.addItem(i));
        
        
        db.setCurrentScheme(schema_combo_box.getSelectedItem().toString());
        
        makeTabs();
        
        isItemChanged = true;
    }
    private boolean checkInputFields(){
        String name, password, ip;
        Integer port = 0;
        
        name = user_input.getText();
        password = new String(password_input.getPassword());
        ip = ip_input.getText();

        //username
        if("".equals(name)){
            JOptionPane.showMessageDialog(null, "Error empty username field", "alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        //password
        if("".equals(password)){
            JOptionPane.showMessageDialog(null, "Error empty password field", "alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        //port
        try{
            port = Integer.parseInt(port_input.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Error wrong or empty port field", "alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        //IP
        if(checkIpRegex(ip)){
            user = new Temp(name, password, ip, port);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Error wrong or empty ip field", "alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }     
    }
    private boolean checkIpRegex(String line){

      final String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
        return m.find( );
    }
    private void makeTabs(){
        int table_count = db.getCountTables();
        String[] columns, tables = db.getTableNames();
        String[][] data = null;
        
        for(int i=0; i<table_count; i++){
            columns = db.getColumnsNames(tables[i]);
           //jtable getrow error
            for (String column : columns) {
                data = db.getRecords(tables[i], column);
            }
            
            base_panel.addTab(tables[i], new JScrollPane(new JTable(data, columns)//blocking editing cell by user
                        {
                            private static final long serialVersionUID = 1L;

                            public boolean isCellEditable(int row, int column) {                
                                    return false;               
                            }
                        }
            ));
        }  
        
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_gui_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_gui_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_gui_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_gui_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_gui_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressee_input;
    private javax.swing.JTabbedPane base_panel;
    private javax.swing.JButton connect_button;
    private javax.swing.JTextArea contents_input;
    private javax.swing.JButton disconnect_button;
    private javax.swing.JTextField ip_input;
    private javax.swing.JLabel ip_label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mail_button;
    private javax.swing.JPasswordField pass_input;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField port_input;
    private javax.swing.JLabel port_label;
    private javax.swing.JComboBox<String> schema_combo_box;
    private javax.swing.JTextField sender_input;
    private javax.swing.JTextField subject_input;
    private javax.swing.JTextField user_input;
    private javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables

 
}
