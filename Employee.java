// Assuming there is a Person class
public class Employee extends Person
{
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, int age, String jobTitle, double salary)
    {
        super(name, age); // Call the constructor of the Person class
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter for jobTitle
    public String getJobTitle()
    {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Overriding toString method
    @Override
    public String toString()
    {
        return super.toString() + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }
}