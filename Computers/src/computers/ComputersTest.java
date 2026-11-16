
package computers;

import java.util.Scanner;


public class ComputersTest {
    
     public static void ramcheck(Computers c){
            if(c.getRam()>16){
                System.out.println("Ram Checking : ");
                System.out.println(c.toString());
            }
        }
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of computers : ");
        int n = in.nextInt();
        for (int i = 0; i < n ; i++) {
        Computers c = new Computers();
            System.out.print("Enter name of brand : ");
        c.setBrand(in.next());
            System.out.print("Enter name of processer : ");
        c.setProcesser(in.next());
            System.out.print("Enter number of ram : ");
        c.setRam(in.nextInt());
        
        
            ramcheck(c);
        System.out.println("=====================");
            
        }
    }
}
