package cake;

import java.util.LinkedList;

public class Queue<T> {
//this queue will use two stacks
	LinkedList<T> stack1;
	LinkedList<T> stack2;
	
	public Queue(){
		stack1 = new LinkedList<>();
		stack2 = new LinkedList<>();
		
	}
	
	public T dequeue(){
		if (!stack2.isEmpty()){
			return stack2.pop();
		}
		while (stack1.peek() != null){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	
	public void enqueue(T t){
		stack1.push(t);
	}
	
	public static void main(String[] args){
		Queue<String> queue = new Queue<>();
		
		queue.enqueue("s");
		queue.enqueue("e");
		queue.enqueue("a");
		queue.enqueue("n");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
	
}
