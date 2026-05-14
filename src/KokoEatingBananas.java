public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int H) {
        int left = 1;
        int right = 0;


        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, H, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


    private static boolean canFinish(int[] piles, int H, int K) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + K - 1) / K;
        }
        return hours <= H;
    }


    public static void main(String[] args) {
        // Hardcoded input
        int[] piles = {3, 6, 7, 11};
        int H = 8;

        int result = minEatingSpeed(piles, H);
        System.out.println(result);
    }
}
