package JavaProg.javaconvert;

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