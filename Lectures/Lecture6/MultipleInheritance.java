package Lecture6;


    
interface ONE
{
    public void print_one();
}

interface TWO
{
    public void print_two();
}

interface THREE extends ONE, TWO
{
    public void print_three();
}

public class MultipleInheritance implements THREE
{
    public void print_one()
    {
        System.out.println("Printing from 1");
    }

    public void print_two()
    {
        System.out.println("Printing from 2");
    }

    public void print_three()
    {
        System.out.println("Printing from 3");
    }


    public static void main(String[] args)
    {
        MultipleInheritance obj1 = new MultipleInheritance();

        obj1.print_one();
        obj1.print_two();
        obj1.print_three();
    }

}

    

