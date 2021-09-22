package A08;
import FileInputString;
import java.io.FileNotFoundException;
import java.io.IOException;

//Ethan Coyle
//Septmeber 22,2021
//This is the inclass program utilizing the file reading exception 
// the purpose of this program is to read the input of that
public class CharacterCount 
{
    public class CharacterCount
    {
        public static void main(string[] args)throws FileNotFoundException,IOError,
        FileInputStream in;
        try
        {
            in=new FileInputStream("sample.txt:");
            int count;
            while(in.read() !=-1)
            {
                count++;

            }
            
            System.out.println("total Characters are"+ count);
         }
         catch(FileNotoundException e1)
         {
            System.out.println("sample.txt is not found!");
            e1.printStackTrace();
         }
         catch(IOException e2)
         {
             System.out.println("there may be some errors");
             e2.printStackTrace();

         }
         finally
         {
             System.out.println("good bye");
         }
       
}
