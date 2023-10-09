package com.example.Employee;

public class Engineer extends Employee{
    private double bonus;

    public Engineer(String name,double bonus, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }
    public Engineer(){}

    public double getTotalsalaries()
    {
        return super.getSalary() + this.bonus;
    } 
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Engineer();
        staff[1] = new Employee();
        staff[2] = new Engineer();
        for(Employee i : staff)
        System.out.println(i.getId());
    }
}
