import java.util.Scanner;
public class BitMovement {
    int number, result1, result2;
    String numStr, resultStr;
    public BitMovement() {
        System.out.println("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        result1 = number << 5;
        result2 = number >> 3;
        resultStr = number + "<<5=" + result1;
        resultStr += "\n" + number + ">>3=" + result2;
        System.out.println(resultStr);
    }
    
    public static void main(String args[]){
        BitMovement bitMovement = new BitMovement();
        System.exit(0);
    }
}