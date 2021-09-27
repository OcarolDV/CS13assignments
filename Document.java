import java.util.*;
public class Document {
    private String content;

    public Document (String text){
        content = text;
    }

    public String getText() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    //Im sure you can just do DocumentName.getContent().length() on the main main method
    public int getDocumentLength(){
        return content.length();
    }

    public boolean contains(String word){
        return content.contains(word);
    }

}


class Email extends Document {
    private String sender;
    private String recipient;
    private Calendar date;
    private String subject;
    private String cc;
    private boolean isSent;

    //Calendar is used instead of date for a more efficient way of displaying and modifying Date and Time

    public Email(String text, String send, String recip, String subj, String c){
        super(text);
        sender = send;
        recipient = recip;
        subject = subj;
        cc = c;
        isSent = false;
        date = Calendar.getInstance();
    }

    public void send(){
        isSent = true;
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

    //Since I am using Calendar instead of Date, there is no need to get a Date getter method

    public void setSender(String sender) {
        if(isSent == false){
            System.out.println("Sender has been modified");
            this.sender = sender;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setRecipient(String recipient) {
        if(isSent == false){
            System.out.println("recipient has been modified");
            this.recipient = recipient;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setSubject(String subject) {
        if(isSent == false){
            System.out.println("Subject has been modified");
            this.subject = subject;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public void setcc(String cc) {
        if(isSent == false){
            System.out.println("CC has been modified");
            this.cc = cc;
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public String toString(){
        return("\n" + 
               "********************************\n" + 
               "\n" +
               "Sender: " + sender + "\n" +
               "Recipient: " + recipient + "\n" +
               "CC: " + cc + "\n" +
               "Subject: " + subject + "\n" +
               "Date: " + date.getTime() + "\n" +
               "\n" +
               "********************************");
    }

    public void modifyContent(String newText){
        if(isSent == false){
            System.out.println("Content has been modified");
            super.setContent(newText);
        } else {
            System.out.println("Sorry, this email has already been sent and cannot be modified");
        }
    }

    public Email forward(String rec, String sender, String cc){
        Email f = new Email (this.getText(), sender, rec, this.subject, cc);
        f.date = Calendar.getInstance();
        f.isSent = true;
        return f;

    }

    public void toCalandar(Calendar Cal, String content){
        if(content.toLowerCase().contains("tomorrow")){
            Cal.add(Calendar.DATE, 1);
            System.out.println("The word tomorrow has been detected in the email, A calendar event has been added at " + Cal.getTime());
        } else if(content.toLowerCase().contains("next week")){
            Cal.add(Calendar.DATE, 7);
            System.out.println("The words next week has been detected in the email, A calendar event has been added at " + Cal.getTime());
        } else if(content.toLowerCase().contains("next month")){
            Cal.add(Calendar.MONTH, 1);
            System.out.println("The words next month has been detected in the email, A calendar event has been added at " + Cal.getTime());
        }
    }
}



//****************************************************************************************

//uncommnet this driver class once you have implemented the Documnet class and the Email class  
     
class EmailDriver
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
       Email e2 = new Email("Hello, next week, we will have a meeting on monday at 10pm", "Kazyua",
       "Ayume", "Meeting","Ryou");

       System.out.println(e2);
       System.out.println("\nThe content of this email is: " + e1.getText());
       System.out.println();

       e2.modifyContent("Hello, next week on Tuesday we will have a meeting at 10am");
       e2.setcc("Ayase");

       System.out.println(e2);
       System.out.println("\nThe content of this email is: " + e1.getText());
       System.out.println();
       
       if(e2.contains("meeting")){
        e2.toCalandar(Calendar.getInstance(), e2.getContent());
       }
        


    }
}