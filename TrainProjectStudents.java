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
      return ("First Name: " + name "\n" + "First Name: " + name "\n";
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
}

interface list{
   public boolean add(Object o);
   public Object search(Object o);
   public boolean delete(Object o);
   public void printLast();
        
}

class Train implements list{ 
   public static int count = 0;
   private Passenger[] train;
   private int trainNumber;

   public Train(){
      train = new Passenger[10];
   }

    
   
   public boolean add(Object O){
      if(O instanceof Passenger){
         Passenger P = (Passenger) O;
         train[count] = P;
         count++;
         return true;
      }
      return false;
   }

   public Object search(Object O){
      
      if(O instanceof Passenger){
         Passenger P = (Passenger) O;
         for(int i =  0; i < train.length; i++){
            if (P.equals(train[i])){
               return train[i];
            }
         }
      }
      return null;
   }

   public boolean delete(Object O){
      
      if(O instanceof Passenger){
         Passenger P = (Passenger) O;
         for(int i =  0; i < train.length; i++){
            if (P.equals(train[i])){
               train[i] = null;
               for(int j = i; j < train.length - 1; j++){
                  train[j] = train[j+1];
               }
               count--;
               return true;
            }
         }
      }
      return false;
   }

   public void printLast(){
      for(Passenger P : train){
         System.out.println(P);
      }
   }


}
 /*once you implemet the above classes uncommnet the driver and test your program*/       
class Driver
{
   public static void main(String[] args)
   {
      /*Scanner kb = new Scanner(System.in);
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
      
      System.out.println("This tarin has " + Train.getCount() + " passengers");
      
      */
      
      
      /********************************************************************************************/
      
      /*   Add your code here for creating the sierraTrain, refer to the document for details    */
      
      /******************************************************************************************/    
   
   }
}    
