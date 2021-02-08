import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for (int i=a;i<=b;i++) {
			System.out.println(countPrimeFactor(i));
		}
		
	}

	private static int countPrimeFactor(int num) {
		// TODO Auto-generated method stub
		int count=0;
		
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {
				if (isPrime(i)) {
					count++;
				} 
				int anotherFactor=num/i;
				if (anotherFactor>i && isPrime(anotherFactor) ) {
					count++;
				}
			} 
		}
		
		return count;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) return false;
		}
		return true;
	}

}
