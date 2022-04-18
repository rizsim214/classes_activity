public class Ford extends Car {

    private String sound;
    

    public Ford(String sound, double consumption, String name, String model, int year, String location, double gas ){
        super(name, model, year, location, gas, consumption);
        this.sound = sound;
        
    }

    public void travel(String destination, double distance){
        setLocation(destination);
        double newGas = calculateGasUsed(distance, consumption);
        setGas(newGas);
        displayCarInfo(sound, consumption);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}