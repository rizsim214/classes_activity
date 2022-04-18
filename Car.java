
public class Car {
    private String name;
    private String model;
    private String brand;
    private int year;
    protected String location;
    protected double gas;
    protected double consumption;

    public Car(String name, String model, String brand, int year, String location, double gas, double consumption) {
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.location = location;
        this.gas = gas;
        this.consumption = consumption;
    }
    public Car(String name, String model, int year, String location, double gas, double consumption) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.location = location;
        this.gas = gas;
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    public void travel(String destination) {
        this.location = destination;
        System.out.println("Name: " + name.toUpperCase() + "\nModel: " + model.toUpperCase() + "\nBrand: " + brand.toUpperCase() + "\nYear: " + year + "\nDestination: " + location.toUpperCase());
    }
    
    public void travel(String destination , double distance) {
        setLocation(destination);
        double newGas = calculateGasUsed(distance);
        setGas(newGas);
        displayCarInfo();
    }

    public double calculateGasUsed(double distance) {
        double result = distance / 15.5;
        double newGas =  this.gas - result;
        return newGas;
    }
    public double calculateGasUsed(double distance, double consumption) {
        double result = distance / consumption;
        double newGas =  this.gas - result;
        return newGas;
    }

    public void displayCarInfo() {
        System.out.println("Name: " + name.toUpperCase() + "\nModel: " + model.toUpperCase() + "\nBrand: " + brand.toUpperCase() + "\nYear: " + year + "\nLocation: " + location.toUpperCase() + "\nGas: " + gas + "\nConsumption " + consumption );
    }
    public void displayCarInfo(String sound, double consumption) {
        System.out.println("Name: " + name.toUpperCase() + "\nModel: " + model.toUpperCase() + "\nYear: " + year + "\nLocation: " + location.toUpperCase() + "\nGas: " + gas + "\nGas Consumption: " + consumption + "\nSound: " + sound);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas){
        this.gas = gas;
    }
    
}
