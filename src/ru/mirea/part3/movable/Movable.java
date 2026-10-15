package ru.mirea.part3.movable; // объявление пакета для перемещаемых объектов

public interface Movable { // интерфейс Movable для объектов, умеющих двигаться
    void moveUp(); // метод перемещения объекта вверх
    void moveDown(); // метод перемещения объекта вниз
    void moveLeft(); // метод перемещения объекта влево
    void moveRight(); // метод перемещения объекта вправо
} // конец интерфейса Movable
