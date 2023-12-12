package solvepolymorphism.expolymorphism1;

import solvepolymorphism.expolymorphism2.Model3Car;

public class Driver {

    private K3Car k3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive(){
        k3Car.startEngine();
        k3Car.pressAccelerator();
        k3Car.offEngine();
    }


}
