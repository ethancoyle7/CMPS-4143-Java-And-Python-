package JavaProg.javaconvert;

import java.io.*;

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