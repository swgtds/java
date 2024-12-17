//program to sort numbers in both ascending and descending
import java.util.Arrays;
import java.util.Scanner;
class SortNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of numbers  to sort:");
        int size=sc.nextInt();

        //array input
        int numbers[]= new int[size];
        System.out.println("Enter numbers to sort:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        //sorting numbers
        System.out.println("enter 1 for Ascending or 2 for descending?:");
        int choice =sc.nextInt();
        if(choice==1){
            Arrays.sort(numbers);;
            System.out.println("sorted numbers in ascending:");
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
        }

        else if (choice==2){
            Arrays.sort(numbers);
            System.out.println("sorted numbers in descending order:");
            for(int i=numbers.length-1;i>=0;i--){
                System.out.print(numbers[i]+" ");
            }
        }

        else{
            System.out.println("Invalid");

        }

    }
} 