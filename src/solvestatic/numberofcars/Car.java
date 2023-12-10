package solvestatic.numberofcars;

public class Car {

    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름 : " + this.name);
        Car.count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + Car.count);
    }
}
