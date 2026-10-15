package ru.mirea.part3.shape; // объявление пакета для геометрических фигур

public abstract class Shape { // абстрактный базовый класс для всех фигур
    protected String color; // защищенное поле цвета фигуры (доступно классам-наследникам)
    protected boolean filled; // защищенный флаг: закрашена ли фигура (true/false)

    public Shape() { // конструктор по умолчанию
        this.color = "red"; // устанавливаем цвет по умолчанию "red"
        this.filled = true; // по умолчанию фигура закрашена
    } // конец конструктора по умолчанию

    public Shape(String color, boolean filled) { // конструктор с параметрами цвета и заливки
        this.color = color; // сохраняем переданный цвет
        this.filled = filled; // сохраняем переданный флаг заливки
    } // конец конструктора с параметрами

    public String getColor() { // геттер для получения цвета фигуры
        return this.color; // возвращаем значение поля color
    } // конец метода getColor

    public void setColor(String color) { // сеттер для изменения цвета фигуры
        this.color = color; // записываем новый цвет
    } // конец метода setColor

    public boolean isFilled() { // метод проверки: закрашена ли фигура
        return this.filled; // возвращаем значение флага filled
    } // конец метода isFilled

    public void setFilled(boolean filled) { // сеттер для изменения флага заливки
        this.filled = filled; // записываем новое значение заливки
    } // конец метода setFilled

    public abstract double getArea(); // абстрактный метод вычисления площади (реализуется в наследниках)
    public abstract double getPerimeter(); // абстрактный метод вычисления периметра (реализуется в наследниках)

    @Override // аннотация переопределения стандартного метода toString
    public String toString() { // строковое описание базовой фигуры
        return "Shape[color=" + this.color + ", filled=" + this.filled + "]"; // возвращаем цвет и статус заливки
    } // конец метода toString
} // конец абстрактного класса Shape
