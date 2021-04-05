public class MultiTable {
    public static void main(String[] args){
        int[][] table = new int [10][10];
        for (int s = 0; s < 10; s++){
            table[s][0] = s + 1;
        }

        for (int k = 1; k <= 10; k++ ) {
            for (int j = 1; j <= 10; j++) {
                int i = 1;
                i++;
                int multi = j * k;

                if (multi != 0) {
                    table[k-1][j-1] = multi;
                } else {
                    table[k-1][j-1] = i;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + table[i][j] + " ");
            }
            
            System.out.println();
        }
    }

}
