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
    int NumArr[] = new int[]{0,1,2,3,4,5,6,7,8,9,10,
                             11,12,13,14,15,16,1,7,18,19};
    //set the smallest and the largest in the array to 0 or the first
    int Smallest = NumArr[0];
    int Largest = NumArr[0];
    //comapre each item in the array to the one compared before and after and then
    //if fits either category, then that is new number or move to next one
    for(int i=1; i< NumArr.length; i++)
        {
        if(NumArr[i] > Largest)
                Largest = NumArr[i];
        else if (NumArr[i] < Smallest)
                Smallest = NumArr[i];       
        }
    //print out to the screen the largest number found and the smallest number found

    System.out.println("the Largest Number is = " + Largest);
    System.out.println("Smallest Number is : " + Smallest);
    }
//after this program completes execution and closes down
}
