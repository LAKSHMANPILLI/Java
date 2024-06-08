package Sting;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Driver1 {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Employee> e1=new ArrayList();
	String st=sc.nextLine();
	public static void AddEmployee()
	{
		System.out.println("Enter the name of Employee");
		String name=sc.next();
		System.out.println("Enter the eid of Employee");
		int eid=sc.nextInt();
		System.out.println("Enter the salary of Employee");
		double salary=sc.nextDouble();
		Employee emp=new Employee(name,eid,salary);
		e1.add(emp);
		System.out.println("Employee added Succussfully!!!!");
	}
	public static void displayDetails(){
		System.out.println("Employee detials");
		System.out.println("-----------------------------------------------");
		for(Employee obj:e1)
		{
			System.out.println("Employee Name:"+obj.getName());
			System.out.println("Employee eid:"+obj.getEid());
			System.out.println("Employee salary:"+obj.getSalary());
			System.out.println("*********************************************************");
		}
	}
	public static void searchEmployee()
	{
		System.out.println("Enter name of the Employee to Sereach:");
		String name=sc.next();
		int c=0;
		for(int i=0;i<e1.size();i++)
		{
			Employee e2=e1.get(i);
			if(name.equals(e2.getName()))
			{
				c=1;
				System.out.println("Finding Employee");
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Employee not Found");
		}
	}
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("press 1 to add/create Employee");
			System.out.println("press 2 to Display of Employee");
			System.out.println("press 3 to Searech of Employee");
			System.out.println("press 4 to delete an Employee");
			System.out.println("press 5 to sort the details of EMployee");

			int choice=sc.nextInt();
			if(choice==1)
			{
				AddEmployee();
			}
			else if(choice==2)
			{
				displayDetails();
			}
			/*else if(choice==3)
			{
				searchEmployee();
			}
			else if(choice==4)
			{
				deleteEmployee();
			}
			else if(choice==5)
			{
				sortSalary();
			}
			 */
			else {
				System.out.println("Invalid choice!!!");
			}
			System.out.println("press 1 to continue");
			System.out.println("Press any other to Stop");
			int choice1=sc.nextInt();
			if(choice1!=1)
			{
				System.out.println("----Thank You-------");
				break;
			}
		}
	}

	/*private static void sortSalary() {
		// TODO Auto-generated method stub

	}
	static void deleteEmployee() {
		// TODO Auto-generated method stub

	}*/











}
