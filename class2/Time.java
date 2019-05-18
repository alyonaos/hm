package class2;

/**
 * Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать два конструктора: первый принимает общее количество секунд(т.е. 3661s = 1h+1m+1s), второй - часы, минуты и секунды по отдельности. Создать методы:
 * для получения полного количества секунд в объекте.
 * для вывода данных.  Написать программу для тестирования возможностей класса.
 */

public class Time {
    private int hrs;
    private int min;
    private int sec;

    public Time(int hrs, int min, int sec) {
        this(getSec(hrs, min, sec));
    }

    public Time(int allSec) {

        if (allSec < 0) {


        }
        int h = allSec / 3600;
        int m = (allSec % 3600) / 60;
        int s = allSec % 60;
        this.hrs = h;
        this.min = m;
        this.sec = s;
    }

    public void print() {
        System.out.println("hrs=" + hrs + ",min=" + min + ",sec=" + sec);
    }

    public int getTimeInSec() {
        return getSec(this.hrs, this.min, this.min);

    }

    private static int getSec(int h, int m, int s) {
        return (h * 3600) + (m*60)  + s;
    }
}
