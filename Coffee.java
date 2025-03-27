public class SpecialtyCoffee extends Coffee
{
    private String flavor;

    // Default constructor
    public SpecialtyCoffee()
    {
        super(); // Calls the default constructor of Coffee
        this.flavor = "vanilla";
    }

    // Parameterized constructor
    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
    {
        super(size, isSkinny, shots, type); // Calls the superclass constructor
        this.flavor = flavor;
    }

    // Getter method for flavor
    public String getFlavor()
    {
        return flavor;
    }

    // Setter method for flavor
    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    // Override toString method to include flavor
    @Override
    public String toString()
    {
        return super.toString() + " with " + flavor + " flavor";
    }
}