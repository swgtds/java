//class cicle and create objects for that 
class Circle1{
    private double radius;

    //no arg constructor
    public Circle1() {
        radius = 1.0;
    }

    //parameterised constructor
    public Circle1(double radius){
        this.radius=radius;
    }

    //radius method 
    public double getRadius(){
        return radius;
    }

    //area method
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class Circle{
    public static void main(String args[]){
        Circle1 c1=new Circle1(2.0);
        Circle1 c2=new Circle1(12);
        Circle1 c3=new Circle1(24);

        System.out.println("Circle  c1 with Radius: "+c1.getRadius()+" has Area of "+c1.getArea());
        System.out.println("Circle  c2 with Radius: "+c2.getRadius()+" has Area of "+c2.getArea());
        System.out.println("Circle  c3 with Radius: "+c3.getRadius()+" has Area of "+c3.getArea());
    }
}

