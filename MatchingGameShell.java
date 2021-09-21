//Dar Vince Ocarol
//This is a matching game program//

import java.util.*;
public class MatchingGameShell
{
  public static void main(String[] args)
  {
     //fill in the code for each line of the provided comment
     //create a Scanner object
      Scanner scan = new Scanner(System.in);
     //declare a string variable and assign "" to it . call this variable answer                 
     String answer = "";                   
      
     while (!answer.equalsIgnoreCase("q"))
     {
        // call the description method
         description();
        //prompt the user to enter their name , store their name in  a variable 
         System.out.print("Please Enter Your Name: ");
         String name = scan.next();

        //display the hello message(refer to the output )
         System.out.println("Hello " + ", Lets start playing");

         //bruh why do I have to do this, I can just Math.random and do it all in one line
        Random random = new Random();



        //call the play method and pass the Random object that you created to it 
         play(random);

         //display the message "Hit enter to let another person play or enter Q to quit the program"
         System.out.println("Hit enter to let another person play or enter Q to quit the program");
        //store the user's input in the answer variable. all you need to do is answer = kb.nextLine(), assuming your scanner object is kb
         answer = scan.nextLine();

     }
      System.out.println("Good Bye! Come Back soon to play again");

  }
  public static int getRand(Random rand)
  {
    return rand.nextInt(8) + 1;// must change this line
  }
  public static void play(Random rand)
  {
     
      
     Scanner kb = new Scanner(System.in);
     int total = 0;
     String answer = "";
     int n1= 0, n2 = 0, n3 = 0;
     while(!answer.equalsIgnoreCase("q"))
     {
        n1 = getRand(rand);
        n2 = getRand(rand);
        n3 = getRand(rand);
       //call the method getRand(rand) three times and store the result in the variable n1, n2, n3       
       //display the generated random numbers
         System.out.println("You got: " + n1 + " " + n2  + " "+ n3);
       int match = match(n1,n2,n3);

       if (match== 2)

       {
         //add 100 to the total
           total = total + 100;
         //display the proper message
          System.out.println("You got two matches, you won 100 dollars");
       }
       //Note: if All 3 numbers are the same, counter would increase by one 3 times, making counter 4, check match method
       else if(match == 4)
       {
           //add 300 to the total
           total = total + 300;
           // display the proper message
           System.out.println("You got two matches, you won 300 dollars");
            
       }    
       else
           System.out.println("Sorry no match");
         //display the proper message

       System.out.print("\nHit enter to continue or press q/Q to quit  ");
       answer = kb.nextLine(); 
       
             
     }
     System.out.println("\nTotal amount you won: " + total);
     System.out.println("\n");
     
  }

  public static int match(int n1, int n2, int n3)
  {
      int counter = 1;
       if(n1 == n2)
           counter++;
       if(n1 == n3)
           counter++;
       if(n2 == n3)
           counter++;

       return counter;//must modify
  }
  public static void description()
  {
      System.out.println("*********************************************************************************************\n" +
              "* Welcome to number matching game. I will generate three random numbers for you. If two      *\n" +
              "* of the numbers match you win 100, if you get three matching numbers you win 300 dollars   *\n" +
              "*********************************************************************************************");
  }
}