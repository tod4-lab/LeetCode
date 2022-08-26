package com.hikaru.Offer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Offer12 {
    private int[][] next = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    private boolean[][] marked;
    private String word;
    private char[][] board;
    private boolean flag = false;

    private void dfs(int x, int y, int index) {
        if(index >= word.length()-1 || flag) {
            flag = true;
            return ;
        }

        for(int i=0;i<4;i++) {
            int newX = x + next[i][0];
            int newY = y + next[i][1];

            if(newX < 0 || newY < 0 || newX >= marked.length || newY >= marked[0].length) {
                continue;
            }
            if(!marked[newX][newY] && board[newX][newY] == word.charAt(index+1)) {
                marked[newX][newY] = true;
                dfs(newX, newY, index+1);
                marked[newX][newY] = false;
            }
        }
    }
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        for(int i = 0;i < board.length;i++) {
            for(int j = 0;j < board[0].length;j++) {
                marked = new boolean[board.length][board[0].length];
                if(flag) {
                    continue;
                }
                if(board[i][j] == word.charAt(0)) {
                    marked[i][j] = true;
                    dfs(i ,j, 0);
                }
            }
        }
        return this.flag;
    }

    public static void main(String[] args) {
        Offer12 o = new Offer12();
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAB";
        System.out.println(o.exist(board, word));
    }

}
