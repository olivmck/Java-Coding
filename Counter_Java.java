//define class
public class Counter {
	//define count and limit
	private int count;
	private int limit;
//define constructor
public Counter(int initLimit) {
	count = 0;
	limit = initLimit;
}
//return value
public int getCount() {
	return count;
}
//increasing count
public void incrementCount() {
	count = count + 1;
	if (count > limit) {
	resetCount();
	count = count + 1;
}
}
//reset loop goes back to 0
private void resetCount() {
	count = 0;
}
}