public class Loops {
	public static void main(String[] args) {
// stating for loop
System.out.println("Using a for loop:");
ForLoop();
// stating while loop
System.out.println("\nUsing a while loop:");
WhileLoop();
// stating do loop
System.out.println("\nUsing a do loop:");
DoLoop();
}

// using for loop
	public static void ForLoop() {
System.out.print(1);
for (int i = 38; i <= 630; i += 37) {
System.out.print(", " + i);
}
System.out.println(".");
}

// using while loop
	public static void WhileLoop() {
System.out.print(1);
int i = 38;
while (i <= 630) {
System.out.print(", " + i);
i += 37;
}
System.out.println(".");
}

//using do loop
	public static void DoLoop() {
System.out.print(1);
int i = 38;
do {
System.out.print(", " + i);
i += 37;
} while (i <= 630);
System.out.println(".");
}
}