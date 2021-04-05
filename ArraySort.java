
public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        int k = 0;
        for (String str : args) {
            array[k++] = Integer.parseInt(str);
        }

        for (int i = args.length - 1; i > 0; i--) { //пузырёк проще
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int f : array) {
            System.out.print(f + " ");
        }
    }
}
