class ThrowAndThrows{
    public static void AgeCheck(int age) throws Exception{
        if(age<18){
            throw new Exception("You are not eligible ");
        }
        
        System.out.println("You are eligible ");
    }
    public static void main(String args[]){
        try{
            AgeCheck(15);
            //AgeCheck(20);
        }
        catch (Exception e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}