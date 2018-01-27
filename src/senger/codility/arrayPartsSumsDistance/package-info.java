/**
 * A non-empty zero-indexed array A consisting of N integers is given. Array A
 * represents numbers on a tape.
 * 
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty
 * parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * 
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
 * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * 
 * In other words, it is the absolute difference between the sum of the first
 * part and the sum of the second part.
 * 
 * For example, consider array A such that:
 * 
 * A[0] = 3 <br/>
 * A[1] = 1 <br/>
 * A[2] = 2 <br/>
 * A[3] = 4 <br/>
 * A[4] = 3 <br/>
 * 
 * We can split this tape in four places:
 * 
 * P = 1, difference = |3 − 10| = 7 <br/>
 * P = 2, difference = |4 − 9| = 5 <br/>
 * P = 3, difference = |6 − 7| = 1 <br/>
 * P = 4, difference = |10 − 3| = 7 <br/>
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty zero-indexed array A of N integers, returns the
 * minimal difference that can be achieved.
 * 
 * For example, given:
 * 
 * A[0] = 3 <br/>
 * A[1] = 1 <br/>
 * A[2] = 2 <br/>
 * A[3] = 4 <br/>
 * A[4] = 3 <br/>
 * the function should return 1, as explained above.
 * 
 * Assume that:
 * 
 * N is an integer within the range [2..100,000]; <br/>
 * each element of array A is an integer within the range [−1,000..1,000]. <br/>
 * 
 * Complexity:
 * 
 * expected worst-case time complexity is O(N); <br/>
 * expected worst-case space complexity is O(N), beyond input storage (not
 * counting the storage required for input arguments).
 */
package senger.codility.arrayPartsSumsDistance;

