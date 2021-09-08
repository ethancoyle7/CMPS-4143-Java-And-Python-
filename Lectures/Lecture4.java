//Ethan Coyle
//Dr.Saikat- CMPS 4143
//Lecture4 Submission

//This class creates instance of a dog
// and creating objects from that class

public class Lecture4 
{
   
        // first initialize instance variable that are private
        String PetsName;
        int PetsAge;
        String PetsBreed;
        String Color;

        // This is the constructor that initializes the pet to default values
        public Lecture4 (String PuppyName, int PuppyAge,String PuppyBreed, String DogColor)
        {
                //called upon whenever the puppy class is invoked
                PetsName=PuppyName;
                PetsAge=PuppyAge;
                PetsBreed=PuppyBreed;
                Color=DogColor;
        }

        // initialize our accessors and mutators
        public void setColor(String DogColor)
        { 
            Color=DogColor;//setting the color(accesor)
       }
       //creation of the accessor called when initialized in the driver of the program
       public String getColor() 
       {
           return Color;//grabbing the color
       }
        public void setName(String PuppyName)
         { 
             PetsName=PuppyName;
        }
        //creation of the accessor called when initialized in the driver of the program
        public String getName() 
        {
            return PetsName;
        }

        public void setAge(int PuppyAge) 
        {
            PetsAge=PuppyAge;
        }
        public int getAge() 
        {
            return PetsAge;
        }
        
        public void setBreed(String PuppyBreed) 
        {
            PetsBreed=PuppyBreed;
        }
        //accesor to the breed string
        public String getBreed() 
        {
            return PetsBreed;
        }
        //once initialize, we can move to our main driver and then create instances of new puppers

        public static void main(String args[]) //this is our main driver program to print out stuffs
        {

                Lecture4 Dog1=new Lecture4(" Bilbo Baggin ",2000," Dalmation"," Orange/Purple"); // two different puppiers
                Lecture4 Dog2=new Lecture4(" Harry Potter ",12," Hobbit", " Muddy Brown ");//second object dog

                //print out to the console
                System.out.println(Dog1.getName()+"'s Age is "+Dog1.getAge() +
                     "His Breed is a "+Dog1.getBreed() + " His Color is "+Dog1.getColor());

                System.out.println(Dog2.getName()+"'s Age is "+Dog2.getAge()+ 
                    " His Breed is a  "+Dog2.getBreed()+ " His Color is "+Dog2.getColor());

        }
}//end of driver and program

