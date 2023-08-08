package datastructures.durga;

public class TestDemo {

	public static void main(String[] args) {
		int result = Demo.addition(2, 3);
		System.out.println("result is " + result);
	}

}

class Demo {

	static int addition(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
}
