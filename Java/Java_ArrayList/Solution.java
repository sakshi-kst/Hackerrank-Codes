/*Hackerrank Java Problem : Java ArrayList 
Problem Statement : 
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format : 
The first line has an integer . In each of the next n lines there will be an integer d denoting number of integers on that line and then there 
will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Constraints :
1 <= n <= 20000
0 <= d <=50000
1 <= q <=1000
1 <= x <=n
Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.

How to solve ?
The idea is to create an array of ArrayList and answer the query in O(1) time.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al[] = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
        {
            int d = sc.nextInt();
            al[i] = new ArrayList<>();
            for(int j = 0; j < d; j++)
            {
                int val = sc.nextInt();
                al[i].add(val);
            }
    
        }
        int query = sc.nextInt();
        for(int i = 0 ; i < query ; i ++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if( x < 1 || x > n)
             System.out.println("ERROR!");
             else if(al[x-1].size() < 1 || al[x-1].size() < y )
             System.out.println("ERROR!");
             else
             System.out.println(al[x-1].get(y-1));
             
        }
    }
}
