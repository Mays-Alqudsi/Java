
package car;


public class carTest {
    public static void main(String[] args) {
        car c1 = new car();
        c1.type="toyota";
        c1.year=2010;
        c1.turnOn();
        c1.moveForword();
        c1.movebackword();
        c1.stop();
        c1.turnOff();
        
        car c2 = new car();
        c2.type="bmw";
        c2.year=2025;
        c2.turnOn();
        c2.moveForword();
        c2.movebackword();
        c2.stop();
        c2.turnOff();
    }
    
}
