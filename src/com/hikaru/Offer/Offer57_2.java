package com.hikaru.Offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < target; i++) {
            int count = 0;
            List<Integer> row = new ArrayList<>();
            for (int j = i; j <= target && count < target; j++) {
                row.add(j);
                count += j;
            }
            if (count == target) {
                list.add(row);
            }
        }
        int[][] ans = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<Integer> rowList = list.get(i);
            int[] rowArr = new int[rowList.size()];
            for (int j = 0; j < rowList.size(); j++) {
                rowArr[j] = rowList.get(j);
            }
            ans[i] = rowArr;
        }
        return ans;
    }

    @Test
    public void test() {
        int[][] arr = findContinuousSequence(15);
        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
