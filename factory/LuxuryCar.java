/**
 * A Luxury Car
 * @author Andrew Paulen
 */
public class LuxuryCar extends Car
{
    /**
     * Creates the luxury car
     * @param make The make of the car
     * @param model The model pf the car
     */
    public LuxuryCar (String make, String model)
    {
        super (make, model);
    }

    /**
     * Prints out the fram that is added to the car
     */
    protected void addFrame()
    {
        System.out.println ("Adding a beautiful frame");
    }

    /**
     * Prints out the engine that is added to the car
     */
    @Override
    protected void addEngine()
    {
        System.out.println ("Adding a Supped Up Engine");
    }

    /**
     * Adds all the needed accessories to the ArrayList of accessories after clearing it
     */
    protected void addAccessories()
    {
        accessories.clear();
        accessories.add (Accessories.FLOOR_MATTS);
        accessories.add (Accessories.PHONE_CHARGER);
        accessories.add (Accessories.BACK_UP_CAMERA);
        accessories.add (Accessories.EXTRA_CUP_HOLDERS);
        accessories.add (Accessories.HEATED_SEATS);
        accessories.add (Accessories.SPORTS_SEATS);
        accessories.add (Accessories.WINDOW_TINT);
        accessories.add (Accessories.HIGH_END_SOUND);
        accessories.add (Accessories.TRUNK_ORGINIZER);
        accessories.add (Accessories.BLUE_TOOTH);
        displayAccessories();
    }
}