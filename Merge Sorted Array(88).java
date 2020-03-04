class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int []first= new int[m];
            for(int p=0;p<m;p++){
                first[p]=nums1[p];
            }
      int j=0;
      int i=0;
      int k=0;
    while(i<m && j<n){
        if(first[i]<nums2[j]){
            nums1[k]=first[i];
            i++;
        }
        else{
            nums1[k]=nums2[j];
            j++;
        }
        k++;
    }
        while(i<m){
            nums1[k]=first[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
        
        }
    }
    
