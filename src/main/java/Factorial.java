public class Factorial {

	public static void main(String[] args) {
		int num = 1;
		System.out.println(num + "! : " + factorial(num));

		num = 2;
		System.out.println(num + "! : " + factorial(num));

		num = 5;
		System.out.println(num + "! : " + factorial(num));

	}

	private static long factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
