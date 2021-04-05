public class ToCelsius {
    public static void main(String[] args){
        //(x°F − 32) × 5/9 = y°C
        //double fahrenheit = Double.parseDouble(args[0]); для дробей, температура же может быть дробью
        //double Celsius = (fahrenheit - 32) * 5/9;
        int fahrenheit = Integer.parseInt(args[0]);
        int Celsius = (fahrenheit - 32) * 5/9;
        System.out.println(Celsius);
    }
}
