# Question 1: 
https://leetcode.com/problems/find-the-town-judge/
# Solution: 
```
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
        int inDegree[]= new int[n+1];
        int outDegree[]= new int[n+1];
        for(int val[]:trust){
             inDegree[val[1]]++;
             outDegree[val[0]]++;
        }
        for(int i=0;i<=n;i++){
            if(inDegree[i]==n-1&&outDegree[i]==0){
                return i;
            }
        }
        return -1;
    }
}
```

# Question 2: 
https://leetcode.com/problems/find-center-of-star-graph/description/
## Solution: 
```
class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        int c=edges[1][0];
        int d=edges[1][1];
        if(a==c||a==d){
            return a;
        }
        if(b==c||b==d){
            return b;
        }
        return -1;
    }
}
```