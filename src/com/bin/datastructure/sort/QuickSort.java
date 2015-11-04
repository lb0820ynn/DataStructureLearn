package com.bin.datastructure.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] data = SortUtil.data;
		quickSort(data);
		SortUtil.printArray(data);
	}

	public static void quickSort(int[] data) {
		quickSort(data, 0, data.length - 1);
	}

	private static void quickSort(int[] data, int left, int right) {
		if (left < right) {
			// 取枢纽元
			int pivot = median3(data, left, right);
			int i = left;
			int j = right - 1;
			for (;;) {
				while (data[i] < pivot) {
					i++;
				}
				while (data[--j] > pivot) {
				}
				if (i < j) {
					SortUtil.swapArrayItem(data, i, j);
				} else {
					break;
				}
			}
			SortUtil.swapArrayItem(data, i, right - 1);

			quickSort(data, left, i - 1);
			quickSort(data, i + 1, right);
		}
	}

	/**
	 * 三数中值分割法(快速排序取枢纽元)
	 * 
	 * @param data
	 *            源数组
	 * @param left
	 *            数组最左侧元素
	 * @param right
	 *            数组最右侧元素
	 */
	public static int median3(int[] data, int left, int right) {
		int center = (left + right) / 2;
		if (data[center] < data[left])
			SortUtil.swapArrayItem(data, left, center);
		if (data[right] < data[left])
			SortUtil.swapArrayItem(data, left, right);
		if (data[right] < data[center])
			SortUtil.swapArrayItem(data, center, right);

		SortUtil.swapArrayItem(data, center, right - 1);
		return data[right - 1];
	}
}
