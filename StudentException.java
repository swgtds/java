class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

class StudentException {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "John", 25, "Computer Science");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
