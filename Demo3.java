import java.util.Scanner;
class Demo3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int [][][] a = new int [2][3][5];

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				for (int k=0; k<a[i][j].length ;k++)
				{
					System.out.println("The age of School "+ i + "Classroom " + j + "Student " + k);
					a[i][j][k]= scan.nextInt();
				}
			}
		}

		System.out.println("The age's of Students are");

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				for (int k=0; k<a[i][j].length ;k++ )
				{
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
