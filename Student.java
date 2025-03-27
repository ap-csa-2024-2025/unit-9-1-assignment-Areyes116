/** The Student class is a subclass of the Person class
 *  A student has both a name and an age, but also has
 *  a grade level and a GPA.
 */
public class Student extends Person
{
    private int grade;
    private double gpa;

    // Non-default constructor with parameters
    public Student(String iName, int iAge, int iGrade, double iGpa)
    {
        super(iName, iAge); // Call the superclass constructor
        this.grade = iGrade;
        this.gpa = iGpa;
    }

    // Non-default constructor with default name and age
    public Student(int iGrade, double iGpa)
    {
        super("John Doe", 0); // Default name and age
        this.grade = iGrade;
        this.gpa = iGpa;
    }

    // Default constructor
    public Student()
    {
        super("John Doe", 0); // Default name and age
        this.grade = 0;
        this.gpa = 0.0;
    }

    // Getters and Setters
    public void setGrade(int iGrade)
    {
        grade = iGrade;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGpa(double iGpa)
    {
        gpa = iGpa;
    }

    public double getGpa()
    {
        return gpa;
    }

    // Overriding toString method
    @Override
    public String toString()
    {
        return "A Student named " + getName() + ", age " + getAge() + ", in grade " + grade + " with a GPA of " + gpa;
    }
}
