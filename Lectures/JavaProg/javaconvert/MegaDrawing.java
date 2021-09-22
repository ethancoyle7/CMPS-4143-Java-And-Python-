package JavaProg.javaconvert;

import java.io.*;

// class named lottery 
public class MegaDrawing implements Closeable
{
	// acts as a friend to the other classes
	public final int drawing(int DrawingNumbers)

	{
		char answer;
		// auto variables - baskets are reinitialized after every drawing

		MegaPlierBall Mega = new MegaPlierBall(); //calls megapliers class


		RegularBall RegBalls = new RegularBall(); // calls ergularballs class
		//format tge output strings of the randomly generated balls
		// [  # # # # ] then asks for a megaplier
		System.out.print("Ticket #");
		System.out.printf("%4d", DrawingNumbers);
		System.out.printf("%d", " ->        [");
		System.out.printf("%4d", RegBalls.drawing());
		System.out.printf("%d", " ");
		System.out.printf("%4d", RegBalls.drawing());
		System.out.printf("%d", " ");
		System.out.printf("%4d", RegBalls.drawing());
		System.out.printf("%d", " ");
		System.out.printf("%4d", RegBalls.drawing());
		System.out.printf("%d", " ");
		System.out.printf("%4d", RegBalls.drawing());
		System.out.printf("%d", " ]  ");



		//prompt if player wants to do a megaplier
		System.out.printf("%d", "\n\n do you want to megply enter y if so?");
		System.out.printf("%d", "\n");
		answer = ConsoleInput.readToWhiteSpace(true).charAt(0);

		if (answer == 'y')
		{
			System.out.printf("%d", " Your  MEGAPLIER Number is  : ");
			System.out.printf("%-4d", "[ (");
			System.out.printf("%d", Mega.drawing());
			System.out.printf("%d", ") ] \n\n\n");

		}
		else
		{
			System.out.printf("%d", '\n');
		}

		return 0; // end of requests
	}

	public final void close()
	{
		//destructor for class mega
	}
}