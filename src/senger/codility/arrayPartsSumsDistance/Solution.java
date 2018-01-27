package senger.codility.arrayPartsSumsDistance;

class Solution {
  public static int solution(int[] A) {

    int len = A.length;

    // initial state
    int lSum = A[0];
    int rSum = calcSum(A) - A[0];
    int min = Math.abs(rSum - lSum);

    for (int i = 1; i < len; i++) {
      int el = A[i];

      int diff = Math.abs(lSum - rSum); // calc diff
      min = diff < min ? diff : min; // check minimum diff value

      // debug
      String s = "";
      for (int j = 0; j < len; j++) {
        if (i == j)
          s += "[" + A[j] + "]";
        else
          s += " " + A[j] + " ";
      }
      printf("%s : \t|%s - %2s| \t=%3s ", s, lSum, rSum, diff);

      // correct sums
      lSum += el;
      rSum -= el;
    }


    return min;
  }

  private static int calcSum(int[] A) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
    }
    return sum;
  }

  static void printf(String s, Object... args) {
    System.out.printf(s + "%n", args);
  }
}
