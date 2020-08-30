
public class Box<T> {
	private T value;
	
	public void set(T val) {
		this.value = val;
	}
	
	public T get() {
		return this.value;
	}
}
