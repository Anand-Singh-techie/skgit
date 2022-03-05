package com.Kunal_LeetCode;

public class DigitSumUsing_Recursion {
    public static void main(String[] args) {
       int res = sum(2345);
        System.out.println(res);
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
    //Alternate Way

}
