
package employeesalaryapplication;

import java.util.Scanner;


public class EmployeeTest {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        Employee e1 = new Employee(10,"Ata",300,100,70);
        System.out.println(e1);
        System.out.println(e1.getTotalSalary());
        System.out.println("=========================");
        Employee e2 = new Employee(20,"kamal",500,180,90);
        System.out.println(e2);
        System.out.println(e2.getTotalSalary());
        System.out.println("=========================");
        Employee e3 = new Employee();
        System.out.print("Enter ID : ");
        e3.setID(in.nextInt());
        System.out.print("Enter employee name : ");
        e3.setName(in.nextLine());
        System.out.print("Enter employee basic salary : ");
        e3.setBasic(in.nextInt());
        System.out.print("Enter employee allownces salary : ");
        e3.setAllowances(in.nextInt());
        System.out.print("Enter employee deduction salary : ");
        e3.setDeduction(in.nextInt());
        System.out.println(e3.getTotalSalary());
    }
   
}
