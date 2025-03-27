import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Creating and testing Student objects
        Student student1 = new Student("Alice", 16, 11, 3.8);
        Student student2 = new Student(10, 3.5);
        Student student3 = new Student();
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // Creating and testing Employee objects
        Employee employee1 = new Employee("Bob", 30, "Software Engineer", 90000);
        Employee employee2 = new Employee("Carol", 40, "Manager", 120000);
        
        System.out.println(employee1);
        System.out.println(employee2);
        
        // Creating and testing SpecialtyCoffee objects
        SpecialtyCoffee coffee1 = new SpecialtyCoffee();
        SpecialtyCoffee coffee2 = new SpecialtyCoffee("medium", "cappuccino", "hazelnut");
        SpecialtyCoffee coffee3 = new SpecialtyCoffee("large", true, 2, "mocha", "caramel");
        
        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println(coffee3);
    }
}
