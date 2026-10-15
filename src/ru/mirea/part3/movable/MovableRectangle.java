package ru.mirea.part3.movable; // объявление пакета для перемещаемых объектов

public class MovableRectangle implements Movable { // класс подвижного прямоугольника
    private MovablePoint topLeft; // верхняя левая вершина (точка MovablePoint)
    private MovablePoint bottomRight; // нижняя правая вершина (точка MovablePoint)

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) { // конструктор с координатами и скоростями
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed); // создаем верхнюю левую точку
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed); // создаем нижнюю правую точку
    } // конец конструктора

    public boolean checkSpeedEquivalence() { // проверка равенства скоростей обеих точек прямоугольника
        return (this.topLeft.xSpeed == this.bottomRight.xSpeed) && (this.topLeft.ySpeed == this.bottomRight.ySpeed); // возвращаем true, если скорости совпадают
    } // конец метода checkSpeedEquivalence

    @Override // перемещение прямоугольника вверх
    public void moveUp() { // метод moveUp
        if (checkSpeedEquivalence()) { // если скорости вершин равны (фигура не деформируется)
            this.topLeft.moveUp(); // перемещаем верхнюю левую вершину вверх
            this.bottomRight.moveUp(); // перемещаем нижнюю правую вершину вверх
        } // конец проверки скорости
    } // конец метода moveUp

    @Override // перемещение прямоугольника вниз
    public void moveDown() { // метод moveDown
        if (checkSpeedEquivalence()) { // если скорости вершин равны
            this.topLeft.moveDown(); // перемещаем левую точку вниз
            this.bottomRight.moveDown(); // перемещаем правую точку вниз
        } // конец проверки скорости
    } // конец метода moveDown

    @Override // перемещение прямоугольника влево
    public void moveLeft() { // метод moveLeft
        if (checkSpeedEquivalence()) { // если скорости вершин равны
            this.topLeft.moveLeft(); // перемещаем левую точку влево
            this.bottomRight.moveLeft(); // перемещаем правую точку влево
        } // конец проверки скорости
    } // конец метода moveLeft

    @Override // перемещение прямоугольника вправо
    public void moveRight() { // метод moveRight
        if (checkSpeedEquivalence()) { // если скорости вершин равны
            this.topLeft.moveRight(); // перемещаем левую точку вправо
            this.bottomRight.moveRight(); // перемещаем правую точку вправо
        } // конец проверки скорости
    } // конец метода moveRight

    @Override // строковое представление прямоугольника
    public String toString() { // метод toString
        return "MovableRectangle{topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "}"; // выводим координаты обеих точек
    } // конец метода toString
} // конец класса MovableRectangle
