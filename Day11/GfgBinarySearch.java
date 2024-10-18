public class GfgBinarySearch {
    class Solution {
        public int binarysearch(int[] arr, int k) {
            int start=0;
            int end=arr.length-1;
            int mid=(start+end)/2;
            while(start <= end){
                if(arr[mid]==k)
                return mid;
                if(k > arr[mid]){
                    start=mid+1;
                }
                else
                end=mid-1;
                mid=(start+end)/2;
            }
            return -1;
        }
    }
}
