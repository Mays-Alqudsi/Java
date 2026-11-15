
package employeesalaryapplication;


public class Employee {
private int ID;
private String name;
private int basic;
private int allowances;
private int deduction;

    public int getTotalSalary(){
        int total=basic+allowances-deduction;
        return total;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getBasic() {
        return basic;
    }

    public int getAllownces() {
        return allowances;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void setAllowances(int allownces) {
        this.allowances = allownces;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public Employee(int ID , String name, int basic, int allowances, int deduction) {
        this.ID = ID;
        this.name = name;
        this.basic = basic;
        this.allowances = allowances;
        this.deduction = deduction;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "employee{" + "ID=" + ID + ", name=" + name + ", basic=" + basic + ", allownces=" + allowances + ", deduction=" + deduction + '}';
    }


    
}
