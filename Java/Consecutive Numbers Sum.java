Given a positive integer A.

Return the number of ways it can be written as a sum of consecutive positive integers.
  
Input Format
The first and the only argument of input contains an integer, A.



Output Format
Return an integer, representing the answer as described in the problem statement.


  
public class Solution {
    public int solve(int A) {
        int ans=0;
        for(int k=1;k*k<2*A;k++){
            if((A - (k-1)*k/2) % k == 0) ans++;
        }
        return ans;
    }
}
