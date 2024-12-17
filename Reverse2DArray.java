import java.util.Scanner;
//Program to reverse a 2D array
class Reverse2DArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows for array");
        int rows=sc.nextInt();
        System.out.println("Enter columns for array:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        //Array input
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //Array Reverse 
        System.out.println("After reverse:");
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            

        }

    }
}