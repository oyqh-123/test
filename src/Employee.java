import java.time.LocalDate;
//test//
public class Employee {
    private final int id;
    private static int nextId = 1;
    private String name;
    private double salary;
    private LocalDate hireDay;
    
    public static int getNextID()
    {
        return nextId;
    } 

    public Employee(String name,double salary,int year,int month,int day)
    {
        id = nextId++;
        this.name = name;
        this.salary = 1200.00+salary;//底薪1200
        hireDay = LocalDate.of(year,month,day);
    }
    public Employee()
    {
        id = nextId++;
        this.name = "none";
        this.salary = 1200.00;
        hireDay = LocalDate.of(2000,1,1);
    }
    

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }

}
