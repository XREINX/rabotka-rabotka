package ru.mirea.part4.seasons; // объявление пакета для практической части 4 (времена года)

public enum Season { // перечисление (enum) времен года
    WINTER(-10.5), // элемент зима со средней температурой -10.5 °C
    SPRING(12.0), // элемент весна со средней температурой 12.0 °C
    SUMMER(24.5) { // элемент лето со средней температурой 24.5 °C
        @Override // переопределяем описание для летнего сезона
        public String getDescription() { // персональный метод описания
            return "Теплое время года"; // для лета возвращаем "Теплое время года"
        } // конец переопределения getDescription
    }, // конец описания SUMMER
    AUTUMN(8.0); // элемент осень со средней температурой 8.0 °C

    private final double averageTemp; // неизменяемое поле для хранения средней температуры

    Season(double averageTemp) { // конструктор элементов перечисления
        this.averageTemp = averageTemp; // сохраняем температуру в поле
    } // конец конструктора

    public double getAverageTemp() { // геттер для получения средней температуры
        return averageTemp; // возвращаем значение средней температуры
    } // конец метода getAverageTemp

    public String getDescription() { // базовый метод описания сезона
        return "Холодное время года"; // для всех сезонов по умолчанию возвращаем "Холодное время года"
    } // конец метода getDescription

    public static void printFavoriteSeasonMessage(Season season) { // метод вывода сообщения о любимом сезоне
        switch (season) { // оператор switch для выбора нужного текста по времени года
            case SUMMER: // если выбрано лето
                System.out.println("Я люблю лето!"); // выводим фразу про лето
                break; // выходим из конструкции switch
            case WINTER: // если выбрана зима
                System.out.println("Я люблю зиму!"); // выводим фразу про зиму
                break; // выходим из switch
            case SPRING: // если выбрана весна
                System.out.println("Я люблю весну!"); // выводим фразу про весну
                break; // выходим из switch
            case AUTUMN: // если выбрана осень
                System.out.println("Я люблю осень!"); // выводим фразу про осень
                break; // выходим из switch
        } // конец switch
    } // конец метода printFavoriteSeasonMessage

    public static void main(String[] args) { // точка входа в программу
        System.out.println("=== Задание 1. Времена года (Enum) ==="); // выводим заголовок задания
        
        Season myFavorite = Season.SUMMER; // объявляем любимое время года (лето)
        System.out.println("Мое любимое время года: " + myFavorite.name()); // печатаем имя перечисления
        System.out.println("Средняя температура: " + myFavorite.getAverageTemp() + " °C"); // печатаем температуру
        System.out.println("Характеристика: " + myFavorite.getDescription()); // выводим характеристику (теплое)

        System.out.print("Результат метода switch: "); // выводим префикс перед вызовом метода
        printFavoriteSeasonMessage(myFavorite); // вызываем метод со switch

        System.out.println("--- Все времена года ---"); // выводим разделитель списка
        for (Season s : Season.values()) { // цикл по всем значениям перечисления Season
            System.out.printf("Время года: %-7s | Ср. темп: %5.1f °C | Описание: %s%n", // форматированный вывод строки
                    s.name(), s.getAverageTemp(), s.getDescription()); // подставляем название, температуру и описание
        } // конец цикла for
    } // конец метода main
} // конец enum Season
