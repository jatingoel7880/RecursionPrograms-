//Print N to 1 and 1 to N times using Recursion

import java.util.*;

public class Nto1and1toN {
  public static void main(String[] args) {
    int n = 4;
    printer(n);
  }

  public static void printer(int n) {
    if (n == 0) return;

    System.out.print(n + " ");
    printer(n - 1);
    System.out.print(n + " ");
  }
}
