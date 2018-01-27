package senger.codility.countDiscsIntersections;

class NaiveSolution {

  public static int solution(int[] A) {

    /*
     * i - disc X position, 0 to 100_000 A[i] - disc radius, 0 to MAX_INT return
     * - number of discs intersections if less than 10_000, else -1
     * 
     * discs intersect when x1+r1 > x2-r2
     */
    int intersections = 0;

    int len = A.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len; j++) {
        int x1 = i;
        int r1 = A[i];

        int x2 = j;
        int r2 = A[j];

        if (x1 + r1 >= x2 - r2) {
          intersections++;
        }
      }
    }

    return intersections > 10_000_000 ? -1 : intersections;
  }
}
