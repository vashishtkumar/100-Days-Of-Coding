//container with Most water
// Leetcode - 11


//Brute Force   TC=O(n^2)  SC=O(1);

/*class Solve{
    
    long maxArea(int A[], int len){
        
        long area=0;
        int width,height,area1;
    for(int i=0 ; i<len ; i++){
        for(int j=i+1 ;j<len;j++){
            width=j-i;
            height=Math.min(A[i],A[j]);
            area1=width*height;
            if(area1 > area)
            area=area1;
        }
    }
    
    return area;
        
    }
    
}

*/

//optimized solution  by two pointer approach Tc=O(n) Sc=O(1);
class Solve{
    
    public long maxArea(int A[], int len){
        
       int width,height,area=0;
       int lp=0,rp=len-1;

      while(lp < rp){
        width=rp-lp;
        height=Math.min(A[lp],A[rp]);
        area=Math.max(width*height,area);
        if(A[lp] < A[rp])
        lp++;
        else
        rp++;
      }
    return area;
        
    }
    
}