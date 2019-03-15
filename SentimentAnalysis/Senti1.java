import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
	public static void main(String [] args) throws FileNotFoundException
	{
		int score = 0;
		String word = args[0];
		Scanner in = new Scanner(new File(args[1]));
		while(in.hasNext())
		{
			int rating = in.nextInt();
			String review = in.nextLine();

			if(review.contains(word))
			{
				score ++;
			}
		}
	System.out.println(word + " appears " + score + " times.");
	}
}
