package maxim;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 2000;
        int monthOfBirthday = 06;
        int dayOfBirthday = 07;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println ("Сумма моего года, месяца и дня рождения:"+" " + sum);
        boolean monthBiggerDay;
        if (monthOfBirthday>dayOfBirthday)
            monthBiggerDay = true;
        else
            monthBiggerDay = false;
        System.out.println ("Месяц моего рождения больше даты рождения:"+" " +  monthBiggerDay);
        char ch1, ch2, ch3, ch4, ch5, ch6;

        ch1 = 'М';
        ch2 = 'А';
        ch3 = 'К';
        ch4 = 'С';
        ch5 = 'И';
        ch6 = 'М';
        System.out.println("Массив с моим именем: " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6);
        double myAge = 20;
        double partYear = 10.0 / 12.0;
        double sum1 = myAge + partYear;
        System.out.println("Мне " + sum1 + "лет");

    }
}
