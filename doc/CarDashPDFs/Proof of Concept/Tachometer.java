package CarDash;

public class Tachometer {
    /**
     * Total mileage.
     */
    private double rpm;
    /**
     * Current trip mileage.
     */
    private double maxRPM;

    /**
     * Constructor.
     */
    public Tachometer() {
        this.rpm = 0.7;
        this.maxRPM = 7;
    }

    /**
     * Getter method for engine rpm.
     *
     * @return engine rpm.
     */
    public double getRPM() {
        return this.rpm;
    }

    /**
     * Getter method for max engine rpm.
     *
     * @return max engine rpm.
     */
    public double getMaxRPM() {
        return this.maxRPM;
    }

    /**
     * Setter method for rpm.
     *
     * @param newRPM
     */
    public void setRPM(double newRPM) {
        this.rpm = newRPM;
    }

    /**
     * Setter method for max rpm.
     *
     * @param newMax
     */
    public void setMaxRPM(double newMax) {
        this.maxRPM = newMax;
    }

    /**
     * For good practice.
     *
     * @return String with class information.
     */
    @Override
    public String toString() {
        return "RPM = " + this.rpm
                + " thousand revolutions per minute\nMax RPM = " + this.maxRPM
                + "thousand revolutions per minute";
    }
}
