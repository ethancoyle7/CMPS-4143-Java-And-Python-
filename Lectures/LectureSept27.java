// ethan coyle 
// in class assignment for class on september 27
// this program show the way to read from a directory using java
// and then printing out the content file of the directory

import java.io.File;
public class LectureSept27 
{
    public static void main(String[] args)
    {
     File file= null;
     String[] paths;
     try
     {
         //looking at list at this directory
        file =new File("/Usrs/Ethancoyle/Desktop/");
        paths=file.list();
        for (String path: paths)
        {
            System.out.println(path);
        }
     }
     catch(Exception e)
     {
        e.printStackTrace();
     }
     {
         
     }
    }
}
