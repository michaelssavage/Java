import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti3
{
    
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner wordfile = new Scanner(new File(args[0]));
        while(wordfile.hasNext())
        {
            String word = wordfile.next();
            String score = score(word,args[1]);
            System.out.println("The score of " + word + " is " + score + ".");
        }
    }    
    public static String score(String word, String review) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(review));
        double score = 0;
        int amount = 0;
        
        while(in.hasNextLine())
        {
            String string = in.nextLine();
            int rating = Integer.parseInt(string.substring(0,1));
            String [] wordlist = string.substring(2).split(" ");
            
            if(contains(wordlist, word))
            {
                amount ++;
                score += rating;
            }
        }
        in.close();
        return String.format("%.2f", (score/amount));
    }
    
    public static boolean contains(String [] wordlist, String reviews)
    {
        for(int i = 0; i < wordlist.length; i++)
        {
            if(wordlist[i].equals(reviews))
            {
                return true;
            }
        }
        return false;
    }
}
