package JavaProg.javaconvert;

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