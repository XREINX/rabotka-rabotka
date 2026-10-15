package ru.mirea.part2; // объявление пакета для практической части 2

public class Ball { // класс, описывающий мяч на плоскости
    private double x = 0.0; // координата X мяча (по умолчанию 0.0)
    private double y = 0.0; // координата Y мяча (по умолчанию 0.0)

    public Ball() { // конструктор по умолчанию
        this.x = 0.0; // устанавливаем X в ноль
        this.y = 0.0; // устанавливаем Y в ноль
    } // конец конструктора по умолчанию

    public Ball(double x, double y) { // конструктор с заданными координатами
        this.x = x; // сохраняем начальную координату X
        this.y = y; // сохраняем начальную координату Y
    } // конец конструктора с параметрами

    public double getX() { // геттер для координаты X
        return this.x; // возвращаем координату X
    } // конец метода getX

    public void setX(double x) { // сеттер для координаты X
        this.x = x; // обновляем координату X
    } // конец метода setX

    public double getY() { // геттер для координаты Y
        return this.y; // возвращаем координату Y
    } // конец метода getY

    public void setY(double y) { // сеттер для координаты Y
        this.y = y; // обновляем координату Y
    } // конец метода setY

    public void setXY(double x, double y) { // метод для одновременной установки обеих координат
        this.x = x; // устанавливаем X
        this.y = y; // устанавливаем Y
    } // конец метода setXY

    public void move(double xDisp, double yDisp) { // метод перемещения мяча на смещение
        this.x += xDisp; // увеличиваем координату X на xDisp
        this.y += yDisp; // увеличиваем координату Y на yDisp
    } // конец метода move

    @Override // аннотация переопределения метода toString
    public String toString() { // строковое представление состояния мяча
        return "Ball @ (" + this.x + ", " + this.y + ")"; // возвращаем строку с текущими координатами
    } // конец метода toString
} // конец класса Ball
