//Program to show multiple inheritance in java
interface Printable {
    // Abstract methods
    void print();
}

interface Showable {
    void show();
}

class Multiple implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("The text is printed.");
    }

    @Override
    public void show() {
        System.out.println("The text is shown.");
    }

}

class MultipleInheritance {
    public static void main(String args[]) {
        Multiple obj = new Multiple();

    
        obj.print();
        obj.show();
    }
}
