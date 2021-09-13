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


public class QuestionTwo
 {
    public static void main(String[] args)

    {
        int DescendingArray=0;//create a DescendingArrayorary holder start at 0 Used in Descending
        //given array for x in the programming assignment
        int Array_X[] = { 10,100,40,28,98,37,12,63 };

        //dynamically allocate new memory to create an identical array x and y
        int Array_Y[] = new int[Array_X.length];
        Array_Y = Array_X;
        Array_Y[0]++;//iterate throughotu the array to copy

        System.out.println("The Contents of Original Array Are : ");

        for (int i = 0; i < Array_X.length; i++)
            System.out.print(Array_X[i] + " ");
            
        System.out.println("\n\nThe Contents Array Y are :  ");
        
        //for loop to print out the values of the copied array
        for (int i = 0; i < Array_Y.length; i++)
            System.out.print(Array_Y[i] + " ");
        
        //below is going to iterate through in descending order of the original array
        int n= Array_X.length;//iterate through the length of array
        //comparative nested for loop to iterate and compare values
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
            System.out.print("\n\nIn Descending Order:\n");
            
            for (int i = 0; i < n - 1; i++) 
            {
            //formatting for array
            System.out.print(Array_X[i] + ",");   
            }
    //print out the descending order array
    //original array now ordered in descending value order
    System.out.print(Array_X[n - 1]+"\n\n");
            
    //we are then going to accumulate and find the average of the array and print out the 
    //value of the average for display purposes 

    int TotArraySum = 0;//base value before counting is 0
       for(int i=0; i < Array_Y.length ; i++)
        TotArraySum = TotArraySum + Array_Y[i];
       //calculate AVG value
    float AVG = TotArraySum / Array_Y.length;
        //then we will print out the calculated average of array
    System.out.println("The average of all the values in the array is  : " + AVG);
    
    
     }      

}
