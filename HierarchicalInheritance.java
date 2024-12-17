//Hierarchical inheritance 

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
class HierarchicalInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
