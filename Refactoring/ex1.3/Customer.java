import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;

class Customer 
{
  private String _name;
  private List<Rental> _rentals;

  public Customer(String name, List<Rental> rentals)
  {
    _name = name;
    _rentals = rentals;
  }

  public void addRental(Rental arg) 
  {
    _rentals.add(arg);
  }

  public String getName()
  {
    return _name;
  }

  public List getRentals()
  {
    return _rentals;
  }
  public String toString()
  {
    return _name + ": " + getRentals();
  }

  public String statement()
  {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "";
    for(Rental each : _rentals)
    {
      double thisAmount = 0;
      thisAmount = amountFor(each);

      frequentRenterPoints ++;
      if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
        frequentRenterPoints ++;

      result += "  " + each.getMovie().getTitle() + "  " + String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
    }
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return result + "\n"; 
  }

  public double amountFor(Rental each)
  {
    double thisAmount = 0;
    switch (each.getMovie().getPriceCode()) 
    {
      case Movie.REGULAR:
        thisAmount += 2;
        if (each.getDaysRented() > 2)
          thisAmount += (each.getDaysRented() - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        thisAmount += each.getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmount += 1.5;
        if (each.getDaysRented() > 3)
          thisAmount += (each.getDaysRented() - 3) * 1.5;
        break;
    }
    return thisAmount;
  }
}
