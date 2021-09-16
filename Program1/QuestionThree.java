//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         Septermeber15,2021                                                   //
//   What it does-                                                                          //
//                                                                                          //
//   This File contains the answer to the Question #3 on Program1                           //
//   This Program,we are given a large string, and we are being asked to run through the    //
//   The string and find the % most occured StringWords inside of the string, In doing, We  //
//   Store the occured StringWords in an array and then run through some tests and then     //
//   output to the screen the top 5 most occured Thus satisfying the given question         //
//                                                                                          //
//##########################################################################################//
public class QuestionThree //same name as the given java program
{
            public static void main(String[] args)//our main driver
         {
            ///First list the given string in the given example
            String S = "Before trying to do any of the steps below, you should read the article"+
                    "through at least once for basic understanding. Then go back and review,"+
                    " following these steps He ran his machine up to the stone porch and ascending"+ 
                    "the steps rang the door bell. Theydirected their steps toward the sea, which"+
                    "was lit up by the rising moon. She breathed a sigh of relief, and her light"+
                    "steps fell gradually into the measure of his. This was fully four feet under "+
                    "water and the lower story of the place was two steps lower down.";

            //for formatting purposes and visual presentation, print out the string
            System.out.println("Our Provided String From The Question is "+S+'\n');
    
            String[] StringWords = S.split("\s");// split the words up so can count occureances

             //next, we are going to look and find the most frequent StringWords given
             //create two dynamic allocated arrays to store frequent StringWords and their Recurrance

            String[] WordsFromOurString = new String[StringWords.length];
            int[] Recurrance = new int[StringWords.length];

            //dyanmicall allocate new mem for Recurrance
            //initialize a counter variable to store the count
            int OccuranceCount = 0;

            //starting a for loop to run through the string a run through Recurrance 
            
            for (int i = 0; i < StringWords.length; i++) 
            {
                boolean exists = false; // assume that a recurrance hasnt happened
                for (int j = 0; j < OccuranceCount; j++) 
                {
                    
                    // cpaital and lower case dont matter if word occurs add to Recurrance
                    if (StringWords[i].replaceAll("[.,;]", "").equalsIgnoreCase(WordsFromOurString[j])) 
                    {
                        //if an occurancy does occur add to freguency 
                        Recurrance[j] += 1;
                        exists = true;
    
                    }
                }
                if (!exists)// if the boolean is true, then add to counter 
                {
                    WordsFromOurString[OccuranceCount] = StringWords[i].replaceAll("[.,;]", "");
                    Recurrance[OccuranceCount] = 1;
                    OccuranceCount += 1;
                }
            }
    
            //my naext loop is going to loop through the occurancecounts
    
            for (int i = 0; i < OccuranceCount; i++) 
            {
                for (int j = 0; j < OccuranceCount - i - 1; j++) 
                {
                    if (Recurrance[j] < Recurrance[j + 1]) 
                    {
                        //temporary holding plave for Recurrance
                        // while we are going through the occurancy placeholders, we are going to 
                        //  assign the highest values to temp for printing out
                        int PlaceHolder = Recurrance[j];
                        Recurrance[j] = Recurrance[j + 1];
                        Recurrance[j + 1] = PlaceHolder;
                        //creating placeholder to hold recurrances  into Temporary String
                        String TemporaryStringS = WordsFromOurString[j];
                        WordsFromOurString[j] = WordsFromOurString[j + 1];
                        WordsFromOurString[j + 1] = TemporaryStringS;
                    }
                }
            }
            // Lastly, we systematically print out the % most frequent StringWords that are found
            System.out.println("\nThe Top 5 Most Frequently Occured StringWords in this string are -");
            System.out.println("---------------------------------------------------------------");
            for (int i = 0; i < 5; i++)
             {
                 //loop through for loop print out the most frequet that is store in the array
                System.out.println("The Word ["+ WordsFromOurString[i] + "] Appearing "+ Recurrance[i] + " Times. ");
            }
            System.out.println("---------------------------------------------------------------");
        }//end of driver
}//end of process and end of program
