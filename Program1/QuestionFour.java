//##########################################################################################//
//                                                                                          //
//   Author-           Ethan Coyle                                                          //
//   Instructor/Class- Dr.Saikat-CMPS 4143 Java/Pyhton                                      //
//   Due Date-         Septermeber15,2021                                                   //
//   What it does-                                                                          //
//                                                                                          //
//   This File contains the answer to the Question #4 on Program1                           //
//   This Program will read in one line in string s, print out that string                  //
//   For user visualization purposes, then it will run through and reverse the string       //
//   And then will print out the reversed order of the given string in a nice user readable //
//   Format                                                                                 //
//                                                                                          //
//##########################################################################################//
class QuestionFour 
{
    static void reverse(char str[],int Beginning,int Ending) 
    {
     // First create StringLINE variable to hold the string
        char StringLINE;  
        while (Beginning <= Ending)
        {
            // Inside here, we are swapping around the string
            StringLINE = str[Beginning];
            str[Beginning] = str[Ending]; // switch beginning with the end
            str[Ending] = StringLINE; // reverse the order that is reading
            Beginning++;
            Ending--;
        }
    }
    //function call whos purpose is to check thring and then go to reverse
    static char[] FlipString(char []s)
    {
    int Beginning = 0;//initialize the starting point to 0
    //comense the swapping!!!!
    for (int Ending = 0; Ending < s.length; Ending++)
    {
        if (s[Ending] == ' ')
        {
        reverse(s, Beginning, Ending);//function call to reverse the string function
        Beginning = Ending + 1;
        }
    }
    reverse(s, Beginning, s.length - 1);//first call
    // putting the whole string in reverse
    //in order to make it legible and not mirror backwards call function again
    reverse(s, 0,s.length - 1);//second call
    //retruning the string that is flipped
    return s;
    }

//Now that we have both the read and flip functions
//it is time to do driver code to read in the dtring
//go to appropriate functions and display the flipped 
//string that was read in

    public static void main(String[] args)// main driver for program

    {
        String s = "this is my first programming  assignment "; // orginal string
        System.out.print("Original Text is :    "+ s +"\n");    //friendly user output
        char []ReversedStringArray = FlipString(s.toCharArray());       // function call to reverse          
        System.out.print("Converted Text is:    ");
        System.out.print(ReversedStringArray); //go to function call to work through so output is nice
        System.out.print("\n\n");

    }

}//end of class reverse
