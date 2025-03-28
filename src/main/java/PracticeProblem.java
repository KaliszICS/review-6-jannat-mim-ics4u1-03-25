public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
	}
	public static void q1() {
		int result = sum(5, 3); 
        System.out.println(result);
	}
		public static int sum(int num1, int num2) {
			return num1+num2;
	}

	public static void q2() {
		int result = difference(6,3);
		System.out.println(result);
	}

		public static int difference (int num3, int num4){
		return num3 - num4;

	}

	public static void q3() {
		double result = product (5.9,6.2);
		System.out.println(result);
	}
	public static double product(double num5, double num6){
	return num5 * num6;
	}

	public static void q4() {
		String result = removeFirst("Food");
		System.out.println(result);
	}
	public static String removeFirst(String input) {
		return input.substring(1);
	}

	public static void q5() {
		int length = combinedLength("I'm", "sleepy");
		System.out.println(length);
	}
	public static int combinedLength(String str1, String str2) {
		return str1.length() + str2.length();
	}

	public static void q6() {
		System.out.println(isEven(3));
		System.out.println(isEven(0));
	}
	public static boolean isEven(int num) {
	return num % 2 == 0;
	}

	public static void q7() {
		System.out.println(isOdd(7));
		System.out.println(isOdd(0));
	}
	public static boolean isOdd(int num) {
	return num % 2 != 0;
	}

	public static void q8() {
		System.out.println(isPositive(-15));
		System.out.println(isPositive(10));
	}
	public static boolean isPositive(int num){
	return num > 0;
	}

	public static void q9() {
		System.out.println(isNegative(-15));
		System.out.println(isNegative(10));
		}
		public static boolean isNegative(int num){
		return num < 0;
		}
	}
