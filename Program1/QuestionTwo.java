//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         Septermeber15,2021                                                   //
//   What it does-                                                                          //
//                                                                                          //
//   This File contains the answer to the Question #2 on Program1                           //
//   In this program, will be copying over the values from one array to another             //
//   will also be comparing the values inside and arranging in descending order             //
//   Also, will be comparing to see the avg in the original array and then printing it out  //
//                                                                                          //
//##########################################################################################//

import java.util.Arrays; //we need this imprt for the  insert
public class QuestionTwo
 {
    //creating our driver program
    public static void main(String[] args)

    {
    //initialize the variables to be used at the top
    int DescendingArray=0,Index_position = 0,TotArraySum = 0;
    int Array_X[] = {10,100,40,28,98,37,12,63};

    //for user view, display original array, then  copy array to y
    System.out.println("\nThe Contents of Our Original Array is : "+Arrays.toString(Array_X)); 
    
    int Array_Y[] = new int[Array_X.length];
    Array_Y = Array_X;
    
    
    System.out.println("Before the AVG Insert, Our Array Y is : "+Arrays.toString(Array_Y));
    // Insert an element in 3rd position of the array (index->2, value->5)
        
    for(int i=0; i < Array_X.length ; i++)
        TotArraySum = TotArraySum + Array_X[i];
       //calculate AVG value
    int AVG = TotArraySum / Array_X.length;

    //printing out the average for visualization purposes
    System.out.print("\nAfter Calculating the avergae we got an average of  :  "+AVG+"\n\n");
    //System.out.println("The Contents of Our Original Array is : "+Arrays.toString(Array_X));     
        
    
    //parse through the array and print out the contents of the new array with the average placed infirst position
       for(int i=Array_Y.length-1; i > Index_position; i--)
       {
        Array_Y[i] = Array_X[i];
        }
        Array_Y[Index_position] = AVG;//place the average in the index position which initializes to index 1
        //printing out the contents of array y
        System.out.println("Array Y with The Average placed is :  "+Arrays.toString(Array_Y));
        


        //below is going to iterate through in descending order of the original array
        //iterate through the length of array
        //comparative nested for loop to iterate and compare values
        int n= Array_X.length;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++)
            {
                //test to see ivalue of i is less than next
                if (Array_X[i] < Array_X[j]) 
                {
                    //store values into DescendingArray rel
                    DescendingArray = Array_X[i];
                    Array_X[i] = Array_X[j];
                    Array_X[j] = DescendingArray;
                    //assign the new values to original in descending order
                }
            } 
        }

        //console print the array in the descending order
        System.out.print("In Descending Order The Array Y is :  "+
                            Arrays.toString(Array_Y)+"\n\n");

    //Now compare the contents of new array to the old and delete extra values to make them the same
     }      
}//end of the driver and program
