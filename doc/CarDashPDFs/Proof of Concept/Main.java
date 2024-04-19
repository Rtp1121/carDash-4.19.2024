package CarDash;

import CarDash.Speedometer;
import CarDash.Odometer;
import CarDash.Tachometer;

/**
 * This is a basic implementation of a digital car dashboard using java.
 *
 * @author R. Platt
 */

/**
 * More notes:
 * I'm planning on implementing similar classes for fuel level, oil pressure and
 * coolant temp.
 * I'm thinking of possibly using graphics to represent the digital dash, but I'm not
 * entirely sure about how to implement that.
 * If I want to be fancy, I'll find ways to implement settings such as color, or
 * even a simulation of the dash running.
 */

/**
 * Main code class.
 */
public final class Main {
    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Main() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Testing Speedometer class.
         */
        Speedometer speedo = new Speedometer();
        System.out.println(speedo.getMaxSpeed());
        System.out.println(speedo.getSpeed());
        speedo.setMaxSpeed(200);
        speedo.setSpeed(65);
        System.out.println(speedo);

        /**
         * Testing Odometer class.
         */
        Odometer odo = new Odometer();
        System.out.println(odo.getMileage());
        System.out.println(odo.getTrip());
        odo.setMileage(50000);
        odo.setTrip(150);
        odo.resetTrip();
        System.out.println(odo);

        /**
         * Testing Tachometer class.
         */
        Tachometer tach = new Tachometer();
        System.out.println(tach.getRPM());
        System.out.println(tach.getMaxRPM());
        tach.setRPM(5);
        tach.setMaxRPM(9);
        System.out.println(tach);
    }
}
