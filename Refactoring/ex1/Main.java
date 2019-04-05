public class Main
{
   public static void main(String [] args)
   {
       Movie [] movies = { new Movie("Mickey Mouse", Movie.CHILDRENS), new Movie("The Pointer Sisters", Movie.REGULAR)};
       
       int count = 0;
       
       for(Movie movie : movies)
       {
          System.out.println("Movie " + ++count);
          System.out.println("    " + movie.getTitle());
          System.out.println("    " + movie.getPriceCode());
          movie.setPriceCode(Movie.NEW_RELEASE);
          System.out.println("    " + movie.getPriceCode());
       }
   }
}
