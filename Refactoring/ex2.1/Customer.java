import java.util.List;

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
  public String statement()
  {
    String output = "Statement for " + getName() + "\n";
    for(Rental rental : getRentals())
      output += "  " + rental.getMovie().getTitle()+ "  " + rental.getCharge() + "\n";

    output += "Amount owed is " + getTotalCharge() + "\n";
    output += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points\n";
  
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