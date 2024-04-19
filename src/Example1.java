import components.cardash.CarDash;
import components.cardash.CarDashOnMap;

/**
 * Use case of converting a low-mileage European sports car's dash from metric
 * to imperial.
 *
 * @author Rio Platt
 */
public class Example1 {
    public static void main(String[] args) {
        /* Creating CarDash object in "km" units */
        CarDash cd = new CarDashOnMap("km");

        /* Setting values for the CarDash */
        cd.set("!fuel", 14.7);
        cd.set("odometer", 14843.8);
        cd.set("!rpm", 850.0); // car is idling
        cd.set("!maxRPM", 8000.0);
        cd.set("maxSpeed", 250);

        /* Changing units to imperial */
        cd.changeUnits("mi");

        /*
         * Car receives engine upgrades and needs a larger speedometer and
         * higher redline
         */
        cd.set("maxSpeed", 320.0);
        cd.set("!maxRPM", 9000.0);

        /* Checking the max engine rpm to prevent engine damage */
        System.out.println(
                "Max RPM: " + cd.get("!maxRPM") + " Revolutions per Minute");

        /* Printing out String representation of the CarDash */
        System.out.println(cd.toString());
    }
}
