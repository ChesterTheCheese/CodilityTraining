package senger.codility.peaks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) {
    Map<int[], Integer> map = new LinkedHashMap<>();

    map.put(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}, 3);
    map.put(new int[] {0, 1, 0, 0, 1, 0, 0, 1, 0}, 3);

    for (Entry<int[], Integer> e : map.entrySet()) {
      int[] ints = e.getKey();
      int expected = e.getValue();
      long start = System.currentTimeMillis();
      int result = Solution.solution(ints);
      long end = System.currentTimeMillis();

      System.out.printf("[Main::main] %-5s %5ss expected %3s  actual %3s %s%n",
          result == expected ? "OK" : "ERROR",
          ((double) end - start) / 1000,
          expected, result, Arrays.toString(ints));
    }

  }

}
