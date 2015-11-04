package com.bin.datastructure.sort;

/**
 * 归并排序
 * @author LiuBin
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] data = SortUtil.dataLong;
		mergeSort(data);
		SortUtil.printArray(data);
	}

	public static void mergeSort(int[] data) {
		int[] tmpArray = new int[data.length];
		mergeSort(data, tmpArray, 0, data.length - 1);
	}
	/**
	 * 通过递归进行排序
	 * @param data	源数组
	 * @param tmpArray	临时存放数据的数组
	 * @param left	子数组的左边界
	 * @param right	子数组的右边界
	 */
	private static void mergeSort(int[] data, int[] tmpArray, int left,
			int right) {
		if (left < right) {
			int center = (left + right) / 2;
			//递归的对数组的左半边进行归并排序
			mergeSort(data, tmpArray, left, center);
			//递归的对数组的右半边进行归并排序
			mergeSort(data, tmpArray, center + 1, right);
			//合并两个排过序的子数组
			merge(data, tmpArray, left, center + 1, right);
		}
	}
	
	/**
	 * 合并两个排过序的子数组
	 * @param data 源数组
	 * @param tmpArray	存放数据的临时数组
	 * @param leftPos	子数组的左边起始位置
	 * @param rightPos	子数组的右边起始位置
	 * @param rightEnd	子数组的右边结束位置
	 */
	private static void merge(int[] data, int[] tmpArray, int leftPos,
			int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int num = rightEnd - leftPos + 1;
		//左边数组和右边数组的较小者copy到临时数组的下一个位置，copy过的数组角标前移
		while (leftPos <= leftEnd && rightPos <= rightEnd) {
			if (data[leftPos] < data[rightPos]) {
				tmpArray[tmpPos++] = data[leftPos++];
			} else {
				tmpArray[tmpPos++] = data[rightPos++];
			}
		}
		//左边数组的剩余部分拷贝到临时数组
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = data[leftPos++];
		}
		//右边数组的剩余部分拷贝到临时数组
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = data[rightPos++];
		}
		//临时数组的数据copy回源数组
		for (int i = 0; i < num; i++, rightEnd--) {
			data[rightEnd] = tmpArray[rightEnd];
		}
	}
}
