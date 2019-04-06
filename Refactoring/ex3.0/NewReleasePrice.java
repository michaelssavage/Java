class NewReleasePrice extends Price 
{
	int getPriceCode() 
	{
		return Price.NEW_RELEASE;
	}
	double getCharge(int daysRented)
	{
		double result = 0;
		result += daysRented * 3;
		return result;
	}
	int getFrequentRenterPoints(int daysRented)
	{
		return (daysRented > 1) ? 2: 1;
	}
}