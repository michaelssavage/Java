import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti2
{
	public static void main(String [] args) throws FileNotFoundException
	{
		double score = 0;
		int amount = 0;
		String word = args[0];
		Scanner in = new Scanner(new File(args[1]));
		while(in.hasNext())
		{
			int rating = in.nextInt();
			String review = in.nextLine();

			if(review.contains(word))
			{
				score += rating;
				amount ++;
			}
		}
	System.out.println(word + " appears " + amount + " times.");
	System.out.print("The average score of the reviews containing " + word + " is ");

	if(amount != 0)
		System.out.printf("%.2f\n", (score/amount));
	else
		System.out.printf("%.2f\n", 0.00);
	}
}
