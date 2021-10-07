import java.util.*;
import java.io.*;
public class ContactApp
{
   //nothing needs to be added here
}
class Person implements Comparable
{
   private String first;
   private String last;
   private String phone;
   public Person(String first, String last, String phone)
   {
      //your code   
   }
   public void setPhone(String number)
   {
     phone = number;
   }
   public void setFirst(String newFirst)
   {
     first = newFirst;
   }
   public void setLast(String newLast)
   {
      last = newLast;
   }
   public String getLast()
   {
      return last;
   }
   public String getFirst()
   {
     return first;
   }
   /*implement this method so that we can compare two people*/ 
   public int compareTo(Object o)
   {
      if (this.equals((Person)o)){
         return 0;
      } else {
         return 1;
      }
             
   }
   /*Implement thsi method to display objects. Must use your own formating and cannot use the sample output as your format*/
   public String toString()
   {
      return  ( "Name: " + first + last + "\n" +
                "Phone: " + phone);
   }
   public String getPhone()
   {
     return phone;
   }
   public boolean equals(Person other)
   {
     return this.last.equalsIgnoreCase(other.last);
   }
 
}
/*this class creates a list of all the contacts , feel free to use any type of list*/
class Contact
{
   ArrayList<Person> contacts;
   public Contact( ) 
   {

   }
       
   
   public boolean addContact(String first, String last, String phone)
   {
       Person toBeAdded = new Person(first, last, phone);
       this.contacts.add(toBeAdded);
       return true;
   }
   public boolean deleteContact(String last)
   {
      return false;
   }
       
   public String searchContact(String last)
   {
       return null;           
   }
      
   public ArrayList<Person> getList()
   {
      return contacts;
   }
   public  String toString()
   {
          
     return "";
   
   }
}
    
class MyDriver
{
   public static void main(String[] args)  
   {
     //see the sample output
                                                       
   }
  
}