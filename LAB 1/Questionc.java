import java.util.*;
import java.io.*;
public class Questionc
{
	public static void c() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		File file1 = new File("Employee.txt");
		FileInputStream fileStream1 = new FileInputStream(file1); 
	    InputStreamReader input1 = new InputStreamReader(fileStream1); 
	    BufferedReader reader1 = new BufferedReader(input1); 

	    File file2 = new File("Department.txt");
		FileInputStream fileStream2 = new FileInputStream(file2); 
	    InputStreamReader input2 = new InputStreamReader(fileStream2); 
	    BufferedReader reader2 = new BufferedReader(input2);


	    System.out.print("Enter employeeId to get budget: ");

	    String employeeId = sc.nextLine(); // enter employeeId.
	    String departmentId = ""; 

	    String line1,line2;


	    while((line1=reader1.readLine())!=null)
	    {
	    	String[] columns = line1.split("\\s+");

	    	if(columns[0].equals(employeeId))
	    	{
	    		departmentId = columns[3];
	    		break;
	    	}
	    }
	    while((line2=reader2.readLine())!=null)
	    {
	    	String[] columns = line2.split("\\s+");

	    	if(columns[0].equals(departmentId))
	    	{
	    		System.out.println(columns[2]);
	    		break;
	    	}
	    }
	}
}
