/**
 * A car factory 
 * @author Andrew Paulen
 */
public class CarFactory 
{
    /**
     * Creates the appropriate car bassed off of the type of it 
     * @param type The type of the car
     * @param make The make of the car
     * @param model The model of the car
     * @return The whole car 
     */
    public static Car createCar (String type, String make, String model)
    {
        if (type.equals ("small"))
        {
            SmallCar smallCar = new SmallCar (make, model);
            smallCar.assemble();
            return smallCar;
        }

        else if (type.equalsIgnoreCase (CarType.SEDAN.toString()))
        {
            SedanCar sedanCar = new SedanCar (make, model);
            sedanCar.assemble();
            return sedanCar;
        }

        else if (type.equalsIgnoreCase (CarType.LUXURY.toString()))
        {
            LuxuryCar luxuryCar = new LuxuryCar (make, model);
            luxuryCar.assemble();
            return luxuryCar;
        }

        return null;
    }
}