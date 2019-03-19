import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WordLength
{
	public static void main(String [] args)
    {
    	Map<Integer,Integer> wordMap = new HashMap<>();
		Scanner in = new Scanner(System.in);

		while(in.hasNext())
		{
			String text = in.next();
			String [] line = text.split(" ");

			int textLen = text.length();

			for(String s : line)
			{
				if(!wordMap.containsKey(textLen) && textLen != 0)
				{
					wordMap.put(textLen,1);
				}
			
				else if(textLen != 0)
				{
					int amount = wordMap.get(textLen);
					wordMap.put(textLen, amount + 1);
				}
			}
		}

		List<Integer> numbers = new ArrayList<Integer>(wordMap.keySet());

		Collections.sort(numbers);

		for(int num : numbers)
		{
			System.out.println(num + ": " + wordMap.get(num));
		}
    }
}
