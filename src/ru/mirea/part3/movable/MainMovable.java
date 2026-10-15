package ru.mirea.part3.movable; // объявление пакета для перемещаемых объектов

public class MainMovable { // тестирующий класс для демонстрации работы интерфейса Movable
    public static void main(String[] args) { // главный метод программы
        System.out.println("--- Проверка работы интерфейса Movable ---"); // заголовок тестов

        MovablePoint pt = new MovablePoint(10, 20, 3, 4); // создаем перемещаемую точку
        System.out.println("Исходная точка: " + pt); // печатаем исходные координаты точки
        pt.moveUp(); // двигаем точку вверх
        pt.moveLeft(); // двигаем точку влево
        System.out.println("Точка после перемещения (moveUp, moveLeft): " + pt); // проверяем новые координаты точки

        MovableCircle mc = new MovableCircle(0, 0, 2, 2, 15); // создаем перемещаемую окружность
        System.out.println("\nОкружность: " + mc); // печатаем начальное состояние окружности
        mc.moveRight(); // перемещаем окружность вправо
        System.out.println("Окружность после сдвига вправо: " + mc); // проверяем новые координаты окружности

        MovableRectangle mr = new MovableRectangle(0, 8, 8, 0, 4, 4); // создаем перемещаемый прямоугольник
        System.out.println("\nПрямоугольник: " + mr); // печатаем координаты прямоугольника
        System.out.println("Скорости вершин согласованы: " + mr.checkSpeedEquivalence()); // проверяем синхронность скоростей вершин
        mr.moveDown(); // опускаем прямоугольник вниз
        System.out.println("Прямоугольник после смещения вниз: " + mr); // проверяем координаты после сдвига вниз
    } // конец метода main
} // конец класса MainMovable
