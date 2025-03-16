public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Задача 6
        for (int i = 7; i <= 100; i = i + 7) {
            System.out.println(i);
        }

        //Задача 7
        for (int i = 1; i <= 513; i = i * 2) {
            System.out.println(i);
        }
        //Задача 8
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int i = 0; i < 12; i++) {
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println(totalSavings);

        //Задача 9
        int monthlySavingsOne = 29000;
        int totalSavingsOne = 0;
        for (int i = 0; i < 12; i++) {
            totalSavingsOne = totalSavingsOne + totalSavingsOne / 100;
            totalSavingsOne = totalSavingsOne + monthlySavingsOne;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + totalSavingsOne + " рублей");
        }
        System.out.println(totalSavingsOne);

        //Задача 10
        int c = 2;
        for (int i = 1; i <= 10; i++) {
            int b = c * i;
            System.out.println(b);
        }
    }
}