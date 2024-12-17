class Student {
    int rollNo;
    String name;
    int age;

    // Default constructor
    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.age = other.age;
    }

    // Display method to show object data
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class CopyConstructorDemo {
    public static void main(String[] args) {
        // Creating the first object
        Student student1 = new Student(1, "John Doe", 20);
        System.out.println("Original Object (student1):");
        student1.display();

        // Creating the second object using the copy constructor
        Student student2 = new Student(student1);
        System.out.println("\nCopied Object (student2):");
        student2.display();

        // Modifying the original object to show that the copied object is independent
        student1.name = "Jane Doe";
        student1.age = 21;

        System.out.println("\nAfter Modifying Original Object (student1):");
        student1.display();

        System.out.println("\nCopied Object (student2) Remains Unchanged:");
        student2.display();
    }
}
