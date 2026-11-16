
package computers;

public class Computers {
private String brand;
private String processer;
private int ram;

    public String getBrand() {
        return brand;
    }

    public String getProcesser() {
        return processer;
    }

    public int getRam() {
        return ram;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcesser(String processer) {
        this.processer = processer;
    }

    public void setRam(int ram) {
        if(ram>=4){
        this.ram = ram;
        }
    }

    public Computers() {
    }

    public Computers(String brand, String processer, int ram) {
        this.brand = brand;
        this.processer = processer;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computers{" + "brand=" + brand + ", processer=" + processer + ", ram=" + ram + '}';
    }
}
