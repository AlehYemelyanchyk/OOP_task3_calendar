/*Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию
о выходных и праздничных днях.*/

public class CalendarMain {

    public static void main(String[] args) {
        Calendar calendar1 = new Calendar();
        Calendar.Day day1 = calendar1.new Day(Calendar.Month.JANUARY, 21, Calendar.DayType.BUSINESS);
        Calendar.Day day2 = calendar1.new Day(Calendar.Month.MARCH, 8, Calendar.DayType.HOLIDAY);
        Calendar.Day day3 = calendar1.new Day(Calendar.Month.MARCH, 12, Calendar.DayType.WEEKEND);
        Calendar.Day day4 = calendar1.new Day(Calendar.Month.MAY, 9, Calendar.DayType.HOLIDAY);

        calendar1.addDay(day1);
        calendar1.addDay(day2);
        calendar1.addDay(day3);
        calendar1.addDay(day4);

        calendar1.showDays();
    }

}
