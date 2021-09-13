//Ethan Coyle
// September 13,2021
//Dr.Saiakat-CMPS 4143

// This will show the heirachy from nheriting classes

class A
{
    public String print_A()
    {
        return("Printing from A");
    }
}

class B extends A
{
    public String print_B()
    {
        return("Printing from B");
    }
}

class C extends A
{
    public String print_C()
    {
        return("Printing from C");
    }
}

class D extends A
{
    public String print_D()
    {
        return("Printing from D");
    }
}


public class Heirarchy
{
    A objA = new A();
    B objB = new B();
    C objC = new C();
    D objD = new D();
}
