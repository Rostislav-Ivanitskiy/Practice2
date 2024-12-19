class Fuel {
    String type;
    double pricePerLiter;
    double volume;


    public Fuel(String type, double pricePerLiter, double volume) {
        this.type = type;
        this.pricePerLiter = pricePerLiter;
        this.volume = volume;
    }


    public void showFuelCost() {
        System.out.println("Ціна за літр палива: " + pricePerLiter + " грн.");
    }


    public double calculateTotalCost() {
        return pricePerLiter * volume;
    }


    public double calculateFuelCostForDistance(int distance) {
        return distance * pricePerLiter;
    }
}