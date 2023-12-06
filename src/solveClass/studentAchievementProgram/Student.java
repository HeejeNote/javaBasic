package solveClass.studentAchievementProgram;

public class Student {

    String name;
    int age;
    int score;

    public Student(){}

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String printStudent() {
        String result = "이름: "  + name + " 나이: " + age + " 성적: " + score;
        return result;
    }
}
