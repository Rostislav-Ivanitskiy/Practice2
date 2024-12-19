class Car {
    String model;
    Engine engine;
    Fuel fuel;


    public Car(String model, Engine engine, Fuel fuel) {
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public void showCarInfo() {
        System.out.println("Модель автомобіля: " + model);
        engine.showPower();
        fuel.showFuelCost();
    }

    public double calculateTripCost(int distance) {
        double fuelCost = fuel.calculateFuelCostForDistance(distance);
        return fuelCost;
    }

    public double calculateFuelUsage(int distance) {
        return engine.calculateFuelConsumption(distance);
    }

    @Override
    public String toString() {
        return "Автомобіль: " + model + ", Потужність двигуна: " + engine.horsepower + " к.с.";
    }

    @Override
    public int hashCode() {
        return (int) (model.hashCode() + engine.horsepower + fuel.pricePerLiter);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return model.equals(car.model) && engine.horsepower == car.engine.horsepower;
    }
}