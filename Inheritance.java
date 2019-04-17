class Telephone {
    String brand, number;
    double dialledTime;
    double rate;
    Telephone(String b, String n){
        brand = b;
        number = n;
    }
    String getBrand() {
        return brand;
    }
    String getNumber() {
        return number;
    }
    double getRate() {//代码1 返回费率值
        return rate;
    }
    double getDialledTime() {
        return dialledTime;
    }
    void setBrand(String b) {
        brand = b;
    }
    void setNumber(String n) {
        number = n;//代码2 设置电话号码
    }
    void setRate(double r) {
        rate = r;
    }
    void setDialledTime(double d) {
        dialledTime = d;
    }
    double callCost() {
        return dialledTime * rate;
    }
    void display() {
        System.out.println("电话品牌：" + brand + " 电话号码：" + number);
        System.out.println("通话时间：" + dialledTime + " 费率：" + rate);
        System.out.println("话费：" + callCost());
    }
}
class Mobilephone extends Telephone {
    String network;
    double receivedTime;
    
    Mobilephone(String b, String num, String net) {
        super(b, num);
        network = net;
    }
    String getNetwork() {
        return network;
    }
    double getReceivedTime() {
        return receivedTime;
    }
    void setNetwork(String n) {
        network = n;
    }
    void setReceivedTime(double d) {
        //代码3 设置被叫时间
        receivedTime = d;
    }
    double callCost() {
        return (dialledTime + 0.5 * receivedTime) * rate;
    }
    void display() {
        System.out.println("电话品牌:" + brand + " 电话号码：" + number + " 网络:" + network);
        System.out.println("主叫时间:" + dialledTime + " 被叫时间:" + receivedTime + " 费率:" + rate);
        System.out.println("话费:" + callCost());
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Telephone tel;
        Mobilephone mobile;
        tel = new Telephone("Tcl", "8309600");
        mobile = new Mobilephone("Nokia", "13007091010", "CDMA");
        tel.setRate(0.2);
        tel.setDialledTime(150);
        mobile.setRate(0.4);
        mobile.setDialledTime(80);//代码4 设置主叫时间为80
        mobile.setReceivedTime(120);
        tel.display();
        System.out.println();
        //代码5 显示移动电话的信息
        mobile.display();
    }
}