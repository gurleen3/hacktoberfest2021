You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
  
  
  
public class Solution {
    public int solve(int[] A) {
        int count =0;
        Arrays.sort(A);
        int max = A[A.length-1], min = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>min && A[i]<max){
                count++;
            }
        }
        return count;
    }
}
