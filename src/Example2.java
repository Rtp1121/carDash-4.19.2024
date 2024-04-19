import components.cardash.CarDash;
import components.cardash.CarDashOnMap;

/**
 * Use case of converting a high-mileage economy car dash from imperial to
 * metric. Car is getting refueled at a gas station.
 *
 * @author Rio Platt
 */
public class Example2 {
    public static void main(String[] args) {
        /* Creating CarDash */
        CarDash cd = new CarDashOnMap();

        /*
         * Setting values for the CarDash. Most of the default values work
         * because they're based on an economy car.
         */
        cd.set("!fuel", 0.7);
        cd.set("odometer", 247567.39);
        cd.set("trip", 367.87);

        /* Changing units to metric */
        cd.changeUnits("km");

        /* Car is getting refueled */
        cd.set("!fuel", 10.0);
        cd.reset("trip");

        /* Displaying refueled tank and resetted trip */
        System.out.println("Fuel remaining: " + cd.get("!fuel") + " Gallons");
        System.out.println("Trip " + cd.get("trip") + " Kilometers");
        /* Printing the String reprsentation of the CarDash */
        System.out.println(cd.toString());
    }
}
