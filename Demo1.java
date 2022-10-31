import java.util.Scanner;
class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[2][5];

		for (int i=0;i<a.length ;i++)
		{
			for (int j=0; j<a[i].length ; j++)
			{
				System.out.println("Enter the age of Class " + i + "Student "+j);
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("The age's of Student's are");

		for (int i=0;i<a.length ;i++)
		{
			for (int j=0; j<a[i].length ; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
