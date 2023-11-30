package Assignments.assignment4;

import java.util.*;

public class SqRoot {

    public static int Square_root(int num) {
        if (num == 1) {
            return 1;
        }
        int res = 0;
        int lo = 0;
        int hi = num / 2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, 2) <= num) {
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Square_root(n);
        System.out.println(ans);
    }
}
