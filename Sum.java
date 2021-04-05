import javax.swing.*;

public class Sum {
    public static void main(String[] args){
        int first = 0;
        int second = 0;
        first = Integer.parseInt(args[0]);
        second = Integer.parseInt(args[1]);
        int sum = 0;
        switch (args[2]){
            case("+"):
                sum = first + second;
                break;
            case("-"):
                sum = first - second;
                break;
            case("*"):
                sum = first * second;
                break;
            case("/"):
                sum = first / second;
                break;
        }
        System.out.println(sum);
    }
}
