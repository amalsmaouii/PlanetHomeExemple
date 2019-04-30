package ph.smoke;

public class Program {

	public void main(String[] args) {
		System.out.println("Hello word!!!");
	}

	public static String createMessage() {
		return ("Hello World");
	}

	public static int getAge() {
		return 18;
	}

	public String concat(String s1, String s2) {
		return s1 + s2;
	}

	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}

