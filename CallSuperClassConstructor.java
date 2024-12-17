class Animal {
    Animal() {
        System.out.println("Animal Constructor Called");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // Calling the superclass constructor
        System.out.println("Dog Constructor Called");
    }
}

class CallSuperClassConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}

