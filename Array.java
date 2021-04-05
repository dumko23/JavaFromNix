import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] array = {1, 5, 5, 6};
        //System.out.println(Arrays.toString(array)); если нужен просто массив
        for (int i : array){
            System.out.print(i + " "); // если нужны значения массива
        }
    }
}
