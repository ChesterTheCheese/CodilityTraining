package senger.codility.peaks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {

  public static int solution(int[] A) {
    int len = A.length;

    List<Integer> peaks = new ArrayList<>();
    for (int i = 1; i < len - 1; i++) {
      if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
        peaks.add(i); // 3, 5, 10
      }
    }
    int peakCount = peaks.size();
    printf("Peaks: %s", peaks);

    int max = 0;

    divisionLoop: for (int nrOfDivisions = 1; nrOfDivisions <= peakCount; nrOfDivisions++) {
      if (len % nrOfDivisions != 0) { // cannot be divided into equal groups
        printf("%s divisions: cannot be divided", nrOfDivisions);
        continue;
      }

      int k = len / nrOfDivisions;
      printf("%s divisions, k: %s", nrOfDivisions, k);

      Iterator<Integer> iter = peaks.iterator();

      // check if there is a peak in each group
      groupLoop: for (int groupNr = 0; groupNr < nrOfDivisions; groupNr++) {
        int start = groupNr * k;
        int end = (groupNr + 1) * k - 1;

        printf("\tRange %s:%s", start, end);

        int index = -1;
        while (iter.hasNext() && (index = iter.next()) < start) {}

        if (start <= index && index <= end) {
          printf("\tPeak found: %s. Next group.", index);
          continue groupLoop; // peak found
        }
        // not executed if all peaks are found

        printf("\tPeek missing. Next division.");
        continue divisionLoop; // peak not found in group, check next division
      }

      printf("\tGroup found.");
      max = nrOfDivisions;
    }

    return max;
  }

  static void printf(String s, Object... args) {
    System.out.printf(s + "%n", args);
  }
}
