import java.util.ArrayList;

/**
 * A car
 * @author Andrew Paulen
 */
public abstract class Car 
{
    private String make;
    private String model;
    protected ArrayList <Accessories> accessories = new ArrayList <Accessories>();

    /**
     * Creates the Car
     * @param make The make of the car
     * @param model The model of the car
     */
    public Car (String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    /**
     * Assembles the car, calls all the methods to put the car together
     */
    public void assemble()
    {
        System.out.println ("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
    }

    protected abstract void addFrame();

    /**
     * Prints out the wheels added to the car
     */
    protected void addWheels()
    {
        System.out.println ("Adding the Wheels");
    }

    /**
     * Prints out the engine added to the car
     */
    protected void addEngine()
    {
        System.out.println ("Adding a Standard Engine");
    }

    /**
     * Prints out the windows added to the car
     */
    protected void addWindows()
    {
        System.out.println ("Adding Windows");
    }

    protected abstract void addAccessories();

    /**
     * Prints out all the accessories in the ArrayList of accessories
     */
    protected void displayAccessories()
    {
        System.out.println ("Accessories:");

        for (Accessories accessory : accessories)
        {
            System.out.println ("- " + accessory);
        }
    }
}