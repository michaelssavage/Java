import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
   public static void main(String [] args)
   {
      Map<String, Integer> students = MakeMap.makeMap(new Scanner(System.in));

      List<String> names = new ArrayList<String>(students.keySet());
      Collections.sort(names);
      for(String name : names)
         System.out.println(name + " has mark " + students.get(name));
   }
}
