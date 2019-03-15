import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class ReadNames
{ 
  public static void main(String[] args) throws Exception 
  { 
	System.out.print(" Enter the file name: ");

//User inputs filename
	Scanner in = new Scanner(System.in);
	String filename = in.next();
	in.close();

//try read the file and start to scan it.... new File("String")
	try
	{
		in = new Scanner(new File(filename));
	}	
	catch (FileNotFoundException e)
	{
		System.out.println(e);
		System.exit(1);
	}
  
//first line is always a number.. its the length of array
	int num = in.nextInt();
	int i = 0;
	String [] names = new String [num+1];

//puts each name into the array called names.
	while (in.hasNextLine())
	{
		names[i] = in.nextLine();
		i++;
	}

//this prints the names backwards, starting from names[num]
	System.out.println("The names in reverse order are: ");
	for(i = num; i > 0; i--)
		{
			System.out.print(names[i] + " ");
		}
	System.out.println();
  } 
}
