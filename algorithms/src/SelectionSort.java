public class SelectionSort {
	public static void Main(Integer[] array) {
		Integer pivot;
		Integer minor;

		for (pivot = 0; pivot < array.length - 1; pivot++) {
			minor = pivot;

			for (int i = minor + 1; i < array.length; i++) {
				if (array[i] < array[minor]) {
					minor = i;
				}
			}
			if (minor != pivot) {
				int t = array[pivot];
				array[pivot] = array[minor];
				array[minor] = t;
			}
		}
	}
}
