public class Finance
{
    private String name;
    private int salary;
    private int expenses;

    public Finance(String nm, int sal, int ex) {
        name = nm;
        salary = sal;
        expenses = ex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpenses() {
        return expenses;
    }

    public int getSalary() {
        return salary;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
