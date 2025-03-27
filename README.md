[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18894414)
# unit-9-1-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Classwork
Complete the `Person` and `Student` classes per the class lecture.

## Homework
# Coffee Subclass Coding Activity

For this coding activity, you will need to write a subclass of the `Coffee` class, which you can view in the `Coffee.java` file. This class has the following attributes:

- `size` (String)
- `isSkinny` (boolean)
- `shots` (int)
- `type` (String)

You will **not** need to edit this class for the exercise.

## Task: Create the SpecialtyCoffee Class

You are required to write a `SpecialtyCoffee` class that **extends** the `Coffee` class, and has the additional attribute `flavor` (String). Your `SpecialtyCoffee` class should have the following constructors:

1. **Default Constructor (no parameters)**:
   - Creates a small, non-skinny, single-shot latte with vanilla.

2. **Constructor with 3 Parameters**:
   - Takes three parameters: `size`, `type`, and `flavor`.
   - Sets the relevant attributes to these values, and all other values to their default values.

3. **Constructor with 5 Parameters**:
   - Takes five parameters representing each of the attributes of a `SpecialtyCoffee`.

Once the constructors are written, you should add a `toString()` method, which prints the `SpecialtyCoffee` as though it were a `Coffee` object, but **adds "with" and the `flavor`** to the end of this string.

## Summary of Constructors and Output

The table below summarizes the state of the object created by calls to the three different constructors, along with the expected output from the `toString()` method:

| Constructor Call | `size`   | `isSkinny` | `shots` | `type`     | `flavor`    | `toString()` Output                                   |
|------------------|----------|------------|---------|------------|-------------|-------------------------------------------------------|
| `new SpecialtyCoffee()`                | "small"  | false      | 1       | "latte"    | "vanilla"   | "small 1-shot latte with vanilla"                    |
| `new SpecialtyCoffee("large", "mocha", "caramel")` | "large"  | false      | 1       | "mocha"    | "caramel"    | "large 1-shot mocha with caramel"                    |
| `new SpecialtyCoffee("medium", true, 2, "cappuccino", "gingerbread")` | "medium" | true       | 2       | "cappuccino" | "gingerbread" | "medium skinny 2-shot cappuccino with gingerbread"   |
