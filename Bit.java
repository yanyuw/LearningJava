class Bit
{
    public static void main(String[] args){
        int i = 127;
        System.out.println(Integer.toBinaryString(i));
        i = i & 8;
        System.out.println(Integer.toBinaryString(i));
    }
}