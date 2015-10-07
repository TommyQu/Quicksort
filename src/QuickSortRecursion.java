
public class QuickSortRecursion {
	
	public int partition(int[] array, int left, int right) {
		int i = left, j = right, pivot = array[(left + right) / 2];
		int flag;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				flag = array[i];
				array[i] = array[j];
				array[j] = flag;
				i++;
				j--;
			}
		}
		return i;
	}
	public void sort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1)
			sort(array, left, index - 1);
		if (index < right)
			sort(array, index, right);
	}
	
}
