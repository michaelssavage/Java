import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        String word = Game.getRandomWord();

        String newStr = "";
        for(int i = 0; i < word.length(); i++)
        {
            newStr += "_";
        }
        // amount of guesses allowed.
        int amount = 10;
        System.out.print("\n" + "The word is ");

        // initial blank string 
        System.out.println(newStr);
        
        String guesses = "";
        boolean finished = Game.allDone(word, newStr);
        while(finished != true)
        {
            if(amount == 0)
            {
                break;
            }
            System.out.println("You have " + amount + " attempts. Guess a letter:");
            guesses += in.next();

            newStr = Game.showLetters(word, guesses);
            amount -= 1;
            System.out.println(newStr);

            finished = Game.allDone(word, newStr);
        }
    if(finished)
        System.out.println("Well Done, the word was " + newStr + ".");
    else
        System.out.println("Too many guesses, try again!");
    }
}
