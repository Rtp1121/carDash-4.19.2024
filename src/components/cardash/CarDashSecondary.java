package components.cardash;

import components.map.Map;
import java.util.Iterator;

/**
 * Layered implementations of secondary methods for {@code CarDash}.
 *
 * @author Rio Platt
 */
public abstract class CarDashSecondary implements CarDash {
    /**
     * A constant, with value 1.609, holding the value for converting units
     * between metric and imperial.
     */
    private static final double CONVERT = 1.609;

    /**
     * Changes the units of the CarDash.
     *
     * @param unit
     *            Unit ("km"/"mi") to be changed to
     * @requires unit is a valid unit
     * @ensures this = #this
     */
    public void changeUnits(String unit) {
        // Creating iterator to iterate through each entry to convert its units.
        Iterator<Map.Pair<String, Double>> it = this.iterator();
        // Checking if "km" is the unit to be converted to and that CarDash already isn't in km
        if (unit.equals("km") && !this.getUnit().equals("km")) {
            // Looping through each entry
            while (it.hasNext()) {
                Map.Pair<String, Double> pair = it.next();
                // Checks if the key contains a "!" indicating a value that doesn't need conversion
                if (!pair.key().contains("!")) {
                    this.set(pair.key(), pair.value() * CONVERT);
                }
            }
            // Checking "mi" is the unit to be converted to and that CarDash already isn't in mi
        } else if (unit.equals("mi") && !this.getUnit().equals("mi")) {
            while (it.hasNext()) {
                Map.Pair<String, Double> pair = it.next();
                if (!pair.key().contains("!")) {
                    this.set(pair.key(), pair.value() / CONVERT);
                }
            }
        }
        // Setting the unit of CarDash
        this.setUnit(unit);
    }

    /**
     * Resets a certain value to a base value based on the key given.
     *
     * @param key
     *            String key to be used to find certain value to be reset
     * @updates this
     * @ensures this = #this
     */
    public void reset(String key) {
        // Getting the unit of the CarDash
        String unit = this.getUnit();
        // Checking if the entry key is maxSpeed to be resetted to the default "mi" value
        if (key.equals("maxSpeed") && unit.equals("mi")) {
            this.set(key, 140.0);
            // Checking if the entry key is maxSpeed to be resetted to the default "km" value
        } else if (key.equals("maxSpeed") && unit.equals("km")) {
            this.set(key, 225.0);
            // Checking if the entry key is maxRPM to be resetted to the default value
        } else if (key.equals("!maxRPM")) {
            this.set(key, 7000.0);
            // The rest of the entries get default values of 0.0
        } else {
            this.set(key, 0.0);
        }
    }

    /*
     * Common methods ----------------------------------------------------------
     */

    /**
     * toString common method.
     *
     * @return String representation of this.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<");
        Iterator<Map.Pair<String, Double>> it = this.iterator();
        while (it.hasNext()) {
            result.append(it.next());
            if (it.hasNext()) {
                result.append(", ");
            }
        }
        result.append(">");
        return result.toString();
    }

    /**
     * equals common method.
     *
     * @param o
     *            object o to be compared to
     * @return boolean stating whether two objects are equal to each other.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return false;
        } else if (o == null) {
            return false;
        } else if (!(o instanceof CarDashOnMap)) {
            return false;
        }
        CarDashOnMap c = (CarDashOnMap) o;
        Iterator<Map.Pair<String, Double>> it1 = this.iterator();
        Iterator<?> it2 = c.iterator();
        while (it1.hasNext()) {
            Map.Pair<String, Double> x1 = it1.next();
            Object x2 = it2.next();
            if (!x1.equals(x2)) {
                return false;
            }
        }
        return true;
    }

    /**
     * hashCode common method.
     *
     * @return int representation of CarDash.
     */
    @Override
    public int hashCode() {
        int num = 0;
        Iterator<Map.Pair<String, Double>> it = this.iterator();
        while (it.hasNext()) {
            Map.Pair<String, Double> pair = it.next();
            num += pair.key().hashCode() + pair.value().hashCode();
        }
        return num + this.getUnit().hashCode();
    }
}
