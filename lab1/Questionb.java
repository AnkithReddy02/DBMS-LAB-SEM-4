import java.util.*;
import java.io.*;
public class Questionb
{
	public static void b() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		File file1 = new File("Employee.txt");
		FileInputStream fileStream1 = new FileInputStream(file1); 
	    InputStreamReader input1 = new InputStreamReader(fileStream1); 
	    BufferedReader reader1 = new BufferedReader(input1); 

	    
	    System.out.print("Enter departmentId to get number of Employees : ");
	    String departmentId = sc.nextLine(); // enter department Id.

	    String line1,line2;


	    int count = 0;
	    

	    while((line1=reader1.readLine())!=null)
	    {
	    	String[] columns = line1.split("\\s+");

	    	if(columns[3].equals(departmentId))
	    	{
	    		count++;
	    	}
	    }

	    System.out.println(count);
	}
}