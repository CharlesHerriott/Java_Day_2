package week_two_j_beginner;

public class Calculator {

	//private Records test = new Records(0, 0, 0, "");

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int substraction(int a, int b) {
		return a - b;
	}

	public int division(int a) {
		return (a * 100) / 350;
	}

	public void displayResults(Records test) {
		int total = addition(test.physics, test.biology, test.chemistry);

		System.out.println("Total of " + test.name + " is:" + total);
		System.out.println("Average " + test.name + " is:" + division(total));

		if (test.physics < 50) {
			System.out.println("Smaller than 50");

		} else if (test.physics >= 50 && test.physics < 60) {
			System.out.println("Bigger than 50 but less than 60");

		} else {
			System.out.println("Bigger than 60");

		}

		System.out.println(test.physics);

	}

}
