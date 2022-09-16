package com.hikaru.Offer;

public class Offer49 {
    public int nthUglyNumber(int n) {
        int ans = 1;
        while(n > 0) {
            int i;
            if(ans % 2 ==0 || ans % 5 == 0 || ans % 3 ==0) {
                for (i = 2; i <= Math.sqrt(ans); i++) {
                    if ((ans % i) == 0 && i != 2 && i != 3 && i != 5) {
                        break;
                    }
                }
                if (i > Math.sqrt(ans)) {
                    n--;
                }
            }
            System.out.println(ans);
            if(n > 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Offer49 offer49 = new Offer49();
        System.out.println(offer49.nthUglyNumber(11));
    }
}
