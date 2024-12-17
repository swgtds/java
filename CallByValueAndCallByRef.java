//Program to show call by value and call by reference
class CallByValueAndCallByRef{
    void callByValue(int num){
        num += 10;
        System.out.println("Inside callByValue method: "+num);
        
    }

    void callByRef(int[] arr){
        arr[0]+=10;
        System.out.println("Inside callByRef method: "+arr[0]);
    
    }
    public static void main(String[] args) {
        CallByValueAndCallByRef call = new CallByValueAndCallByRef();
        int number = 10;
        System.out.println("Before callByValue: number:" + number);
        call.callByValue(number);
        System.out.println("Outside callByValue method: "+number);
        int array[]={5};
        System.out.println("Before callByRef: Array:" + array[0]);
        call.callByRef(array);
        System.out.println("Outside callByRef method: "+array[0]);
    }
}