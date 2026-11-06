
package practice2;

import java.util.Scanner;


public class primeNumbers {
    
    public static boolean primeCheck(int num){
    if(num<=1){
    return false;
    }
        for (int i = 2; i <= Math.sqrt(num); i++) {
        if(num%i==0)    
        return false;
        }
    return true;
        }
    

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter how many Prime numbers you would like to generate :");
        int n =in.nextInt();
        int count=0;
        int i=2;
        while (count<n){
            if(primeCheck(i)){
            System.out.println(i); 
              count++;
 
         } 
            i++;
        }
       
}}
