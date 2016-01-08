public class Sort {
	public static void main(String[] args) {
		int[] list = {8,2,7,1,3,4, 4};
		selectionSort(list);
		for(int i=0 ; i<list.length; i++){
			System.out.print(list[i]+",");
		}
	}

	public static void selectionSort(int[] list) {
		int size = list.length;
		for (int i = 0; i < size - 1; i++) {
			int smallElementIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (list[j] < list[smallElementIndex]) {
					smallElementIndex = j;
				}
			}
			int temp = list[smallElementIndex];
			list[smallElementIndex] = list[i];
			list[i] = temp;
		}
	}
}
