//Ethan  Coyle
//Dr.Saikat
//Employee Class
//September 8,2021

//This program creates an employee class and then attributes for that employees
//and itializing objects of employees


public class Employee 
{
 
        // first initialize instance variable that are private
        String Name;
        String Position;
        String EmploeeGender;
        int EmployeeAge;

        // This is the constructor that initializes the pet to default values
        public Employee (String EmployeeName, String EmployeePoistion,String Gender, int Age)
        {
                //called upon whenever the puppy class is invoked
                Name=EmployeeName;
                Position=EmployeePoistion;
                EmploeeGender=Gender;
                EmployeeAge=Age;
        }

        // initialize our accessors and mutators
        public void setEmployeeAge(int Age)
        { 
            EmployeeAge=Age;//setting the color(accesor)
       }
       //creation of the accessor called when initialized in the driver of the program
       public int getEmployeeAge() 
       {
           return EmployeeAge;//grabbing the color
       }
        public void setName(String EmployeeName)
         { 
             Name=EmployeeName;
        }
        //creation of the accessor called when initialized in the driver of the program
        public String getName() 
        {
            return Name;
        }

        public void setPosition(String EmployeePoistion) 
        {
            Position=EmployeePoistion;
        }
        public String getPosition() 
        {
            return Position;
        }
        
        public void setGender(String Gender) 
        {
            EmploeeGender=Gender;
        }
        //accesor to the breed string
        public String getGender() 
        {
            return EmploeeGender;
        }
        //once initialize, we can move to our main driver and then create instances of new puppers

        public static void main(String args[]) //this is our main driver program to print out stuffs
        {

                Employee Employee1=new Employee(" Bilbo Baggin"," Manager"," Male", 25); // two different puppiers
                Employee Employee2=new Employee(" Harry Potter"," Loser ", " Hobbit", 99);//second object dog

                //print out to the console
                System.out.println(Employee1.getName()+"'s Position is "+Employee1.getPosition() +
                     "  His Gender is a "+Employee2.getGender() + " His Age is "+Employee1.getEmployeeAge());

                System.out.println(Employee2.getName()+"'s Position is  "+Employee2.getPosition()+ 
                    " His Gender is a  "+Employee2.getGender()+ " His Age is "+Employee2.getEmployeeAge());

        }
}//end of driver and program


