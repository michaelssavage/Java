import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspicious
{
    public static void main(String [] args)
    {
        try
        {
            Set<String> students = new HashSet<String>();
            Scanner sc = new Scanner(new File(args[0]));
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                students.add(line);
            }
            sc.close();
            
            sc = new Scanner(new File(args[1]));
            int i = 1;
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(students.contains(line))
                {
                    System.out.println(i+ ". " + line);
                    i++;
                }
            }
        }
        catch(Exception e){   
        }
    }
}
