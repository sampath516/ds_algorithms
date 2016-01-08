public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] list = { 5, 1, 50, 30, 2, 10, 90 };
//		bubbleSort(list);
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i] + ", ");
//		}
		
		int[] list = { 5, 1, 50, 30, 2, 10, 90 };
		insertionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}

	}

	public static void bubbleSort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			boolean alreadySorted = true;
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					alreadySorted = false;
				}

			}
			if (alreadySorted) {
				break;

			}
		}

	}

	public static void insertionSort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				boolean swap = false;
				if (list[j] < list[j - 1]) {
					int temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
					swap = true;
				}
				if (!swap) {
					break;
				}
			}
		}

	}
}
