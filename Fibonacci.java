public class Fibonacci {
    public static void main(String[] args){
        int currentNum = Integer.parseInt(args[0]);
        int f0 = 0;
        int f1 = 1;
        int fi;
        System.out.print(f0 + ", "+ f1);
        // №1

        /*for(int i = 1; i <= currentNum; i++){
            fi = f0 + f1;
            if (fi <= currentNum){
                f0 = f1;
                f1 = fi;
                System.out.print( ", " + fi);
            }
        }*/

        //№2

        fi = f0 + f1;
        while (fi <= currentNum){
            System.out.print( ", " + fi);
            f0 = f1;
            f1 = fi;
            fi = f0 + f1;

        }
    }
}
