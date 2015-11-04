package com.bin.datastructure.sort;

import java.util.ArrayList;
import java.util.List;


/**
 * Ï£¶ûÅÅĞò
 * 
 * @author LiuBin
 * 
 */
public class ShellSort {
	public static void main(String[] args) {
//		int[] data = SortUtil.data;
//		shellSort(data);
//		SortUtil.printArray(data);	
		String str = "576 segword/temp/cibiao/";
		if(str.contains(" ")){
			str = str.substring(0, str.indexOf(" "));
			System.out.println(str);
		}
	}

	public static void shellSort(int[] sortList) {
		int j;
		for (int gap = sortList.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < sortList.length; i++) {
				int tmp = sortList[i];
				for (j = i; j >= gap && tmp < sortList[j - gap]; j -= gap) {
					sortList[j] = sortList[j - gap];
				}
				sortList[j] = tmp;
			}
		}
		
		String[] a = {"hahah","hahah","hahah","hahah"};
		for (String item : a) {
			item = "you are" + item;
		}
	}
}
