package adapterlab;

public class Client {

	public static void main(String[] args){
		System.out.println("==============Stack Operation============");
		StackInterface targetStack = new Adapter();
		targetStack.push("A");
		targetStack.push("B");
		targetStack.push("C");
		
		System.out.println("Pop:" + targetStack.pop());
		System.out.println("Is Empty:" + targetStack.isEmpty());

		targetStack.push("D");
		targetStack.push("E");
		System.out.println("Pop:" + targetStack.pop());
		System.out.println("Pop:" + targetStack.pop());
		System.out.println("Pop:" + targetStack.pop());
		System.out.println("Pop:" + targetStack.pop());
		System.out.println("Is Empty:" + targetStack.isEmpty());

		System.out.println("==============Queue Operation============");
		QueueInterface targetQueue = new Adapter();
		targetQueue.enqueue("A");
		targetQueue.enqueue("B");

		System.out.println("Deque:" + targetQueue.dequeue());
		System.out.println("Is Empty:" + targetQueue.isEmpty());

		targetQueue.enqueue("C");
		targetQueue.enqueue("D");
		targetQueue.enqueue("E");
		System.out.println("Deque:" + targetQueue.dequeue());
		System.out.println("Deque:" + targetQueue.dequeue());
		System.out.println("Deque:" + targetQueue.dequeue());
		System.out.println("Deque:" + targetQueue.dequeue());
		System.out.println("Is Empty:" + targetQueue.isEmpty());
		
	}
}
