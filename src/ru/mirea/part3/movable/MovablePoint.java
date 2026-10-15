package ru.mirea.part3.movable; // объявление пакета для перемещаемых объектов

public class MovablePoint implements Movable { // класс точки на плоскости с поддержкой перемещения
    int x; // координата X точки
    int y; // координата Y точки
    int xSpeed; // скорость точки по горизонтальной оси X
    int ySpeed; // скорость точки по вертикальной оси Y

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) { // конструктор с начальными координатами и скоростями
        this.x = x; // сохраняем координату X
        this.y = y; // сохраняем координату Y
        this.xSpeed = xSpeed; // сохраняем скорость по оси X
        this.ySpeed = ySpeed; // сохраняем скорость по оси Y
    } // конец конструктора

    @Override // реализация метода перемещения вверх
    public void moveUp() { // метод moveUp
        this.y += this.ySpeed; // увеличиваем координату Y на величину вертикальной скорости
    } // конец метода moveUp

    @Override // реализация метода перемещения вниз
    public void moveDown() { // метод moveDown
        this.y -= this.ySpeed; // уменьшаем координату Y на величину вертикальной скорости
    } // конец метода moveDown

    @Override // реализация метода перемещения влево
    public void moveLeft() { // метод moveLeft
        this.x -= this.xSpeed; // уменьшаем координату X на величину горизонтальной скорости
    } // конец метода moveLeft

    @Override // реализация метода перемещения вправо
    public void moveRight() { // метод moveRight
        this.x += this.xSpeed; // увеличиваем координату X на величину горизонтальной скорости
    } // конец метода moveRight

    @Override // переопределение метода строкового вывода
    public String toString() { // метод toString
        return "MovablePoint{x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}"; // возвращаем строку с координатами и скоростями
    } // конец метода toString
} // конец класса MovablePoint
