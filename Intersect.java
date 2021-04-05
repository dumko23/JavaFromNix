public class Intersect {

    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {                  //всё еще разобраться с импортом модулей
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void print(int[] arr){
        for (int f : arr) {
            System.out.print(f + " ");
        }
    }

    public static void equals(int[] arr1, int[] arr2){
        for (int item : arr1) {                     //тут был "for loop", но ide любезно предложило заменить на более крутой loop
            for (int value : arr2) {
                if (item == value) {
                    System.out.print(item + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 7, 30, 5, 70, 44};
        int[] array2 = new int[]{24, 13, -1, 2, 4, 70, 44};

        Intersect.sort(array1);
        Intersect.sort(array2);

        Intersect.print(array1);
        System.out.println();
        Intersect.print(array2);

        System.out.println();
        Intersect.equals(array1, array2);



    }
}
