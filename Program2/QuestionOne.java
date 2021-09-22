package Program2;

public class QuestionOne 
{
    
class Alphabet 
{

    public void display() 
    {

        System.out.println("I am alphabet");

    }

}

//inheritance from class Alphabet

class Alphanumeric extends Alphabet {

    @Override
    // overriding the display method which was from class alphabet
    public void display() 
    {
        System.out.println("I am aplhanumeric");
    }
    // adding one more method
    // polymorphism -> it has same function but different parameters 
    public int add(int x, int y) 
    {
        return x+y;
    }

    //Overloading the above method
    // when parameters are passed as int it will call above method
    // whwn parameters are passed as double it will call below method

    public double add(double x,double y)
    {
        return x+y;
    }

}

//encapsulation example

class VehicleName 
{

    private String name;
    // getter
    public String getName() 
    {
        return name;
    }
    // setter
    public void setName(String newName)
    {
        name = newName;
    }

}

//abstraction

abstract class Vehicle 
{

    public abstract void weight();

}

class Car extends Vehicle
{

    public void weight()
    {
        System.out.println("\nweight of car is less than heavy vehicle");
    }
}
class Truck extends Vehicle
{
    @Override
    public void weight() 
    {
        System.out.println("\nWeight of Truch is more than car");
    }
}



    public static void main(String[] args)
    {

        Alphabet a=new Alphabet();

        a.display();

        Alphanumeric b=new Alphanumeric();

        b.display();

        System.out.println(b.add(4,2));

        System.out.println(b.add(5.4,2.2)); //polymorphism

        VehicleName e = new VehicleName();

        e.setName("BMW");

        System.out.print("Name of car : " + e.getName() );

        Vehicle w1 = new Car();
        w1.weight();

        Vehicle w2 = new Truck();
        w2.weight();
    }

}
    

