package solvepolymorphism.expolymorphism1;

import solvepolymorphism.expolymorphism2.Model3Car;

public class CarMain {
    public static void main(String[] args) {

        Driver driver1 = new Driver();
        K3Car k3Car = new K3Car();
        driver1.setK3Car(k3Car);
        driver1.drive();

    }
}
