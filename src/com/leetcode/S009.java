package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: wxw24633
 * @Time: 2023/5/10  17:19
 */
public class S009 {

    @Test
    public void solution() {
        int x = 0;
        System.out.println(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String xStr = x + "";
        int count = xStr.length()/2;
        for (int i = 0; i < count; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
