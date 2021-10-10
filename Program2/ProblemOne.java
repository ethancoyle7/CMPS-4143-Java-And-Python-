//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         October 11,2021                                                      //
//   What it does-                                                                          //
//                                                                                          //
//   The purpose of this program is to show the various concepts associated with OOP concept//
//       in Java including polymorphism, encapsulation, abstract classes and method override//
//       This is the solution to Question Number 1 in our programming assignment            //           
//                                                                                          //
//##########################################################################################//
//class Wizard created which has display method to print statement
class Wizard 
{
    public void display() 
    {
        System.out.println("I am Gandalf the Grey");
    }
}
//Now we are going to show inheritance by extending from Wizard Class
class Hobbit extends Wizard 
{
    @Override // compile time polymorphism
    // we are overriding that which derived from the father class
    public void display()
    {
        System.out.println("I am Bilbo Baggins and i dont like adventures ");
    }
    //now to multiplication some polymorphism inside which is two similar functions
    //but take different parameters(Polymorphism means many forms) 
    
    public int multiplication(int x, int y) // runtime polymorphism
    {
      // this function is using integer multiplication
      //truncating the values 
      return x*y;
    }
    public double multiplication(double x,double y) 
    {
      // this function take doubles as the parameter which
      // shows that same functions different parameters 
      return x*y;
    }

}
//My next task is to show form of encapsulation in a class

//create a class of FathersName and inside we have our get, set and private members
class FathersName 
{

    private String name;

    //fathers name and age only accessed inside of class fathersname 
   
    // now intilize our getter and setter methods to set and get the name of the father
    public String getName() 
    {
        return name;// access the name and grab it and pass it back
    }
    public void setName(String newName) 
    {
        name = newName;// upon initilization over ride and set the name
    }
    
}

//Final task in this question is provide a form of abstraction

//pronounce the class as abstract and we orride this for any call made previous 
// to avoid 
abstract class GrandParent
{
    public abstract void Person();
    public abstract void setAge(int age);
}

//we extend the classes that will take attributes from the main

class GrandFathersSon extends GrandParent

{

    private int FatherAge;
    public void Person()
    {
        System.out.println("\nI am the Father, Bilbo Baggins");
    }
    @Override
    public void setAge(int age)
    {
      FatherAge=age;
    }
    //setting the age of the fathr in accessor and mutator methods
    public int getAge()
    {
      return FatherAge;
    }
    
}
class FathersSon extends GrandFathersSon// extend this child from parent which is extended from grandparent
{ 
  //we override this method that will be called whenever instance of Hobbit comes up
  // when function call is called
  @Override
    public void Person() 
    {
        System.out.println("\nAnd I Frodo, am the Son");
    }
}

// now to print out all in the main driver class to iterate through all
//the various cases of OOP concepts 
class ProblemOne
{
    public static void main(String[] args) 
    {
         System.out.println("#############################################\n");
         System.out.println("##   Author    Ethan Coyle                 ##\n");
         System.out.println("##   Teacher    Dr. Saikat                 ##\n");
         System.out.println("##   Class      CMPS 4143                  ##\n");
         System.out.println("##   Homework   Question 1                 ##\n");
         System.out.println("#############################################\n\n");
         System.out.println("\nWe are Now Going to Demonstrate Inheritance");
        System.out.println("--------------------------------------------\n");
        Wizard Name=new Wizard();
        Name.display();

        Hobbit Name1=new Hobbit();
        // overriding method to prevent polymorphism will take the Hobbit class and
        // prints out the ontents of the Hobbits name announcement  
        Name1.display();
        System.out.println("--------------------------------------------\n\n");

        // inside of the same function, we create a runtime and compilation 
        //polymorphis m showing overrloading  methods
        // using same function name but differnt parameters
        System.out.println("We are Now Going to Demonstrate Method Overloading");
        System.out.println("--------------------------------------------------\n");
        System.out.println(Name1.multiplication(20,5));
        System.out.println(Name1.multiplication(20.0,5.0)); 
        System.out.println("--------------------------------------------------\n\n");


        System.out.println("We are Now Going to see some Encapsulation");
        System.out.println("------------------------------------------\n");
        // now we will show some polymorphism in action

        //utilize the get and set methods(mutators and accessors)
        FathersName HobbitFather = new FathersName();
        HobbitFather.setName("Bilbo Baggins");
        System.out.print("The Name of Father  is : " + HobbitFather.getName());
        
        System.out.println("\n------------------------------------------\n");
        System.out.println("\nWe are Now are going to see some inheritance\n");
        System.out.println("------------------------------------------\n");
		
        GrandFathersSon relation1 = new GrandFathersSon();
        relation1.Person();//creating instance of new father who is the grand fathers son
        relation1.setAge(111);//ovverriding the age of grandfather age for the father
        System.out.print("It's My : " + relation1.getAge()+"'th Birthday");

        // by calling, relation2 object, we utilize the call whihc
        //will print out the contents associated with the Hobbit instead from inheritance
        GrandParent relation2 = new FathersSon();
        relation2.Person();// will print out the content os the Son display method by method overriding
        System.out.println("------------------------------------------\n\n");
    }//end of main driver
}//end of the program
