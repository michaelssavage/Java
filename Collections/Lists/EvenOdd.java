import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd
{
	public static void main(String [] args)
    {
	Scanner in = new Scanner(System.in);
	List<Integer> oddnum = new ArrayList<Integer>(); // Create a List of Integers
	List<Integer> evennum = new ArrayList<Integer>(); // Create a List of Integers

	System.out.print("Enter numbers: ");
	int num = in.nextInt();
	while(num != -1)
	{
		if(num % 2 == 0)
			evennum.add(num);
		else
			oddnum.add(num);

	    num = in.nextInt();
	}

	System.out.print("\nOdd: ");
	for(int number : oddnum)  // The Integer object is automatically converted back to an int (unbox)
	    System.out.print(number + " ");

	System.out.print("\nEven: ");
	for(int number : evennum)  // The Integer object is automatically converted back to an int (unbox)
	    System.out.print(number + " ");
    }
}
