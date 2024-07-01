import java.util.Scanner;

public class MainClass 
{
	Facilities data= new Facilities();
	
	static boolean ordering = true;
	
	public static void menu() 
	{
        System.out.println("****************Welcome To Employee Managment System *********** "
        		+ "\n1.Add Employee "
        		+ "\n2.View Employee"
        		+ "\n3.Update Employee"
        		+ "\n4.Delete Employee"
        		+ "\n5.View All Employee"
        		+ "\n6.Exist ");
	}  
        
        public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		
    		Facilities data= new Facilities();
    		
    		do 
    		{
    			menu();
    			System.out.println("Enter your Choice");
    			int choice=sc.nextInt();
    			switch(choice) {
    			
    			case 1:
    				System.out.println("Add Employee");
    				data.addEmp();
    				break;
    			case 2:
    				System.out.println("View Employee\n\n");
    				data.viewEmp();
    				break;
    			case 3:
    				System.out.println("Update Employee");
    				data.updateEmployee();
    				break;
    			case 4:
    				System.out.println("Delete Employee");
    				data.deleteEmp();
    				break;
    			case 5:
    				System.out.println("view All Employee\n\n");
    				data.viewAllEmps();
    				break;
    			case 6:
    				System.out.println("Thank you for using application!!");
    				System.exit(0);
    				
    			default:
    				System.out.println("Please enter valid choice");
    				break;
    			
    			
    			}
    			
    		}while(ordering);
    		
    			}
    		
    	


    }

