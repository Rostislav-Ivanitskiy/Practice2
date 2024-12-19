public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класів
        Engine carEngine = new Engine(200, 4, 8.5); // Потужність, кількість циліндрів, витрата палива на 100 км
        Fuel carFuel = new Fuel("Бензин", 40, 50); // Тип палива, ціна за літр, об'єм палива
        Car myCar = new Car("Toyota Corolla", carEngine, carFuel); // Модель автомобіля, двигун, паливо

        // Створення об'єкта спортивного автомобіля
        SportsCar mySportsCar = new SportsCar("Ferrari", carEngine, carFuel, 350, "Червоний");

        // Виклик методів класів
        myCar.showCarInfo(); // Вивести інформацію про автомобіль
        System.out.println("Вартість поїздки на відстань 200 км: " + myCar.calculateTripCost(200) + " грн.");
        System.out.println("Витрата палива на поїздку: " + myCar.calculateFuelUsage(200) + " л.");

        // Використовуємо методи класу Engine
        System.out.println("Витрати палива на 100 км: " + carEngine.calculateFuelPer100Km(100) + " л.");

        // Виклик методів спортивного автомобіля
        mySportsCar.showCarInfo(); // Вивести інформацію про спортивний автомобіль
        mySportsCar.performRace(); // Виконати гонку
        System.out.println(mySportsCar.toString()); // Використання перевизначеного методу toString()

        // Виклик методів класу Object
        System.out.println("Перевірка рівності автомобілів: " + myCar.equals(mySportsCar)); // Виклик методу equals()
        System.out.println("Хеш-код автомобіля: " + myCar.hashCode()); // Виклик методу hashCode()
    }
}