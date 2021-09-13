//Ethan Coyle
// Dr Saikat- CMPS 4143 Java and Pyhton
//
//ClassWork Spetember 13,2021
//
// This is showing the visual of multiple inheritance heirarchy
//Wil lgive a visual display of the inheritning from the base, intermediate 
// and the child class and print out the use in a nice easy to read format



public class MultiLevel 
{
    
}
class one
{
    publc String print_one()
    {
        return("printing from base class");
    }
}
class two extends one
{

    publc String print_two()
    {
        return("printing from itermediate class");
    }
}
class three extends two
{
    publc String print_one()
    {
        return("printing from child class");
    }
}
public class MulitLevel
{
    public static void main(String[] args)
    {
    // in the main driver, we are going to be printing out the inheriting string
    // this will show a dinfinitve display of the inheritance from the three classes
    three childObj=new three(); // create an object from 3 and it will automatically inher

    //to display the multilevel result use some print out methods
    System.out.println(childObj.print_one());
    System.out.println(childObj.print_two());
    System.out.println(childObj.print_thee());
    }
}