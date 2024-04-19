package CarDash;

/**
 * Information for the odometer.
 */
public class Odometer {
    /**
     * Total mileage.
     */
    private double mileage;
    /**
     * Current trip mileage.
     */
    private double trip;
    /**
     * Units - MPH/KMH
     */
    private String units;
    /**
     * Constant for changing units between MPH and KMH.
     */
    private static final double convert = 1.609;

    /**
     * Constructor.
     */
    public Odometer() {
        this.mileage = 0.0;
        this.trip = 0.0;
    }

    /**
     * Getter method for mileage.
     *
     * @return total mileage of vehicle.
     */
    public double getMileage() {
        return this.mileage;
    }

    /**
     * Getter method for current trip mileage.
     *
     * @return current trip mileage.
     */
    public double getTrip() {
        return this.trip;
    }

    /**
     * Setter method for mileage.
     *
     * @param newMileage
     */
    public void setMileage(double newMileage) {
        this.mileage = newMileage;
    }

    /**
     * Setter method for trip mileage.
     *
     * @param newTrip
     */
    public void setTrip(double newTrip) {
        this.trip = newTrip;
    }

    /**
     * Resets the current trip mileage.
     */
    public void resetTrip() {
        this.trip = 0;
    }

    /**
     * Changes units of speed between mph and kmh.
     *
     * @param newUnit
     */
    public void changeUnits(String newUnit) {
        if (newUnit.equals("kmh")) {
            this.mileage *= convert;
            this.trip *= convert;
            this.units = newUnit;
        } else if (newUnit.equals("mph")) {
            this.mileage /= convert;
            this.trip /= convert;
        }
    }

    /**
     * For good practice.
     *
     * @return String with class information.
     */
    @Override
    public String toString() {
        return "Mileage = " + this.mileage + " " + this.units
                + "\nCurrent Trip = " + this.trip + " " + this.units;
    }
}
