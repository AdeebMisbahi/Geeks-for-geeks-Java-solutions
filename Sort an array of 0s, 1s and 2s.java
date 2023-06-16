
class Solution
{
    public static void sort012(int a[], int n){
        int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}


// OR


class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeros=0, ones=0, twos=0;
        for(int i=0; i<n; i++){
            if(a[i]==0){
                zeros++;
            }
            else if(a[i]==1){
                ones++;
            }
            else if(a[i]==2){
                twos++;
            }
        }
        int i=0;
        while(zeros>0){
            a[i]=0;
            i++;
            zeros--;
        }
        while(ones>0){
            a[i]=1;
            i++;
            ones--;
        }
        while(twos>0){
            a[i]=2;
            i++;
            twos--;
        }
    }
}
