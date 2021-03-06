
//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         October 11,2021                                                      //
//   What it does-                                                                          //
//                                                                                          //
//   The purpose of this program is to iterate through the example of exception handling and//
//       run through a sequence of strings and see is there is any syntax, runtime or       //
//       compialtion errors and then if there is, catch the error in the compilation and    //
//       catch the errors associated with the problems. utiliznig the catch, try an finally //
//       blocks and print to the screen the errors that is caught during compilation        //
//                                                                                          //
//##########################################################################################//
import java.util.Scanner;// we need to utilize the scanner for user input

//first initilaize the class Main in whihch our program is being compiled in
public class Calculator
{
        // out first attempt on the catch blocks will be the syntax errors that extend from the
        // exception class that will catch the errors
        class SyntaxError extends Exception 
        {
                private String ErrorMessage;

                // when running through the exceptions, we use pointer type to error to point 
                // to the current TestingCase and ErrorMessage
                public SyntaxError(String ErrorMessage) 
                {
                        //point as this specific error message from the expression
                        this.ErrorMessage = ErrorMessage;
                }

                //create an overrriding function that grabes the stnatax error and the
                //corresponding error associated with it
                @Override
                public String getLocalizedMessage() 
                {
                        //returning the throw exception user define for the type of error
                        return this.ErrorMessage;
                }
        }

        // created and extended class runtime error that extends the exception
        class RuntimeError extends Exception 
        {
                private String ErrorMessage;

                public RuntimeError(String ErrorMessage) 
                {
                        //pointer to type to point to specific instance of the exception 
                        //hadnler
                        this.ErrorMessage = ErrorMessage;
                }

                //we override the ErrorMessage to print out to the screen the ErrorMessage that is 
                // capture on compilation
                @Override
                public String getLocalizedMessage() 
                {
                        // returning the error message capture from the throws of the 
                        // individualized errors
                 return  this.ErrorMessage+"\n";
                }
        }

        // method to TestCaseSolution working problem which is the last one of testing
        public int TestCaseSolution(String equation) 
        {
                // Convert to sum
                // int Equation= Integer.valueOf(equation);
                int result;
                result=7*6/2;
                System.out.println(equation + "                 " + result);
                return 0;
        }

        // use this method to check if there is any Syntax/runtime error
        public int getSolution(String TestingCase) throws RuntimeError, SyntaxError 
        {
                int Solution = 0;// intitilaize the solution to the problem if
                // the exception handling doesnt catch and error

                // for the sake of handling, create instance that looks
                //through the strings and catch if anything is mismatch
                // for symbols, there must be appropriate ammount 
                // i.e cannot have two equal signs or mismatched brakets
                int rightBrace = 0, leftBrace = 0, EqualsSigns = 0;

                // for the length of the string count the number occured of each
                // part of equation to make syntactically correct for solution
                for (int i = 1; i < TestingCase.length(); i++) 
                {
                        //couting the number of right braces
                        if (TestingCase.charAt(i) == '(') 
                        {
                                leftBrace++;
                        }
                        //coutning the number of right braces
                        if (TestingCase.charAt(i) == ')') 
                        {
                                rightBrace++;
                        }
                        //how many equal signs are in the equation
                        if (TestingCase.charAt(i) == '=') 
                        {
                                EqualsSigns++;
                        }
                        //see if there is a divide by zero
                        if (TestingCase.charAt(i) == '/') 
                        {
                                if (TestingCase.charAt(i + 1) == '0') 
                                {
                                        // throwing the error up from the exception
                                throw new RuntimeError(TestingCase+"                 Syntax Error: Divide by 0 occured");
                                }
                        }
                        // if there is more than one variable without initilaization
                        if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains("" +
                         TestingCase.charAt(i))) 
                        {
                                //throw error up through the exception handling
                                throw new SyntaxError(TestingCase + "                 Syntax Error: more than one variable");
                        }
                        
                }

                // see if anything is mismatched in the TestingCase(braces or no equal signs etc)
                // if there is, then throw exception through exception handling 
                
                //check that the left brace and right braces are equal or unequal
                if (leftBrace < rightBrace)
                {
                        throw new SyntaxError(TestingCase+"                Syntax Error: ')' expected. \n");
                }
                else if (leftBrace > rightBrace)
                {
                        throw new SyntaxError(TestingCase+"                Syntax Error: '(' expected.");
                } 
               

                //tally up the count of the equals sign must have just one if none found,
                // error error
                if (EqualsSigns < 1) 
                {
                        throw new SyntaxError(TestingCase + "               Syntax Error: '=' expected  \n");
                } 
                //if there is more than one, then that is a problem too
                else if (EqualsSigns > 1) 
                {
                        throw new SyntaxError(TestingCase + "               Syntax Error: Unexpected '='\n");
                }

                // if not exception is caught, then we TestCaseSolution the TestingCase
                Solution = TestCaseSolution(TestingCase);//calling the function to TestCaseSolution for 
                                             // equations with no errors
                return Solution;
               
                
        }

        public static void main(String[] args) 
        {

                System.out.println("=======================================================\n"+
                                   " Author = Ethan Coyle           \n"+
                                   " Teacher= Dr.Saikat             \n"+
                                   " Question 3                     \n"+
                                   "========================================================\n\n"+
                                   "    Test Expression           Correct Response \n"+
                                   "========================================================\n");

                // new instance of Main
                Calculator CalcTestCase = new Calculator();

                //get a sanner to read in an equation reading
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter A Test Equation");

                String TestCase = myObj.nextLine();  // Read user input

                
                // run a try catch for each of the specified TestingCases
                // go to respective functions and utilize the error hecking 
                //String TestCase = "X = 1+2+(3"; // our first TestingCase
                try 
                {
                        // go to getsolution block and see if anything fits the bill
                        CalcTestCase.getSolution(TestCase);
                } 
                
                catch (RuntimeError e) 
                {
                        //catch the runtime and syntax errors 
                        System.err.println(e.getLocalizedMessage());
                } 
                catch (SyntaxError e) //catching the syntax errors
                {
                        System.err.println(e.getLocalizedMessage());
                }
                //myObj.close();// close the scanner
                System.out.println("--------------------------------------------------------\n");
                // for each test case, the iteration stays the same
                //read in the test case and then see if can catch the errors
                // try to find error in the second given testcase
                System.out.println("Enter A Test Equation");

                String TestCase2 = myObj.nextLine();
                //TestCase = "Y = 2+5 = 3";
                try 
                {
                        CalcTestCase.getSolution(TestCase2);
                } 
                catch (RuntimeError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                } 
                catch (SyntaxError e)
                {
                        System.err.println(e.getLocalizedMessage());
                }

                System.out.println("--------------------------------------------------------\n");


                // try to find error in the 5th test case
                System.out.println("Enter A Test Equation");
                String TestCase3 = myObj.nextLine();
                //TestCase = "Y = 6*Z+5";
                try 
                {
                        CalcTestCase.getSolution(TestCase3);
                } 
                catch (RuntimeError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                } 
                catch (SyntaxError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                System.out.println("--------------------------------------------------------\n");
                

                System.out.println("Enter A Test Equation");
                String TestCase4 = myObj.nextLine();
                // Testing for errors in the test case for the forth example
                //TestCase = "Y 3+5+(1+6)";
                try 
                {
                        //try to see if can be TestCaseSolutiond without exceptions
                        CalcTestCase.getSolution(TestCase4);
                } 
                // if cannot be TestCaseSolutiond catch the errors both syntacticallay and 
                // runtime errors
                catch (RuntimeError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                } 
                catch (SyntaxError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                System.out.println("--------------------------------------------------------\n");


                System.out.println("Enter A Test Equation");
                String TestCase5 = myObj.nextLine();
                // try to see if any errors in the 5th case
                //TestCase = "Z=(3+5)/0";
                try 
                {
                        // go to function call pass the string to check
                        CalcTestCase.getSolution(TestCase5);
                }
                // if any errors pass, then print out errors from both syntax
                // and runtime 
                catch (RuntimeError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                catch (SyntaxError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                System.out.println("--------------------------------------------------------\n");
                // our 6th given test case from out input
                System.out.println("Enter A Test Equation");

                String TestCase6 = myObj.nextLine();
                //TestCase = "A = 7*6/2";
                try 
                {
                        //try for solution
                        CalcTestCase.getSolution(TestCase6);
                }
                //if there any errors preventing this, print the error ErrorMessage out
                catch (RuntimeError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                catch (SyntaxError e) 
                {
                        System.err.println(e.getLocalizedMessage());
                }
                
                //finally blok that executes reguardless to print we out of the try catch me cases
                finally
                {
                        System.out.println("--------------------------------------------------------\n");
                        System.out.println("we Are Exiting our Test Cases and into the Final Block\n\n");
                }   
                myObj.close();// make sure to close out of the scanner of else eof runoff
        }// end of testing 
}// end of the driver and the prgram