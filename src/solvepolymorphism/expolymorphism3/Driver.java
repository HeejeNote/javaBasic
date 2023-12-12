package solvepolymorphism.expolymorphism3;

public class Driver{
    private Car car;

    public void setCar(Car car){
        System.out.println("자동차 선택");
        this.car = car;
    }
    public void drive(){
        System.out.println("자동차 운전");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
