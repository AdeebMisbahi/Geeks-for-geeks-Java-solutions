
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        if(n==1){
            return 1;
        }
     long sum=0;
     long leftSum=0;
     for(int i=0; i<n; i++){
         sum+=arr[i];
     }
     for(int i=0; i<n; i++){
         sum-=arr[i];       /* now The sum is right sum for index i*/
         if(leftSum==sum){
             return i+1;
         }
         leftSum+=arr[i];
     }
      return -1;
    }
}
