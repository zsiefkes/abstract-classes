
public class EntryPoint {

	private static void update(Box<String> box) {
		box.set("goodbye");
	}
	
	public static void printContainer(Container<String> c) {
		System.out.println(c.get());
	}
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<String>();
		Box<Integer> intBox = new Box<Integer>();
		stringBox.set("hello");
		intBox.set(99);
		intBox.set(11111);
		update(stringBox);
		System.out.println(stringBox.get() + intBox.get());
		Container<String> c = stringBox;
		printContainer(c);
		c = new StringContainer();
		printContainer(c);
	}

}
