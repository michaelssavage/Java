import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Customer
{
  private String _name;
  private List<Rental> _rentals;
  
  public Customer(String name, List<Rental> rental)
  {
    _name = name;
    _rentals = rental;
  }
  
  public void addRental(List<Rental> arg)
  {
    _rentals.add((Rental) arg);
  }
  
  public String getName()
  {
    return _name;
  }
  
  public List<Rental> getRentals()
  {
    return _rentals;
  }
  
  public String toString()
  {
    return getName() + ": " + getRentals();

  }
  public String htmlStatement()
  {
    String output = "<h1>Statement for " + getName() + "</h1>\n<ol>\n";
    for(Rental rental : getRentals())
      output += "  <li>" + rental.getMovie().getTitle()+ "  " + rental.getCharge() + "</li>\n";

    output += "</ol>\n<p>Amount owed is " + getTotalCharge() + "</p>\n";
    output += "<p>You earned " + getTotalFrequentRenterPoints() +" frequent renter points.</p>\n";
    return output;
  }

  public double getTotal(Rental each)
  {
    return each.getCharge();
  }
  public double getTotalCharge()
  {
    double result = 0;
    for(Rental each : getRentals())
    {
      result += each.getCharge();
    }
    return result;
  }

  public int getFrequentRenterPoints(Rental each)
  {
    return each.getFrequentRenterPoints();
  }

  public int getTotalFrequentRenterPoints()
  {
    int result = 0;
    for(Rental each : getRentals())
    {
      result += each.getFrequentRenterPoints();
    }
    return result;
  }
}