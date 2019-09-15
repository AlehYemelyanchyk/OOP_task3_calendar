package by.epam.ayem.module5;

/*Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию
о выходных и праздничных днях.*/

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private List<Day> days;

    public Calendar() {
        days = new ArrayList<>();
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public void showDays() {
        for (Day day : days) {
            System.out.println(day.toString());
        }
    }

    public class Day {

        private Month month;
        private int date;
        private DayType dayType;

        public Day(Month month, int date, DayType dayType) {
            this.month = month;
            this.date = date;
            this.dayType = dayType;
        }

        @Override
        public String toString() {
            return month.getReadableName() + " " + date + " is " + dayType.getReadableName() + '.';
        }
    }

    public enum DayType {

        BUSINESS("business"), WEEKEND("weekend"), HOLIDAY("holiday");

        private String readableName;

        DayType(String readableName) {
            this.readableName = readableName;
        }

        public String getReadableName() {
            return readableName;
        }

    }

    public enum Month {
        JANUARY("January"), FEBRUARY("February"), MARCH("March"),
        APRIL("April"), MAY("May"), JUNE("June"),
        JULY("July"), AUGUST("August"), SEPTEMER("September"),
        OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");

        private String readableName;

        Month(String readableName) {
            this.readableName = readableName;
        }

        public String getReadableName() {
            return readableName;
        }
    }
}
