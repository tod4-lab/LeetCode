package com.hikaru.Offer;

public class Offer40 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        int len = arr.length;
        for(int i=len-1;i>len-1-k;i--) {
            for(int j=i-1;j>=0;j--) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = arr[i];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,1};

        int[] ans = getLeastNumbers(arr, 3);

        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
}
