//Ethan Coyle
//Dr.Saikit
//CMPS 4143-Jav/python
//lecture 2 notes
//8/30/21

//class name is the same as the file name
public class Lecture2 
{
    public static void main(String[] args) 
    //main class inside of the hello world class
    {
    int[] age = {0, 10,20,30,40,50};
    System.out.println(age.length);
    //loop ends when the i value is length of the list
    for(int i=0; i<age.length; i++)
        {
        System.out.println(i);//prints out the index num
        //System.out.println(age[i]);//prints out contents
        }
    System.out.println();//create a space and then access the contents
    for(int i=0; i<age.length; i++)
        {
        System.out.println(age[i]);//prints out contents
        }
        System.out.println();//create a space and then access the contents
    
    // the below is also anoter way to print out the element values without the
    //repeat of the indexing age[i];
    for(int element: age)
        {
        System.out.println(element);
        }

    int[] numbers= {1,2,3,4,5};
    double avg;
    int sum=0;
    for(int number: numbers)
        {
        sum=sum+number;
        }
    System.out.println(sum);

    avg =(double)sum /(double) numbers.length;
    System.out.println(avg);
    }
}
