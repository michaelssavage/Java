public abstract class Animal
{
    public Animal(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", my name is " + name;
    }
    // private
    private String name;
}
