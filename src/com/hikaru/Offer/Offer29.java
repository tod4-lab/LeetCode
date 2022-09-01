package com.hikaru.Offer;

import org.junit.Test;

public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }
        boolean[][] mark = new boolean[matrix.length][matrix[0].length];
        int[] ans = new int[matrix.length * matrix[0].length];
        int count = 0;

        int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int i = 0, j = 0;
        mark[i][j] = true;
        ans[count++] = matrix[i][j];
        int k = 0;

        boolean flag = true;
        while (flag) {
            flag = false;

            for (int time = 0; time < 4; time++) {
                int newI = i + next[k][0];
                int newJ = j + next[k][1];

                if (newI >= 0 && newI < matrix.length
                        && newJ >= 0 && newJ < matrix[0].length
                        && !mark[newI][newJ]) {
                    ans[count++] = matrix[newI][newJ];
                    mark[newI][newJ] = true;
                    flag = true;
                    i = newI;
                    j = newJ;
                    break;
                } else {
                    k = (k + 1) % 4;
                }
            }

        }

        return ans;
    }

    @Test
    public void test() {
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] ans = spiralOrder(a);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
