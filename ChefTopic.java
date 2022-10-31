import java.util.Scanner;
class ChefTopic 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();

		if (A == X || B == X || C == X )
		{
			System.out.print("YES");
		}
		else 
		{
			System.out.print("NO");
		}

	}
}
