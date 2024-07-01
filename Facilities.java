import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Facilities 
{
	HashSet<EmployeeData> empset=new HashSet<EmployeeData>();
	
	List<EmployeeData> empdata = new ArrayList();
	
	EmployeeData emp1=new EmployeeData(101, "Shital", 24, "Developer", "IT", 25000);
	
	EmployeeData emp2=new EmployeeData(102, "Meena", 26, "Tester","CO", 57000);
	
	EmployeeData emp3=new EmployeeData(103, "Bob", 20, "DevOps Eng","Admin", 5000);
	
	EmployeeData emp4=new EmployeeData(104, "Max", 27, "System Eng","CO",  70000);
	
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	boolean found=false;
	int id;
	String name;
	int age; 
	String department;
	String desiganation;
	double sal;
	
   
     public  Facilities()
     {
    	 empset.add(emp1);
    	 empset.add(emp2);
    	 empset.add(emp3);
    	 empset.add(emp4); 
     }

	public void addEmp() 
	{
			System.out.println("Enter id:");
			id=sc.nextInt();
			
			System.out.println("Enter name");
			name=sc.next();
			
			System.out.println("Enter age");
			age=sc.nextInt();
			
			System.out.println("enter Desiganation");
			desiganation=sc.next();
			
			System.out.println("Enter Department");
			department=sc.next();
			
			System.out.println("Enter sal");
			sc.nextDouble();	
			
			EmployeeData obj = new EmployeeData(id, name, age, desiganation, department, sal);
			empset.add(obj);
			System.out.println("Successfully Added");
			
	}

	public void viewAllEmps()
	{
		 for(EmployeeData emp : empset)
		 {
			 System.out.println(emp);
		 }
	}

	public void updateEmployee() 
	{
		 for(EmployeeData emp : empset)
		 {
			 System.out.println(emp);
		 }
		 System.out.println("Enter the id You want to update : \n\n");
		 int id = sc.nextInt();
		 
		 boolean found=false;
			for(EmployeeData emp:empset) 
			{
				if(emp.getId()==id) 
				{
					System.out.println("Enter name: ");
					name=sc.next();
					System.out.println("Enter new Salary");
					sal=sc.nextDouble();
					emp.setName(name);
					emp.setSalary(sal);
					System.out.println("Updated Details of employee are: ");
					System.out.println(emp);
					found=true;
				}
			}
			if(!found) 
			{
				System.out.println("Employee is not present");
			}
			else 
			{
				System.out.println("Employee details updated successfully !!");
			}
	}
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		EmployeeData empdelete=null;
		for(EmployeeData emp:empset)
		{
			if(emp.getId()==id)
			{
				empdelete=emp;
				found=true;
			}
		}
		if(!found) 
		{
			System.out.println("Employee is not present");
		}
		else
		{
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}

	public void viewEmp()
	{
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(EmployeeData emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	
	
}
