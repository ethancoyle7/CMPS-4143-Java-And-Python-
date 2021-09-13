//#############################################################//
//Ethan Coyle
//Dr.Saikat-CMPS 4143(Java and Pyhton)
// September 13,2021

//Lecture 5 Bike Simulation includng the orginal Class and
//A mountain bike is derived from the original class showing
//inheritance in java
//############################################################//


public class Lecture5 //Lecture5 is the bike class
{
    //creaing attributes
    public int Gear,Speed;

    //creating the constructor
    // this is simulating a bicycle and its speed

    public Lecture5(int Gear, int Speed)
    {
        this.Gear=Gear;
        this.Speed=Speed;
    }

    //behaviors of bike
    public void ApplyBreak(int decrement)
    {
        Speed= Speed-=decrement;
    }
    public String ShowStatus()
    {
        return("I am using the gear of "+Gear+"\n and the speed is"+Speed);
    }
    public void SpeedUp(int increment)
    {
        Speed+=increment;
    }

}

//creating another class called mountain bike extending from the original bike

public class MountainBike extends Lecture5
{
    public int SeatHeight;
    public MountainBike(int Gear,int Speed, int MySeatHeight)
    {
    super(Gear,Speed);//calling super calls the bicycle gear ad speed
    SeatHeight=MySeatHeight;
    
    public voidsetHeight(int newSeatHeight)
    {
        seatHeight= newSeatHeight;
    }
    // using single inheritance
    Override 
    public string ShowStatus()
    {
    return("I am using the gear of "+Gear+"\n and the speed is"+Speed+"\n my SeatHeight is "+SeatHeight);
    }
//now we create out driver class
    public static void main(String[] args) 
    {
    System.println("Calling from main");

    //callling the mountain bike class and creaing an object with variable
    MountainBike mBike=new MountainBike( 5, 2000, 12);
    System.println(mBike.ShowStatus);
    }
}
