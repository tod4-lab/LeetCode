package com.hikaru.Offer;

import org.junit.Test;

public class Offer59 {
    public class MaxQueue {
        private int[] queue;
        private int front, rear;
        private int[] count;

        public MaxQueue() {
            this.queue = new int[10000];
            this.count = new int[100000 + 1];
            this.rear = this.front = 0;
        }

        public int max_value() {
            for(int i = 100000;i>=0;i--) {
                if(this.count[i] > 0) {
                    return i;
                }
            }
            return -1;
        }

        public void push_back(int value) {
            this.count[value]++;
            this.queue[this.rear++] = value;
        }

        public int pop_front() {
            if(this.rear == this.front) {
                return -1;
            }
            int result = this.queue[front++];
            this.count[result]--;
            return result;
        }
    }

    @Test
    public void test() {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1709);
        maxQueue.push_back(96086);
        maxQueue.pop_front();
        maxQueue.push_back(3375);
        System.out.println(maxQueue.max_value());
    }
}
