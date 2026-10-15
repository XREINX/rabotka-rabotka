package ru.mirea.part3.shape; // объявление пакета для геометрических фигур

public class Square extends Rectangle { // класс Квадрат, наследуется от Прямоугольника

    public Square() { // конструктор квадрата по умолчанию
        super(2.0, 2.0, "red", true); // создаем базовый прямоугольник со сторонами 2.0 на 2.0
    } // конец конструктора по умолчанию

    public Square(double side) { // конструктор квадрата со стороной
        super(side, side, "red", true); // стороны одинаковы: ширина = длина = side
    } // конец конструктора со стороной

    public Square(double side, String color, boolean filled) { // полный конструктор со стороной и цветом
        super(side, side, color, filled); // передаем одинаковые стороны и цвет в Rectangle
    } // конец полного конструктора

    public double getSide() { // геттер стороны квадрата
        return this.width; // возвращаем ширину (она равна любой из сторон)
    } // конец метода getSide

    public void setSide(double side) { // сеттер стороны квадрата
        this.width = side; // обновляем ширину
        this.length = side; // обновляем длину квадрата тем же значением
    } // конец метода setSide

    @Override // переопределяем установку ширины, чтобы квадрат не терял форму
    public void setWidth(double side) { // изменение ширины квадрата
        this.setSide(side); // меняем сразу обе стороны
    } // конец метода setWidth

    @Override // переопределяем установку длины, чтобы квадрат не терял форму
    public void setLength(double side) { // изменение длины квадрата
        this.setSide(side); // меняем сразу обе стороны
    } // конец метода setLength

    @Override // переопределяем строковое описание квадрата
    public String toString() { // метод toString
        return "Square[" + super.toString() + "]"; // формируем строковое представление на базе родителя
    } // конец метода toString
} // конец класса Square
