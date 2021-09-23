import java.util.*;
public class Document {
    private String content;

    public Document (String text){
        content = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Im sure you can just do DocumentName.getContent().length() on the main main method
    public int getContentLength(){
        content.length();
    }

    //this is already a method
    public boolean contains(){

    }

}
class Email extends Document {
    private String sender;
    private String recipient;
    private Date date;
    private String subject;
    private String cc;
    private boolean isSent;

    public Email(String sender, String recipient, Date date, String subject, String cc, boolean isSent){
        super(content);
        sender = sender;
        recipient = recipient;
        date = date;
        subject = subject;
        cc = cc;
        isSent = isSent;
    }

    public void send(){
        isSent = true;
    }

    public void forward(){

    }

    public boolean getSent(){
        return isSent;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getcc() {
        return cc;
    }

    public Date getDate() {
        return date;
    }

    public void setSender(String sender) {
        if(isSent == false){
            this.sender = sender;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setRecipient(String recipient) {
        if(isSent == false){
            this.recipient = recipient;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setSubject(String subject) {
        if(isSent == false){
            this.subject = subject;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setcc(String cc) {
        this.cc = cc;
    }

    public void toString(){
        System.out.println();
        System.out.println("********************************");
        System.out.println();
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("CC: " + cc);
        System.out.println("Subject: " + subject);
        System.out.println("Date: " + date);
        System.out.println("Content: " + content);
        System.out.println();
        System.out.println("********************************");
        System.out.println();
    }

    public void modifyContent(String newText){
        if(isSent == false){
            super.setContent(newText);
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public Email forward(String rec, String sender, String cc){
        Email f = new Email (this.getText(), sender, rec, this.subject, cc);
        f.date = new Date();
        f.isSent = true;
        return f;

    }

}

//****************************************************************************************

//uncommnet this driver class once you have implemented the Documnet class and the Email class  
     
/*class EmailDriver
{
    // public Email(String text, String sender,String recipiant, String subject, String cc)
    public static void main(String[] args)
    {
      //creating an Email object
       Email e1 = new Email("Hello everyone, we will have a meeting tomorrow at 10", "Gita Faroughi","Alex","Meeting","");
      
       //sending the email
       e1.send();
       
       //disply the details about the email
       System.out.println(e1);
       System.out.println("\n\n");
       
       //searching the email for the email for the word tomorrow
       boolean b = e1.contains("tmorrow");
       if(b)
         System.out.println("The word tomorrow was  found in the email");
       else
          System.out.println("The word tomorrow was found in the email"); 
           
      
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e1.getText());
       System.out.println();
       //modifying the content of the email
       e1.modifyContent("bye");
       
       //changing the recipient of the e1 email
       e1.setRecipient("Jose@yahoo.com,Mary@gmail.com");
       System.out.println();
       
       //forwarding the email
       Email forward = e1.forward("Alex", "Gita" ,"Maria");
       System.out.println();
       
       //printing the forwarded email 
       System.out.println("forwarded message\n"+ forward);
       System.out.println();
       
       //display the length of the text in the email
       System.out.println("The number of the letters in the email is: " + e1.getDocumentLength());
       
       //***********************************************************************
       //your turn, refer to the provided documnet on the codes you need to write
       
    }
}*/