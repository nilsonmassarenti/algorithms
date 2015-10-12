public class Fibonacci {
	static double[] sequence;

	/**
	 * This method is main to execute the test
	 * the pure and recursive fibonatti
	 * @param args
	 */
	public static void main(String[] args) {
		// length of fibonacci numbers
		Integer n = 6;
		// check if n is valid
		// if invalid put error message
		// else process the number of fibonacci and show
		if (n < 1) {
			System.err.println("Invalid number, put number greater than 0");
		} else {
			// Start a length of sequence with a number of N
			sequence = new double[n + 2];
			// call the pure fibonacci method
			fibonacciPure(n);
			// print the numbers
			for (double d : sequence) {
				System.out.println(d);
			}
			// Start again a length of sequence with a number of N
			// to test the recursive mode
			sequence = new double[n + 2];
			System.out.println(recursiveFibonacci(n+1));
			// print the numbers
			for (double d : sequence) {
				System.out.println(d);
			}
		}
	}
	
	/**
	 * this method will be calculate the sequence of fibonacci using a for
	 * @param n - number of fibonatti
	 */
	static void fibonacciPure(int n) {
		// declare an auxiliaries variables
		// POS1 n-1 and POS2 n-2 of list
		Integer pos1, pos2;
		// check if sequence is greater then 2 to put the start numbers
		// else the length is 1 put 0 in array.
		if (n >= 2) {
			sequence[0] = 0;
			sequence[1] = 1;
		} else {
			sequence[0] = 0;
		}

		// for to generate a numbers of fibonacci
		for (int i = 2; i < n + 2; i++) {
			pos1 = i - 1;
			pos2 = i - 2;
			if (pos1 < 0) {
				pos1 = i;
			}
			if (pos2 < 0) {
				pos2 = 0;
			}
			sequence[i] = sequence[pos1] + sequence[pos2];
		}
	}

	/**
	 * this method will be call the calculateMaxFibonacci 
	 * and recovery the number of sequence
	 * @param n - number of fibonatti
	 * @return all the time the recursive call except to return to main method
	 */
	static Boolean recursiveFibonacci(int n) {
		if (n < 2) {
			if (n == 1) {
				sequence[1] = 1; 
			} else {
				sequence[0] = 0; 
			}
			return true;
		} else {
			sequence[n] = calculateMaxFibonacci(n);
			return recursiveFibonacci(--n);
		}

	}
	
	/**
	 * this method calculate a number of fibonacci over one determinate number
	 * @param n - number of fibonatti
	 * @return all the time the recursive call except to return to main method
	 */
	static Long calculateMaxFibonacci(int n) {
		if (n < 2) {
			return (long) n;
		} else {
			return calculateMaxFibonacci(n - 1) + calculateMaxFibonacci(n - 2);
		}
	}

}
