// A class just to test that the statement method uses the getTotal() method.

class DummyTester extends Customer
{
    public DummyTester(String name, List rentals)
    {
        super(name, rentals);
    }
    
    // Note that we can only do this if getTotal exists in the parent class (Customer)
    public int getFrequentRenterPoints(Rental rental)
    {
        return super.getFrequentRenterPoints(rental) * 2;  // Just double the rental points!
    }
}
