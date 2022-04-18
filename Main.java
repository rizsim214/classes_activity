import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many brand x cars do you want? ");
        byte arr1 = scan.nextByte(); 

        System.out.print("How many ford cars do you want? ");
        byte arr2 = scan.nextByte();

        Car[] brandX = new Car[arr1];

        Ford[] fords = new Ford[arr2];
        // brandX ARRAY
        for(byte i = 0; i < brandX.length; i++){
            int x = i + 1;
            System.out.println("Enter Brand X Car " + x + "'s Name: ");
            String name = scan.next();
            System.out.println("Enter Brand X Car " + x + "'s Model: ");
            String model = scan.next();
            System.out.println("Enter Brand X Car " + x + "'s Brand: ");
            String brand = scan.next();
            System.out.println("Enter Brand X Car " + x + "'s Year: ");
            int year = scan.nextInt();
            System.out.println("Enter Brand X Car " + x + "'s Current Location: ");
            String location = scan.next();
            System.out.println("Enter Brand X Car " + x + "'s Initial Gas: ");
            double gas = scan.nextDouble();
            System.out.println("Enter Brand X Car " + x + "'s Gas Consumption: ");
            double consumption = scan.nextDouble();
            brandX[i] = new Car(name, model, brand, year, location, gas, consumption);
            brandX[i].displayCarInfo();
            System.out.println("\n");
        }

        // FORDS ARRAY
        for(byte j = 0; j < fords.length; j++){
            int y = j + 1;
            System.out.println("Enter FORD Car " + y + "'s Name: ");
            String name = scan.next();
            System.out.println("Enter FORD Car " + y + "'s Model: ");
            String model = scan.next();
            System.out.println("Enter FORD Car " + y + "'s sound: ");
            String sound = scan.next();
            System.out.println("Enter FORD Car " + y + "'s Year: ");
            int year = scan.nextInt();
            System.out.println("Enter FORD Car " + y + "'s Gas Consumption: ");
            double consumption = scan.nextDouble();
            System.out.println("Enter FORD Car " + y + "'s Initial Gas: ");
            double gas = scan.nextDouble();
            System.out.println("Enter FORD Car " + y + "'s Current Location: ");
            String location = scan.next();
           
            fords[j] = new Ford(sound, consumption, name, model, year, location, gas);
            fords[j].displayCarInfo(sound, consumption);
            System.out.println("\n");
        }
        
        
        System.out.println();
        System.out.println("Which type of car do you want to use? ");
        System.out.println("Choose 1 for BrandX");
        System.out.println("Choose 2 for Ford");
        byte choice = scan.nextByte();
        
        switch(choice){
            case 1: 
                System.out.print("Enter name of the car you want to use to travel:  ");
                String carName = scan.next().toLowerCase();
                System.out.print("Enter Destination:  ");
                String destination = scan.next().toLowerCase();
                System.out.print("Estimated Travel Distance: ");
                double distance = scan.nextDouble();
                for(int k = 0; k < brandX.length; k++){
                    if(brandX[k].getName().equals(carName)){
                        brandX[k].travel(destination, distance);
                    }
                }
                break;
            case 2: 
                System.out.print("Enter name of the car you want to use to travel:  ");
                String fordCarName = scan.next().toLowerCase();
                System.out.print("Enter Destination:  ");
                String dest = scan.next().toLowerCase();
                System.out.print("Estimated Travel Distance: ");
                double dist = scan.nextDouble();
                for(int k = 0; k < fords.length; k++){
                    if(fords[k].getName().equals(fordCarName)){
                        fords[k].travel(dest, dist);
                    }
                }
                break;
            default: 
                System.out.println(choice + " is not a valid choice");
        }
       
        scan.close(); 
        System.out.println();   
        System.out.println("END OF PROGRAM...");
    }
   
}
