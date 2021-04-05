public class SumOfNum {
    public static int switchExample(int i) {
        switch (i) {
            case 1 -> System.out.print(3);
            case 2 -> System.out.print(2);
            case 3 -> System.out.print(1);
            default -> System.out.print(0);
        }
        return 5;
    }
    public static void main(String[] args) {
        /*int sum = 0;
        String numString = args[0];
       for (int i = 0; i < numString.length(); i++) {
           char y = numString.charAt(i);
            int x = Character.getNumericValue(y);
            sum += x;
        }
        System.out.println(sum);*/

        switchExample(3);
        switchExample(2);
        switchExample(0);
        switchExample(1);
    }
}