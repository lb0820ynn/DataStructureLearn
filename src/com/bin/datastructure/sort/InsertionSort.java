package com.bin.datastructure.sort;

/**
 * ≤Â»Î≈≈–Ú
 * 
 * @author LiuBin
 * 
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = SortUtil.data;
		insertionSort(data);
		SortUtil.printArray(data);
	}

	public static void insertionSort(int[] sortList) {
		int j;
		for (int i = 0; i < sortList.length; i++) {
			int tmp = sortList[i];
			for (j = i; j > 0 && tmp < sortList[j - 1]; j--) {
				sortList[j] = sortList[j - 1];
			}
			sortList[j] = tmp;
		}
	}
}
