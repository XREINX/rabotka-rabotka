package ru.mirea.part1; // объявление пакета для практической части 1

import java.util.Arrays; // импорт утилиты для работы с массивами

public class MainPart1 { // главный класс программы для части 1

    public static void main(String[] args) { // точка входа в программу (метод main)
        System.out.println("### Практическая работа 1 (Часть 1)\n"); // выводим заголовок работы

        runTask3(); // запускаем задание 3 (сумма и среднее)
        runTask4(); // запускаем задание 4 (циклы while, do-while, min и max)
        runTask5(args); // запускаем задание 5 (аргументы командной строки)
        runTask6(); // запускаем задание 6 (гармонический ряд)
        runTask7(); // запускаем задание 7 (факториал числа)
    } // конец метода main

    public static void runTask3() { // метод выполнения задания 3
        System.out.println("### Задание 3"); // выводим номер задания
        int[] data = {18, 4, 33, 9, 14, 27, 6, 41, 15, 23}; // объявляем и инициализируем массив чисел
        int total = 0; // переменная для накопления суммы элементов

        for (int idx = 0; idx < data.length; idx++) { // цикл for для прохода по массиву
            total += data[idx]; // прибавляем текущий элемент к общей сумме
        } // конец цикла for

        double mean = (double) total / data.length; // вычисляем среднее арифметическое

        System.out.println("Массив: " + Arrays.toString(data)); // печатаем элементы массива
        System.out.println("Сумма: " + total); // выводим общую сумму
        System.out.printf("Среднее: %.2f\n\n", mean); // выводим среднее значение с округлением
    } // конец метода runTask3

    public static void runTask4() { // метод выполнения задания 4
        System.out.println("### Задание 4"); // выводим номер задания
        int[] values = {26, 7, 88, 13, 92, 5, 49, 31}; // инициализируем массив целых чисел
        System.out.println("Массив: " + Arrays.toString(values)); // выводим исходный массив

        int sumWhile = 0; // сумма элементов через while
        int k = 0; // индекс элемента для цикла while
        while (k < values.length) { // пока индекс не вышел за пределы массива
            sumWhile += values[k]; // прибавляем элемент массива к сумме
            k++; // сдвигаем указатель на следующий элемент
        } // конец цикла while

        int sumDoWhile = 0; // сумма элементов через do-while
        int minimum = values[0]; // начальное значение минимума (первый элемент)
        int maximum = values[0]; // начальное значение максимума (первый элемент)
        int m = 0; // индекс для цикла do-while
        do { // тело цикла do-while (сработает хотя бы один раз)
            sumDoWhile += values[m]; // прибавляем элемент к сумме
            if (values[m] < minimum) { // если нашли элемент меньше текущего минимума
                minimum = values[m]; // обновляем минимум
            } // конец проверки минимума
            if (values[m] > maximum) { // если нашли элемент больше текущего максимума
                maximum = values[m]; // обновляем максимум
            } // конец проверки максимума
            m++; // переход к следующему индексу
        } while (m < values.length); // условие продолжения: пока не дошли до конца массива

        System.out.println("Сумма while: " + sumWhile); // печатаем сумму через while
        System.out.println("Сумма do-while: " + sumDoWhile); // печатаем сумму через do-while
        System.out.println("Min: " + minimum); // печатаем минимальный элемент
        System.out.println("Max: " + maximum + "\n"); // печатаем максимальный элемент
    } // конец метода runTask4

    public static void runTask5(String[] args) { // метод вывода аргументов командной строки
        System.out.println("### Задание 5"); // выводим номер задания
        if (args.length == 0) { // если ни одного аргумента не передано
            System.out.println("Аргументы не переданы.\n"); // сообщаем об этом в консоль
        } else { // если аргументы присутствуют
            for (int i = 0; i < args.length; i++) { // перебираем массив аргументов
                System.out.println("arg[" + i + "]: " + args[i]); // печатаем номер и значение аргумента
            } // конец цикла перебора аргументов
            System.out.println(); // отступ в конце
        } // конец условия if-else
    } // конец метода runTask5

    public static void runTask6() { // метод вывода первых 10 чисел гармонического ряда
        System.out.println("### Задание 6"); // выводим номер задания
        for (int i = 1; i <= 10; i++) { // цикл от 1 до 10
            double term = 1.0 / i; // вычисляем значение 1/i
            System.out.printf("1/%d = %.4f\n", i, term); // выводим дробь и десятичное значение
        } // конец цикла
        System.out.println(); // отступ в конце
    } // конец метода runTask6

    public static void runTask7() { // метод проверки вычисления факториала
        System.out.println("### Задание 7"); // выводим номер задания
        int n1 = 6; // первое число
        System.out.println("Факториал " + n1 + "! = " + computeFactorial(n1)); // выводим факториал 6
        int n2 = 8; // второе число
        System.out.println("Факториал " + n2 + "! = " + computeFactorial(n2) + "\n"); // выводим факториал 8
    } // конец метода runTask7

    public static long computeFactorial(int number) { // метод подсчета факториала
        if (number < 0) { // проверяем на отрицательное число
            throw new IllegalArgumentException("Число должно быть неотрицательным"); // выбрасываем исключение
        } // конец проверки
        long acc = 1; // начальное значение факториала
        for (int step = 2; step <= number; step++) { // цикл последовательного перемножения чисел от 2 до n
            acc *= step; // домножаем накопитель на текущее число
        } // конец цикла
        return acc; // возвращаем результат факториала
    } // конец метода computeFactorial
} // конец класса MainPart1
