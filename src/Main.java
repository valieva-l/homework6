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
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

        //Задача 9
        int savingsWithInterest = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total / 100;
            total1 = total1 + savingsWithInterest;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println(total1);

        //Задача 10
        int c = 2;
        for (int i = 1; i <= 10; i++) {
            int b = c * i;
            System.out.println(b);
        }
    }
}