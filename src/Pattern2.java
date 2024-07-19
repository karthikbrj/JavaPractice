public class Pattern2 {
    public static void main(String[] args) {
        int row=5,col=5;
        printPattern2(row,col);
    }

    private static void printPattern2(int row, int col) {
        for(int i=1;i<=row;i++){
            for(int j=0;j<col;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
