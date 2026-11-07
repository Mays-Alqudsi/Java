
package arrays;

import java.util.Scanner;

public class ArraySumPrinter {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number of values you want to add : ");
        int n =in.nextInt();
        int arr[]=new int [n];
        int sum=0;
        System.out.print("Your numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            sum+=arr[i];     
        }
        System.out.println("The Sum of Numbers is : "+ sum);
        System.out.print("Your Numbers : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");   
        }
    }
}

