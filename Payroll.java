public class Payroll
{
   private String name;
   private String id;
   private double hourlyRate;
   private double hoursWorked;

   public Payroll(String n, String idC, double hoursWork, double hourlyR){
     name = n;
     id = idC;
     hoursWorked = hoursWork;
     hourlyRate = hourlyR;
   }

   public String getName(){
     return name;
   }
   public String getId(){
     return id;
   }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  public void setName(String name) {
        this.name = name;
    }

  public void setId(String id) {
        this.id = id;
    }

  public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

  public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPay(){
       return hourlyRate*hoursWorked;
  }

    @Override
    //modifies the default toString methods, and changes what prints out of println
    //Java doesn't really need to use getters and setters to call variables within the same class
    public String toString() {
        return  "Name = " + name + '\n' +
                "ID = " + id + '\n' +
                "Hourly Rate = " + hourlyRate + '\n' +
                "Hours Worked = " + hoursWorked;
    }
}

//once you implement the Payroll class, uncommnet the code in the main method and run your program. 
class PayrollDriver
{
  public static void main(String[] args)
  {
   

    System.out.println("Cretaing payroll objects");
    Payroll p1 = new Payroll("Alex Martinez" ,"123456", 25, 20);
    Payroll p2 = new Payroll("Ali Santos" ,"986747", 125, 45);
    Payroll p3 = new Payroll(" Jose Busta" ,"45678", 55, 30);
    System.out.println("testing the toString method");

    System.out.println(p1);
    System.out.println("Salary is : " + p1.getPay());  //calling the getPay method
    System.out.println("\n*******************");
    System.out.println(p2);
    System.out.println("Salary is : "+ p2.getPay());
    System.out.println("\n*******************");
    System.out.println(p3);
    System.out.println("Salary is : "+ p3.getPay());
    System.out.println("\n*******************");
    System.out.println("\nTesting the setter methods");
    System.out.println("The hourly pay of " + p1.getName()  + " is being chnaged");
    p1.setHoursWorked(80);  // changing the hours worked for the object p1
    System.out.println(p1);
    System.out.println("\n*******************");
    
    
      
    
    
    //***********************************************************************************
    
    
    /*        Your turn , you need to implement code for each commnet  below       */
     
    //1. create two objects of the payroll class

      Payroll SWE = new Payroll("Dar Vince" ,"79407", 40, 95);
      Payroll McD = new Payroll("Kevin Meehan" ,"1738", 48, 16);

    //2. display the objects on the screen by calling the toString method
    //2. display the salary of each person by calling the getPay method
      System.out.println();
      System.out.println(SWE);
      System.out.println("Salary is : " + SWE.getPay());
      System.out.println();
      System.out.println(McD);
      System.out.println("Salary is : "+ McD.getPay());

      System.out.println("\n*******************");

    //change the hourlyRate of the objects you created
      System.out.println();
      //set the change first so I can mention the change in the output for a better user experience
      SWE.setHourlyRate(125);
      System.out.println("The hourly pay of " + SWE.getName()  + " has changed to " + SWE.getHourlyRate());
      McD.setHourlyRate(18);
      System.out.println("The hourly pay of " + McD.getName()  +  " has changed to " + McD.getHourlyRate());
      System.out.println("\n*******************");

    //display the objects again to see the changes you made by calling the toString method
      System.out.println();
      System.out.println(SWE);
      System.out.println("Salary is : " + SWE.getPay());
      System.out.println();
      System.out.println(McD);
      System.out.println("Salary is : " + McD.getPay());
      System.out.println("\n*******************");

    //change the hoursworked for the objects you created by calling the setter methods

      System.out.println();
      SWE.setHoursWorked(80);
      System.out.println("The hours worked of " + SWE.getName()  + " has changed to " + SWE.getHoursWorked());
      McD.setHoursWorked(96);
      System.out.println("The hours worked of " + McD.getName()  +  " has changed to " + McD.getHoursWorked());
      System.out.println("\n*******************");

    //display your objects again to see the changes you made
      System.out.println();
      System.out.println(SWE);
      System.out.println("Salary is : " + SWE.getPay());
      System.out.println();
      System.out.println(McD);
      System.out.println("Salary is : " + McD.getPay());
      System.out.println("\n*******************");
    
    //add anyother code you want
    
  }
}