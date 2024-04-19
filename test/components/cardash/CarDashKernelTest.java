package components.cardash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.cardash.CarDash;
import components.cardash.CarDashOnMap;

/**
 * JUnit test fixture for {@code CarDash}'s constructors and kernel methods.
 *
 * @author Rio Platt
 */
public class CarDashKernelTest {
    /*
     * Constructor tests -------------------------------------------------------
     */

    /** Test no-argument constructor. */
    @Test
    public void emptyContructorTest() {
        /*
         * Call method under test
         */
        CarDash cd = new CarDashOnMap();
        CarDash cdExpected = new CarDashOnMap();
        String unit = cd.getUnit();
        String unitExpected = "mi";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdExpected, cd);
        assertEquals(unitExpected, unit);
    }

    /** Test constructor with "mi" argument. */
    @Test
    public void constructorMITest() {
        /*
         * Call method under test
         */
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        String unit = cd.getUnit();
        String unitExpected = "mi";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, unit);
    }

    /** Test constructor with "km" argument. */
    @Test
    public void constructorKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String unit = cd.getUnit();
        String unitExpected = "km";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, unit);
    }

    /**
     * Kernel method tests -----------------------------------------------------
     */

    /** Test get for default fuel value. */
    @Test
    public void getFuelTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();

        /*
         * Call method under test
         */
        Double fuel = cd.get("!fuel");
        Double fuelExpected = 0.0;

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(fuelExpected, fuel);
        assertEquals(cdCopy, cd);
    }

    /** Test get for default odometer value. */
    @Test
    public void getodometerTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();

        /*
         * Call method under test
         */
        Double odometer = cd.get("odometer");
        Double odometerExpected = 0.0;

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(odometerExpected, odometer);
        assertEquals(cdCopy, cd);
    }

    /** Test get for default maxRPM value. */
    @Test
    public void getMaxRPMTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();

        /*
         * Call method under test
         */
        Double rpm = cd.get("!maxRPM");
        Double rpmExpected = 7000.0;

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(rpmExpected, rpm);
        assertEquals(cdCopy, cd);
    }

    /** Test get for default maxSpeed value. */
    @Test
    public void getMaxSpeedTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();

        /*
         * Call method under test
         */
        Double maxSpeed = cd.get("maxSpeed");
        Double maxSpeedExpected = 140.0;

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(maxSpeedExpected, maxSpeed);
        assertEquals(cdCopy, cd);
    }

    /** Test get for default maxSpeed value in km. */
    @Test
    public void getMaxSpeedKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");

        /*
         * Call method under test
         */
        Double maxSpeed = cd.get("maxSpeed");
        Double maxSpeedExpected = 225.0;

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(maxSpeedExpected, maxSpeed);
        assertEquals(cdCopy, cd);
    }

    /** Test set for fuel value. */
    @Test
    public void setFuelTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double fuel = 10.0;

        /*
         * Call method under test
         */
        cd.set("!fuel", fuel);
        cdCopy.set("!fuel", fuel);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(fuel, (Double) cd.get("!fuel"));
        assertEquals(cdCopy, cd);
    }

    /** Test set for trip value. */
    @Test
    public void setTripTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double trip = 345.73;

        /*
         * Call method under test
         */
        cd.set("trip", trip);
        cdCopy.set("trip", trip);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(trip, (Double) cd.get("trip"));
        assertEquals(cdCopy, cd);
    }

    /** Test set for speed value. */
    @Test
    public void setSpeedTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double speed = 65.87;

        /*
         * Call method under test
         */
        cd.set("speed", speed);
        cdCopy.set("speed", speed);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(speed, (Double) cd.get("speed"));
        assertEquals(cdCopy, cd);
    }

    /** Test getUnit for standard units ("mi"). */
    @Test
    public void getUnitsTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        /*
         * Call method under test
         */
        String unit = cd.getUnit();
        String unitExpected = "mi";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, unit);
    }

    /** Test getUnit for units "mi" as argument in constructor. */
    @Test
    public void getUnitsMITest() {
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        /*
         * Call method under test
         */
        String unit = cd.getUnit();
        String unitExpected = "mi";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, unit);
    }

    /** Test getUnit for units "km" as argument in constructor. */
    @Test
    public void getUnitKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        /*
         * Call method under test
         */
        String unit = cd.getUnit();
        String unitExpected = "km";

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, unit);
    }

    /** Test setUnit for standard units "mi" to "mi". */
    @Test
    public void setUnitMITest1() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        String unitExpected = "mi";

        /*
         * Call method under test
         */
        cd.setUnit("mi");
        cdCopy.setUnit("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test setUnit for units "mi" as constructor argument to "mi". */
    @Test
    public void setUnitMITest2() {
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        String unitExpected = "mi";

        /*
         * Call method under test
         */
        cd.setUnit("mi");
        cdCopy.setUnit("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test setUnit for units "km" as constructor argument to "mi". */
    @Test
    public void setUnitMITest3() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String unitExpected = "mi";

        /*
         * Call method under test
         */
        cd.setUnit("mi");
        cdCopy.setUnit("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test setUnit for standard units "mi" to "km". */
    @Test
    public void setUnitKMTest1() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        String unitExpected = "km";

        /*
         * Call method under test
         */
        cd.setUnit("km");
        cdCopy.setUnit("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test setUnit for units "mi" as constructor argument to "km". */
    @Test
    public void setUnitKMTest2() {
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        String unitExpected = "km";

        /*
         * Call method under test
         */
        cd.setUnit("km");
        cdCopy.setUnit("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test setUnit for units "km" as constructor argument to "km". */
    @Test
    public void setUnitKMTest3() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String unitExpected = "km";

        /*
         * Call method under test
         */
        cd.setUnit("km");
        cdCopy.setUnit("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }
}
