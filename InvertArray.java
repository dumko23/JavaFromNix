public class InvertArray {
    public static void main(String[] args){
        int[] array = new int[args.length];
        int k = 0;
        for (String str : args) {
            array[k++] = Integer.parseInt(str);
        }
        for (int f : array) {
            System.out.print(f + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[(array.length - i-1)];
            array[array.length - i-1] = temp;
        }

        for (int f : array) {
            System.out.print(f + " ");
        }
    }
}
