import java.util.Scanner;

abstract class Ride {

    abstract int calculateFare(int distance);

    public void rideType() {
        System.out.println("Generic Ride");
    } 
}

class AutoRide extends Ride  {

    @Override
    int calculateFare(int distance) {
    return distance * 10;
    }

    @Override
    public void rideType() {
        System.out.println("Auto Ride");
    }
}

class CarRide extends Ride {

    @Override
    int calculateFare(int distance) {
        return distance * 20;
    }
    @Override   
    public void rideType() {
        System.out.println("Car Ride");
    }
}

public class BookingApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ride type (auto / car): ");
        String type = input.nextLine();

        System.out.print("Enter the distance (in km): ");
        int distance = input.nextInt();

        Ride ride;

        if (type.equals("auto")) {
            ride = new AutoRide();
        }
        else {
            ride = new CarRide();
        }

        ride.rideType();
        int fare = ride.calculateFare(distance);

        System.out.println("Total Fare: " + fare);

        input.close();
    }
}
