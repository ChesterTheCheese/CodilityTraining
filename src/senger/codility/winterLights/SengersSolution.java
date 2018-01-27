package senger.codility.winterLights;

class SengersSolution extends Solution {

  @Override
  public int solve(String S) {

    int sol = 0;
    for (int i = 0; i < S.length(); i++) {
      for (int j = i + 1; j <= S.length(); j++) {
        String sub = S.substring(i, j);
        if (isValidImpl(sub)) {
          sol++;
        }
        // print("%s %s %s", sub, isValidImpl(sub), sol);
      }
    }

    return sol;
  }

  void print(String s, Object... args) {
    System.out.printf(s + "%n", args);
  }

  boolean isValid(String s, boolean exp) {
    boolean valid = isValidImpl(s);
    print("%5s isValid? %5s %s", valid == exp ? "OK" : "ERROR", valid, s);
    return valid;
  }

  boolean isValidImpl(String s) {
    int len = s.length();
    int[] t = new int[10];
    for (char c : s.toCharArray()) {
      t[parse(c)]++;
    }
    boolean alreadyOdd = false;
    for (int i = 0; i < 10; i++) {
      boolean odd = t[i] % 2 == 1;
      if (alreadyOdd && odd) {
        return false;
      }
      if (odd) {
        alreadyOdd = odd;
      }
    }
    if (len % 2 == 0) {
      return !alreadyOdd;
    }
    return alreadyOdd;
  }

  int parse(char c) {
    switch (c) {
      case '0':
        return 0;
      case '1':
        return 1;
      case '2':
        return 2;
      case '3':
        return 3;
      case '4':
        return 4;
      case '5':
        return 5;
      case '6':
        return 6;
      case '7':
        return 7;
      case '8':
        return 8;
      case '9':
        return 9;
    }
    return 0;
  }
}
