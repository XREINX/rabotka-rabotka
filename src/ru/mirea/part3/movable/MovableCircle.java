package ru.mirea.part3.movable; // объявление пакета для перемещаемых объектов

public class MovableCircle implements Movable { // класс подвижной окружности
    private int radius; // радиус окружности
    private MovablePoint center; // точка центра окружности (объект MovablePoint)

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) { // конструктор подвижной окружности
        this.center = new MovablePoint(x, y, xSpeed, ySpeed); // инициализируем точку центра с координатами и скоростями
        this.radius = radius; // сохраняем радиус окружности
    } // конец конструктора

    @Override // перемещение окружности вверх
    public void moveUp() { // метод moveUp
        this.center.moveUp(); // делегируем перемещение вверх точке центра
    } // конец метода moveUp

    @Override // перемещение окружности вниз
    public void moveDown() { // метод moveDown
        this.center.moveDown(); // делегируем перемещение вниз точке центра
    } // конец метода moveDown

    @Override // перемещение окружности влево
    public void moveLeft() { // метод moveLeft
        this.center.moveLeft(); // делегируем перемещение влево точке центра
    } // конец метода moveLeft

    @Override // перемещение окружности вправо
    public void moveRight() { // метод moveRight
        this.center.moveRight(); // делегируем перемещение вправо точке центра
    } // конец метода moveRight

    @Override // строковое представление окружности
    public String toString() { // метод toString
        return "MovableCircle{center=" + this.center + ", radius=" + this.radius + "}"; // выводим центр и радиус
    } // конец метода toString
} // конец класса MovableCircle
