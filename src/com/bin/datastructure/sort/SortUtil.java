package com.bin.datastructure.sort;
/**
 * ���򹤾���
 * @author LiuBin
 *
 */
public class SortUtil {
	public static int[] data = { 34, 8, 64, 51, 32, 7, 15, 20, 65, 77, 19 };
	public static int[] dataLong = {49,38,65,97,76,13,27,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
	
	public static void printArray(Object[] data){
		for (Object object : data) {
			System.out.println(object.toString());
		}
	}
	public static void printArray(int[] data){
		for (Object object : data) {
			System.out.println(object.toString());
		}
	}
	/**
	 * �������������Ԫ��
	 * @param data
	 * @param index1
	 * @param index2
	 */
	public static void swapArrayItem(int[] data, int index1, int index2) {
		if(data == null){
			throw new RuntimeException("����Ϊ��");
		}
		if(index1 <0 || index1 >= data.length){
			throw new RuntimeException("����Ǳ�1�Ƿ�");
		}
		if(index2 <0 || index2 >= data.length){
			throw new RuntimeException("����Ǳ�2�Ƿ�");
		}
		int tmp = data[index1];
		data[index1] = data[index2];
		data[index2] = tmp;
	}
}
