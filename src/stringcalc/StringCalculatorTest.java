package stringcalc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    
	// "" -> 0
    // "1" -> 1
    // "1, 2" -> 3
    // null -> IllegalArgumentException

	@Test
	public void emptyStringReturnsZero() {
		Calculator c = new Calculator();
		
		int result = c.add("");
		
		assertThat(result, is(0));
	}
	
	@Test
	public void singleNumberReturnsItsValue() {
		Calculator c = new Calculator();
		
		int result = c.add("1");
		
		assertThat(result, is(1));
	}
	
	@Test
	public void multipleNumbersReturnsTheSum() {
		Calculator c = new Calculator();
		
		int result = c.add("1,2");
		
		assertThat(result, is(3));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nullThrows() {
		Calculator c = new Calculator();
		
		c.add(null);

	}
}