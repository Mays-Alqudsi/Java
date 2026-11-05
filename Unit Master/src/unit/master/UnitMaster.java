
package unit.master;

import java.util.Scanner;


public class UnitMaster {
    
    public static double cmToInch(double num){
    double ci =(num/2.54);
    return ci; 
    }
    public static double inchToCm(double num){
    double ic =(num*2.54);
    return ic; 
    }
    public static double mToFeet(double num){
    double mf =(num/0.3048);
    return mf; 
    }
    public static double feetToM(double num){
    double fm =(num*0.3048);
    return fm; 
    }
    public static double celToFenh(double num){
    double cf =((num*1.8)+32);
    return cf; 
    }
    public static double fenhToCel(double num){
    double fc =((num-32)/1.8);
    return fc; 
    }
    public static double hektarToDunm(double num){
    double hd =(num*10);
    return hd; 
    }
    public static double dunmToHektar(double num){
    double dh =(num/10);
    return dh; 
    }

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    System.out.println("The menu: ");
    System.out.println("1- cm to inch");
    System.out.println("2- inch to cm");
    
    System.out.println("3- m to feet");
    System.out.println("4- feet to m");
    
    System.out.println("5- cel to fenh");
    System.out.println("6- fenh to cel");
    
    System.out.println("7- hectar to dunm");
    System.out.println("8- dunm to hectar");
    
    System.out.print("Enter number from the menu to calculate : ");
    int n =in.nextInt();
    if(n>=1 && n<=8){
    System.out.print("Enter the number : ");
    double num =in.nextDouble();
    System.out.print("The result : ");
    switch (n){ 
    case 1: System.out.println(cmToInch(num)); break;
    case 2: System.out.println(inchToCm(num)); break;
    case 3: System.out.println(mToFeet(num)); break;
    case 4: System.out.println(feetToM(num)); break;
    case 5: System.out.println(celToFenh(num)); break;
    case 6: System.out.println(fenhToCel(num)); break;
    case 7: System.out.println(hektarToDunm(num)); break;
    case 8: System.out.println(dunmToHektar(num)); break;
    }}
    else {
    System.out.println("Wrong Number! Please select a valid option from 1 to 8.");
        }
    
    }
}
