public class MultiplyList1 {
    public static void main (String args[]) {
        String output = "";
        for(int row = 1; row <= 9; row++){
            for(int col = 1; col <= row; col++){
                output += col + "*" + row + "=" + (row * col) + " ";
            }
            output += "\n";
        }
        System.out.println(output);
        System.exit(0);
    }
}