public class MidSum {
    public static void main(String[] args){
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        int sum = 0;
        double midSum;
        for (i = 0; i < array.length; i++){
            sum += array[i];
        }

        midSum = sum / array.length;

        System.out.println(midSum);
    }
}
