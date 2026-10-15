package ru.mirea.part2; // объявление пакета для практической части 2

public class TestAuthor { // тестирующий класс для проверки класса Author
    public static void main(String[] args) { // главный метод программы
        Author a1 = new Author("Федор Достоевский", "dostoevsky@spb.ru", 'm'); // создаем объект автора
        System.out.println("Созданный объект: " + a1); // выводим созданный объект в консоль

        a1.setEmail("fedor.dostoevsky@lit.org"); // меняем email у автора через сеттер
        System.out.println("Новый адрес почты: " + a1.getEmail()); // проверяем обновленную почту через геттер
        System.out.println("Имя автора: " + a1.getName()); // выводим имя автора через геттер
        System.out.println("Пол автора: " + a1.getGender()); // выводим пол автора через геттер
        System.out.println("Финальное строковое представление: " + a1); // выводим итоговую строку с объектом
    } // конец метода main
} // конец класса TestAuthor
