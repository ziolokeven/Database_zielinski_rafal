package temp;
public class Keep {
    private final String sender;
    private final String addressee;
    private final String subject;
    private final String contents;
    private final String pass;
    public Keep(String sender, String addressee, String subject, String contents, String pass){
        this.sender=sender;
        this.addressee=addressee;
        this.subject=subject;
        this.contents=contents;
        this.pass=pass;
    }
    public String getSender(){
        return sender;
    }
    public String getAddressee(){
        return addressee;
    }
    public String getSubject(){
        return subject;
    }
    public String getContents(){
        return contents;
    }
    public String getPass(){
        return pass;
    }
}
