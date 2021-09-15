class Bicycle
{
    public int gear;
    public int speed;


    //Constructor
    public Bicycle(int myGear, int mySpeed)
    {
        gear = myGear;
        speed = mySpeed;
    }

    //Behaviors
    public void applyBreaks(int decr)
    {
        speed -=  decr;
    }

    public void speedUp(int incr)
    {
        speed += incr;
    }

    public String showStatus()
    {
        return("I am using the gear of " + gear + "\nand my speed is " + speed);
    }
}