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
        return ("Has  " + Legs + " Legs\n"+ 
        "I Have a Tail? " + HasTail + "\n"+
         "Do I have a Brain?  " + HasABrain + "\n"+
          "How Many Neurons Do I have? " + NumNeurons + "\n"
        + "My Total Level Percentage of Precision is  " + LevelOfPrecision + "%\n"+
         "I was Born in the Year? " + DateOfBirth + "\n"+
          "And My Favorite Food is ? " + FavoriteFood + "\n");
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

class Eulipotyphia extends Laurasiatheria {
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
    public static void main(String [] args) 
    {
        // problem one says to print out five animals from the families
        Perissodactyla ButterBean = new Perissodactyla(80, true, true, 12, 1.2, 1954, "Butter  and Peanuts");
        System.out.println(" I am a Perissodactyla\n"+ButterBean.Attributes());

        // animal 2
        Mammilia BubbleMan = new Theria(2, true, true, 11, 88.3, 1332, "Air and Little Hobbits");
        System.out.println(" I am a Theria\n"+BubbleMan.Attributes());

        //mammal3
        Mammilia Boreoeutheria1 = new Boreoeutheria(19, true, true, 200, 99.9, 1283, "Celery and Potatoes");
        System.out.println(" I am a Boreoeutheria\n"+ Boreoeutheria1.Attributes());

        //mammal 4 creating
        Pholidota Laurasiatheria1 = new Pholidota(80, true, true, 9, 40.3, 1542, "Nothing");
        System.out.println(" I am a Pholidota\n"+Laurasiatheria1.Attributes());

        //mammalia 5 creating
        Mammilia Placentalia1 = new Placentalia(5, true, true, 800, 10.0, 2030, "McDonals and Ketchup Sauce");
        System.out.println("I am a Placentia\n"+Placentalia1.Attributes());
    }
}