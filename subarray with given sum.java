/*
Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
*/




// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?track=amazon-arrays&batchId=192


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int j=0; 
        int sum=0;
        ArrayList<Integer> list=new ArrayList <>();
        if(s==0){
            list.add(-1);
            return list;
        }
        
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum>s && j<n){
                while(sum>s && j<n){
                    sum-=arr[j];  /* Now sum is rightSum */
                    j++;
                }
                
            }
            if(sum==s){
                list.add(j+1);    /* i+1 and j+1 for starting Index from index 1*/
                list.add(i+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}









// ORR



void subarraySum(int arr[], int n, int sum){
    
       /* Initialize curr_sum as value of  
    first element and starting point as 0 */
    int curr_sum = arr[0], start = 0, i; 
  
    /* Add elements one by one to curr_sum and  
    if the curr_sum exceeds the sum, 
    then remove starting element */
    for (i = 1; i <= n; i++) { 
        // If curr_sum exceeds the sum, 
        // then remove the starting elements 
        while (curr_sum > sum && start < i - 1) { 
            curr_sum = curr_sum - arr[start]; 
            start++; 
        } 
  
        // If curr_sum becomes equal to sum
        if (curr_sum == sum) { 
            cout << start+1 << " " << i; 
            return; 
        } 
  
        // Add this element to curr_sum 
        if (i < n) 
            curr_sum = curr_sum + arr[i]; 
    } 
  
    // If we reach here, then there is no subarray 
    cout << "-1"; 
}
