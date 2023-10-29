package exerciseList1.questao5;

import java.util.Objects;

public class Data
{
    private int month;
    private int day;
    private int year;

    public Data(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return month == data.month && day == data.day && year == data.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }
}

