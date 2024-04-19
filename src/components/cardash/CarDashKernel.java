package components.cardash;

import components.standard.Standard;
import java.util.Iterator;
import components.map.Map;

/**
 * Car Dash kernel component with primary methods.
 *
 * @author Rio Platt
 */
public interface CarDashKernel
        extends Standard<CarDash>, Iterable<Map.Pair<String, Double>> {

    /**
     * Searches the CarDash map to find a certain value based on the key given.
     *
     * @param key
     *            the String key to be searched for (maxRPM, fuelLevel, etc.)
     * @return double value of the key.
     * @ensures this = #this
     * @requires there exists a String key
     */
    double get(String key);

    /**
     * Searches the CarDash map to change a certain value based on the key
     * given.
     *
     * @param key
     *            the String key to be searched for
     * @param value
     *            the double value to be changed to
     * @ensures this = #this (length is same)
     * @updates this (updates the map)
     * @requires there exists a String key
     */
    void set(String key, double value);

    /**
     * Gives the current units ("mi"/"km") the CarDash is in.
     *
     * @return String value of current CarDash units
     */
    String getUnit();

    /**
     * Sets the current CarDash unit to the parameter unit.
     *
     * @param unit
     *            the String unit to change the CarDash unit to
     */
    void setUnit(String unit);

    /**
     * Creates and returns an iterator to iterate through the Map that stores
     * the CarDash attributes.
     *
     * @return Iterator to iterate through CarDash Map
     */
    Iterator<Map.Pair<String, Double>> iterator();
}
