import java.util.Scanner;
class Cred 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();

		if (X >= 750)
		{
			System.out.print("YES");
		}
		else 
		{
			System.out.print("NO");
		}
	}
}
