package com.dyashincollectionfm.list;

import java.util.Stack;

public class FirstStack {

	public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	
	stack.pop();
	System.out.println(stack.search(2));
	System.out.println(stack.peek());
	System.out.println(stack.empty());
	System.out.println(stack);
	
	}

}
