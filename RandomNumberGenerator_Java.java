public class RandomNumber {

	//constants
	private static final long M = 2147483647L;
	private static final long A = 16807L;
	private static final long C = 0L;
	private static long seed = 1L;
	
	//seed
	private static double LCGRandomNumber() {
	seed = (A * seed + C) % M;
	return (double) seed / M;
}

public static void main(String[] args) {
	//using random() method
	System.out.println("Using Random() Method:");
	for (int i = 0; i < 10; i++) {
	double randomValue = Math.random();
	System.out.println("random number: "+ randomValue);
}
	//using linear congruential generator
	System.out.println("Using Linear Congruential Generator:");
	for (int i = 0; i < 10; i++) {
	double randomValue = LCGRandomNumber();
	System.out.println("random number: "+ randomValue);
}
}
}