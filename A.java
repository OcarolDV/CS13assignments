public class A {
    public void show()
    {
      
       System.out.println("Inside class A");
    }
 }   
 class B extends A
 {
    public void show()
    {
       super.show();
       System.out.println("Inside class B");
    }
 }    
 class Driver
 {
    public static void main(String[] args)
    {
       A a = new A();
       a.show();
       B b = new B();
       b.show();
    }
 }