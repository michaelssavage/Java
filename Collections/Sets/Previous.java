import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Previous
{
	public static void main(String [] args)
    {
	Scanner in = new Scanner(System.in);
	Set<Integer> numbers = new HashSet<Integer>(); // Create a List of Integers
	List<Integer> seen = new ArrayList<Integer>(); // Create a List of Integers

	System.out.println("Enter some numbers (-1 to end)");
	int num = in.nextInt();
	while(num != -1)
	{
		if(numbers.contains(num))
			seen.add(num);
		else
			numbers.add(num);

		num = in.nextInt();
	}

	System.out.println("Previous:");
	for(int number : seen)  // The Integer object is automatically converted back to an int (unbox)
	    System.out.println(number);
    }
}
