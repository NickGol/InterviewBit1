package com.company1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int maxArr(ArrayList<Integer> A)
    {
        int val = Integer.MIN_VALUE;
        int max_val = Integer.MIN_VALUE;
        int i1=0, j1=0;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i=0; i<A.size(); i++)
        {
            max1 = Math.max(max1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min1 = Math.min(min1, A.get(i) + i);
            min2 = Math.min(min2, A.get(i) - i);
        }
        max_val = Math.max(max_val, max2 - min2);
        max_val = Math.max(max_val, max1 - min1);
        //System.out.println(max_val);
        return max_val;
    }
    /*int maxVal(ArrayList<Integer> A, int i, int j)
    {
        return Math.abs( A.get(i)-A.get(j) ) + Math.abs(i-j);
    }*/

    public static void main(String[] args)
    {
	System.out.println("12345");
	Solution s = new Solution();
	//ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 0, 4, 4, 6, 0, 9, 6, 5, 1));
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 0, 4, 4, 6, 0, 9, 6, 5, 1));
        //List<Integer> arr = Arrays.asList( -50, -500, 25, -100);
	s.maxArr(arr);
    }
}


/*
* public ArrayList<Integer> plusOne(ArrayList<Integer> A)
    {

        int col = A.size();
        int digit, perenos=1;
        for(col = col-1; col>=0; col--)
        {
            digit = A.get(col)+perenos; perenos = 0;
            if(digit>9) {digit = 0; perenos=1;}
            A.set(col, digit);
        }
        if(perenos==1)
        {
            A.add(0,1);
        }
        col=0;
        while(A.get(0)<1)
        {A.remove(0); col++;}
            System.out.println(A.toString());
        return A;
    }
* */

/*
public int maxSubArray(final List<Integer> A)
    {
        int sum = 0, max_sum = 0;
        for(int i : A)
        {
            if(sum<0)
            {
                if(i>sum) sum = i;
            }
            else sum += i;
            if(sum>max_sum) max_sum = sum;

            //System.out.println(max_sum);
        }
        //System.out.println(max_sum>0?max_sum:sum);
        return max_sum>0?max_sum:sum;
    }
* */

/*
* public int maxArr(ArrayList<Integer> A)
    {
        int val = Integer.MIN_VALUE;;
        int max_val = Integer.MIN_VALUE;
        int i1=0, j1=0;
        for(int i=0; i<A.size(); i++)
        {
            for(int j=0; j<A.size(); j++)
            {
                val = Math.abs( A.get(i)-A.get(j) ) + Math.abs(i-j);
                if( val> max_val) {max_val = val; i1=i; j1=j;}
            }
        }
        //System.out.println(max_val);
        return max_val;
    }
* */