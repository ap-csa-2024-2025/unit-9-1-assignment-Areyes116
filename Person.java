public class Person
{
    private String name;
    private int age;

    // Non-default constructor
    public Person(String iName, int iAge)
    {
        this.name = iName;
        this.age = iAge;
    }

    // Default constructor
    public Person()
    {
        this("John Doe", 0);
    }

    // Setters and getters
    public void setName(String iName)
    {
        name = iName;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int iAge)
    {
        age = iAge;
    }

    public int getAge()
    {
        return age;
    }

    // toString method
    public String toString()
    {
        return "A Person named " + name + ", age " + age;
    }
}
