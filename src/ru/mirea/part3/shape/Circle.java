package ru.mirea.part3.shape; // объявление пакета для геометрических фигур

public class Circle extends Shape { // класс Круг, наследуется от Shape
    protected double radius; // защищенное поле: радиус круга

    public Circle() { // конструктор круга по умолчанию
        super("red", true); // вызываем конструктор родителя Shape (красный, закрашен)
        this.radius = 1.0; // задаем начальный радиус 1.0
    } // конец конструктора по умолчанию

    public Circle(double radius) { // конструктор с указанием радиуса
        super("red", true); // передаем в родитель цвет по умолчанию и заливку
        this.radius = radius; // сохраняем заданный радиус
    } // конец конструктора

    public Circle(double radius, String color, boolean filled) { // конструктор со всеми параметрами
        super(color, filled); // передаем цвет и заливку в родительский класс Shape
        this.radius = radius; // сохраняем переданный радиус
    } // конец конструктора

    public double getRadius() { // геттер для получения радиуса
        return this.radius; // возвращаем радиус круга
    } // конец метода getRadius

    public void setRadius(double radius) { // сеттер для изменения радиуса
        this.radius = radius; // записываем новый радиус
    } // конец метода setRadius

    @Override // переопределяем абстрактный метод расчета площади
    public double getArea() { // метод вычисления площади круга
        return Math.PI * Math.pow(this.radius, 2); // формула: pi * r^2
    } // конец метода getArea

    @Override // переопределяем абстрактный метод расчета периметра
    public double getPerimeter() { // метод вычисления длины окружности (периметра)
        return 2.0 * Math.PI * this.radius; // формула: 2 * pi * r
    } // конец метода getPerimeter

    @Override // переопределяем строковое представление круга
    public String toString() { // метод toString
        return "Circle[" + super.toString() + ", radius=" + this.radius + "]"; // объединяем поля Shape и радиус
    } // конец метода toString
} // конец класса Circle
