You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
  
  
Input Format
The first argument given is the integer array, A.



Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.
  
  
  
public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int even = Integer.MIN_VALUE;
        int odd = Integer.MAX_VALUE;
        for(int i : A){
            if(i%2==0)
            even = Math.max(even,i);
            else
            odd = Math.min(odd,i);
        }
        return even-odd;
    }
}
