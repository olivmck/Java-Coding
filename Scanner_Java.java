public class ScannerLab {
   
   private java.util.Scanner scan;

	//constructor
	public ScannerLab() {
	scan = new java.util.Scanner(System.in);
}
   
   public void echoStrings() {
      String[] words;
	words = new String[5];
      // declare an array to hold the 5 values
      for(int i = 0; i < 5; i ++) {
         // prompt for the value
         System.out.print("Enter word " + i + ": ");
         // get the input value
         String word = scan.next();
         // echo the input value
         System.out.println("You entered " + word);
         // store the input value into the array
	words[i] = word;
      }
      String line = "";
      // loop through the array and concatenate the values
      // put a space between the words
	for (int i=0; i<words.length; i++) {
	line += words[i] + " ";
}
      System.out.println("The words you entered are: " + line);
   }
   
   public void echoIntsAndTotal() {
      int inputValue;
	int[] numbers = new int[5];
      // declare an array to hold the 5 values
      for(int i = 0; i < 5; i ++) {
         // prompt for the value
         System.out.print("Enter integer value " + i + ": ");
         // get the input value
         inputValue = scan.nextInt();
         // echo the input value
         System.out.println("You entered " + inputValue);
         // store the input value into the array
	numbers[i] = inputValue;
      }
      int total = 0;
	for (int i=0; i<numbers.length; i++) {
	total += numbers[i];
}
      // loop through the array and add the values
      System.out.println("The total of your values is " + total);
   }
   
   public static void main(String[] args) {
      ScannerLab lab;
      lab = new ScannerLab();
      lab.echoStrings();
	//update main to call echoIntsAndTotal
      lab.echoIntsAndTotal();
   }
   
}