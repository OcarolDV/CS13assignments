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
      this.first = first;
      this.last = last;
      this.phone = phone;
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
   public int compareTo(Person o)
   {
      //overrides base compareTo function with compareTo on last name ignored case;
     return this.getLast().compareToIgnoreCase(((Person) o).getLast());
   }
   /*Implement thsi method to display objects. Must use your own formating and cannot use the sample output as your format*/
   public String toString()
   {
      return  ( "Name: " + first + " " + last + "\n" +
                "Phone: " + phone);
   }
   public String getPhone()
   {
     return phone;
   }
   public boolean equals(Person other)
   {
      //overrides base equals function with equals on last name ignored case;
     return this.last.equalsIgnoreCase(other.last);
   }
 
}
/*this class creates a list of all the contacts , feel free to use any type of list*/
class Contact
{
   ArrayList<Person> contacts;
   public Contact()
   {
      contacts = new ArrayList<Person>();
   }
       
   
   public boolean addContact(String first, String last, String phone)
   {
       Person p = new Person(first, last, phone);
       boolean isTrue = false;
       if (contacts.size() == 0){
          contacts.add(P);
          isTrue = true;
       } else {
          for (int i =  0; i < contacts.size(); i++){
             if(contacts.get(i).compareTo(p) < 0){
                //if its less than, than it precedes the current persons last name
                //alphabetically, so it shifts the current to the right and replaces
                contacts.add(i, p);
                isTrue = true;
             } else if (contacts.get(i).compareTo(p) > 0){
                contacts.add(i + 1, p);
                isTrue = true;
             } else {
                //if its neither above or below it has to be 0, which means its already
                //there
                isTrue = false;
             }
          }
       }
      return isTrue;
   }

   public boolean deleteContact(String last) {
      boolean found = false;
      for (int i = 0; i < contacts.size(); i++) {
         if (contacts.get(i).getLast().compareToIgnoreCase(last) == 0) {
            contacts.remove(i);
            found = true;
         } else {
            found = false;
         }
      }
      return found;
   }
       
   public String searchContact(String last)
   {
      String ret = null;
      for (Person p: contacts){
         if (p.getLast().equalsIgnoreCase(last)){
            ret = ("Last Name: " + p.getLast() + ", Phone: " + p.getPhone());
         }
      }
      return ret;
   }
      
   public ArrayList<Person> getList()
   {
      return contacts;
   }
   public  String toString()
   {
      String ret = "";
      for (Person p : contacts){
         ret += p.toString() + "\n";
      }
      return ret;
   }
}
    
class MyDriver
{
   public static void main(String[] args)  
   {
     //see the sample output
                                                       
   }
  
}