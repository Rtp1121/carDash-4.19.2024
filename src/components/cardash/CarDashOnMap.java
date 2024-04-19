package components.cardash;

import java.util.Iterator;
import components.map.Map;
import components.map.Map1L;

/**
 * {@code CarDash} represented as a {@code Map} with implementations of primary
 * methods.
 *
 * @convention <pre>
 * [all keys of $this.rep are Strings]  and
 * [all values of $this.rep are doubles]
 * </pre>
 * @correspondence <pre>
 * this = [value of $this]
 * </pre>
 *
 * @author Rio Platt
 */
public class CarDashOnMap extends CarDashSecondary {
    /*
     * Private members ---------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private Map<String, Double> rep;

    /**
     * CarDash units. Mi is standard.
     */
    private String unit;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new Map1L<String, Double>();
        this.unit = "mi";
    }

    /*
     * Constructors ------------------------------------------------------------
     */

    /**
     * No argument constructor to create a standard CarDash with default values.
     * Default units in mi, and "!" indicates a value that doesn't need to be
     * converted when changing units.
     */
    public CarDashOnMap() {
        this.createNewRep();
        this.rep.add("!fuel", 0.0); // gallons
        this.rep.add("trip", 0.0);
        this.rep.add("odometer", 0.0);
        this.rep.add("!rpm", 0.0); // revolutions per minute
        this.rep.add("!maxRPM", 7000.0);
        this.rep.add("speed", 0.0);
        this.rep.add("maxSpeed", 140.0);
    }

    /**
     * Constructor from {@code String} that creates a CarDash with default
     * values.
     *
     * @param unit
     *            {@code String} unit (mi/km) to be used for the CarDash
     */
    public CarDashOnMap(String unit) {
        this.createNewRep();
        this.rep.add("!fuel", 0.0);
        this.rep.add("odometer", 0.0);
        this.rep.add("trip", 0.0);
        this.rep.add("!rpm", 0.0);
        this.rep.add("!maxRPM", 7000.0);
        this.rep.add("speed", 0.0);
        if (unit.equals("mi")) {
            this.rep.add("maxSpeed", 140.0);
        } else if (unit.equals("km")) {
            this.unit = "km";
            this.rep.add("maxSpeed", 225.0);
        }
    }

    /*
     * Standard methods --------------------------------------------------------
     */
    @Override
    public final CarDashOnMap newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(CarDash source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof CarDashOnMap : ""
                + "Violation of: source is of dynamic type CarDashOnMap";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        CarDashOnMap localSource = (CarDashOnMap) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ----------------------------------------------------------
     */
    @Override
    public final double get(String key) {
        return this.rep.value(key);
    }

    @Override
    public final void set(String key, double value) {
        this.rep.replaceValue(key, value);
    }

    @Override
    public final String getUnit() {
        return this.unit;
    }

    @Override
    public final void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public final Iterator<Map.Pair<String, Double>> iterator() {
        return this.rep.iterator();
    }
}
