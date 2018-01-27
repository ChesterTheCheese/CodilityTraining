package senger.codility.countDiscsIntersections;

class Solution {

  public static int solution(int[] A) {

    /*
     * i - disc position x, 0 to 100_000
     * A[i] - disc radius r, 0 to MAX_INT
     * 
     * discs intersect when x1+r1 >= x2-r2
     * 
     * return number of discs intersections if less than 10_000, else -1
     */

    int intersections = 0;

    int len = A.length;
    int[] state = new int[len]; // state[i]=3 -> three discs such that x<i<x+r
    int[] ends = new int[len]; // ends[i]=2 -> there were two discs such that and x+r=i 
    for (int i = 0; i < len; i++) {
      int x = i;
      int r = A[i];
      if (r > len) { // securing integer overflow and increasing performance 
        r = len;
      }

      // counting intersections
      intersections += state[x];
      for (int xi = x - r; xi < x; xi++) {
        if (xi > 0) {
          intersections += ends[xi];
        }
      }

      // marking state
      for (int xi = x; xi <= x + r; xi++) {
        if (xi < len) {
          state[xi]++;
        }
      }

      // marking ends
      if (x + r < len) {
        ends[x + r]++;
      }

    }

    return intersections > 10_000_000 ? -1 : intersections;
  }

  static void printf(String s, Object... args) {
    System.out.printf(s + "%n", args);
  }
}
