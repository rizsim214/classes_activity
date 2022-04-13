import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many cars do you want? ");
        byte arraySize = scan.nextByte(); 
        
        Car[] cars = new Car[arraySize];

        for(byte i = 0; i < cars.length; i++){
            int x = i + 1;
            
            System.out.println("Enter Car " + x + "'s Name: ");
            String name = scan.next();
            System.out.println("Enter Car " + x + "'s Model: ");
            String model = scan.next();
            System.out.println("Enter Car " + x + "'s Brand: ");
            String brand = scan.next();
            System.out.println("Enter Car " + x + "'s Year: ");
            int year = scan.nextInt();
            System.out.println("Enter Car " + x + "'s Current Location: ");
            String location = scan.next();
            System.out.println("Enter Car " + x + "'s Initial Gas: ");
            double gas = scan.nextDouble();
            cars[i] = new Car(name, model, brand, year, location, gas);
        }

        for(byte j = 0; j < cars.length; j++){
            System.out.print("\n");
            cars[j].displayCarInfo();
        }
        System.out.println();
        System.out.print("Enter name of the car you want to use to travel:  ");
        String carName = scan.next().toLowerCase();
        System.out.print("Enter Destination:  ");
        String destination = scan.next().toLowerCase();
        System.out.print("Estimated Travel Distance: ");
        double distance = scan.nextDouble();
        scan.close();

        for(int k = 0; k < cars.length; k++){
            if(cars[k].getName() == carName){
                cars[k].travel(destination, distance);
            }
        }
        
        
        System.out.println("End of Program....");
    }
}
