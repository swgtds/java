//program to show the use of static keyword

class StaticKeyword{
    //Static varibale
    static int count=0;

    StaticKeyword(){
        count++;
    }
    //static method 
    static void showcount(){
        System.out.println("Count is "+count);
    }

    public static void main(String[] args) {

        StaticKeyword s1=new StaticKeyword();
        StaticKeyword s2=new StaticKeyword();
        StaticKeyword s3=new StaticKeyword();
        StaticKeyword.showcount();
    }
}