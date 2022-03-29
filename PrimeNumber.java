import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter the Number");
		n = sc.nextInt();
		
		if(n%2==1)
		{
			System.out.println("It is Prime Number");
		
		}
		else
			System.out.println("It isnot Prime Number");
	}

}
