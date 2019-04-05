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

    public double getTotal(Rental each)
    {
        return each.getCharge();
    } 

    public String statement()
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "";
        for(Rental each  : _rentals)
        {
            double thisAmount = getTotal(each);
            frequentRenterPoints += getFrequentRenterPoints(each);
            
            result += "  " + each.getMovie().getTitle()+ "  " + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points" + "\n";
        return result;
    }
    public int getFrequentRenterPoints(Rental each)
    {
    if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
       return 2;
    else
       return 1;
    }
}