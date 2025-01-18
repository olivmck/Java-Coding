//define class
public class Main {
//main method
public static void main(String[] args) {
//set counter
Counter c = new Counter(100);
//print statement with counter value
System.out.println("counter c initial value: " + c.getCount());
//for loop 110 times
for (int i = 0; i < 110; i++) {
c.incrementCount();
}
System.out.println("counter c incremented value: " + c.getCount());
}
}

