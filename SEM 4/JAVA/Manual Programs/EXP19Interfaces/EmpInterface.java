import java.util.*;
import java.lang.*;

public class EmpInterface
{
	public static void main(String[] args)
	{
		Gross R = new Gross(51 ,"John Wick");
		R.display();
	}
}

class Employee
{
	protected String name;
	protected int id;
	
	Employee(int i,String n)	
	{
		id = i;
		name = n;
	}
	
	void display()	
	{
		System.out.println("Age of Employee \t: " + id);
		System.out.println("Name of Employee \t: "+ name);
	}
}

interface Salary 
{
	int basic_salary = 75000;
	void basic_sal();
}

class Gross extends Employee implements Salary
{
	protected int total = 0;
	protected int da = 25000;
	protected int ta = 10000;
	protected int hra = 5000;
	
	Gross( int i ,String n )
	{
		super(i,n);
		total = basic_salary + hra + ta + da;	
	}

	public void basic_sal()
	{
		System.out.println("\nBasic salary \t\t: " + basic_salary);
	}

	void display()
	{
		basic_sal();
		super.display();
		System.out.println("Gross Salary \t\t: " + total);
	}
}