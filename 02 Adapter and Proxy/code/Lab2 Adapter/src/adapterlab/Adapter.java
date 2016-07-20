package adapterlab;

public class Adapter implements QueueInterface, StackInterface {
	Adaptee adaptee;

	public Adapter() {
		adaptee = new Adaptee();
	}

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public void enqueue(String str) {
		adaptee.add(str);
	}

	@Override
	public String dequeue() {
		String str = adaptee.get(0);
		adaptee.remove(0);
		return str;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

}
