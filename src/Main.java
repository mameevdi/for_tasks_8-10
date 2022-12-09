public class Main {
    public static void main(String[] args) {
        task8();
        task9();
        task10();
    }

    public static void task8() {
        System.out.println("Задача 8"); //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку»
        int savings = 0;
        for (int i = 1; i <= 12; ++i) {
            savings = savings + 29000;
            System.out.println("Месяц " + i + "-й, сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("За год удалось накопить " + savings + " рублей");
        System.out.println();
    }
    public static void task9() {
        System.out.println("Задача 8"); //Посчитайтесколько будет денег при условии, что вы откладываете в банк под проценты — 12% годовых
        int savings = 0;
        int percent = 0;
        for (int i = 1; i <= 12; ++i) {
            percent = savings/100;
            savings = savings + percent + 29000;
            System.out.println("Месяц " + i + "-й, сумма накоплений равна " + savings + " рублей");
        }
        System.out.println("За год удалось накопить " + savings + " рублей");
        System.out.println();
    }
    public static void task10() {
        System.out.println("Задача 10"); //Напишите программу, которая выводит в консоль таблицу умножения на 2
        int answer = 0;
        for (int i = 1; i <= 10; ++i) {
            answer = 2*i;
            System.out.println("2*" + i + "=" + answer);
        }
    }
}