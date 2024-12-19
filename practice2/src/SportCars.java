class SportsCar extends Car {
    int maxSpeed;
    String color;


    public SportsCar(String model, Engine engine, Fuel fuel, int maxSpeed, String color) {
        super(model, engine, fuel);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }


    @Override
    public void showCarInfo() {
        super.showCarInfo();
        System.out.println("Максимальна швидкість: " + maxSpeed + " км/год");
        System.out.println("Колір автомобіля: " + color);
    }


    public void performRace() {
        System.out.println(model + " виконує гонку на швидкість!");
    }


    @Override
    public String toString() {
        return "Спортивний автомобіль: " + model + ", Швидкість: " + maxSpeed + " км/год";
    }
}