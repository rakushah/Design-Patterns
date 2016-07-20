package adapterlab;

public interface QueueInterface {
	public void enqueue(String str);
	public String dequeue();
	public boolean isEmpty();
}
