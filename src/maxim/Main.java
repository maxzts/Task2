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
        char[] arr = new char[6];

        arr[0] = 'М';
        arr[1] = 'а';
        arr[2] = 'к';
        arr[3] = 'с';
        arr[4] = 'и';
        arr[5] = 'м';
        System.out.println("Массив с моим именем: " + arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]);
        double myAge = 20;
        double partYear = 10.0 / 12.0;
        double sum1 = myAge + partYear;
        System.out.println("Мне " + sum1 + "лет");

    }
}
