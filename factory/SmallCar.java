/**
 * A small car 
 * @author Andrew Paulen
 */
public class SmallCar extends Car
{
    /**
     * Creates the small car
     * @param make The make of the car
     * @param model The model of the car
     */
    public SmallCar (String make, String model)
    {
        super (make, model);
    }

    /**
     * Prints out the frame of the car when it is added
     */
    protected void addFrame()
    {
        System.out.println ("Adding a small frame");
    }

    /**
     * Adds all of the accessories that are needed to the ArrayList of accessories after emptying the list
     */
    protected void addAccessories()
    {
        accessories.clear();
        accessories.add (Accessories.FLOOR_MATTS);
        accessories.add (Accessories.PHONE_CHARGER);
        displayAccessories();
    }
}