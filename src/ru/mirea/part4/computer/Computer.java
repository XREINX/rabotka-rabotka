package ru.mirea.part4.computer; // объявление пакета для практической части 4 (компьютер)

public class Computer { // класс моделирования персонального компьютера

    public enum Brand { // перечисление производителей компьютеров
        ASUS, // бренд ASUS
        LENOVO, // бренд Lenovo
        HP, // бренд HP
        DELL, // бренд Dell
        APPLE, // бренд Apple
        MSI // бренд MSI
    } // конец enum Brand

    public static class Processor { // внутренний класс, описывающий процессор
        private final String model; // модель процессора
        private final double clockSpeedGhz; // тактовая частота в ГГц
        private final int cores; // количество вычислительных ядер

        public Processor(String model, double clockSpeedGhz, int cores) { // конструктор процессора
            this.model = model; // сохраняем модель
            this.clockSpeedGhz = clockSpeedGhz; // сохраняем частоту
            this.cores = cores; // сохраняем число ядер
        } // конец конструктора

        public String getModel() { return model; } // геттер модели
        public double getClockSpeedGhz() { return clockSpeedGhz; } // геттер тактовой частоты
        public int getCores() { return cores; } // геттер количества ядер

        @Override // переопределяем строковый вывод процессора
        public String toString() { // метод toString
            return String.format("%s (%.1f ГГц, %d ядер)", model, clockSpeedGhz, cores); // формируем строку характеристик процессора
        } // конец метода toString
    } // конец класса Processor

    public static class Memory { // внутренний класс, описывающий оперативную память
        private final int capacityGb; // объем памяти в гигабайтах
        private final String type; // тип памяти (DDR4, DDR5, LPDDR5)
        private final int frequencyMhz; // рабочая частота памяти в МГц

        public Memory(int capacityGb, String type, int frequencyMhz) { // конструктор оперативной памяти
            this.capacityGb = capacityGb; // сохраняем объем
            this.type = type; // сохраняем тип памяти
            this.frequencyMhz = frequencyMhz; // сохраняем частоту памяти
        } // конец конструктора

        public int getCapacityGb() { return capacityGb; } // геттер объема памяти
        public String getType() { return type; } // геттер типа памяти
        public int getFrequencyMhz() { return frequencyMhz; } // геттер частоты памяти

        @Override // переопределяем строковый вывод памяти
        public String toString() { // метод toString
            return String.format("%d ГБ %s (%d МГц)", capacityGb, type, frequencyMhz); // формируем строку характеристик памяти
        } // конец метода toString
    } // конец класса Memory

    public static class Monitor { // внутренний класс, описывающий монитор
        private final double diagonalInches; // диагональ экрана в дюймах
        private final String resolution; // разрешение экрана (например, 2560x1440)
        private final int refreshRateHz; // частота обновления экрана в Гц

        public Monitor(double diagonalInches, String resolution, int refreshRateHz) { // конструктор монитора
            this.diagonalInches = diagonalInches; // сохраняем диагональ
            this.resolution = resolution; // сохраняем разрешение
            this.refreshRateHz = refreshRateHz; // сохраняем частоту обновления
        } // конец конструктора

        public double getDiagonalInches() { return diagonalInches; } // геттер диагонали
        public String getResolution() { return resolution; } // геттер разрешения экрана
        public int getRefreshRateHz() { return refreshRateHz; } // геттер частоты обновления

        @Override // переопределяем строковый вывод монитора
        public String toString() { // метод toString
            return String.format("%.1f дюймов %s (%d Гц)", diagonalInches, resolution, refreshRateHz); // формируем строку характеристик монитора
        } // конец метода toString
    } // конец класса Monitor

    private final Brand brand; // марка компьютера (из перечисления Brand)
    private final Processor processor; // процессор компьютера
    private final Memory memory; // оперативная память компьютера
    private final Monitor monitor; // монитор компьютера

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) { // сборка компьютера из компонентов
        this.brand = brand; // сохраняем выбранный бренд
        this.processor = processor; // сохраняем процессор
        this.memory = memory; // сохраняем память
        this.monitor = monitor; // сохраняем монитор
    } // конец конструктора Computer

    public Brand getBrand() { return brand; } // геттер марки компьютера
    public Processor getProcessor() { return processor; } // геттер процессора
    public Memory getMemory() { return memory; } // геттер памяти
    public Monitor getMonitor() { return monitor; } // геттер монитора

    public void printSpecs() { // метод вывода полной спецификации компьютера
        System.out.println("========================================"); // линия границы
        System.out.println("Компьютер марки: " + brand); // выводим название бренда
        System.out.println("  Процессор:  " + processor); // выводим данные процессора
        System.out.println("  Память ОЗУ: " + memory); // выводим данные оперативной памяти
        System.out.println("  Монитор:    " + monitor); // выводим данные монитора
        System.out.println("========================================"); // линия границы
    } // конец метода printSpecs

    public static void main(String[] args) { // точка входа в программу
        System.out.println("=== Конфигуратор компьютеров (Задание 4 Enum) ==="); // заголовок задания

        Processor p1 = new Processor("Intel Core i7-13700K", 3.4, 16); // создаем процессор Intel
        Memory m1 = new Memory(32, "DDR5", 5600); // создаем память 32 ГБ DDR5
        Monitor mon1 = new Monitor(27.0, "2560x1440 QHD", 165); // создаем игровой монитор 27 дюймов
        Computer pc1 = new Computer(Brand.ASUS, p1, m1, mon1); // собираем компьютер марки ASUS
        pc1.printSpecs(); // печатаем характеристики первого ПК

        System.out.println(); // пустая строка между компьютерами
        Processor p2 = new Processor("Apple M3 Pro", 4.05, 12); // создаем чип Apple M3 Pro
        Memory m2 = new Memory(18, "Unified LPDDR5", 6400); // создаем объединенную память 18 ГБ
        Monitor mon2 = new Monitor(16.2, "3456x2234 Liquid Retina XDR", 120); // создаем дисплей Liquid Retina
        Computer pc2 = new Computer(Brand.APPLE, p2, m2, mon2); // собираем компьютер марки Apple
        pc2.printSpecs(); // печатаем характеристики второго ПК
    } // конец метода main
} // конец класса Computer
