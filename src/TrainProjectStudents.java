import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class TrainProjectStudents
{
}
class Person
{
    private String name;
    private String lastName;
    private String phoneNum;
    private String email;

    public Person(String nameC, String lastC, String phoneC, String emailC){
      name = nameC;
      lastName = lastC;
      phoneNum = phoneC;
      email = emailC;
    }

    public void setFirst(String nameC){
       name = nameC;
    }

    public void setLast(String lastnameC){
      lastName = lastnameC;
   }

   public void setPhone(String phone){
      phoneNum = phone;
   }

   public void setEmail(String emailC){
      email = emailC;
   }

   public String getFirst(){
      return name;
   }

   public String getLast(){
      return lastName;
   }

   public String getEmail(){
      return email;
   }
   
   public String getPhoneNum(){
      return phoneNum;
   }

   public boolean equals(Person o){
      return (this.name == o.name);
   }

   public String toString(){
      return ("First Name: " + name + "\n"
              + "Last Name: " + lastName + "\n"
              + "Contact: " + phoneNum + "\n"
              + "Email: " + email + "\n");
   }

}


class Passenger extends Person  {
    private int seatNumber;
    private String classType;            
        

   public Passenger (String first, String last, String phone, String email, int seatNumber, String ClassType){
      super(first, last, phone, email);
      this.seatNumber = seatNumber;
      this.classType = ClassType;
   }

   public void setSeatNumber(int num){
      seatNumber = num;
   }

   public void setClass(String classtype){
      classType = classtype;
   }

   public String getClassType(){
      return classType; 
   }

   public int getSeatNumber(){
      return seatNumber;
   }

   public String toString(){
      return super.toString() + "Seat Number: " + seatNumber + "\nClass: " + classType + "\n"; //Calls toString from parent method, and adds on to it.
   }
}

interface list{
   public boolean add(Object o);
   public Object search(Object o);
   public boolean delete(Object o);
   public void printLast();
        
}

class Train implements list {
   //myTrain and sierraTrain are different trains, so they need to have their own count variable
   //if we were to count all the passengers in all the trains, we would use a static variable
   public int count = 0;
   private Passenger[] train;
   private int trainNumber;

   public Train() {
      train = new Passenger[10];
   }


   public boolean add(Object O) {
      if (O instanceof Passenger) {
         Passenger P = (Passenger) O;
         train[count] = P;
         count++;
         return true;

      }
      return false;
   }

   public Object search(Object O) {

      if (O instanceof String) {
         for(Passenger P : train){
            if (P != null) {
               if (P.getLast().equalsIgnoreCase((String)O)){
                  return P;
               }
            }
         }
      }
      return null;
   }


   public boolean delete(Object O) {
      boolean isTrue = false;
      if (O instanceof String) {

            for (int i = 0; i < train.length; i++) {
               if (train[i] != null) {
                  if (((String) O).equalsIgnoreCase(train[i].getLast())) {
                     train[i] = null;
                     //for everytime an instance is deleted, every instance is bumped down by one index
                     for (int j = i; j < train.length - 1; j++) {
                        train[j] = train[j + 1];
                     }
                     count--;
                     isTrue = true;
                  }
               }
            }

      }
      return isTrue;
   }

   public void printLast() {
      for (Passenger P : train) {
         if (P != null) {
            System.out.println(P.getLast());
         }

      }
   }

   public int getCount() {
      return count;
   }

   public String toString() {
      String a = "";
      for (Passenger P : train) {
         if (P != null) {
            a += P.toString() + "\n";
         }
      }
      return (a);
   }

   public Passenger[] getTrain() {
      return train;
   }
}
 /*once you implemet the above classes uncommnet the driver and test your program*/       
class Driver
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Train myTrain = new Train();
      Passenger p1 = new Passenger("Alex", "Mano","123-456-7893","Mano@gmail.com", 12, "First class");
      Passenger p2 = new Passenger("Mary", "Trump","123-456-4894","mary@sierracollege.edu", 23, "Coach class");
      Passenger p3 = new Passenger("Al", "Busta","123-456-7890","AlB@csus.edu", 34, "Business class");
      Passenger p4 = new Passenger("Jose", "Rodrigues","123-222-7890", "Jose*gmail.com",22, "First class");
      Passenger p5 = new Passenger("Joe", "Rodrigues","123-222-7890","joe@yahoo.com", 25, "First class");
      myTrain.add(p1);
      myTrain.add(p2);
      myTrain.add(p3);
      myTrain.add(p4);
      myTrain.add(p5);

       
      System.out.println("\nHere is the list of the passengers in this train");
      System.out.println(myTrain);
      
      System.out.println("Testing the printLast method to display the last names");
      myTrain.printLast();
      System.out.println("\nTesting the static method getCount");
      System.out.println("This train has " + myTrain.getCount() + " Passengers\n");
      
      System.out.println("Testing the search method\n");
      System.out.print("Enter the last name of the passenger: ");
      
      String last = kb.nextLine();
      Passenger p = (Passenger)myTrain.search(last);
      if(p == null)
         System.out.println("Passenger not found");
      else
        System.out.println("Here is the info for the passenger: "+p);   
      
      System.out.println("\nTesting the delete method");
      System.out.print("Enter the last name of the passenger: ");
      last = kb.nextLine();
      boolean delete = myTrain.delete(last);
      if(delete)
         System.out.println("Passenger  "+ last+ " has been removed from the list");
      else
        System.out.println("Passenger not found"); 
        
      System.out.println("\nHere is the updated list");
      System.out.println(myTrain); 
      
      System.out.println("This train has " + myTrain.getCount() + " passengers");
      

      
      
      /********************************************************************************************/
      
      Train sierraTrain = new Train();

      Passenger dad = new Passenger("Santino", "Ocarol","123-456-7893", "santidar@gmail.com", 12, "First class");
      Passenger mom = new Passenger("Gitta", "Ocarol","113-456-7193","gi@gmail.com", 13, "First class");
      Passenger brother = new Passenger("Tatsuya", "Shiba","113-416-7893","Oniichan@gmail.com", 14, "First class");
      Passenger sister = new Passenger("Izumi", "Sagiri","123-416-7893","Imouto@gmail.com", 15, "First class");
      Passenger uncle = new Passenger("Alistaire", "Ocarol","113-456-7193","stairecase@gmail.com", 16, "First class");

      sierraTrain.add(dad);
      sierraTrain.add(mom);
      sierraTrain.add(brother);
      sierraTrain.add(sister);
      sierraTrain.add(uncle);

      System.out.println(sierraTrain);

      System.out.println("Last name of all Passengers: ");
      sierraTrain.printLast();

      String scanned = "";

      System.out.println("Search for a last name to search = ");
      scanned = kb.next();

      sierraTrain.search(scanned);
      Passenger a = (Passenger)sierraTrain.search(scanned);

      if(a == null)
         System.out.println("Passenger not found");
      else
         System.out.println("Here is the info for the passenger: "+a);

      System.out.println("\nTesting the delete method");
      System.out.print("Enter the last name of the passenger: ");

      scanned = kb.next();

      boolean delet = sierraTrain.delete(scanned);
      if(delet)
         System.out.println("Passenger/s " + scanned+ " has been removed from the list");
      else
         System.out.println("Passenger not found");

      System.out.println("\nHere is the updated list");
      System.out.println(sierraTrain);

      System.out.println("This train has " + sierraTrain.getCount() + " passengers");


      /******************************************************************************************/    
   
   }
}    
