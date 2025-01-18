//import package
import java.util.InputMismatchException;

public class RecursionTrace {
	
    public int mystery(int a, int b) {
	//precondition with statement returned if not met
        if (a < 1 || b < 1) { 
	String msg = "Argument must be 1 or greater";
	throw new IllegalArgumentException(msg);
    }
	//first condition
	if (a == 1) {
	return b;
}
	//second condition
	if (a % 2 == 0) {
	return mystery(a / 2, b + b);
} else {
	//last result if previous conditions aren't met
	return mystery(a / 2, b + b) + b;
}
}
	//add while loop
	public int loopingMystery(int a, int b) {
	while (a > 1) {
	if (a % 2 == 0){
	a = a / 2;
	b = b + b;
	} else {
	a = a / 2;
	b = b + b;
	b = b + b;
}
}
return b;
}

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
	//try statement
	try {
        System.out.print("Enter first integer: ");
        int a = scan.nextInt();

	//check for non-positive value and send error message
	if (a < 1) {
	System.err.println("Non-positive input value: " + a);
	return;
}
        System.out.print("Enter second integer: ");
        int b = scan.nextInt();

//check for non-positive value and send error message
	if (b < 1) {
	System.err.println("Non-positive input value: " + b);
}
        int answer = new RecursionTrace().mystery(a, b);
        System.out.println("mystery(" + a + ", " + b + ") is " + answer);
	//second looping mystery
	int answer2 = new RecursionTrace().loopingMystery(a, b);
        System.out.println("loopingMystery(" + a + ", " + b + ") is " + answer);
	
	//catch statement for non-integer values
	} catch (InputMismatchException e) {
	System.err.println("Non-integer input value: " + scan.next());
	} catch (IllegalArgumentException e) {
	System.err.println(e.getMessage());
    }
    
}
}