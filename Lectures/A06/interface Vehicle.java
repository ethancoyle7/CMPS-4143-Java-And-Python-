package A06;

//Ethan Coyle
//Dr.Saikat
//Septmber 15,2021
//This program utilizes inheritance and shows the functionality of pulling 
//from different classes
interface Vehicle 
{
    // common functionalities
    public void changeGear (int a);
    public void speedUp(int a);
    public void applyBrakes(int a);
}

class Bicycle implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }

    public void printStates() 
    {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class Car implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }

    public void printStates() 
    {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class Bike implements Vehicle
{
    public int gear;
    public int speed;

    public void changeGear(int myGear)
    {
        gear = myGear;
    }
   
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public void applyBrakes(int decrement)
    {
        speed -= decrement;
    }
    public void printStates() 
    {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }

    public static void main(String[] args)
    {
        {
        
            // creating an inatance of Bicycle 
            // doing some operations 
            Bicycle bicycle = new Bicycle();
            bicycle.changeGear(2);
            bicycle.speedUp(3);
            bicycle.applyBrakes(1);
              
            System.out.println("Bicycle present state :");
            bicycle.printStates();
              
            // creating instance of the bike.
            Bike bike = new Bike();
            bike.changeGear(1);
            bike.speedUp(4);
            bike.applyBrakes(3);
              
            System.out.println("Bike present state :");
            bike.printStates();
          
            Car car = new Car();
            car.changeGear(1);
            car.speedUp(4);
            car.applyBrakes(3);
              
            System.out.println("Car at present state :");
            car.printStates();

    }
}}
