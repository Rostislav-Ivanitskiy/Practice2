class Engine {
    double horsepower;
    int cylinders;
    double fuelConsumptionPer100Km;  // Витрата палива на 100 км


    public Engine(double horsepower, int cylinders, double fuelConsumptionPer100Km) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }


    public void showPower() {
        System.out.println("Двигун має потужність: " + horsepower + " к.с.");
    }


    public double calculateFuelConsumption(int distance) {
        return (fuelConsumptionPer100Km / 100) * distance;
    }


    public double calculateFuelPer100Km(double distance) {
        return (fuelConsumptionPer100Km / distance) * 100;
    }
}