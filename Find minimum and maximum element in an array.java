/*
iven an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
  */



//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       long min=Integer.MAX_VALUE;
       long max=Integer.MIN_VALUE;
       for(int i=0; i<n; i++){
           if(a[i]<min){
               min=a[i];
           }
           if(a[i]>max){
               max=a[i];
           }
       }
       pair p=new pair(min, max);
       return p;
    }
}
