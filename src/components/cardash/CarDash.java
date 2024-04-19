package components.cardash;

/**
 * {@code CarDashKernel} enhanced with secondary methods.
 *
 * @author Rio Platt
 */
public interface CarDash extends CarDashKernel {

    /**
     * A constant, with value 1.609, holding the value for converting units
     * between metric and imperial.
     */
    double CONVERT = 1.609;

    /**
     * Changes the units of the CarDash.
     *
     * @param unit
     *            Unit ("km"/"mi") to be changed to
     * @ensures this = #this
     */
    void changeUnits(String unit);

    /**
     * Resets a certain value to a base value based on the key given.
     *
     * @param key
     *            String key to be used to find certain value to be reset
     * @updates this
     * @ensures this = #this
     */
    void reset(String key);
}
