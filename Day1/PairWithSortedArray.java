
//tc=o(n) sc=o(1);
class Solution {

    int countPair(int k, int arr[]) {
     int lp=0,rp=arr.length-1;
     int cnt=0;
     while(lp < rp){
         if(arr[lp]+arr[rp]==k){
         cnt++;
         lp++;
         rp--;
         }
         else if(arr[lp]+arr[rp] > k){
             rp--;
              }
         else
         lp++;
     }
     return cnt;
     
    }
}
