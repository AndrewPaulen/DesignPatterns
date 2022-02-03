/**
 * A sedan car
 * @author Andrew Paulen
 */
public class SedanCar extends Car
{
    /**
     * Creates the sedan car
     * @param make
     * @param model
     */
    public SedanCar (String make, String model)
    {
        super (make, model);
    }

    /**
     * Prints out the frame of the car when it is added
     */
    protected void addFrame()
    {
        System.out.println ("Adding a three part frame");
    }

    /**
     * Adds all of the accessories that are needed to the accessory ArrayList after emptying the list
     */
    protected void addAccessories()
    {
        accessories.clear();
        accessories.add (Accessories.FLOOR_MATTS);
        accessories.add (Accessories.PHONE_CHARGER);
        accessories.add (Accessories.BACK_UP_CAMERA);
        accessories.add (Accessories.EXTRA_CUP_HOLDERS);
        accessories.add (Accessories.HEATED_SEATS);
        displayAccessories();
    }
}