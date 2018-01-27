package senger.codility.arrayPartsSumsDistance;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] A = {3, 1, 2, 4, 3};
    int result = Solution.solution(A);
    int expected = 1;

    System.out.printf("[Main::main] %-5s expected %s  actual %s %s%n", result == expected ? "OK" : "ERROR", expected, result, Arrays.toString(A));
  }

}
