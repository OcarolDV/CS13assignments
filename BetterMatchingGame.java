import java.util.*;

public class BetterMatchingGame {
    public static void main(String[] args) {
        System.out.println("*********************************************************************************************\n" +
                "* Welcome to number matching game. I will generte three random numbers for you. If two      *\n" +
                "* of the numbers match you win 100, if you get three matching numbers you win 300 dollars   *\n" +
                "*********************************************************************************************");
        String answer = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = scan.nextLine();


        int[] threeNumbers = new int[7];
        int total = 0;

        while (!answer.equalsIgnoreCase("q")) {
            for(int i = 0; i < threeNumbers.length; i++){
                threeNumbers[i] = (int) (Math.random() * 8) + 1;
            }
            System.out.print("You got: ");
            for(int i = 0; i < threeNumbers.length; i++){
                System.out.print(threeNumbers[i] + " ");
            }

            int match = found(threeNumbers);
            System.out.println(match);
            if (match != 0) {
                System.out.println("You got " + match + " matches, you won " + (int)Math.pow(10, match)  + " dollars");
                total += (int)Math.pow(10, match);
            }
            else {
                System.out.println("Sorry no match");
            }

            System.out.print("\nHit enter to continue or press q/Q to quit  ");
            answer = scan.nextLine();

        }
        System.out.println("\nTotal amount you won: " + total);
        System.out.println("\n");
    }

    public static int found(int[] num) {
        int counter = 0;
        boolean hasMatch = false;
        int[] indexlog = new int[100];

        for (int i = 0; i < num.length; i++) {
            if(!Arrays.asList(indexlog).contains(num[i])) {
                for (int j = 0; j < num.length; j++) {

                    if (num[i] == num[j] && i != j) {
                        indexlog[counter] = num[i];
                        hasMatch = true;
                    }
                }
            }
            if(hasMatch) {
                counter++;
                hasMatch = false;
            }
        }
        return counter;
    }
}