import java.io.*;

// class that generates the megaplier numbers
public class MegaPlierBall implements Closeable
{
	// drawing a Mega ball from a set of balls numbers 1 through 15
	private static int DrawnBalls = 0;
	private static int[] megaballs = {0};

	public MegaPlierBall()
	{
		DrawnBalls = 0;
		//default value will be det to 0 and then will be
		//filled with 15 balls
		for (int i = 0; i < DefineConstants.MEGAPLIER; i++)
		{
			megaballs[i] = i + 1; //each holds an index value
		}
	} //default constructor

	public final int drawing()
	{
		int SizeofBin = DefineConstants.MEGAPLIER - DrawnBalls; // megaplier will be of whats left
		//of the already plucked balls

		int RandomBallNum = tangible.RandomNumbers.nextNumber() % SizeofBin;
		//random ball will be a random number of the leftover balls

		for (int i = 0; i < DefineConstants.MEGAPLIER; i++)
		{
			// skip over balls no longer in the bin
			if (megaballs[i] == -1)
			{
				continue; // jump back to top then go to next iteration
			}

			// choose the 'RandomBallNum'th ball from the remaining bin
			else if (megaballs[i] != -1 && RandomBallNum == 0)
			{
				// rest the bin
				DrawnBalls++;
				int drawnBall = megaballs[i];
				megaballs[i] = -1;
				return drawnBall;
			}
			else
			{
				// skip over ball not chosen by rand() 'RandomBallNum'
				RandomBallNum--;
			}
		}
	}

	public final void close()
	{
	// class destructor
	}


}

//definition of statics defaults

// class name and declaration methods for regualr balls
public class RegularBall implements Closeable
{
	// balls drawn from 1-50
	private static int DrawnBalls = 0; // numbers is a set number
	private static int[] balls = {0}; // set number array of balls

	//definition of reguar balls
	public RegularBall()
	{
		DrawnBalls = 0;
		// fille with mega balls
		for (int i = 0; i < DefineConstants.REGULARBALLS; i++)
		{
			balls[i] = i + 1; // index i +1 looping through nums
		}
	}

	public final void close()
	{
		// destructor
	}
	public final int drawing()
	{
		int SizeofBin = DefineConstants.REGULARBALLS - DrawnBalls;
		int RandomBallNum = tangible.RandomNumbers.nextNumber() % SizeofBin;
		for (int i = 0; i < DefineConstants.REGULARBALLS; i++)
		{
			// skip balls not in the bin
			if (balls[i] == -1)
			{
				continue;
			}
			// crandom index value balls
			if (balls[i] != -1 && RandomBallNum == 0)
			{
				DrawnBalls++;
				int drawnBall = balls[i];
				balls[i] = -1;
				return drawnBall;
			}
			else
			{
				// skip over ball not chosen by rand() 'RandomBallNum'
				RandomBallNum--;
			}
		}
	}


}
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

package <missing>;

public class GlobalMembers
{
	//access to private and public outside of class
	// definition of the static data members initialized outside of class


	public static void main(String[] args)
	{
		MegaDrawing drawingLotto = new MegaDrawing(); // object of class drawingLotto with obj named drawingLotto
		int numTickets;
		System.out.print("how many tickets would you like?");
		System.out.print("\n");
		numTickets = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		System.out.print("Number of Tickets that you requested were : ");
		System.out.print(numTickets);
		System.out.print("\n\n");


		tangible.RandomNumbers.seed(time(null)); // srand generates new number everytime

		for (int i = 0; i < numTickets; i++) //iterate through each time
		{
			drawingLotto.drawing(i + 1); // calls the drawing function inside of class
		}

		system("pause");
	}
}

final class DefineConstants
{
	public static final int MEGAPLIER = 15; // balls numbered 1-15
	public static final int REGULARBALLS = 70; // there are 70 balls
}

//Helper class added by C++ to Java Converter:

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2021 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to replicate the behavior of the C/C++ functions for 
//	generating random numbers.
//	'rand' converts to the parameterless overload of NextNumber
//	'random' converts to the single-parameter overload of NextNumber
//	'randomize' converts to the parameterless overload of Seed
//	'srand' converts to the single-parameter overload of Seed
//----------------------------------------------------------------------------------------
public final class RandomNumbers
{
	private static java.util.Random r;

	public static int nextNumber()
	{
		if (r == null)
			Seed();

		return r.nextInt();
	}

	public static int nextNumber(int ceiling)
	{
		if (r == null)
			Seed();

		return r.nextInt(ceiling);
	}

	public static void seed()
	{
		r = new java.util.Random();
	}

	public static void seed(int seed)
	{
		r = new java.util.Random(seed);
	}
}

//Helper class added by C++ to Java Converter:

package tangible;

//----------------------------------------------------------------------------------------
//	Copyright © 2006 - 2021 Tangible Software Solutions, Inc.
//	This class can be used by anyone provided that the copyright notice remains intact.
//
//	This class provides the ability to convert basic C++ 'cin' behavior.
//----------------------------------------------------------------------------------------
public final class ConsoleInput
{
	private static boolean goodLastRead = false;
	public static boolean lastReadWasGood()
	{
		return goodLastRead;
	}

	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace)
	{
		String input = "";
		char nextChar;
		while (Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			//accumulate leading white space if skipLeadingWhiteSpace is false:
			if (!skipLeadingWhiteSpace)
			{
				input += nextChar;
			}
		}
		//the first non white space character:
		input += nextChar;

		//accumulate characters until white space is reached:
		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
		}

		goodLastRead = input.length() > 0;
		return input;
	}

	public static String scanfRead()
	{
		return scanfRead(null, -1);
	}

	public static String scanfRead(String unwantedSequence)
	{
		return scanfRead(unwantedSequence, -1);
	}

	public static String scanfRead(String unwantedSequence, int maxFieldLength)
	{
		String input = "";

		char nextChar;
		if (unwantedSequence != null)
		{
			nextChar = '\0';
			for (int charIndex = 0; charIndex < unwantedSequence.length(); charIndex++)
			{
				if (Character.isWhitespace(unwantedSequence.charAt(charIndex)))
				{
					//ignore all subsequent white space:
					while (Character.isWhitespace(nextChar = (char)System.in.read()))
					{
					}
				}
				else
				{
					//ensure each character matches the expected character in the sequence:
					nextChar = (char)System.in.read();
					if (nextChar != unwantedSequence.charAt(charIndex))
						return null;
				}
			}

			input = (new Character(nextChar)).toString();
			if (maxFieldLength == 1)
				return input;
		}

		while (!Character.isWhitespace(nextChar = (char)System.in.read()))
		{
			input += nextChar;
			if (maxFieldLength == input.length())
				return input;
		}

		return input;
	}
}
