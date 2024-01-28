package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Course class definition
class Course {
    // Data members
    private int ID;
    private String name;
    private String code;

    // Default constructor
    public Course() {
        // Initialize with default values or leave them uninitialized
    }

    // Overloaded constructor with parameters to update member variables
    public Course(int ID, String name, String code) {
        this.ID = ID;
        this.name = name;
        this.code = code;
    }

    // Getter and setter methods for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

// Driver class with main method
public class CourseDriver {
    public static void main(String[] args) {
        // Instantiate the Course class using the default constructor
        Course myCourse = new Course();

        // Display initial values
        System.out.println("Initial Values:");
        System.out.println("ID: " + myCourse.getID());
        System.out.println("Name: " + myCourse.getName());
        System.out.println("Code: " + myCourse.getCode());

        // Use the overloaded constructor to update values
        Course updatedCourse = new Course(123, "Java Programming", "CS101");

        // Display updated values
        System.out.println("\nUpdated Values (using overloaded constructor):");
        System.out.println("ID: " + updatedCourse.getID());
        System.out.println("Name: " + updatedCourse.getName());
        System.out.println("Code: " + updatedCourse.getCode());

        // Alternatively, use setter methods to update values
        updatedCourse.setID(456);
        updatedCourse.setName("Data Structures");
        updatedCourse.setCode("CS201");

        // Display updated values
        System.out.println("\nUpdated Values (using setters):");
        System.out.println("ID: " + updatedCourse.getID());
        System.out.println("Name: " + updatedCourse.getName());
        System.out.println("Code: " + updatedCourse.getCode());
    }
}
