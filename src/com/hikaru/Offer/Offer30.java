package com.hikaru.Offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Offer30 {
    public class MinStack {
        private int top;
        private int[] stack;

        public MinStack() {
            top = -1;
            stack = new int[20000];
        }

        public void push(int x) {
            this.stack[++top] = x;
        }

        public void pop() {
            top--;
        }

        public int top() {
            return this.stack[top];
        }

        public int min() {
            int ans = this.stack[0];
            for (int i = this.top; i > 0; i--) {
                if(ans > this.stack[i]) {
                    ans = this.stack[i];
                }
            }
            return ans;
        }
    }
}
