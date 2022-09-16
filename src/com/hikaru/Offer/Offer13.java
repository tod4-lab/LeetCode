package com.hikaru.Offer;

import org.junit.Test;

public class Offer13 {
    int ans = 1;

    boolean judgeK(int x, int y, int k) {
        int count = 0;
        while (x > 0) {
            count += x % 10;
            x /= 10;
        }
        while(y > 0) {
            count += y % 10;
            y /= 10;
        }
        return count > k;
    }

    void dfs(int x, int y, boolean[][] mark1, boolean[][] mark2, int k) {
        int next[][] = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int i = 0; i < 4; i++) {
            int newX = x + next[i][0];
            int newY = y + next[i][1];

            if (judgeK(newX, newY, k)
                    || newX < 0 || newX >= mark1.length
                    || newY < 0 || newY >= mark1[0].length ) {
                continue;
            }

            if (!mark1[newX][newY]) {
                if(!mark2[newX][newY]) {
                    mark2[newX][newY] = true;
                    ans++;
                }
                mark1[newX][newY] = true;
                dfs(newX, newY, mark1, mark2, k);
            }
        }
    }

    public int movingCount(int m, int n, int k) {
        boolean[][] mark1 = new boolean[m][n];
        boolean[][] mark2 = new boolean[m][n];

        mark1[0][0] = mark2[0][0] = true;
        dfs(0, 0, mark1, mark2, k);
        return ans;
    }
    @Test
    public void test() {
        System.out.println(movingCount(2, 3, 1));
    }
}
