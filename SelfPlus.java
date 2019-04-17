class SelfPlus
{
    public static void main(String[] args){
        int i = 0;
        int j = (i++)+(++i);
        int k = --i;
        System.out.println("i:" + i + "\nj:" + j + "\nk:" + k);
    }
}