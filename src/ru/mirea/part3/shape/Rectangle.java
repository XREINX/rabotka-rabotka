package ru.mirea.part3.shape; // объявление пакета для геометрических фигур

public class Rectangle extends Shape { // класс Прямоугольник, наследуется от Shape
    protected double width; // защищенное поле: ширина прямоугольника
    protected double length; // защищенное поле: длина прямоугольника

    public Rectangle() { // конструктор прямоугольника по умолчанию
        super("red", true); // вызываем конструктор базового класса Shape
        this.width = 2.0; // ширина по умолчанию = 2.0
        this.length = 4.0; // длина по умолчанию = 4.0
    } // конец конструктора по умолчанию

    public Rectangle(double width, double length) { // конструктор с размерами
        super("red", true); // вызываем конструктор родителя с дефолтным цветом
        this.width = width; // сохраняем переданную ширину
        this.length = length; // сохраняем переданную длину
    } // конец конструктора с размерами

    public Rectangle(double width, double length, String color, boolean filled) { // полный конструктор
        super(color, filled); // передаем цвет и флаг заливки в класс Shape
        this.width = width; // сохраняем ширину
        this.length = length; // сохраняем длину
    } // конец полного конструктора

    public double getWidth() { // геттер для получения ширины
        return this.width; // возвращаем ширину
    } // конец метода getWidth

    public void setWidth(double width) { // сеттер для установки ширины
        this.width = width; // обновляем значение ширины
    } // конец метода setWidth

    public double getLength() { // геттер для получения длины
        return this.length; // возвращаем длину
    } // конец метода getLength

    public void setLength(double length) { // сеттер для установки длины
        this.length = length; // обновляем значение длины
    } // конец метода setLength

    @Override // переопределяем метод расчета площади
    public double getArea() { // вычисление площади прямоугольника
        return this.width * this.length; // формула: ширина * длина
    } // конец метода getArea

    @Override // переопределяем метод расчета периметра
    public double getPerimeter() { // вычисление периметра прямоугольника
        return 2.0 * (this.width + this.length); // формула: 2 * (ширина + длина)
    } // конец метода getPerimeter

    @Override // переопределяем строковое представление
    public String toString() { // строковое описание объекта Rectangle
        return "Rectangle[" + super.toString() + ", width=" + this.width + ", length=" + this.length + "]"; // возвращаем характеристики
    } // конец метода toString
} // конец класса Rectangle
