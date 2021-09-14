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
     //function call to add the element AVG into the array Y
    public static int[] InsertAVG(int n, int arr[], int x)
    {
        int i;
  
        // new array size n+1 for inserting average
        int newarr[] = new int[n + 1];
  
        //taking the old array and looping through adding element
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
  
        newarr[n] = x;
  
        //returning the new array with new value inserted
        return newarr;
    }
    //function to search for the number that is specified to perform deletion function
    static int findElement(int arr[], int n, int key)
    {
        int i;//search through the array to find the value specified
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
      
        return -1;
    }
     
    // This is our function to delete the average element again to make them both equal
    static int deleteElement(int arr[], int n, int key)
    {
        // find the element thats to be deleted from function call position
        int pos = findElement(arr, n, key);
      
        if (pos == -1)
        {
            System.out.println("We couldnt find specified element");
            return n;//exit out of this function call
        }
      
        // DIf the value is found we iterate through to delete that number
        int i;
        for (i = pos; i< n - 1; i++)
            arr[i] = arr[i + 1];
      
        return n - 1;// returning the array with the value deleted
    }

    //creating our driver program
    public static void main(String[] args)

    {
    //initialize the variables to be used at the top
    int DescendingArray=0,TotArraySum = 0;
    int Array_X[] = {10,100,40,28,98,37,12,63};

    //for user view, display original array, then  copy array to y
    System.out.println("\nThe Contents of Our Original Array is : "+Arrays.toString(Array_X)); 
    

    //for calculating the average, we must loop through array x and determine the total of the sum indexes
    //then divide by the number of indexes and then store in variable
    for(int i=0; i < Array_X.length ; i++)
        TotArraySum = TotArraySum + Array_X[i];
    //calculate AVG value
    int AVG = TotArraySum / Array_X.length;

    //we create a new array called y and then copy array x into it
    int Array_Y[] = new int[Array_X.length];
    Array_Y = Array_X;
    System.out.println("The Content of ArrY without AVG is   :  "+Arrays.toString(Array_Y));

    //now for display print out the calculated average
    System.out.print("\nAfter Calculating the avergae we got an average of  :  "+AVG+"\n\n");

    int x = AVG, SizeArray = 8;//to be used on function call to insert the avg value at end

    Array_Y = InsertAVG(SizeArray, Array_X, x);// go the function call to insert the Avg 
    //print out the contents after the insert is done
    System.out.println("\nThe Contents of Array Y After AVG  :  " + Arrays.toString(Array_Y));

        //below is going to iterate through in descending order of the original array
        //iterate through the length of array
        //comparative nested for loop to iterate and compare values
        int n= Array_Y.length;
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++)
            {
                //test to see ivalue of i is less than next
                if (Array_Y[i] < Array_Y[j]) 
                {
                    //store values into DescendingArray rel
                    DescendingArray = Array_Y[i];
                    Array_Y[i] = Array_Y[j];
                    Array_Y[j] = DescendingArray;
                    //assign the new values to original in descending order
                }
            } 
        }

        //console print the array in the descending order
        System.out.print("In Descending Order The Array Y is :  "+
                            Arrays.toString(Array_Y)+"\n\n");

    //Now compare the contents of new array to the old and delete extra values to make them the same
    if(Array_X !=Array_Y)
    {
    int itr;  
    int ArrayLength = Array_Y.length; // the array length to look at is the length 9
    int key = AVG;                    //key item to delete is average value
    n = deleteElement(Array_Y, ArrayLength, key);   // go to the function call
    
    System.out.println("\n\nArray Y Content after deletion ");
    for (itr=0; itr<n; itr++)
        System.out.print(" "+Array_Y[itr]+",");
    }
    else
    System.out.print("The Arrays are the Same!");

     }//end of our driver main  
}//end of the class program