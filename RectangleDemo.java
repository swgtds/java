class Rectangle {
    // Data members
    private double length;
    private double breadth;
    private double height;

    // Parameterized constructor
    public Rectangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Function to calculate surface area
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    // Function to calculate volume
    public double volume() {
        return length * breadth * height;
    }

    // Function to display the surface area and volume
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Surface Area: " + surfaceArea());
        System.out.println("Volume: " + volume());
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        // Creating a Rectangle object using the parameterized constructor
        Rectangle rectangle = new Rectangle(5.0, 3.0, 2.0);

        // Displaying surface area and volume
        System.out.println("Details of the Rectangle:");
        rectangle.display();
    }
}
