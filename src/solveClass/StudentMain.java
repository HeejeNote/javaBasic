package solveClass;

public class StudentMain {

    /**
     * ::: 요구사항 :::
     * 1.첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
     * 2.두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
     * 3.각학생의 정보를 다음과 같은 형식으로 출력해야 합니다 : "이름: [이름] 나이: [나이] 성적: [성적]"
     * 4.변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
     */
    public static void main(String[] args) {

        Student student1 = new Student("학생1", 15,90);
        Student student2 = new Student("학생2", 16,80);
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
