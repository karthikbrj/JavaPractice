public class Pattern5 {
    public static void main(String[] args) {
        int row=5,col=5;
        print(row,col);
    }

    private static void print(int row, int col) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
