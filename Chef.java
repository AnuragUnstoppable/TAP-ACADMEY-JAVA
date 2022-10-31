import java.util.Scanner;
class Chef 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();

		for (int i = 0; i<=T ;i++ )
		{
		if (X<Y)
		{
			System.out.print("FIRST");
		}
		if (X>Y)
		{
			System.out.print("SECOND");
		}

		if (X==Y)
		{
			System.out.print("ANY");
		}
		}
	}
}
