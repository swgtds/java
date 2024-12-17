//Program to reverse 1D array
import java.util.Scanner;
class ReverseArray{
    public static void main(String args[]){
        System.out.println("Enter array size:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        //Array input
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Before reverse
        System.out.println("Before Reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //After reverse 
        System.out.println("After Reverse:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}