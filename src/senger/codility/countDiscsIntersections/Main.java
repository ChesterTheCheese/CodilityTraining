package senger.codility.countDiscsIntersections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) {
    Map<int[], Integer> map = new LinkedHashMap<>();

    map.put(new int[] {1, 5, 2, 1, 4, 0}, 11);
    map.put(new int[] {2, 0, 0, 0, 2}, 5);
    map.put(new int[] {2, 0, 0, 0, 0, 2}, 4);
    map.put(new int[] {2, 1, 1, 1, 2}, 10);
    map.put(new int[] {3, 1, 1, 1, 2}, 10);
    map.put(new int[] {3, 2, 0, 0, 2, 2}, 13);
    map.put(new int[] {1, 2147483647, 0}, 2);

    for (Entry<int[], Integer> e : map.entrySet()) {
      int[] ints = e.getKey();
      int expected = e.getValue();
      long start = System.currentTimeMillis();
      //      int result = NaiveSolution.solution(ints); // fails for Integer.MAX_VALUE
      int result = Solution.solution(ints);
      long end = System.currentTimeMillis();

      System.out.printf("[Main::main] %-5s %5ss expected %3s  actual %3s %s%n",
          result == expected ? "OK" : "ERROR",
          ((double) end - start) / 1000,
          expected, result, Arrays.toString(ints));
    }

  }

}
