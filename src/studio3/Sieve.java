package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Choose n");
		int n = in.nextInt();
		
		boolean [] primes = new boolean [n+1];
		System.out.println("n: " + n);
		for (int i = 2; i <= n; i++)
		{
			for (int x = 2 * i; x <= n; x += i)
			{
				primes [x] = true;
			}
		}
		for (int i = 2; i < primes.length; i++)
		{
			if (primes[i] != true)
			{
				System.out.print(i + " ");
			}
			
		}
	}

}
