// for BufferedReader and InputStreamReader
import java.io.*;

public class Mario {

	private static BufferedReader stdIn = new BufferedReader(new
											InputStreamReader(System.in));

	private int height;

	public void readHeight ()
	{
		boolean invalidInput = true;
		System.out.print("Height: ");
		
		while(invalidInput)
		{
			try
			{
				height = Integer.parseInt(stdIn.readLine());
				if (invalidInput = ( (height < 0) || (height > 23) ))
				{
					System.out.print("Height: ");
				}
			}
			catch (IOException e)
			{
				System.out.println("Not sure how you did that.");
				System.exit(0);
			}
			catch (NumberFormatException e)
			{
				height = -1;
				System.out.print("Retry: ");
			}
		}
	}

	public void printPyramid ()
	{
		for (int row = 1; row <= height; row++)
		{
			for (int space = 0; space < height - row; space++)
			{
				System.out.print(" ");
			}
			for (int octo = 0; octo <= row; octo++)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}

	public static void main (String[] args) throws IOException {

		Mario m = new Mario();
		m.readHeight();
		m.printPyramid();
	}

}
