/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.

Note: The extra space is only for the array to be returned.
Try and perform all operations within the provided array. 

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.
Your Task:
Complete the function duplicates() 
which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner.
If no such element is found, return list containing [-1]. 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n)
*/


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
         ArrayList<Integer> l = new ArrayList<Integer>();
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i:arr){
            
            // hmap.put(i, hmap.getOrDefault(i,0)+1);
            
            if(hmap.containsKey(i)){
                hmap.put(i,hmap.get(i)+1);
            }else
                  hmap.put(i, 1);
                
              
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()){
    if(entry.getValue()>1)
    l.add(entry.getKey());
} // iteration of hashmap.
 
        
        if(l.size()==0){
            l.add(-1);
        }
        else Collections.sort(l);
        return l;

    }
}
