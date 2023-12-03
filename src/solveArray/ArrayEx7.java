package solveArray;

import java.util.Scanner;

public class ArrayEx7 {
    /**
     * 1번 학생의 성적을 입력하세요:
     * 국어 점수:100
     * 영어 점수:80
     * 수학 점수:70
     * 2번 학생의 성적을 입력하세요:
     * 국어 점수:30
     * 영어 점수:40
     * 수학 점수:50
     * 3번 학생의 성적을 입력하세요:
     * 국어 점수:60
     * 영어 점수:70
     * 수학 점수:50
     * 4번 학생의 성적을 입력하세요:
     * 국어 점수:90
     * 영어 점수:100
     * 수학 점수:80
     * 1번 학생의 총점: 250, 평균: 83.33333333333333
     * 2번 학생의 총점: 120, 평균: 40.0
     * 3번 학생의 총점: 180, 평균: 60.0
     * 4번 학생의 총점: 270, 평균: 90.0
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] student = new int[4][3];
        String[] subjects = {"국어","영어","수학"};

        for(int i = 0; i < student.length; i++){
            System.out.println(i+1 + "번 학생의 성적을 입력하세요:");
            int sum = 0;
            for(int j = 0; j < student[i].length; j++){
                student[i][j] = sc.nextInt();
                sum += student[i][j];
                System.out.println(subjects[j] + " : " + student[i][j]);
            }

            double avg = (double) sum/ student[i].length;
            System.out.println(i+1 + "번 학생의 총점 : " + sum + " 평균 : " + avg);
        }
        
    }
}
