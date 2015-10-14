/** This is to test up- and downcasting */

public class testCasting {
    public static void main(String[] args) {
        MBike my_mountain_bike=new MBike();
        CityBike my_city_bike=new CityBike();

        Bike[] bike_shed=new Bike[5]; // space for 5 bikes in a shed
        
        // Implicit upcasting: MBike --> Bike (because every Mountain Bike "is a" Bike)
        bike_shed[0]=my_mountain_bike;

        // Implicit upcasting: CityBike --> Bike (because every City Bike "is a" Bike)
        bike_shed[1]=my_city_bike;

        // whatever_bike holds a reference to a Bike, but it might be CityBike or MBike.
        Bike whatever_bike=bike_shed[1]; // change it to 0 and see what happens
        whatever_bike.ride();

        if (whatever_bike instanceof Bike) {
            System.out.println("It is (of course) a bike");
        }
        
        if (whatever_bike instanceof MBike) {
            System.out.println("It is a mountain bike");
        }
        
        if (whatever_bike instanceof CityBike) {
            System.out.println("It is a city bike");
        }

        // // Cannot do this:
        // whatever_bike.fold(); // because class Bike does not have method fold()

        // // Cannot do implicit downcasting Bike --> CityBike:
        // CityBike must_be_city_bike=whatever_bike;  // because not every Bike is a CityBike!

        // Promise to the compiler that this particular Bike is a CityBike:
        CityBike must_be_city_bike=(CityBike)whatever_bike;  // if we violate this promise, exception will be thrown.

        // And a CityBike can be folded:
        must_be_city_bike.fold();
    }
}

class Bike {
    public void ride() { System.out.println("Riding bike"); }
}

class MBike extends Bike {
    public void adjustSeat(double delta) { System.out.println("Adjusting seat by "+delta); }
}

class CityBike extends Bike {
    public void fold() { System.out.println("Folding bike"); }
}
