package com.letcode.recursion;

public class Hanoi {
  static long count = 0;
  public static void main(String[] args) {
    printHanoi(63);
  }

  private static void printHanoi(int movingCount) {
    hanoi(movingCount, "A", "C", "B");
  }

  private static void hanoi(int movingCount, String start, String to, String via) {
    if (count % 1000 == 0) {
      System.out.println("count: " + count);
    }
    count += 1;
    if (movingCount == 1) {
      move(1, start, to, ">>>>");
      return;
    }

    hanoi(movingCount -1, start, via, to);
    move(movingCount, start, to, ">>");
    hanoi(movingCount -1, via, to, start);
  }

  private static void move(int n, String start, String to, String decorator) {
    System.out.println(String.format("%s {%s}번 원반을 {%s}에서 {%s}로 이동", decorator, n, start, to));

  }

}
