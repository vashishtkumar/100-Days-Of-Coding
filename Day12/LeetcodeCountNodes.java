package Day12;


leetcode 222 tc=o(n) sc=o(1);
public class LeetcodeCountNodes {
    if(root==null)
    return 0;
    int left=countNodes(root.left);
    int right=countNodes(root.right);
    return left+right+1;
}
