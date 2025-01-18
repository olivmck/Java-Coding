import java.util.Scanner;

public class HeightConverter {
	public static void main(String[] args) {
 	
	//declaring variables
	int heightfeet, heightinches, heightcentimeters, heightinchestotal;
	int heightcentimetersfeet, wholeinches, fractioninches;
	double heightinchestocentimeters, heightcentimeterstotalinches; 
	double heightcentimetersinches, heightcentimeterfractioninches;

	//activating scanner
	Scanner s= new Scanner(System.in);

	//entering height in feet and inches
	System.out.println("Please enter the height to be converted.");
	System.out.print("First, enter the feet: ");
	heightfeet = s.nextInt();
	System.out.print("Now, enter the inches: ");
	heightinches = s.nextInt();
	System.out.println();

	//calculations for height from feet and inches
	heightinchestotal = heightfeet * 12 + heightinches;
	heightfeet = heightinchestotal / 12;
	heightinches = heightinchestotal % 12;
	heightinchestocentimeters = heightinchestotal * 2.54;

	//output for height from feet and inches
	System.out.printf("Your height is %d feet %d inches, or %d inches. That is %.2f cm.\n", heightfeet, heightinches, heightinchestotal, heightinchestocentimeters);
	System.out.println();

	//entering height in centimeters
	System.out.println("Please enter a second height to be converted.");
	System.out.print("Enter the height in centimeters: ");
	heightcentimeters = s.nextInt();
	System.out.println();

	//calculations for height from centimeters
	heightcentimeterstotalinches = heightcentimeters / 2.54;
	heightcentimetersfeet = (int) heightcentimeterstotalinches / 12;
	heightcentimetersinches = heightcentimeterstotalinches % 12;
	
	//fraction for inches
	heightcentimeterfractioninches = (heightcentimetersinches * 8) + 0.5;
	wholeinches = (int) heightcentimeterfractioninches / 8;
	fractioninches = (int) heightcentimeterfractioninches % 8;

	//output for height from centimeters
	System.out.printf("Your height is %d cm. That's %.3f inches, or %d feet %d-%d/8 inches.\n", heightcentimeters, heightcentimeterstotalinches, heightcentimetersfeet, wholeinches, fractioninches);
}
}

	