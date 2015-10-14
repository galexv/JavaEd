public class testInterfaces{
    public static void main (String[] args){
        Car my_car=new Car();
        MBike my_bike=new MBike();

        // // We cannot do this:
        // Drivable something=new Drivable(); // which Drivable to construct? No constructor exists!

        // But we can do this: an array of "drivables"
        Drivable[] garage=new Drivable[2];

        // And store drivables in this array (implicit upcasting):
        garage[0]=my_car;
        garage[1]=my_bike;

        // We can do also this:
        Drivable v; // allowed: v can contain a reference to any Drivable, but right now does not contain anything.

        System.out.println("Taking the first vehicle for a test drive:");
        v=garage[0];
        driveVehicle(v);

        System.out.println("Taking the second vehicle for a test drive:");
        v=garage[1];
        driveVehicle(v);
    }

    static void driveVehicle(Drivable vehicle) {
        System.out.println("Starting your vehicle");
        vehicle.speedUp(10);

        System.out.println("Stopping your vehicle");
        vehicle.brake();

        System.out.println("Happy driving!");
    }
}

interface Drivable{
    public void speedUp(double increment);
    public void brake();
}

interface SeatAdjustable{
    public void liftSeat(double increaseHeight);
}

class Car implements Drivable{
    private double speed;
    public void speedUp(double increment){
        speed += increment;
        System.out.println("Speeding the car, speed="+speed);
    }

    public void brake() {
        System.out.println("Stopping the car");
        speed=0;
    }
}

class MBike implements  Drivable, SeatAdjustable{
    private double seatHeight;
    private double cadence;
    private double gearCoeff=1;
    public void setGear(double coeff) {
        gearCoeff=coeff;
    }
    public void speedUp(double increment) {
        cadence += increment/gearCoeff;
        System.out.println("Biking with cadence="+cadence);
    }
    public void brake() {
        System.out.println("Stopping the bike");
        cadence=0;
    }
    public void liftSeat(double h) {
        seatHeight += h;
    }
}
