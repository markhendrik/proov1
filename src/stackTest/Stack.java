package stackTest;

import java.util.Arrays;

public class Stack {
	
	private int stackSize = 0;
	private Integer[] stack;
	
	public Stack(int maxSize) {
		stack = new Integer[maxSize];
	}
	
	public Stack() {
		stack = new Integer[100];
	}

	public void push(Integer i) {
		stack[stackSize] = i;
		stackSize++;
	}

	public Integer pop() {
		if (stackSize < 1) {
			throw new IllegalStateException();
		}
		
		stackSize--;
		return stack[stackSize];
	}

	public Integer getSize() {
		return stackSize;
	}

	public Integer peek() {
		if (stackSize < 1) {
			throw new IllegalStateException();
		}
		return stack[stackSize - 1];
	}

	@Override
	public String toString() {
		return "Stack [stackSize=" + stackSize + ", stack=" + Arrays.toString(stack) + "]";
	}
	
}
