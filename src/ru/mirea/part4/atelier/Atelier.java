package ru.mirea.part4.atelier; // объявление пакета для практической части 4 (ателье)

public class Atelier { // класс ателье одежды

    public enum Size { // перечисление размеров одежды
        XXS(32) { // размер XXS со значением евро-размера 32
            @Override // переопределяем описание для самого маленького размера
            public String getDescription() { // метод описания размера
                return "Детский размер"; // для XXS возвращаем "Детский размер"
            } // конец метода getDescription
        }, // конец XXS
        XS(34), // размер XS (34)
        S(36), // размер S (36)
        M(38), // размер M (38)
        L(40); // размер L (40)

        private final int euroSize; // числовое поле евро-размера

        Size(int euroSize) { // конструктор размера
            this.euroSize = euroSize; // сохраняем числовой размер
        } // конец конструктора

        public int getEuroSize() { // геттер евро-размера
            return euroSize; // возвращаем число евро-размера
        } // конец метода getEuroSize

        public String getDescription() { // базовое описание размера
            return "Взрослый размер"; // для всех остальных размеров возвращаем "Взрослый размер"
        } // конец метода getDescription
    } // конец enum Size

    public interface MenClothing { // интерфейс мужской одежды
        void dressMan(); // метод "одеть мужчину"
    } // конец интерфейса MenClothing

    public interface WomenClothing { // интерфейс женской одежды
        void dressWomen(); // метод "одеть женщину"
    } // конец интерфейса WomenClothing

    public static abstract class Clothes { // абстрактный родительский класс для элементов одежды
        protected Size size; // поле размера одежды
        protected double price; // поле стоимости одежды
        protected String color; // поле цвета одежды

        public Clothes(Size size, double price, String color) { // конструктор базовой одежды
            this.size = size; // сохраняем размер
            this.price = price; // сохраняем цену
            this.color = color; // сохраняем цвет
        } // конец конструктора

        public Size getSize() { return size; } // геттер для размера одежды
        public double getPrice() { return price; } // геттер для цены одежды
        public String getColor() { return color; } // геттер для цвета одежды
    } // конец абстрактного класса Clothes

    public static class TShirt extends Clothes implements MenClothing, WomenClothing { // футболка подходит и мужчинам, и женщинам
        public TShirt(Size size, double price, String color) { // конструктор футболки
            super(size, price, color); // передаем параметры в конструктор родителя Clothes
        } // конец конструктора

        @Override // реализация примерки мужской футболки
        public void dressMan() { // метод dressMan
            System.out.printf("Мужская футболка: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод параметров
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики футболки
        } // конец метода dressMan

        @Override // реализация примерки женской футболки
        public void dressWomen() { // метод dressWomen
            System.out.printf("Женская футболка: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод параметров
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики футболки
        } // конец метода dressWomen
    } // конец класса TShirt

    public static class Pants extends Clothes implements MenClothing, WomenClothing { // штаны подходят и мужчинам, и женщинам
        public Pants(Size size, double price, String color) { // конструктор штанов
            super(size, price, color); // передаем размер, цену и цвет предку
        } // конец конструктора

        @Override // реализация примерки мужских штанов
        public void dressMan() { // метод dressMan
            System.out.printf("Мужские штаны: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики штанов
        } // конец метода dressMan

        @Override // реализация примерки женских штанов
        public void dressWomen() { // метод dressWomen
            System.out.printf("Женские штаны: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики штанов
        } // конец метода dressWomen
    } // конец класса Pants

    public static class Skirt extends Clothes implements WomenClothing { // юбка предназначена только для женщин
        public Skirt(Size size, double price, String color) { // конструктор юбки
            super(size, price, color); // передаем параметры в Clothes
        } // конец конструктора

        @Override // реализация примерки юбки
        public void dressWomen() { // метод dressWomen
            System.out.printf("Женская юбка: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики юбки
        } // конец метода dressWomen
    } // конец класса Skirt

    public static class Tie extends Clothes implements MenClothing { // галстук предназначен только для мужчин
        public Tie(Size size, double price, String color) { // конструктор галстука
            super(size, price, color); // передаем параметры в Clothes
        } // конец конструктора

        @Override // реализация примерки галстука
        public void dressMan() { // метод dressMan
            System.out.printf("Мужской галстук: размер %s (EUR %d, %s), цена: %.2f руб, цвет: %s%n", // форматированный вывод
                    size, size.getEuroSize(), size.getDescription(), price, color); // подставляем характеристики галстука
        } // конец метода dressMan
    } // конец класса Tie

    public void dressWomen(Clothes[] clothes) { // метод для подбора и вывода всей женской одежды
        System.out.println("=== Одеваем женщин (Женский гардероб) ==="); // заголовок секции
        for (Clothes item : clothes) { // перебираем все вещи в массиве
            if (item instanceof WomenClothing) { // если вещь реализует женский интерфейс
                ((WomenClothing) item).dressWomen(); // вызываем метод примерки женской вещи
            } // конец проверки интерфейса
        } // конец цикла
    } // конец метода dressWomen

    public void dressMan(Clothes[] clothes) { // метод для подбора и вывода всей мужской одежды
        System.out.println("=== Одеваем мужчин (Мужской гардероб) ==="); // заголовок секции
        for (Clothes item : clothes) { // перебираем все вещи в массиве
            if (item instanceof MenClothing) { // если вещь реализует мужской интерфейс
                ((MenClothing) item).dressMan(); // вызываем метод примерки мужской вещи
            } // конец проверки интерфейса
        } // конец цикла
    } // конец метода dressMan

    public static void main(String[] args) { // главный метод демонстрации работы ателье
        Clothes[] wardrobe = new Clothes[] { // создаем гардероб с набором вещей разных типов
            new TShirt(Size.M, 1500, "Белый"), // создаем футболку размера M
            new Pants(Size.L, 3500, "Темно-синий"), // создаем штаны размера L
            new Skirt(Size.S, 2800, "Красный"), // создаем юбку размера S
            new Tie(Size.M, 1200, "Черный"), // создаем галстук размера M
            new TShirt(Size.XXS, 1100, "Розовый"), // создаем детскую футболку XXS
            new Pants(Size.XXS, 2000, "Серый") // создаем детские штаны XXS
        }; // конец массива вещей

        Atelier atelier = new Atelier(); // создаем экземпляр ателье
        atelier.dressWomen(wardrobe); // вызываем показ женского гардероба
        System.out.println(); // пустая строка между блоками
        atelier.dressMan(wardrobe); // вызываем показ мужского гардероба
    } // конец метода main
} // конец класса Atelier
