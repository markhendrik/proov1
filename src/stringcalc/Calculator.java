package stringcalc;

public class Calculator {

	public int add(String string) {
		
		if ("".equals(string)) {
			return 0;
		}
		if (string == null) {
			throw new IllegalArgumentException();
		}
		
		int sum = 0;
		for (String each : string.split(", ?")) {
			sum += Integer.parseInt(each);
		}
		
		return sum;
	}
	
}