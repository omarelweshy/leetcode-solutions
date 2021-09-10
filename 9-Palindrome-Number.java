// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x%10==0) return false;
        int reverseNum = 0;
        int getLastNum = 0;
        while (x > reverseNum) {
            getLastNum = x%10;
            x /= 10;
            reverseNum = reverseNum*10 + getLastNum;
        }
        
        if (x == reverseNum || x == reverseNum/10) {
            return true;
        } else {
            return false;
        }
    }
}
