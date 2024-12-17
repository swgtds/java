class BaseClass {
    void display() {
        System.out.println("Base Class Method");
    }
}

class DerivedClass extends BaseClass {
    @Override
    void display() {
        System.out.println("Derived Class Method");
    }
}

class OverrideExample {
    public static void main(String[] args) {
        BaseClass obj = new DerivedClass();
        obj.display();
    }
}
