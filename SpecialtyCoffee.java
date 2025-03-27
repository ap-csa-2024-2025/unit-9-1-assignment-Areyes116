public class SpecialtyCoffee extends Coffee
{
    private String flavor;

    // Default constructor
    public SpecialtyCoffee()
    {
        super("small", false, 1, "latte");
        this.flavor = "vanilla";
    }

    // Constructor with 3 parameters
    public SpecialtyCoffee(String size, String type, String flavor)
    {
        super(size, false, 1, type);
        this.flavor = flavor;
    }

    // Constructor with 5 parameters
    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    // toString method
    @Override
    public String toString()
    {
        return super.toString() + " with " + flavor;
    }
}
