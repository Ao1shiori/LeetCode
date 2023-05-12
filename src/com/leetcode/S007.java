package com.leetcode;

import org.junit.Test;

/**
 * @author: wxw24633
 * @Time: 2023/5/10  17:36
 */
public class S007 {

    @Test
    public void solution() {
        int x = -123;
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        String xStr = x + "";
        String fs = "";
        if (xStr.substring(0,1).equals("-")){
            fs = "-";
            xStr = xStr.substring(1);
        }

        StringBuilder sb = new StringBuilder(xStr);
        sb.reverse();
        String xStr1 = sb.toString();

        try{
            return Integer.parseInt(fs + xStr1);
        }catch (Exception e){
            return 0;
        }

    }
}
