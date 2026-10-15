package ru.mirea.part2; // объявление пакета для практической части 2

public class Author { // класс, описывающий автора книги/произведения
    private String name; // приватное строковое поле: имя автора
    private String email; // приватное строковое поле: электронная почта автора
    private char gender; // приватное символьное поле: пол автора ('m' или 'f')

    public Author(String name, String email, char gender) { // конструктор класса с параметрами
        this.name = name; // сохраняем переданное имя автора в поле объекта
        this.email = email; // сохраняем переданный email в поле объекта
        this.gender = gender; // сохраняем переданный символ пола в поле объекта
    } // конец конструктора

    public String getName() { // геттер для получения имени автора
        return this.name; // возвращаем имя автора
    } // конец метода getName

    public String getEmail() { // геттер для получения адреса электронной почты
        return this.email; // возвращаем email
    } // конец метода getEmail

    public void setEmail(String email) { // сеттер для изменения адреса электронной почты
        this.email = email; // перезаписываем email новым значением
    } // конец метода setEmail

    public char getGender() { // геттер для получения пола автора
        return this.gender; // возвращаем символ пола
    } // конец метода getGender

    @Override // аннотация переопределения метода базового класса Object
    public String toString() { // строковое представление объекта Author
        return "Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]"; // форматируем и возвращаем данные автора
    } // конец метода toString
} // конец класса Author
