public class DayOfWeek {
    public static void main(String[] args){
        String[] week = {"", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        int random = (int) (Math.random() * (7 - 1 + 1) + 1 );
        System.out.println(random + " - " + week[random]);
    }
}
