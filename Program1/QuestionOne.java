//##################################################################//
//                                                                  //
//  Ethan Coyle                                                     //
//  CMPS 4143-Java/Python(Dr.Saikit)                                //
//  Program 1 Question 1                                            //
//                                                                  //
//  in this code, i will be computing the smallest and the          //
//  largest number in a size 20 array and finding the smallest and  //
//  largest and then i will be printing out to the console the      //
//  results                                                         //
//                                                                  //      
//##################################################################//


//this is the compilation and executable code for the first problem
public class QuestionOne //class name same as the .java name
{
        public static void main(String[] args) 
    {
    //give array of 20 values
    int ArrayofValues[] = new int[]{5,25,37,-9000,0,85,28,5901020,12,37,78,94,100,29,8,
                                16,11,15,905,2};
    //small and large are the first index
    int Smallest = ArrayofValues[0];
    int Largest = ArrayofValues[0];
    //comapre each item in the array to the one compared before and after and then
    //if fits either category, then that is new number or move to next one
    for(int i=1; i< ArrayofValues.length; i++)
        {
        if(ArrayofValues[i] > Largest)  // comparison to find the largest value inside the array
                Largest = ArrayofValues[i];
        else if (ArrayofValues[i] < Smallest) // comparison peruse the arry to find the smallest
                Smallest = ArrayofValues[i];       
        }
    //print out to the screen the largest number found and the smallest number found
    System.out.println("In This Array of 20 Values \n");
    System.out.println("The Largest  # in This Array is = " + Largest);
    System.out.println("The Smallest # in This Array is = " + Smallest+"\n");
    }
//after this program completes execution and closes down
}


