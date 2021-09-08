public class Lecture4 
{
   
        // first initialize instance variable that are private
        private String PetsName;
        private int PetsAge;
        private String PetsBreed;

        // This is the constructor that initializes the pet to default values
        public Puppy (String PuppyName, int PuppyAge,string PuppyBreed)
        {
                //called upon whenever the puppy class is invoked
                PetsName=PuppyName;
                PetsAge=PuppyAge;
                PetsBreed=PuppyBreed;

        }

        // initialize our accessors and mutators
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
        
        public void setBreed(int PuppyBreed) 
        {
            PetsBreed=PuppyBreed;
        }
        //accesor to the breed string
        public int getBreed() 
        {
            return PetsBreed;
        }
        //once initialize, we can move to our main driver and then create instances of new puppers

        public static void main(String args[]) //this is our main driver program to print out stuffs
        {

                Puppy Dog1=new Puppy("Bilbo Bsggind",2000,"Dalmation"); // two different puppiers
                Puppy Dog2=new Puppy("Harry Potter",12,"Hobbit");//second object dog

                //print out to the console
                System.out.println(Dog1.getName()+"'s PuppyAge is "+Dog1.getAge() + "PuppyBreed is "+Dog1.getBreed());
                System.out.println(Dog2.getName()+"'s PuppyAge is "+Dog2.getAge()+ "PuppyBreed is "+Dog2.getBreed());;

        }
}

