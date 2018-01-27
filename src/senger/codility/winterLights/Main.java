package senger.codility.winterLights;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

abstract class Solution {
  public abstract int solve(String S);
}


public class Main {

  public static void main(String[] args) {

    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("02002", 11);
    map.put("0", 1);
    map.put("00", 3);
    map.put("001", 5);
    map.put("0101", 7);
    map.put("0110", 8);
    map.put("0011", 9);
    map.put(string(100), 0);
    map.put(string(200), 0);
    map.put(string(400), 0);
    map.put(string(800), 0);
    map.put(string(1600), 0);
    map.put(string(3200), 0);

    Solution solution = new KrawczyksSolution();

    for (Entry<String, Integer> e : map.entrySet()) {

      String s = e.getKey();
      Integer expected = e.getValue();

      long start = System.currentTimeMillis();
      Integer actual = solution.solve(s);
      long end = System.currentTimeMillis();

      System.out.printf("[Main::main] %-5s %8ss:%-5s %4s %3s  %s%n",
          expected.equals(actual) ? "OK" : "ERROR",
          (double) (end - start) / 1_000,
          s.length(),
          String.format("(%s)", expected),
          actual,
          s);
    }
  }

  private static String string(int len) {
    String s = "";
    for (int i = 0; i < len; i++) {
      s += "1";
    }
    return s;
  }

}

