Q Link : https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        // make sure that we apply binary search on array with smaller length
        // for reducing complexity let's take nums1 as the smaller array
        if(arr2.length<arr1.length) return kthElement(arr2,arr1,m,n,k);
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        /* for case like this, s can't be only '0'
           n1=3, n2=4, k=5
           arr1 = [0 9 20]
           arr2 = [1 2 3 4]
           as, cut at 0th pos in n1 is useless so, we start from cut at 1st pos (5-4) 
        */

        int s=Math.max(0,k-n2);
        
        // for case like : n1=2, n2=8, k=3, e can't only be 'n1'
        // as, last 5 elements in n2 are not are of no use 
        int e = Math.min(n1,k);
        
        while(s<=e){
            int cut1 = (s+e)/2;
            int cut2 = k-cut1;
            
            int l1 = (cut1==0)?(Integer.MIN_VALUE):(arr1[cut1-1]);
            int r1 = (cut1==n1)?(Integer.MAX_VALUE):(arr1[cut1]);
            int l2 = (cut2==0)?(Integer.MIN_VALUE):(arr2[cut2-1]);
            int r2 = (cut2==n2)?(Integer.MAX_VALUE):(arr2[cut2]);
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) e=cut1-1;
            else s=cut1+1;
        }
        
        return 0;
        
    }
}
