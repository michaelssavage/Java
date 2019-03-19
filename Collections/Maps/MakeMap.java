import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MakeMap
{
    public static Map<String,Integer> makeMap(Scanner in)
    {
    	Map<String,Integer> students = new HashMap<>();
    	while(in.hasNext())
      	{
         // Read the input and add it to the map.
      		String name = in.next();
      		int mark = in.nextInt();
      		students.put(name,mark);
      	}
    return students;
    }
}
