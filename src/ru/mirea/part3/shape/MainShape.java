package ru.mirea.part3.shape; // объявление пакета для геометрических фигур

public class MainShape { // тестирующий класс демонстрации полиморфизма фигур
    public static void main(String[] args) { // точка входа в программу
        System.out.println("--- Полиморфизм и иерархия Shape (Вариант 2) ---"); // заголовок секции

        Shape s1 = new Circle(7.2, "GREEN", true); // полиморфная ссылка: тип Shape указывает на объект Circle
        System.out.println(s1); // печатаем фигуру (автоматически вызовется Circle.toString())
        System.out.println("Вычисленная площадь круга: " + s1.getArea()); // вызывается переопределенный getArea() круга
        System.out.println("Вычисленный периметр круга: " + s1.getPerimeter()); // вызывается переопределенный getPerimeter() круга
        System.out.println("Цвет фигуры: " + s1.getColor()); // выводим цвет через метод базового класса
        System.out.println("Заливка: " + s1.isFilled()); // проверяем флаг заливки

        Circle c1 = (Circle) s1; // нисходящее приведение типа (downcast) от Shape к Circle
        System.out.println(c1); // выводим объект типа Circle
        System.out.println("Радиус круга (после downcast): " + c1.getRadius()); // теперь доступен специфичный метод getRadius()

        Shape s3 = new Rectangle(3.0, 5.0, "YELLOW", false); // ссылка Shape указывает на объект Rectangle
        System.out.println("\n" + s3); // выводим строковое представление прямоугольника
        System.out.println("Площадь прямоугольника: " + s3.getArea()); // площадь прямоугольника
        System.out.println("Периметр прямоугольника: " + s3.getPerimeter()); // периметр прямоугольника

        Rectangle r1 = (Rectangle) s3; // приведение типа (downcast) к Rectangle
        System.out.println("Длина (длина стороны): " + r1.getLength()); // получаем длину через метод Rectangle

        Shape s4 = new Square(8.5); // ссылка Shape указывает на Square
        System.out.println("\n" + s4); // выводим квадрат
        System.out.println("Площадь квадрата: " + s4.getArea()); // считаем площадь квадрата через метод Rectangle

        Rectangle r2 = (Rectangle) s4; // приведение типа Square к Rectangle
        System.out.println("Периметр через ссылку Rectangle: " + r2.getPerimeter()); // вычисляем периметр

        Square sq1 = (Square) r2; // приведение типа к Square
        System.out.println("Сторона квадрата sq1: " + sq1.getSide()); // получаем значение стороны квадрата
    } // конец метода main
} // конец класса MainShape
