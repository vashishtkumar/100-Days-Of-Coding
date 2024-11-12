
leetcode 455
public class CookieProblem {

    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int gs=g.length;
            int ss=s.length;
            int gi=0;
            int si=0;
    
            Arrays.sort(g);
            Arrays.sort(s);
            int cnt=0;
            while(gi < gs && si < ss){
                if(s[si]>=g[gi]){
                cnt++;
                si++;
                gi++;
                }
                else
                si++;
            }
            return cnt;
        }
    }
    
}

tc=O(nlogn) sc=O(1);
