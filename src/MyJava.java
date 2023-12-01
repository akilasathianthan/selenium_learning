import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr1[]=new int[2];
		arr1[0]=10;
		arr1[1]=20;
		
		int arr2[]= {31,34};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}*/
		Scanner scanInput = new Scanner(System.in);
	
			
			
		List employee = new ArrayList<Employee>();
		 Employee e = new Employee();
		 while( true)
		 {
			
			System.out.println("Enter employ name:"); 
	        String empName = scanInput.next();
	        e.setName(empName);
			System.out.println("Enter employ sal:"); 
	        int empSal = scanInput.nextInt();
	        e.setSalary(empSal);
	        
	        System.out.println("Enter employ id:"); 
	        int empId = scanInput.nextInt();
	        e.setId(empId);
	        employee.add(e);
	        
	       
		 	
	        System.out.println("Lit of employees: "+ employee);  
	     
		 }
	}

}


