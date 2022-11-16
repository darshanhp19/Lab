package lab5;

import java.util.Scanner;
import java.util.function.IntPredicate;

class Prime extends Thread {
	int arr[];

	public Prime(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		System.out.println("thread1");
		System.out.println("prime numbers ");
		final IntPredicate isPrime = val -> {
			if (val < 2)
				return false;

			for (int i = 2, sqrt = (int) Math.sqrt(val); i <= sqrt; i++)
				if (val % i == 0)
					return false;

			return true;
		};

		for (int val : arr) {
			if (isPrime.test(val))
				System.out.print(val + " ");
			

		}
	}
}

class NotPrime extends Thread {
	int arr[];

	public NotPrime(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		System.out.println("thread2");
		System.out.println("non-prime numbers ");
		final IntPredicate isPrime = val -> {
			if (val < 2)
				return false;

			for (int i = 2, sqrt = (int) Math.sqrt(val); i <= sqrt; i++)
				if (val % i == 0)
					return false;

			return true;
		};

		for (int val : arr) {
			if (!isPrime.test(val)) {
				System.out.print(val + " ");
				
			}
		}
	}
}

public class PrimeAndNonPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length:");
		int arrLen = sc.nextInt();
		int arr[] = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			arr[i] = sc.nextInt();
		}

		Prime th1 = new Prime(arr);
		th1.start();
		try {
			th1.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		NotPrime th2 = new NotPrime(arr);
		th2.start();

	}

}
