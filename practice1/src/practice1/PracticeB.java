
package practice1;

import java.util.Scanner;

public class PracticeB {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    System.out.print("Enter number 1 : ");
    int num1 = in.nextInt();
    System.out.print("Enter number 2 : ");
    int num2 = in.nextInt();
    System.out.println("select number of menu :");
    System.out.println("the menu : ");
    System.out.println("1- Add");
    System.out.println("2- Sub");
    System.out.println("3- Mul");
    System.out.println("4- Div");
    System.out.print("My choice is : ");
    int ch = in.nextInt();
   
    switch (ch){
    case 1 : System.out.println("The Add Numbers is : " +(num1 + num2)); break;
    case 2 : System.out.println("The Sub Numbers is : " +(num1 - num2)); break;
    case 3 : System.out.println("The Mul Numbers is : " +(num1 * num2)); break;
    case 4 :  if (num2==0){
    System.out.println("Undefined value"); break;
    } else {
    System.out.println("The Div Numbers is : " +(num1 / num2)); break;}
    default: System.out.println("Wrong Number");
}
}
}