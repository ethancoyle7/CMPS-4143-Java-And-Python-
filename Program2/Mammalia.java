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
//////////////////////////////////////////////////////////////////////////////////////////////

// Program guidelines
//============================================================================================
// a. Consider the following organigram (can be found in https://en.wikipedia.org/wiki/Mammal)
//    of Mammalia family. (a: 5, b: 5, c: 10, d: 20, e:10) – (50 points)
// b. Think about perissodactyla, they can mate with carnivora members; can breed and
// produce a new family called ‘Perivora’. Perivora animals supposed to give birth to a new
// family ‘Periveron’. But by nature law no periveron member can be crated.
// 
// c. Create at least 5 animals from each family; Perviveron member cannot be produced.
//
// d. Now you can do some creativity by changing the neurons, precision to understand, food
// habits, but you can’t change the legs, brains, birth date. Change these features for at
// least 20 animals and show how it was before and how it is now. From level 6 to
// 8(Considering Mammlia as level-1 and carnivora, cetartiodactyla are on level-8), animals
// can run and hunt for their food. Change at least 10 animals’ running speed, hunting
// process and hunting food type for those who are 6-8 level animals. Try changing at least
// 10 animals and show (reading from files; see next bullet) what they were and what they
// are now.
// e. All outcomes should be stored in a file. When you have created objects, their
// information should be stored in files. After changing their behaviors and attributes, they
// should also be stored in files. The term show mentioned in the previous sub-section
// refers to reading the data from files and printing to the console.                                                  //
//##########################################################################################//

import java.io.*;// for reading in from the input and the outtputting the results
import java.io.File;//inporting to io file outfile streaming to the print stream 
import java.io.PrintStream; // override console output to be file outputted


//we start by creating our main supe class that we derive each one of our other animals and mammals from

class Mammilia 
{

    // we initialize out variables for the various attributes for each of our mammals to be derived from
    int Legs,RunSpeed = 0,NumNeurons,DateOfBirth;
    boolean HasTail, HasABrain;
    double LevelOfPrecision;
    String FavoriteFood,HuntingAttribute = "None";

    // then we create our constructor which will be used as pointer type to our personal new created animals
    public Mammilia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute ) 
    {
        this.Legs = Legs;
        this.HasTail = HasTail;
        this.HasABrain = HasABrain;
        this.NumNeurons = NumNeurons;
        this.LevelOfPrecision = LevelOfPrecision;
        this.DateOfBirth = DateOfBirth;
        this.FavoriteFood = FavoriteFood;
        this.HuntingAttribute = HuntingAttribute;
        this.RunSpeed = RunSpeed;
    }
    public void set_RunSpeed(int RunSpeed) 
    {
        this.RunSpeed = RunSpeed;
    }

    public int get_RunSpeed() 
    {
        return RunSpeed;
    }

    public void set_HuntingAttribute(String HuntingAttribute) 
    {
        this.HuntingAttribute = HuntingAttribute;
    }

    public String get_HuntingAttribute() 
    {
        return HuntingAttribute;
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
        + "My Precision Level is     " + LevelOfPrecision + "%  (Im a little Smart) \n"+
         "I was Born in the Year    " + DateOfBirth + "\n"+
         "And My Favorite Food is   " + FavoriteFood +  "   (Isnt that Yummy? )\n"+
         "My Hunting Speed is       " + RunSpeed + "   MPH (Aint I Fast? ) \n"+
         " My  HuntingAttribute is   " + HuntingAttribute+ "  Aint That Cool?\n");
    }
}

    // the following is built similarly to the derived from super class only differences are the attributes associated with them that are
    // user defined in the main driver of the program
    //we extend each one from their respective cases and then if they are used in the driver for animal and class instances, then they will
    //be processed accordingly
    class Theria extends Mammilia 
    {
        //constructors set for each instance of animal process by calling the parent class
    public Theria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);
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
    public Monotremata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Placentalia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Marsupialia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Boreoeutheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Atlantogenata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Afrotheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Xenarthra(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Laurasiatheria(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Euarchontogires(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Euarchonta(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Glires(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Scrotifera(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Eulipotyphia(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Chiroptera(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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

class Euungulata extends Scrotifera 
{
    public Euungulata(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Ferae(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
    public Carnivora(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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

    public Pholidota(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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

class Cetartiodactyla extends Euungulata 
{
    public Cetartiodactyla(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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

class Perissodactyla extends Euungulata 
{
    public Perissodactyla(int Legs, boolean HasTail, Boolean HasABrain, int NumNeurons, double LevelOfPrecision, int DateOfBirth, String FavoriteFood, int RunSpeed,
    String HuntingAttribute)
    {
        super(Legs, HasTail, HasABrain, NumNeurons, LevelOfPrecision, DateOfBirth, FavoriteFood, RunSpeed,
         HuntingAttribute);;
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
        Perissodactyla ButterBean = new Perissodactyla(80, true, true, 12, 1.2, 1954, "Butter  and Peanuts", 5, "Teeth");
        System.out.println(" I am a Perissodactyla\n"+"---------------------------------\n"+ButterBean.Attributes());
                        
        // animal 2
        Mammilia BubbleMan = new Theria(2, true, true, 11, 88.3, 1332, "Air and Little Hobbits",5, "Teeth");
        System.out.println(" I am a Theria\n"+"---------------------------------\n"+BubbleMan.Attributes());

        //mammal3
        Mammilia Boreoeutheria1 = new Boreoeutheria(19, true, true, 200, 99.9, 1283, "Celery and Potatoes",5, "Teeth");
        System.out.println(" I am a Boreoeutheria\n"+"---------------------------------\n" +Boreoeutheria1.Attributes());

        //mammal 4 creating
        Pholidota Pholidota1 = new Pholidota(80, true, true, 9, 40.3, 1542, "Nothing",5, "Teeth");
        System.out.println(" I am a Pholidota\n"+"---------------------------------\n"+Pholidota1.Attributes());

        //mammalia 5 creating
        Mammilia Placentalia1 = new Placentalia(5, true, true, 800, 10.0, 2030, "McDonals and Ketchup Sauce",5, "Teeth");
        System.out.println("I am a Placentia\n"+"---------------------------------\n"+Placentalia1.Attributes());




        System.out.println("\nNow We are Going to be Outputting our newly created Animals Derived Form their own Classes\n"+
                           "============================================================================================\n\n");
        // in part C, we are needing to have the creation of each class five instances of each

        // create five instances of new mammals that are derived from the different levels
        Marsupialia Marsup1=new Marsupialia(4, true, true, 80, 90.0, 1287, "Pork and Prime Rib",5, "Teeth");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup1.Attributes());
        Marsupialia Marsup2=new Marsupialia(0, true, true, 0, 0.0, 1500, "Bugs and Worms",5, "Teeth");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup2.Attributes());
        Marsupialia Marsup3=new Marsupialia(1, true, true, 10, 100, 1568, "Blue Cheese and Crackers",5, "Teeth");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup3.Attributes());
        Marsupialia Marsup4=new Marsupialia(8, true, true, 78, 90.9, 1567, "Rocks",5, "Teeth");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup4.Attributes());
        Marsupialia Marsup5=new Marsupialia(4, true, true, 1, 5.0, 1289, "Spaghetti",5, "Teeth");
        System.out.println("I am a Marsupialia\n"+"---------------------------------\n"+Marsup5.Attributes());

        Afrotheria Afro1=new Afrotheria(4, true, true, 80, 90.0, 1287, "Beries and Pork Belly",5, "Teeth");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro1.Attributes());
        Afrotheria Afro2=new Afrotheria(0, true, true, 0, 0.0, 1500, " Fried Caviar",5, "Teeth");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro2.Attributes());
        Afrotheria Afro3=new Afrotheria(1, true, true, 10, 100, 1568, "Mold",5, "Teeth");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro3.Attributes());
        Afrotheria Afro4=new Afrotheria(8, true, true, 78, 90.9, 1567, "Ants and Mold Catapillers",5, "Teeth");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro4.Attributes());
        Afrotheria Afro5=new Afrotheria(4, true, true, 1, 5.0, 1289, "Eggs and Bacon",5, "Teeth");
        System.out.println("I am a Afrotheria\n"+"---------------------------------\n"+Afro5.Attributes());

        Xenarthra Xena1=new Xenarthra(4, true, true, 80, 90.0, 1287, "Banana and More Bananas",5, "Teeth");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena1.Attributes());
        Xenarthra Xena2=new Xenarthra(0, true, true, 0, 0.0, 1500, "Cherries and Worms",5, "Teeth");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena2.Attributes());
        Xenarthra Xena3=new Xenarthra(1, true, true, 10, 100, 1568, "Drt and Ants",5, "Teeth");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena3.Attributes());
        Xenarthra Xena4=new Xenarthra(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena4.Attributes());
        Xenarthra Xena5=new Xenarthra(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Xenarthra\n"+"---------------------------------\n"+Xena5.Attributes());

        Glires Gliry1=new Glires(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry1.Attributes());
        Glires Gliry2=new Glires(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry2.Attributes());
        Glires Gliry3=new Glires(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry3.Attributes());
        Glires Gliry4=new Glires(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry4.Attributes());
        Glires Gliry5=new Glires(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Glires\n"+"---------------------------------\n"+Gliry5.Attributes());

        Chiroptera Chiro1=new Chiroptera(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro1.Attributes());
        Chiroptera Chiro2=new Chiroptera(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro2.Attributes());
        Chiroptera Chiro3=new Chiroptera(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro3.Attributes());
        Chiroptera Chiro4=new Chiroptera(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro4.Attributes());
        Chiroptera Chiro5=new Chiroptera(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Chiroptera\n"+"---------------------------------\n"+Chiro5.Attributes());


        Cetartiodactyla Certa1=new Cetartiodactyla(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa1.Attributes());
        Cetartiodactyla Certa2=new Cetartiodactyla(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa2.Attributes());
        Cetartiodactyla Certa3=new Cetartiodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa3.Attributes());
        Cetartiodactyla Certa4=new Cetartiodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa4.Attributes());
        Cetartiodactyla Certa5=new Cetartiodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Cetartiodactyla\n"+"---------------------------------\n"+Certa5.Attributes());

        Perissodactyla Peris1=new Perissodactyla(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris1.Attributes());
        Perissodactyla Peris2=new Perissodactyla(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris2.Attributes());
        Perissodactyla Peris3=new Perissodactyla(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris3.Attributes());
        Perissodactyla Peris4=new Perissodactyla(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris4.Attributes());
        Perissodactyla Peris5=new Perissodactyla(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Perissodactyla\n"+"---------------------------------\n"+Peris5.Attributes());

        Pholidota Pholi1=new Pholidota(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi1.Attributes());
        Pholidota Pholi2=new Pholidota(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi2.Attributes());
        Pholidota Pholi3=new Pholidota(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi3.Attributes());
        Pholidota Pholi4=new Pholidota(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi4.Attributes());
        Pholidota Pholi5=new Pholidota(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Pholidota\n"+"---------------------------------\n"+Pholi5.Attributes());

        Carnivora Carni1=new Carnivora(4, true, true, 80, 90.0, 1287, "Carrotss",5, "Teeth");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni1.Attributes());
        Carnivora Carni2=new Carnivora(0, true, true, 0, 0.0, 1500, "Other Animals",5, "Teeth");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni2.Attributes());
        Carnivora Carni3=new Carnivora(1, true, true, 10, 100, 1568, "Sticks and Dirt",5, "Teeth");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni3.Attributes());
        Carnivora Carni4=new Carnivora(8, true, true, 78, 90.9, 1567, "Brocolli and Rocks",5, "Teeth");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni4.Attributes());
        Carnivora Carni5=new Carnivora(4, true, true, 1, 5.0, 1289, "Beans and Beans",5, "Teeth");
        System.out.println("I am a Carnivora\n"+"---------------------------------\n"+Carni5.Attributes());

        Scrotifera Scrot1 = new Scrotifera(18, true, true, 12, 56.7, 1000, "Carrots and Dings", 100, " Using a Bubble Maker");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scrot1.Attributes());
        Scrotifera Scrot2 = new Scrotifera(18, true, true, 12, 56.7, 1000, "Carrots and Dings", 100, " Using a Bubble Maker");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scrot2.Attributes());
        Scrotifera Scrot3 = new Scrotifera(18, true, true, 12, 56.7, 1000, "Carrots and Dings", 100, " Using a Bubble Maker");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scrot3.Attributes());
        Scrotifera Scrot4 = new Scrotifera(18, true, true, 12, 56.7, 1000, "Carrots and Dings", 100, " Using a Bubble Maker");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scrot4.Attributes());
        Scrotifera Scrot5 = new Scrotifera(18, true, true, 12, 56.7, 1000, "Carrots and Dings", 100, " Using a Bubble Maker"); 
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scrot5.Attributes());




        // below is creating the varies derived mammals with overriding attributes utilizing setters and getts to change 
        //attributes from the various creation of mammals which will be done utilizing the first instance of each class
       // creating first instance and then overriding to change some attributes
        Cetartiodactyla Cetartiodactyla1 = new Cetartiodactyla(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Cetartiodactyla1.Attributes());
        
        Cetartiodactyla1.set_RunSpeed(45); // replacing the attribute hunting and running 
        Cetartiodactyla1.set_HuntingAttribute("Aggressive");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Cetartiodactyla1.Attributes());

        Cetartiodactyla Cetartiodactyla2 = new Cetartiodactyla(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetartiodactyla  \n"+"---------------------------------\n"+Cetartiodactyla2.Attributes());
        Cetartiodactyla Cetartiodactyla3 =new Cetartiodactyla(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetartiodactyla  \n"+"---------------------------------\n"+Cetartiodactyla3.Attributes());
        Cetartiodactyla Cetartiodactyla4 = new Cetartiodactyla(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetartiodactyla  \n"+"---------------------------------\n"+Cetartiodactyla4.Attributes());
        Cetartiodactyla Cetartiodactyla5 = new Cetartiodactyla(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetartiodactyla  \n"+"---------------------------------\n"+Cetartiodactyla5.Attributes());


        
        Theria Theria1 = new Theria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Theria \n"+"---------------------------------\n"+Theria1.Attributes());
        
        Theria1.set_RunSpeed(10 ); // replacing the attribute hunting and running 
        Theria1.set_HuntingAttribute("Morbid and Rabid");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Theria1.Attributes());

        Theria Theria2 = new Theria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Theria \n"+"---------------------------------\n"+Theria2.Attributes());
        Theria Theria3 = new Theria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Theria \n"+"---------------------------------\n"+Theria3.Attributes());
        Theria Theria4 = new Theria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Theria \n"+"---------------------------------\n"+Theria4.Attributes());
        Theria Theria5 = new Theria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Theria \n"+"---------------------------------\n"+Theria5.Attributes());
        
        Placentalia Placent1 = new Placentalia(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Placentalia \n"+"---------------------------------\n"+Placent1.Attributes());
        
        Placent1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Placent1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Placent1.Attributes());

        Placentalia Placent2 = new Placentalia(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Placentalia \n"+"---------------------------------\n"+Placent2.Attributes());
        Placentalia Placent3 = new Placentalia(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Placentalia \n"+"---------------------------------\n"+Placent3.Attributes());
        Placentalia Placent4 = new Placentalia(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Placentalia \n"+"---------------------------------\n"+Placent4.Attributes());
        Placentalia Placent5 = new Placentalia(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Placentalia \n"+"---------------------------------\n"+Placent5.Attributes());
        
        

        //Boreutheria class with changing attributes display orignal and then display the update
        Boreoeutheria Boro1 = new Boreoeutheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Boreoeutheria \n"+"---------------------------------\n"+Boro1.Attributes());
        
        Boro1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Boro1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Boro1.Attributes());

        Boreoeutheria Boro2 = new Boreoeutheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Boreoeutheria \n"+"---------------------------------\n"+Boro2.Attributes());
        Boreoeutheria Boro3 = new Boreoeutheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Boreoeutheria \n"+"---------------------------------\n"+Boro3.Attributes());
        Boreoeutheria Boro4 = new Boreoeutheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Boreoeutheria \n"+"---------------------------------\n"+Boro4.Attributes());
        Boreoeutheria Boro5 = new Boreoeutheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Boreoeutheria \n"+"---------------------------------\n"+Boro5.Attributes());



        /// class of euchaontogires with changing hunting attributes etc display original and then updated
        Euarchontogires Euch1 = new Euarchontogires(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Euch1.Attributes());
        
        Euch1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Euch1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Euch1.Attributes());

        Euarchontogires   Euch2 = new Euarchontogires (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Euch2.Attributes());
        Euarchontogires  Euch3 = new Euarchontogires (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Euch3.Attributes());
        Euarchontogires  Euch4 = new Euarchontogires (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Euch4.Attributes());
        Euarchontogires  Euch5 = new Euarchontogires (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Cetatiodactlyia \n"+"---------------------------------\n"+Euch5.Attributes());

        



        Atlantogenata Atla1 = new Atlantogenata(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Atlantogenata \n"+"---------------------------------\n"+Atla1.Attributes());
        
        Atla1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Atla1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Euch1.Attributes());

        Atlantogenata   Atla2 = new Atlantogenata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Atlantogenata \n"+"---------------------------------\n"+Atla2.Attributes());
        Atlantogenata  Atla3 = new Atlantogenata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Atlantogenata \n"+"---------------------------------\n"+Atla3.Attributes());
        Atlantogenata  Atla4 = new Atlantogenata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Atlantogenata \n"+"---------------------------------\n"+Atla4.Attributes());
        Atlantogenata  Atla5 = new Atlantogenata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Atlantogenata \n"+"---------------------------------\n"+Atla5.Attributes());

        Laurasiatheria Laura1 = new Laurasiatheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Laurasiatheria \n"+"---------------------------------\n"+Laura1.Attributes());
        
        Laura1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Laura1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Laura1.Attributes());

        Laurasiatheria   Laura2 = new Laurasiatheria (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Laurasiatheria \n"+"---------------------------------\n"+Laura2.Attributes());
        Laurasiatheria  Laura3 = new Laurasiatheria (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Laurasiatheria\n"+"---------------------------------\n"+Laura3.Attributes());
        Laurasiatheria  Laura4 = new Laurasiatheria(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Laurasiatheria \n"+"---------------------------------\n"+Laura4.Attributes());
        Laurasiatheria  Laura5 = new Laurasiatheria (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Laurasiatheria \n"+"---------------------------------\n"+Laura5.Attributes());
        
        
        
        Scrotifera Scofi1 = new Scrotifera(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scofi1.Attributes());
        
        Scofi1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Scofi1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Scofi1.Attributes());

        Scrotifera   Scofi2 = new Scrotifera (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Scrotifera\n"+"---------------------------------\n"+Scofi2.Attributes());
        Scrotifera  Scofi3 = new Scrotifera (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Scrotifera\n"+"---------------------------------\n"+Scofi3.Attributes());
        Scrotifera  Scofi4 = new Scrotifera(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scofi4.Attributes());
        Scrotifera  Scofi5 = new Scrotifera(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Scrotifera \n"+"---------------------------------\n"+Scofi5.Attributes());
        




        Euungulata Euung1 = new Euungulata(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Euungulata \n"+"---------------------------------\n"+Euung1.Attributes());
        
        Euung1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Euung1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Euung1.Attributes());

        Euungulata   Euung2 = new Euungulata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Euungulata\n"+"---------------------------------\n"+Euung2.Attributes());
        Euungulata  Euung3 = new Euungulata (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Euungulata\n"+"---------------------------------\n"+Euung3.Attributes());
        Euungulata  Euung4 = new Euungulata(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Euungulata \n"+"---------------------------------\n"+Euung4.Attributes());
        Euungulata  Euung5 = new Euungulata(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Euungulata \n"+"---------------------------------\n"+Euung5.Attributes());
        
        
        //ferae class creationg on changing the attributeas
        Ferae Fera1 = new Ferae(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Ferae \n"+"---------------------------------\n"+Fera1.Attributes());
        
        Fera1.set_RunSpeed(450); // replacing the attribute hunting and running 
        Fera1.set_HuntingAttribute("Lazzzzy");

        System.out.println("I am the Upgraded Version \n"+"---------------------------------\n"+Fera1.Attributes());

        Ferae   Fera2 = new Ferae (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Ferae\n"+"---------------------------------\n"+Fera2.Attributes());
        Ferae  Fera3 = new Ferae (29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Ferae\n"+"---------------------------------\n"+Fera3.Attributes());
        Ferae  Fera4 = new Ferae(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Ferae \n"+"---------------------------------\n"+Fera4.Attributes());
        Ferae  Fera5 = new Ferae(29, true, true, 190, 75.0, 9999, " Worms and Potatoes", 5000 , " Being Lazy");
        System.out.println("I am a Ferae \n"+"---------------------------------\n"+Fera5.Attributes());
    }
}