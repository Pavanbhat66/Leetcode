// ======================================
// LeetCode Problem: reverse string
// Language: java
// Link: https://leetcode.com/problems/reverse-string/
// Synced by: LinkCode
// Date: 11/19/2026, 10:20:28 PM
// ======================================


class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}