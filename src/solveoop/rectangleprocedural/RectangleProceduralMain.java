package solveoop.rectangleprocedural;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        /**
         * 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하기
         * 절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경
         * Rectangle 클래스를 만들기
         * RectangleOopMain 에 해당 클래스를 사용하는 main() 코드를 만들어라
         */
        Rectangle rectangle = new Rectangle(5,5);

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }


}
