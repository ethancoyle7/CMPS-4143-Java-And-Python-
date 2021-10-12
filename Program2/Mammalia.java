//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         October 11,2021                                                      //
//   What it does-                                                                          //
//                                                                                          //
//   The purpose of this program is to create instance of mammalia family tree and          //
//   then change thier attributes and do few other things per the guidline s of the prog    //
//   by creating inheritance from derived classes and ovverriding methods for each instance //
//   of a created mammalia family memeber                                                   //
//##########################################################################################//

import java.io.*;// for reading in from the input and the outtputting the results
import java.io.File;//inporting to io file outfile streaming to the print stream 
import java.io.PrintStream; // override console output to be file outputted


//we start by creating our main supe class that we derive each one of our other animals and mammals from

class Mammilia 
{

    // we initialize out variables for the various attributes for each of our mammals to be derived from
    int Legs;
    boolean HasTail;
    boolean HasABrain;
    int NumNeurons;
    double LevelOfPrecision;
    int DateOfBirth;
    String FavoriteFood;

    // then we create our constructor which will be used as pointer type to our personal new created animals
    public Mammilia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood) 
    {
        this.Legs = Legs;
        this.HasTail = HasTail;
        this.HasABrain = HasABrain;
        this.NumNeurons = NumNeurons;
        this.LevelOfPrecision = LevelOfPrecision;
        this.DateOfBirth = DateOfBirth;
        this.FavoriteFood = FavoriteFood;
    }

    //other attributes that the animals share
    public void Eat() 
    {
        System.out.println("I like to Eat" + FavoriteFood + " Wow Aint That Yummy?\n");
    }
    public void Walk() 
    {
        System.out.println("I Walk on " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am currenlty Sleeping Away\n");
    }
    
    public String Attributes() 
    {
        
        //returning the set variables and values per instance of each case of derive mammalia
        return ("I Have                    " + Legs + " Leg/s\n"+ 
         "I Have a Tail?            " + HasTail + "\n"+
         "Do I have a Brain         " + HasABrain + "\n"+
         "I have                    " + NumNeurons + " Neurons \n"
        + "My Precision Level is     " + LevelOfPrecision + "% (Im a little Smart) \n"+
         "I was Born in the Year    " + DateOfBirth + "\n"+
         "And My Favorite Food is   " + FavoriteFood +  " (Isnt that Yummy? )\n");
    }
}

    // the following is built similarly to the derived from super class only differences are the attributes associated with them that are
    // user defined in the main driver of the program
    //we extend each one from their respective cases and then if they are used in the driver for animal and class instances, then they will
    //be processed accordingly
    class Theria extends Mammilia 
    {
        //constructors set for each instance of animal process by calling the parent class
    public Theria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        //returned the overriden atttrivutes for the derived class
        return (super.Attributes() + "\n");
    }

    // various other attributes associated with this derived from mammalia
    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}
//repeat the whole process
class Monotremata extends Mammilia 
{
    public Monotremata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk()
     {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Placentalia extends Theria {
    public Placentalia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Marsupialia extends Theria 
{
    public Marsupialia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return ("Marsupialia\n" + super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk()
     {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
   
}

class Boreoeutheria extends Placentalia 
{
    public Boreoeutheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Asleep\n");
    }
    
}

class Atlantogenata extends Placentalia
{
    public Atlantogenata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Afrotheria extends Atlantogenata  
{
    public Afrotheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Xenarthra extends Atlantogenata 
 {
    public Xenarthra(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return ( super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk()
     {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Laurasiatheria extends Boreoeutheria 
{
    public Laurasiatheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes()
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk()
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Euarchontogires extends Boreoeutheria 
{
    public Euarchontogires(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return ( super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Euarchonta extends Euarchontogires
 {
    public Euarchonta(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() {
        return (super.Attributes() + "\n");
    }

    public void Eat()
     {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Asleep\n");
    }
    
}

class Glires extends Euarchontogires 
{
    public Glires(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk()
     {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Scrotifera extends Laurasiatheria 
{
    public Scrotifera(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return ( super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Eulipotyphia extends Laurasiatheria 
{
    public Eulipotyphia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Chiroptera extends Scrotifera 
{
    public Chiroptera(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Euunquiata extends Scrotifera 
{
    public Euunquiata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}
 
class Ferae extends Scrotifera 
{
    public Ferae(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat()
     {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Carnivora extends Ferae 
{
    public Carnivora(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Pholidota extends Ferae 
{

    public Pholidota(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep()
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Cetartiodactyla extends Euunquiata 
{
    public Cetartiodactyla(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return (super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

class Perissodactyla extends Euunquiata 
{
    public Perissodactyla(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood);
    }

    @Override public String Attributes() 
    {
        return ( super.Attributes() + "\n");
    }

    public void Eat() 
    {
        System.out.println("I Love to Eat :" + FavoriteFood + "\n");
    }
    public void Walk() 
    {
        System.out.println("I Have : " + Legs + "Legs\n");
    }
    public void Sleep() 
    {
        System.out.println("I am Asleep\n");
    }
    
}

public class Mammalia
{
    public static void main(String [] args) throws FileNotFoundException 
    {
        // for this output file extension, i am using my own path for the ouput but user can change to
        //whatever desired output they would like
        File output = new File("Program2/Output.txt");
        //creating a new file stream
        // all of the running classes inside main will be printing to output file
        //declared by the user overriding the console output
        PrintStream outtputting = new PrintStream(output);
        System.setOut(outtputting);// set the stream to be that of the new output file
    
    


        System.out.println("\nFirst We are going to create Five Mammalia Derived Animals \n"+
        "============================================================================================\n\n");

        // problem one says to print out five animals from the families
        Perissodactyla ButterBean = new Perissodactyla(80, true, true, 12, 1.2, 1954, "Butter  and Peanuts");
        System.out.println(" I am a Perissodactyla\n"+"---------------------------------\n"+ButterBean.Attributes());
                        
        // animal 2
        Mammilia BubbleMan = new Theria(2, true, true, 11, 88.3, 1332, "Air and Little Hobbits");
        System.out.println(" I am a Theria\n"+"---------------------------------\n"+BubbleMan.Attributes());

        //mammal3
        Mammilia Boreoeutheria1 = new Boreoeutheria(19, true, true, 200, 99.9, 1283, "Celery and Potatoes");
        System.out.println(" I am a Boreoeutheria\n"+"---------------------------------\n" +Boreoeutheria1.Attributes());

        //mammal 4 creating
        Pholidota Pholidota1 = new Pholidota(80, true, true, 9, 40.3, 1542, "Nothing");
        System.out.println(" I am a Pholidota\n"+"---------------------------------\n"+Pholidota1.Attributes());

        //mammalia 5 creating
        Mammilia Placentalia1 = new Placentalia(5, true, true, 800, 10.0, 2030, "McDonals and Ketchup Sauce");
        System.out.println("I am a Placentia\n"+"---------------------------------\n"+Placentalia1.Attributes());




        System.out.println("\nNow We are Going to be Outputting our newly created Animals Derived Form their own Classes\n"+
                           "============================================================================================\n\n");
        // in part C, we are needing to have the creation of each class five instances of each

        // create five instances of new mammals that are derived from the different levels
        Marsupialia Marsup1=new Marsupialia(4, true, true, 80, 90.0, 1287, "Pork and Prime Rib");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup1.Attributes());
        Marsupialia Marsup2=new Marsupialia(0, true, true, 0, 0.0, 1500, "Bugs and Worms");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup2.Attributes());
        Marsupialia Marsup3=new Marsupialia(1, true, true, 10, 100, 1568, "Blue Cheese and Crackers");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup3.Attributes());
        Marsupialia Marsup4=new Marsupialia(8, true, true, 78, 90.9, 1567, "Rocks");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup4.Attributes());
        Marsupialia Marsup5=new Marsupialia(4, true, true, 1, 5.0, 1289, "Spaghetti");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup5.Attributes());

        Afrotheria Afro1=new Afrotheria(4, true, true, 80, 90.0, 1287, "Beries and Pork Belly");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro1.Attributes());
        Afrotheria Afro2=new Afrotheria(0, true, true, 0, 0.0, 1500, " Fried Caviar");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro2.Attributes());
        Afrotheria Afro3=new Afrotheria(1, true, true, 10, 100, 1568, "Mold");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro3.Attributes());
        Afrotheria Afro4=new Afrotheria(8, true, true, 78, 90.9, 1567, "Ants and Mold Catapillers");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro4.Attributes());
        Afrotheria Afro5=new Afrotheria(4, true, true, 1, 5.0, 1289, "Eggs and Bacon");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro5.Attributes());

        Xenarthra Xena1=new Xenarthra(4, true, true, 80, 90.0, 1287, "Banana and More Bananas");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena1.Attributes());
        Xenarthra Xena2=new Xenarthra(0, true, true, 0, 0.0, 1500, "Cherries and Worms");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena2.Attributes());
        Xenarthra Xena3=new Xenarthra(1, true, true, 10, 100, 1568, "Drt and Ants");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena3.Attributes());
        Xenarthra Xena4=new Xenarthra(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena4.Attributes());
        Xenarthra Xena5=new Xenarthra(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena5.Attributes());

        Glires Gliry1=new Glires(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry1.Attributes());
        Glires Gliry2=new Glires(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry2.Attributes());
        Glires Gliry3=new Glires(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry3.Attributes());
        Glires Gliry4=new Glires(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry4.Attributes());
        Glires Gliry5=new Glires(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry5.Attributes());

        Chiroptera Chiro1=new Chiroptera(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro1.Attributes());
        Chiroptera Chiro2=new Chiroptera(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro2.Attributes());
        Chiroptera Chiro3=new Chiroptera(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro3.Attributes());
        Chiroptera Chiro4=new Chiroptera(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro4.Attributes());
        Chiroptera Chiro5=new Chiroptera(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro5.Attributes());


        Cetartiodactyla Certa1=new Cetartiodactyla(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa1.Attributes());
        Cetartiodactyla Certa2=new Cetartiodactyla(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa2.Attributes());
        Cetartiodactyla Certa3=new Cetartiodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa3.Attributes());
        Cetartiodactyla Certa4=new Cetartiodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa4.Attributes());
        Cetartiodactyla Certa5=new Cetartiodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa5.Attributes());

        Perissodactyla Peris1=new Perissodactyla(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris1.Attributes());
        Perissodactyla Peris2=new Perissodactyla(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris2.Attributes());
        Perissodactyla Peris3=new Perissodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris3.Attributes());
        Perissodactyla Peris4=new Perissodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris4.Attributes());
        Perissodactyla Peris5=new Perissodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris5.Attributes());

        Pholidota Pholi1=new Pholidota(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi1.Attributes());
        Pholidota Pholi2=new Pholidota(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi2.Attributes());
        Pholidota Pholi3=new Pholidota(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi3.Attributes());
        Pholidota Pholi4=new Pholidota(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi4.Attributes());
        Pholidota Pholi5=new Pholidota(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi5.Attributes());

        Carnivora Carni1=new Carnivora(4, true, true, 80, 90.0, 1287, "Carrotss");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni1.Attributes());
        Carnivora Carni2=new Carnivora(0, true, true, 0, 0.0, 1500, "Other Animals");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni2.Attributes());
        Carnivora Carni3=new Carnivora(1, true, true, 10, 100, 1568, "Sticks and Dirt");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni3.Attributes());
        Carnivora Carni4=new Carnivora(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni4.Attributes());
        Carnivora Carni5=new Carnivora(4, true, true, 1, 5.0, 1289, "Beans and Beans");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni5.Attributes());

    }
}