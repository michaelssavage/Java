public class WordScore
{
    String word;
    int score;
    
    public WordScore(String word)
    {
        this.word = word;
    }
    
    public int score(String review)
    {
        String[] wordlist = review.split(" ");
        
        for(int i = 1; i < wordlist.length; i++)
        {
            if(wordlist[i].equals(this.word))
            {
                return Integer.parseInt(review.substring(1,2));
            }
        }
    return -1;
    }
}
