//Dar Vince Ocarol
//This program removes repeated numbers//

import java.util.*;

public class DistinctNumbersShell
{
   public static void main(String[] args)
   {

     System.out.println("Welcome to the distinct numbers. \nI will remove the repeated numbers and display the numbers you just enetered");

     //num is initialized into the array that is returned by getInput
     int[] num = getInput();
     display(num);
   }
   public static Boolean found(int[] num, int n){
       //counter is used to see if target n appears more than once
       int counter = 0;
       for(int i = 0; i < num.length; i++){
           if(num[i] == n){
               counter++;
           }
       }
       //rather than initializing a boolean a conditional is placed in the return statement so it would return true if target n
       //is found more than once, in this case however, it would never go past 2 since, a double entry will always be overwritten
       return (counter > 1);
    }
   public static int[] getInput()
   {
       int[] scannedArray = new int[10];
       Scanner scan = new Scanner(System.in);
       int scannedNum;

       for(int i = 0; i < 10; i++){
           System.out.print("Enter a Number: ");
           boolean forLoopFound = false;
           scannedNum = scan.nextInt();
           scannedArray[i] = scannedNum;
           forLoopFound = found(scannedArray, scannedNum);
           if(forLoopFound == true){
               //loop index is decremented so the repeated number is overwritten
               i--;
           }


       }
       return scannedArray;
   }
   public static void display(int[] num)
   {
       System.out.println("I filtered out all the repeated numbers you entered and kept only one copy of each numberHere is the list of your numbers");
       String printOut = "{";
       for(int i = 0; i < 9; i++) {
           printOut = (printOut + num[i] + ", ");
       }
       //I could use num[num.length - 1] here if the size wasn't already predetermined by the instructions
       printOut = printOut + num[9] + "}";
       System.out.println(printOut);
   }

 }