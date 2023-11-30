import java.util.Arrays;

public class SROJ_AggressiveCow {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        Arrays.sort(stalls);
    }

//    public static int largestDistance(int[] stalls, int cows) {
//        int lo = stalls[0];
//        int hi = stalls[stalls.length - 1];
//        int ans = 0;
//        while (lo <= hi) {
//            int mid = (lo+hi)/2;
//            if (ispossible(stalls, cows, mid)) {
//
//            }
//        }
//    }

    public static boolean ispossible(int[]stalls, int cows, int mid) {
        int pos = stalls[0];
        int c = 1;
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - pos >= mid) {
                c++;
                pos = stalls[i];
            }
            if (c == cows) return true;
        }
        return false;
    }


}
