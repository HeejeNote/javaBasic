package solvearray;

public class ArrayEx1 {

    public static void main(String[] args) {
        /**
         *  아래 코드 배열로 변경
         *  int student1 = 90;
         *  int student2 = 80;
         *  int student3 = 70;
         *  int student4 = 60;
         *  int student5 = 50;
         *  int total = student1 + student2 + student3 + student4 + student5;
         *  double average = (double) total / 5;
         *  System.out.println("점수 총합: " + total);
         *  System.out.println("점수 평균: " + average);
         */

        int[] student = {90, 80, 70, 60, 50};

        int total = 0;

        for(int score : student){
            total += score;
        }

        double average = (double) total / student.length;

        System.out.println("total = " + total);
        System.out.println("average = " + average);

    }
}
