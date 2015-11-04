package com.bin.datastructure.sort;

/**
 * �鲢����
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
	 * ͨ���ݹ��������
	 * @param data	Դ����
	 * @param tmpArray	��ʱ������ݵ�����
	 * @param left	���������߽�
	 * @param right	��������ұ߽�
	 */
	private static void mergeSort(int[] data, int[] tmpArray, int left,
			int right) {
		if (left < right) {
			int center = (left + right) / 2;
			//�ݹ�Ķ���������߽��й鲢����
			mergeSort(data, tmpArray, left, center);
			//�ݹ�Ķ�������Ұ�߽��й鲢����
			mergeSort(data, tmpArray, center + 1, right);
			//�ϲ������Ź����������
			merge(data, tmpArray, left, center + 1, right);
		}
	}
	
	/**
	 * �ϲ������Ź����������
	 * @param data Դ����
	 * @param tmpArray	������ݵ���ʱ����
	 * @param leftPos	������������ʼλ��
	 * @param rightPos	��������ұ���ʼλ��
	 * @param rightEnd	��������ұ߽���λ��
	 */
	private static void merge(int[] data, int[] tmpArray, int leftPos,
			int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int num = rightEnd - leftPos + 1;
		//���������ұ�����Ľ�С��copy����ʱ�������һ��λ�ã�copy��������Ǳ�ǰ��
		while (leftPos <= leftEnd && rightPos <= rightEnd) {
			if (data[leftPos] < data[rightPos]) {
				tmpArray[tmpPos++] = data[leftPos++];
			} else {
				tmpArray[tmpPos++] = data[rightPos++];
			}
		}
		//��������ʣ�ಿ�ֿ�������ʱ����
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = data[leftPos++];
		}
		//�ұ������ʣ�ಿ�ֿ�������ʱ����
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = data[rightPos++];
		}
		//��ʱ���������copy��Դ����
		for (int i = 0; i < num; i++, rightEnd--) {
			data[rightEnd] = tmpArray[rightEnd];
		}
	}
}
