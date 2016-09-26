package stackTest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StackTest {

	/*
	 * @Test(expected = IllegalArgumentException.class) public void
	 * testNameThrows() throws Exception { throw new IllegalArgumentException();
	 * }
	 */
	//new comment
	@Test
	public void newStackHasNoElements() {
		Stack stack = new Stack();
		assertThat(stack.getSize(), is(0));
	}

	@Test
	public void eachPushIncreaseStackSize() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(4);
		assertThat(stack.getSize(), is(2));
	}

	@Test
	public void eachPopDecreaseStackSize() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(41);
		stack.pop();
		stack.pop();
		assertThat(stack.getSize(), is(0));
	}

	@Test
	public void popReturnsPushedElements(){
		Stack stack = new Stack();
		stack.push(5);
		stack.push(2);

		assertThat(stack.pop(), is(2));
		assertThat(stack.pop(), is(5));
	}

	@Test
	public void peekElement() {
		Stack stack = new Stack();
		stack.push(5);
		assertThat(stack.peek(), is(5));
		//
	}

	@Test
	public void peekElementTwoStack() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(6);
		assertThat(stack.peek(), is(6));
		assertThat(stack.getSize(), is(2));
	}

	@Test
	public void peekTwiceElementTwoStack() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(6);
		assertThat(stack.peek(), is(6));
		int peekedelem = stack.peek();
		assertThat(peekedelem, is(6));
	}

	@Test(expected = IllegalStateException.class)
	public void popEmptyStackThows() throws Exception {
		Stack stack = new Stack();
		stack.pop();
	}

	@Test(expected = IllegalStateException.class)
	public void peekEmptyStackThows() throws Exception {
		Stack stack = new Stack();
		stack.peek();
	}
}
