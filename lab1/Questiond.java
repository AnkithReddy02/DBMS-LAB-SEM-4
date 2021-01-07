import java.util.*;
import java.io.*;
public class Questiond
{
	public static void d() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		File file1 = new File("Employee.txt");
		FileInputStream fileStream1 = new FileInputStream(file1); 
	    InputStreamReader input1 = new InputStreamReader(fileStream1); 
	    BufferedReader reader1 = new BufferedReader(input1); 

	    
	    System.out.print("Enter city name to display name of Employees : ");

	    String city = sc.nextLine(); // enter city.
	  

	    String line1;


	    while((line1=reader1.readLine())!=null)
	    {
	    	String[] columns = line1.split("\\s+");

	    	if(columns[2].equals(city))
	    	{
	    		System.out.println(columns[1]);
	    		
	    	}
	    }
	}
}