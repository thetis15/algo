package com.letcode.medium.recursion.tco;

public class Factorial {

  public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
    TailCalls<Integer> tc = new TailCalls<>();
    if (number == 1)
      return tc.done(factorial);
    else
      return tc.call(() -> factorialTailRec(factorial * number, number - 1));
  }

}
