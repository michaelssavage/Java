public class Main
{
    public static void main(String [] args)
    {
        Price cp = new ChildrensPrice();
        Price nrp = new NewReleasePrice();
        Price reg = new RegularPrice();
        
        boolean ok = true;
        
        if(cp.getPriceCode() != Price.CHILDRENS)
        {
            System.out.println("Children's price does not have the correct price code.");
            ok = false;
        }
        if(nrp.getPriceCode() != Price.NEW_RELEASE)
        {
            System.out.println("New Release price does not have the correct price code.");
            ok = false;
        }
        if(reg.getPriceCode() != Price.REGULAR)
        {
            System.out.println("The regular price does not have the correct price code.");
            ok = false;
        }
        if(ok)
            System.out.println("All good.");
    }
}