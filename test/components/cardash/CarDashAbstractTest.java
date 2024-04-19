package components.cardash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.cardash.CarDash;
import components.cardash.CarDashOnMap;

/**
 * JUnit test fixture for {@code CarDash}'s constructors and abstract methods.
 *
 * @author Rio Platt
 */
public class CarDashAbstractTest {
    /**
     * Secondary method tests --------------------------------------------------
     */

    /** Test changeUnits for default unit "mi" to "mi". */
    @Test
    public void changeUnitsMITest1() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        String unitExpected = "mi";

        /*
         * Call method under test
         */
        // cdCopy.changeUnits() not called because cdCopy and cd should be equal
        cd.changeUnits("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test changeUnits for constructor argument "mi" to "mi". */
    @Test
    public void changeUnitsMITest2() {
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        String unitExpected = "mi";

        /*
         * Call method under test.
         */
        // cdCopy.changeUnits() not called because cdCopy and cd should be equal
        cd.changeUnits("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test changeUnits for constructor argument "km" to "mi". */
    @Test
    public void changeUnitsMITest3() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String unitExpected = "mi";

        /*
         * Call method under test.
         */
        cd.changeUnits("mi");
        cdCopy.changeUnits("mi");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test changeUnits for default unit "mi" to "km". */
    @Test
    public void changeUnitsKMTest1() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        String unitExpected = "km";

        /*
         * Call method under test.
         */
        cd.changeUnits("km");
        cdCopy.changeUnits("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test changeUnits for constructor argument unit "mi" to "km". */
    @Test
    public void changeUnitsKMTest2() {
        CarDash cd = new CarDashOnMap("mi");
        CarDash cdCopy = new CarDashOnMap("mi");
        String unitExpected = "km";

        /*
         * Call method under test.
         */
        cd.changeUnits("km");
        cdCopy.changeUnits("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test changeUnits for constructor argument unit "mi" to "km". */
    @Test
    public void changeUnitsKMTest3() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String unitExpected = "km";

        /*
         * Call method under test.
         */
        cd.changeUnits("km");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(unitExpected, cd.getUnit());
    }

    /** Test reset for default fuel value. */
    @Test
    public void resetFuelTest1() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double fuelExpected = 0.0;
        /*
         * Call method under test
         */
        // cdCopy.reset() not called because cdCopy and cd should be equal
        cd.reset("!fuel");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(fuelExpected, (Double) cd.get("!fuel"));
    }

    /** Test reset for non-default fuel value. */
    @Test
    public void resetFuelTest2() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double fuelExpected = 0.0;
        cd.set("!fuel", 10.0);
        cdCopy.set("!fuel", 10.0);

        /*
         * Call method under test
         */
        cd.reset("!fuel");
        cdCopy.reset("!fuel");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(fuelExpected, (Double) cd.get("!fuel"));
    }

    /** Test reset for non-default maxRPM value. */
    @Test
    public void resetMaxRPMTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double rpmExpected = 7000.0;
        cd.set("!maxRPM", 9000.0);
        cdCopy.set("!maxRPM", 9000.0);

        /*
         * Call method under test
         */
        cd.reset("!maxRPM");
        cdCopy.reset("!maxRPM");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(rpmExpected, (Double) cd.get("!maxRPM"));
    }

    /** Test reset for standard unit "mi" and non-default maxSpeed value. */
    @Test
    public void resetMaxSpeedMITest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        Double speedExpected = 140.0;
        cd.set("maxSpeed", 273.1);
        cdCopy.set("maxSpeed", 273.1);

        /*
         * Call method under test
         */
        cd.reset("maxSpeed");
        cdCopy.reset("maxSpeed");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(speedExpected, (Double) cd.get("maxSpeed"));
    }

    /**
     * Test reset for constructor argument unit "km" and non-default maxSpeed
     * value.
     */
    @Test
    public void resetMaxSpeedKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        Double speedExpected = 225.0;
        cd.set("maxSpeed", 427.8);
        cdCopy.set("maxSpeed", 427.8);

        /*
         * Call method under test
         */
        cd.reset("maxSpeed");
        cdCopy.reset("maxSpeed");

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(cdCopy, cd);
        assertEquals(speedExpected, (Double) cd.get("maxSpeed"));
    }

    /**
     * Common method tests -----------------------------------------------------
     */

    /** Test toString for empty CarDash. */
    @Test
    public void toStringEmptyTest() {
        CarDash cd = new CarDashOnMap();
        String expected = "<>";
        String actual = "";
        cd.clear();

        /*
         * Call method under test
         */
        actual = cd.toString();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expected, actual);
    }

    /** Test toString for non-empty CarDash with unit "mi". */
    @Test
    public void toStringMITest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        String expected = "";
        String actual = "";

        /*
         * Call method under test
         */
        cd.toString();
        cdCopy.toString();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expected, actual);
    }

    /** Test toString for non-empty CarDash with unit "km". */
    @Test
    public void toStringKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        String expected = "";
        String actual = "";

        /*
         * Call method under test
         */
        cd.toString();
        cdCopy.toString();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(expected, actual);
    }

    /** Test equals for empty CarDash. */
    @Test
    public void equalsEmtpyTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        boolean isEqual;
        cd.clear();
        cdCopy.clear();
        /*
         * Call method under test
         */
        isEqual = cd.equals(cdCopy);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(true, isEqual);
    }

    /** Test equals for default unit "mi". */
    @Test
    public void equalsMITest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        boolean isEqual;

        /*
         * Call method under test
         */
        isEqual = cd.equals(cdCopy);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(true, isEqual);
    }

    /** Test equals for constructor argument unit "km". */
    @Test
    public void equalsKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        boolean isEqual;

        /*
         * Call method under test
         */
        isEqual = cd.equals(cdCopy);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(true, isEqual);
    }

    /** Test equals for CarDashes with different units. */
    @Test
    public void equalsNotUnitTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap("km");
        boolean isEqual;

        /*
         * Call method under test
         */
        isEqual = cd.equals(cdCopy);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(false, isEqual);
    }

    /** Test equals with different fuel value. */
    @Test
    public void equalsNotFuelTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        boolean isEqual;
        cd.set("!fuel", 5.0);

        /*
         * Call method under test
         */
        isEqual = cd.equals(cdCopy);

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(false, isEqual);
    }

    /** Test hashCode with empty CarDash. */
    @Test
    public void hashCodeEmptyTest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        int codeExpected;
        int codeActual;
        cd.clear();
        cdCopy.clear();
        /*
         * Call method under test
         */
        codeActual = cd.hashCode();
        codeExpected = cdCopy.hashCode();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(codeExpected, codeActual);
    }

    /** Test hashCode with nonempty CarDash with standard units "mi". */
    @Test
    public void hashCodeMITest() {
        CarDash cd = new CarDashOnMap();
        CarDash cdCopy = new CarDashOnMap();
        int codeExpected;
        int codeActual;
        /*
         * Call method under test
         */
        codeActual = cd.hashCode();
        codeExpected = cdCopy.hashCode();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(codeExpected, codeActual);
    }

    /**
     * Test hashCode with nonempty CarDash with constructor argument unit "km".
     */
    @Test
    public void hashCodeKMTest() {
        CarDash cd = new CarDashOnMap("km");
        CarDash cdCopy = new CarDashOnMap("km");
        int codeExpected;
        int codeActual;
        /*
         * Call method under test
         */
        codeActual = cd.hashCode();
        codeExpected = cdCopy.hashCode();

        /*
         * Assert that values of variables match expectations
         */
        assertEquals(codeExpected, codeActual);
    }
}
