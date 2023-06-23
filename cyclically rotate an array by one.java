/*
Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
  */

class Compute {
    
    public void rotate(int arr[], int n)
    {
          int temp=arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        } 
        arr[0]=temp;
    }
        
    
}





// this is another way

class Compute {
    
    public void rotate(int arr[], int n)
    {
       int rotatedArr[]=new int[n];
       rotatedArr[0]=arr[n-1];
       for(int i=1; i<n; i++){
           rotatedArr[i]=arr[i-1];
       }
       
    //   now store all elements of rotatedArr into Given Arr
       for(int i=0; i<n; i++){
           arr[i]=rotatedArr[i];
       }
       
    }
        
    
}
