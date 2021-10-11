



public class Mammalia 
{
    //creating a basis for all the animals in mammlia class that everything is going to be orriding from
    int NumLegs,NumNuerons,BornOnDate;
    boolean HasTail;
    boolean HasBrain;
    double precision;
    
    String FavoriteFood;

    //we need t set the attributes for each of the casses as well
    public void Attributes()
    {
        
    };
    public void eat(){};
    public void walk(){};
    public void sleep(){};
    public void give_birth(){};

    Mammalia(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
    {
        this.NumLegs = Legs;
        this.HasBrain = HasBrain;
        this.NumNuerons = NumNuerons;
        this.HasTail = Tail;
        this.precision = precision;
        this.BornOnDate = BornOnDate;
        this.FavoriteFood = FavFood;
    }

    //extending from the mammalia class monotremata
    class Theria extends Mammalia 
    {
        Theria(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain,Tail,NumNuerons, precision, BornOnDate, FavFood);

        }
        @Override
        public void Attributes()
        {
            
            System.out.println(" Has -"+NumLegs+"legs\n");
            System.out.println(" Has -"+HasBrain+ " A Brain\n");
            System.out.println(" Has -"+HasTail +" A Tail\n");
            System.out.println(" Has -"+NumNuerons+ " Neurons!\n");
            System.out.println(" Has -"+precision+" Percent Precision and Adaptability\n");
            System.out.println(" Was Born in the Year -"+BornOnDate+ "\n");
            System.out.println(" Their Favorite Food is -"+FavoriteFood+ "Wow Thats Yummy!\n\n");
        }
        
    }
    public class Monotremata extends Mammalia
    {
        Monotremata(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
   
    //theria is the paren of the marsupilia class
    class Marsupialia extends Theria
    {
        Marsupialia(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    //parent class is theria
    class Placentia extends Theria
    {
        Placentia(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    //placentia is the parent class for the atlantogenata
    class Atlantogenata extends Placentia
    {
        Atlantogenata(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    //class is extended from plaventia
    class Boreoeutheria extends Placentia
   {
    Boreoeutheria(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Afrotheria extends Atlantogenata
    {
        Afrotheria(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Xenarthra extends Atlantogenata
    {
        Xenarthra(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
            super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Euarchontoglires extends Boreoeutheria
    {   
        Euarchontoglires(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }

    class Laurasiatheria extends Boreoeutheria
    {
        Laurasiatheria(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }

    class Euarchonta extends Euarchontoglires
    {
        Euarchonta(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }

    class Glires extends Euarchontoglires
    {
        Glires(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }

    class Scrotifera extends Laurasiatheria
    {
        Scrotifera(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Eulipotyphia extends Laurasiatheria
    {
        Eulipotyphia(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Chirpotera extends Scrotifera
    {
        Chirpotera(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Euungulata extends Scrotifera
    {
        Euungulata(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Ferae extends Scrotifera
    {
        Ferae(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Cetartiodactyla extends Euungulata
    {
        Cetartiodactyla(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Perissodactyla extends Euungulata
    {
        Perissodactyla(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Pholidota extends Ferae
    {
        Pholidota(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }
    class Carnivora extends Ferae
    {
        Carnivora(int Legs, boolean HasBrain, boolean Tail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        {
             super(Legs,HasBrain, Tail,NumNuerons, precision, BornOnDate, FavFood);
        }
    }

    public  void main(String[] args) 
    {
        //Theria(int Legs, boolean HasBrain, boolean HasTail, int NumNuerons, double precision, int BornOnDate, String FavFood)
        Theria SquidMan= new Theria(4, true, true, 5, 10.0, 1, " Potatoes ");
        SquidMan.Attributes();


    }   //end of the main driver  
}// end of the main class and close


