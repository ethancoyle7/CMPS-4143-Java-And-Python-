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
            str[Beginning] = str[Ending];
            str[Ending] = StringLINE;
            Beginning++;
            Ending--;
        }

    }

// Next we must create function to reverse the words

    static char[] StringSwap(char []s)
    {
    int Beginning = 0;//initialize the starting point to 0
    //comense the swapping!!!!
    for (int Ending = 0; Ending < s.length; Ending++)
    {
        if (s[Ending] == ' ')
        {
        
        reverse(s, Beginning, Ending);
        Beginning = Ending + 1;

        }

    }

    // Reverse the last word

    reverse(s, Beginning, s.length - 1);

    // putting the whole string in reverse
    reverse(s, 0, s.length - 1);
    //retruning the string that is flipped
    return s;
    }

//Now that we have both the read and flip functions
//it is time to do driver code to read in the dtring
//go to appropriate functions and display the flipped 
//string that was read in

    public static void main(String[] args)

    {
        //format the printing console output
        String s = "this is my first programming  assignment";
        System.out.print("Original Text is :    "+ s +"\n");
        char []p = StringSwap(s.toCharArray());
        System.out.print("Converted Text is:    ");
        System.out.print(p);
        System.out.print("\n");

    }

}//end of class reverse
