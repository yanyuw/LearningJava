import java.util.Scanner;
public class CompareTwoNumbers1 {
    double number1, number2, max;
    // Scanner scanner;
    public CompareTwoNumbers1(){
        System.out.println("请输入2个数字：");
        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        number2 = in.nextInt();
        max = number1 > number2 ? number1 : number2;
        System.out.println("较大的数值是" + max);
    }
    public static void main(String args[]){
        CompareTwoNumbers1 ct = new CompareTwoNumbers1();
        System.exit(0);
    }
}