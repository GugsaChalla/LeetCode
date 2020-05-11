class Solution {
    public boolean isPerfectSquare(int num) {
        if (num%10 == 2 || num%10 == 3 || num%10 == 7 || num%10 == 8) {
            return false;
        }
        long start = 1, end = num;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == num){return true; } 
            if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1; 
            }
        }
        return false;
    }
}