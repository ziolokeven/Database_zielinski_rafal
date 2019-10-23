package mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import temp.Keep;

public class MailSender {
    private Keep keep;
    public MailSender(Keep keep) {
        this.keep=keep;
        Mail();
    }
    
    private void Mail(){
        String username = keep.getSender();
        final String password =keep.getPass();
        
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");//TLS
        
        
            Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(keep.getSender()));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(keep.getAddressee())
            );
            message.setSubject(keep.getSubject());
            message.setText(keep.getContents());

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
