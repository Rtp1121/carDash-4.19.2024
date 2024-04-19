package CarDash;

/**
 * Information for the speedometer.
 */
public class Speedometer {
    /**
     * Max speed for speedometer.
     */
    private double maxSpeed;
    /**
     * Current speed.
     */
    private double speed;
    /**
     * Units - MPH/KMH
     */
    private String units;
    /**
     * Constant for changing units between MPH and KMH.
     */
    private static final double convert = 1.609;

    /**
     * Constructor. MPH is default.
     */
    public Speedometer() {
        this.maxSpeed = 140.0;
        this.speed = 0.0;
    }

    /**
     * Getter method for max speed. Gets the max speed of the speedometer.
     *
     * @return max speed on speedometer.
     */
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Getter method for speed. Gets the current speed of the car.
     *
     * @return current vehicle speed.
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Sets the max speed.
     *
     * @param newMax
     */
    public void setMaxSpeed(double newMax) {
        this.maxSpeed = newMax;
    }

    /**
     * Setter method for speed. May change this so that speed becomes based on
     * acceleration in which case this method will be replaced by an updates
     * method that will update the speed depending on acceleration, which will
     * be added to this class as a class variable.
     *
     * @param newSpeed
     */
    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Changes units of speed between mph and kmh.
     *
     * @param newUnit
     */
    public void changeUnits(String newUnit) {
        if (newUnit.equals("kmh")) {
            this.speed *= convert;
            this.maxSpeed *= convert;
            this.units = newUnit;
        } else if (newUnit.equals("mph")) {
            this.speed /= convert;
            this.maxSpeed /= convert;
        }
    }

    /**
     * For good practice.
     *
     * @return String with class information.
     */
    @Override
    public String toString() {
        return "speed = " + this.speed + " " + this.units + "\nmaxSpeed = "
                + this.maxSpeed + " " + this.units;
    }
}
