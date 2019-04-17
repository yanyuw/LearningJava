import java.util.Scanner;
public class ChineseGrade2 {
    Scanner scanner;

    public ChineseGrade2() {
        scanner = new Scanner(System.in);
        inputScore();
    }

    public void inputScore() {
        System.out.println("请输入10位学生的成绩:");
        for(int i = 0; i < 10; i++){
            int s = scanner.nextInt();
            String grade = judgeGrade(s);
            System.out.println("成绩" + s + "的等级是" + grade);
        }
    }
    
    public String judgeGrade(int score) {
        if(score > 100 || score < 0){
            return "wrong grades";
        } else if(score >= 90 && score <= 100){
            return "Grades: A";
        } else if (score >= 80){
            return "Grades: B";
        } else {
            return "Grades: C";
        }
    }
    
    public static void main(String args[]) {
        ChineseGrade2 grade = new ChineseGrade2();
        System.exit(0);
    }
}