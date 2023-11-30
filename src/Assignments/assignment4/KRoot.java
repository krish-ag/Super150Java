package Assignments.assignment4;

import java.util.*;
public class KRoot {
    public static long calRoot(long k, long n){
        long ans = 0;
        long lo = 0;
        long hi = n;
        while(lo <= hi){
            long mid = (lo + hi)/2;
            if(Math.pow(mid, k)<= n){
                ans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = calRoot(k, n);
            System.out.println(ans);
        }
    }
}