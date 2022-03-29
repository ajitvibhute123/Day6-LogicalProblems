import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n, sum =0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
			sum = sum + i;
			}
		}
		if(n==sum)
			System.out.println("It is a Perfect Number");
		else 
			System.out.println("It isnot a Perfect Number");
		}
}

