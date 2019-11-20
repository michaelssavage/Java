public class Best
{
    // This method returns the best boxer with win / fights
    public static Boxer getBestBoxer(Boxer [] boxer){
        int win = 0;
        for(int i = 1; i < boxer.length; i++){
            if(boxer[i].winPercentage() > boxer[win].winPercentage())
                win = i;
        }
    return boxer[win];
    }

    // This method returns the tallest boxer.
    public static Boxer getTallest(Boxer [] boxer){
        int tall = 0;
        for(int i = 1; i < boxer.length; i++){

            //compareHeight gets the integer. Can't compare Strings.
            if(boxer[i].compareHeight() > boxer[tall].compareHeight())
                tall = i;
        }
    return boxer[tall];
    }
}
