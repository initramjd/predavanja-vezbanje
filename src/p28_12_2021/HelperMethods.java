package p28_12_2021;

public class HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "1", "12", "22", "21", "13", "17", "36" };

		printArray(array);
		
		System.out.println();
		
		printArrayReverse(array);

	}

	public static void printArray(String[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + ", ");

		}

	}

	public static void printArrayReverse(String[] array) {

		for (int i = array.length-1; i >= 0; i--) {

			System.out.print(array[i] + ", ");

		}

	}

}
