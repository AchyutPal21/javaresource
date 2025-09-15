package com.prepjava.dsa.recursion;

final class SolvePow {
  public double myPow(double x, int n) {
    if (n == 0) return 1.00;
    if (x == 1.00) return x;

    double ans = 1.00;
    long p = n;
    if (n < 0) p *= -1L;

    while (p > 0) {
      if ((p&1) == 1) {
        ans = ans * x;
        p = p - 1;
      } else {
        x = x * x;
        p = p >> 1;
      }
    }

    if (n < 0) ans = 1.00 / ans;
    return ans;
  }
}
