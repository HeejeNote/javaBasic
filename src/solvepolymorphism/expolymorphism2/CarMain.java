package solvepolymorphism.expolymorphism2;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();


        Driver driver2 = new Driver();
        Model3Car model3Car = new Model3Car();
        driver2.setModel3Car(model3Car);
        driver2.drive();
    }
}
