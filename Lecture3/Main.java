//Ethan Coyle
//Dr.Dr. Saikat
//September 1,2021
//spiral array class work


public class Main// same name as the filename
{
    private static void SpiralArray(int[][] grid)
    {
        // our bas case
        if (grid == null || grid.length == 0) 
        {
            return;
        }
        //set up the variable to rea the grid
        //if not will just read straigh across
        int top = 0, bottom = grid.length - 1;
        int left = 0, right = grid[0].length - 1;
 
        while (true)
        {
            if (left > right) 
            {
                break;
            }
 
            // print top
            for (int i = left; i <= right; i++)
             {
                System.out.print(grid[top][i] + " ");
            }
            top++;//increment the thop
 
            if (top > bottom)
             {
                break;
            }
 
            // print right column
            for (int i = top; i <= bottom; i++)
             {
                System.out.print(grid[i][right] + " ");
            }
            right--;
 
            if (left > right) 
            {
                break;
            }
 
            // print csonle out line bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(grid[bottom][i] + " ");
            }
            bottom--;//decrement
 
            if (top > bottom) 
            {
                break;
            }
 
            // print left column
            for (int i = bottom; i >= top; i--) 
            {
                System.out.print(grid[i][left] + " ");
            }
            left++;//increment
        }
    }
 
    public static void main(String[] args)
    {
        //set up what array grid will look like to read from
        int[][] grid =
        {
            { 1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
 
        SpiralArray(grid);//traverse the spiral grid print out handling
    }
}//close program
