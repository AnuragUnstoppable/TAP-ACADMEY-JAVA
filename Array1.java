import java.util.Scanner;

public class Array1 
{
	Static String angryProfessor(int k,int [] a)
	{
		int count = 0;
		
		for (int i = 0;i<=a.length;i++)
		{
			if (a[i] <= 0)
			{
				count++;
			}
		}
		if (count>=k)
		{
			return "NO";
		}
		else
		{
			return "YES";
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int [] a = new int [n];
		for (int i = 0;i<a.length;i++);
		{
			a[i] = scan.nextInt();	
		}
		System.out.println(Array1.angryProfessor(k, a));
	}

}
