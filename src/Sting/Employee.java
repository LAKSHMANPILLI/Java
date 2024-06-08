package Sting;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	
	Employee()
	{
		
	}
	Employee(String name,int eid,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}
