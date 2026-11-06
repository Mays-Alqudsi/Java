
package practice2;

import java.util.Scanner;


public class oodNumbers {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.print("Enter how many odd numbers you would like to generate : ");
    int n =in.nextInt();
        for (int i = 0; i < (n*2); i++) {
            if(i%2!=0){
                System.out.println(i);
            }  
        }
    }
  
}
