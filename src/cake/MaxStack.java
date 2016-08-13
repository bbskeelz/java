//package cake;
//
//import java.util.LinkedList;
//
///*
// * getMax() always returns the max integer that is the stack.
// */
//public class MaxStack {
//
//	LinkedList<Integer> stack1;
//	LinkedList<Integer> stack2;
//	
//	public void push(Integer i){
//		if (i > stack2.peek())
//			stack2.push(i);
//	}
//	
//	public Integer pop(){		
//		Integer ret = stack1.pop();
//		if (ret == max){
//			stack2.pop();
//			if (stack2.isEmpty() && !stack1.isEmpty()){
//				
//			}
//			
//	}
//	
//	public Integer getMax(){
//		return max; 
//	}
//	
//	public static void main(String[] args) {
//		
//		MaxStack maxStack = new MaxStack();
//		maxStack.push(1);
//		maxStack.push(2);
//		System.out.println(maxStack.getMax());
//		maxStack.push(5);
//		System.out.println(maxStack.getMax());
//		maxStack.pop();
//		System.out.println(maxStack.getMax());
//	}
//
//}
