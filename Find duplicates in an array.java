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
        
          // code here
          if(n==0){
            return new ArrayList<Integer>();
        }
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
               hm.put(arr[i],hm.get(arr[i])+1); 
            }
            else{
                hm.put(arr[i],1);
            }
        }
        
        for(Map.Entry mapElement:hm.entrySet()){
            int key=((int)mapElement.getKey());
            int val=((int)mapElement.getValue());
            if(val>1){
                ans.add(key);
                flag=true;
            }
        }
        if(!flag){
            ans.add(-1);
        }
        
        return ans;
    }
}







// or


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




// or




class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList();
        int[] brr=new int[n];
        
        for(int i=0;i<n;i++) {
            brr[arr[i]]++;
        }
        
        for(int i=0;i<n;i++) {
            if(brr[i]>1) {
                res.add(i);
            }
        }
        if(res.size()==0) {
            res.add(-1);
        }
        return res;
    }
}




// or


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            mx=Math.max(mx,arr[i]);
        }
        int a[]=new int[mx+1];
        for(int ele:arr) a[ele]++;
        for(int i=0;i<=mx;i++) {
            if (a[i]>1) list.add(i);
        }
        if (list.size()==0) list.add(-1);
        return list;
        
    }
}
