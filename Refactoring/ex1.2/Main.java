import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
   public static void main(String [] args)
   {
       Movie [] movies = { new Movie("Mickey Mouse", Movie.CHILDRENS), new Movie("The Pointer Sisters", Movie.REGULAR)};
       Rental [] rentalsArray = { new Rental(movies[0], 1), new Rental(movies[1], 10)};
       
       List<Rental> rentals = new ArrayList<Rental>(Arrays.asList(rentalsArray));
       
       Customer donald = new Customer("Donald", rentals);
       
       System.out.println(donald.getName());
       System.out.println(donald.getRentals());
       System.out.println(donald); // test the toString() method.
   }
}
