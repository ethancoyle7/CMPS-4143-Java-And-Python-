//import java.io.*;
  
  //Ethan Coyle
  //Dr. Saikat
  //CMPS 4143-Java/Pyhton
  //September 15,2021
  //This program implements the inclass work showing the inteface and // multiple inheritance from  vehicle interface
  interface Vehicle 
  {
        
      
      void changeGear(int a);
      void speedUp(int a);
      void applyBrakes(int a);
  }
    
  class Car implements Vehicle
  {
        
      int speed;
      int gear;
        
       // to change gear
      //override
      public void changeGear(int newGear){
            
          gear = newGear;
      }
        
      //overriding
      public void speedUp(int increment){
            
          speed = speed + increment;
      }
        
      
      public void applyBrakes(int decrement){
            
          speed = speed - decrement;
      }
        
      public void printStates() {
           System.out.println("speed: " + speed
                + " gear: " + gear);
      }
  class Bicycle implements Vehicle
  {
        
      int speed;
      int gear;
        
       // to change gear
      //override
      public void changeGear(int newGear){
            
          gear = newGear;
      }
        
      //overriding
      public void speedUp(int increment){
            
          speed = speed + increment;
      }
        
      
      public void applyBrakes(int decrement){
            
          speed = speed - decrement;
      }
        
      public void printStates() {
           System.out.println("speed: " + speed
                + " gear: " + gear);
      }
  }
    
  class Bike implements Vehicle {
        
      int speed;
      int gear;
        
      // to change gear
    
      public void changeGear(int newGear)
      {
            
          gear = newGear;
      }
        
      // to increase speed
      public void speedUp(int increment)
      {
            
          speed = speed + increment;
      }
        
      // to decrease speed
      
      public void applyBrakes(int decrement){
            
          speed = speed - decrement;
      }
        
      public void printStates() {
           System.out.println("speed: " + speed
               + " gear: " + gear);
      }
        
  }
  
        
      public void main (String[] args) 
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
            
          System.out.println("Bike present state :");
          car.printStates();
      }}
  