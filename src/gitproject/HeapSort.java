package gitproject;

public class HeapSort {
	public static void heapSort(int[] arr) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heap(arr, n, i);

		// One by one extract elements from heap
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heap(arr, i, 0);
		}
	}

	static void heap(int[] arr, int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heap(arr, n, largest);
		}
	}
}
