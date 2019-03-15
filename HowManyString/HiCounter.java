import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String word = in.next();
        int length = word.length();
        int i = 0;
        int count = 0;

        while (i + 1 < length)
        {
            String hi = word.substring(i, i + 2);
            if (hi.equals("hi"))
            {
                count ++;
            }
            i ++;
        }
    System.out.println(count);
    }
}
