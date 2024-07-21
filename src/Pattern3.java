public class Pattern3 {
    public static void main(String[] args) {
        int row=5,col=5;
        Pattern(row,col);
    }

    public static void Pattern(int row, int col) {
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
