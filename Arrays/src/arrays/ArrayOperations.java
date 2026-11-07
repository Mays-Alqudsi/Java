
package arrays;

import java.util.*;


public class ArrayOperations {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number of elements in the arrays : ");
        int n = in.nextInt();
        System.out.print("Enter yours numbers : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            
         }   
        System.out.println("The Max number is : "+maxCalculate(arr));
        System.out.println("The Min number is : "+minCalculate(arr));
        System.out.println("The sum of numbers is : "+sumOfNumbers(arr));
        System.out.println("The avg of numbers is : "+((double)sumOfNumbers(arr))/arr.length);
        System.out.print("your numbers is : ");
        for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[j]+" ");    
        }
        }
    
    
    
        public static int maxCalculate(int arr[]){
        int Max =arr[0];
            for (int i = 0; i < arr.length; i++) {
            if(arr[i]>Max){
                Max=arr[i];
            }    
            }
        return Max;
        }
    
        public static int minCalculate(int arr[]){
            int Min = arr[0];
            for (int i = 0; i < arr.length ; i++) {
             if(arr[i]<Min){
                 Min =arr[i];
            }   
            }
        return Min;
            }

        public static int sumOfNumbers(int arr[]){
            int sum =0;
            for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];    
            }
            return sum;
        }
    
       
            
}    












