import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String[] args)
    {
    	System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
		Scanner in = new Scanner(System.in);	
		Map<String,Integer> phonebook = new HashMap<>();

		String line = in.nextLine();
		while(!(line.contains("!!")))
		{		
				String[] parts = line.split(" ");
				String name = parts[0];
				if(parts[1].length() == 1)
				{
					if(phonebook.get(name) != null)
					{
						System.out.println(name + " has number " + phonebook.get(name));
					}
					else
					{
						System.out.println("Sorry, there is no " + name);
					}
				}
				else
				{
					int number = Integer.parseInt(parts[1]);
					phonebook.put(name,number);		
				}	
				line = in.nextLine();
		}
		System.out.println("Bye");
		System.exit(0);
	}
}
