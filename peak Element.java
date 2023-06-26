/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.
Example 2:

Input:
N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
it's neighbor elements 3 and 2.
If 1 is returned then the generated output will be 1 else 0.
*/


class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
        if(n==1)return 0;
       if(arr[0]>arr[1])return 0;
       if(arr[n-1]>arr[n-2])return n-1;
       
       int result=0;
       for(int i=1;i<n-1;i++){
           
           if(arr[i-1]<arr[i] && arr[i]>=arr[i+1]){
               result=i;
               break;
           }
       }
       return result;
    }
}
