import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ListSort
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		List<Integer> sorted = new ArrayList<Integer>(); // Create a List of Integers

		System.out.print("Enter numbers: ");
		int num = in.nextInt();
		while(num != -1)
		{
			sorted.add(num);
			num = in.nextInt();
		}
		Collections.sort(sorted);
		System.out.print("Sorted: ");
		for(int number : sorted)  // The Integer object is automatically converted back to an int (unbox)
	    		System.out.print(number + " ");
	    		System.out.println();
    	}
}
