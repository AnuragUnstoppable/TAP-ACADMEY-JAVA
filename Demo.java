import java.util.Scanner;
class	Demo
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [] a = new int [5];

		for (int i=0;i<a.length ;i++ )
		{
			System.out.println("The age of Student " + i);
			a[i] = scan.nextInt();
		}
			System.out.println("The ages are");
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
