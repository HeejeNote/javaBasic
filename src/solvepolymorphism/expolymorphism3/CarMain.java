package solvepolymorphism.expolymorphism3;

public class CarMain {
    public static void main(String[] args) {
        /**
         * river : 운전자는 자동차( Car )의 역할에만 의존한다. 구현인 K3, Model3 자동차에 의존하지 않는다.
         * Driver 클래스는 Car car 멤버 변수를 가진다. 따라서 Car 인터페이스를 참조한다.
         * 인터페이스를 구현한 K3Car , Model3Car 에 의존하지 않고, Car 인터페이스에만 의존한다.
         * 여기서 설명하는 의존은 클래스 의존 관계를 뜻한다. 클래스 상에서 어떤 클래스를 알고 있는가를 뜻한다.
         * Driver 클래스 코드를 보면 Car 인터페이스만 사용하는 것을 확인할 수 있다.
         */
        Driver driver1 = new Driver();
        Car car1 = new K3Car();
        driver1.setCar(car1);
        driver1.drive();

        Driver driver2 = new Driver();
        Car car2 = new Model3Car();
        driver2.setCar(car2);
        driver2.drive();

    }
}
