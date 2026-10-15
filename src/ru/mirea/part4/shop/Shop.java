package ru.mirea.part4.shop; // объявление пакета для практической части 4 (интернет-магазин)

import java.util.ArrayList; // импорт класса динамического списка ArrayList
import java.util.List; // импорт интерфейса List

public class Shop { // класс модели интернет-магазина

    public enum Category { // перечисление категорий каталога товаров
        ELECTRONICS("Электроника"), // категория электроники
        CLOTHING("Одежда и обувь"), // категория одежды и обуви
        BOOKS("Книги и учебники"); // категория книг

        private final String title; // понятное русскоязычное название категории
        Category(String title) { this.title = title; } // конструктор для установки заголовка категории
        public String getTitle() { return title; } // геттер для получения названия категории
    } // конец enum Category

    public enum Product { // перечисление товаров магазина
        SMARTPHONE("Смартфон Xiaomi", 25000, Category.ELECTRONICS), // товар: смартфон
        LAPTOP("Ноутбук ASUS ROG", 85000, Category.ELECTRONICS), // товар: ноутбук
        HEADPHONES("Наушники Sony", 12000, Category.ELECTRONICS), // товар: наушники
        
        HOODIE("Худи оверсайз", 3500, Category.CLOTHING), // товар: худи
        JEANS("Джинсы прямого кроя", 4200, Category.CLOTHING), // товар: джинсы
        SNEAKERS("Кроссовки беговые", 6800, Category.CLOTHING), // товар: кроссовки
        
        JAVA_BOOK("Java: Полное руководство", 2800, Category.BOOKS), // товар: книга по Java
        ALGORITHMS("Грокаем алгоритмы", 1500, Category.BOOKS), // товар: книга по алгоритмам
        CLEAN_CODE("Чистый код", 1900, Category.BOOKS); // товар: книга по чистому коду

        private final String name; // наименование товара
        private final double price; // цена товара в рублях
        private final Category category; // категория товара из перечисления Category

        Product(String name, double price, Category category) { // конструктор товара
            this.name = name; // сохраняем название товара
            this.price = price; // сохраняем цену товара
            this.category = category; // сохраняем категорию товара
        } // конец конструктора Product

        public String getName() { return name; } // геттер названия товара
        public double getPrice() { return price; } // геттер стоимости товара
        public Category getCategory() { return category; } // геттер категории товара
    } // конец enum Product

    public static class User { // внутренний класс пользователя магазина
        private final String login; // логин пользователя
        private final String password; // пароль пользователя

        public User(String login, String password) { // конструктор пользователя
            this.login = login; // сохраняем логин
            this.password = password; // сохраняем пароль
        } // конец конструктора User

        public boolean authenticate(String enteredLogin, String enteredPassword) { // метод аутентификации пользователя
            return this.login.equals(enteredLogin) && this.password.equals(enteredPassword); // проверяем одновременное совпадение логина и пароля
        } // конец метода authenticate
    } // конец класса User

    public static void main(String[] args) { // точка входа интернет-магазина
        User validUser = new User("student", "mirea2026"); // создаем зарегистрированного пользователя
        List<Product> cart = new ArrayList<>(); // создаем пустую корзину для покупок
        
        System.out.println("=== Интернет-магазин (Задание 3 Enum) ==="); // заголовок задания
        System.out.println("Вход в систему (учетные данные: student / mirea2026)"); // подсказка с тестовыми данными
        
        String inputLogin = "student"; // эмулируем введенный пользователем логин
        String inputPassword = "mirea2026"; // эмулируем введенный пользователем пароль
        
        if (!validUser.authenticate(inputLogin, inputPassword)) { // проверяем корректность логина и пароля
            System.out.println("Ошибка: Неверный логин или пароль."); // вывод ошибки при неверных данных
            return; // прекращаем выполнение программы
        } // конец проверки авторизации
        System.out.println("Аутентификация успешна! Добро пожаловать, " + inputLogin + "."); // уведомляем об успешном входе
        System.out.println(); // пустая строка для отступа

        System.out.println("Доступные каталоги товаров:"); // заголовок списка категорий
        for (Category cat : Category.values()) { // перебираем все категории из enum Category
            System.out.println("- " + cat.name() + " (" + cat.getTitle() + ")"); // печатаем имя и русское название категории
        } // конец цикла категорий
        System.out.println(); // пустая строка

        Category selectedCategory = Category.ELECTRONICS; // выбираем категорию электроники для просмотра
        System.out.println("Товары в каталоге [" + selectedCategory.getTitle() + "]:"); // выводим выбранную категорию
        for (Product prod : Product.values()) { // перебираем все товары в магазине
            if (prod.getCategory() == selectedCategory) { // фильтруем товары по выбранной категории
                System.out.printf("  * %-25s | %.2f руб.%n", prod.getName(), prod.getPrice()); // печатаем товар и его цену
            } // конец фильтрации
        } // конец цикла товаров
        System.out.println(); // пустая строка

        System.out.println("Добавление товаров в корзину:"); // заголовок процесса покупки
        cart.add(Product.LAPTOP); // добавляем ноутбук в корзину
        System.out.println("+ Добавлен: " + Product.LAPTOP.getName()); // выводим сообщение о добавлении ноутбука
        cart.add(Product.HEADPHONES); // добавляем наушники в корзину
        System.out.println("+ Добавлен: " + Product.HEADPHONES.getName()); // выводим сообщение о добавлении наушников
        cart.add(Product.CLEAN_CODE); // добавляем книгу в корзину
        System.out.println("+ Добавлен: " + Product.CLEAN_CODE.getName()); // выводим сообщение о добавлении книги
        System.out.println(); // пустая строка

        System.out.println("=== Оформление заказа и покупка ==="); // заголовок формирования чека
        double totalSum = 0; // переменная для накопления итоговой стоимости
        for (int i = 0; i < cart.size(); i++) { // перебираем все товары в корзине
            Product p = cart.get(i); // получаем текущий товар из корзины
            System.out.printf("%d. %-25s : %.2f руб.%n", (i + 1), p.getName(), p.getPrice()); // выводим номер, имя и цену товара
            totalSum += p.getPrice(); // прибавляем цену к итоговой сумме
        } // конец цикла по корзине
        System.out.printf("Итого к оплате: %.2f руб.%n", totalSum); // выводим итоговую сумму заказа
        System.out.println("Оплата успешно произведена! Чек сформирован."); // сообщаем об успешной оплате
        cart.clear(); // очищаем корзину после завершения покупки
    } // конец метода main
} // конец класса Shop
