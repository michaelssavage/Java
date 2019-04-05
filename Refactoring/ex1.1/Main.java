public class Main
{
   public static void main(String [] args)
   {
       Movie [] movies = { new Movie("Mickey Mouse", Movie.CHILDRENS), new Movie("The Pointer Sisters", Movie.REGULAR)};
       Rental [] rentals = { new Rental(movies[0], 1), new Rental(movies[1], 10)};
       
       int count = 0;
       
       for(Rental rental : rentals)
       {
          System.out.println("Rental " + ++count);
          System.out.println("    " + rental.getMovie());
          System.out.println("    " + rental.getDaysRented());
          System.out.println("    " + rental); // test the toString() method
       }
   }
}
