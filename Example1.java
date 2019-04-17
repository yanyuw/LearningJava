public class Example1 {
    public static void main(String args[]){
        int i = 0;
        double x = 2.3;
        System.out.println("结果1：" + (--i + i + i++)); // -1+-1+-1 = -3 运算后i=0
        System.out.println("结果2：" + (i+++i)); //0+1=1 运算后i=1
        i += i+ (i=4); //i = i+(i+4)=1+(1+4)=6; 通过四则运算利用堆栈来理解，在i=4时前面的i已经作为1入栈了 
        System.out.println("结果3：" + i);
        i = 3 + 3*2 % i--; // i =3+6%6= 3 
        System.out.println("结果4：" + i);
        x += 1.2 * 3 + x++; // x = 2.3+3.6+2.3=4.6+3.6=8.2
        System.out.println("结果5：" + x);
        x = x % 3 + 4*2 + x--; // x = 8.2 % 3 + 8 + 8.2 = 2.2+16.2=18.4
        System.out.println("结果6；" + x);
    }
}