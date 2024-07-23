public class Pattern6 {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        Pattern6(row,col);
    }

    private static void Pattern6(int row, int col) {
        for(int i=row;i>0;i--){
            for(int j=col;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
