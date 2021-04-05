public class minMax {

    public static void main(String[] args){
        int[] array = new int[args.length];                 //разобраться с импортом методов, так как всё в одном проекте!
        int k = 0;
        for (String str : args) {
            array[k++] = Integer.parseInt(str);
        }

        for (int i = args.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println("min = "+ array[0] + "; max = "+array[array.length-1]+";");

    }
}
