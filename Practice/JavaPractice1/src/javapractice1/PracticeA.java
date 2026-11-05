
package javapractice1;

import java.util.Scanner;


public class PracticeA {

   
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter two numbers to find the maximum: ");
        System.out.print("Enter number 1 : ");
        int num1 =in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 =in.nextInt();
        
        if(num1>num2){
        System.out.println("The Maximum number is : "+num1);
        }
        else{
        System.out.println("The Maximum number is : "+num2);
        }
        
    }
    
}
