package kr.co.programers.l2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class L92335Test {
  L92335 l = new L92335();

  /**
   * 제한사항
   * 1 ≤ n ≤ 1,000,000
   * 3 ≤ k ≤ 10
   *
   * 입출력 예
   * n	    k	result
   * 437674	3	     3
   * 110011	10	     2
   *
   * 입출력 예 설명
   * 예를 들어, 437674을 3진수로 바꾸면 '211' 0 '2' 01010 '11'입니다.
   * 여기서 찾을 수 있는 조건에 맞는 소수는 왼쪽부터 순서대로 211, 2, 11이 있으며, 총 3개입니다.
   * (211, 2, 11을 k진법으로 보았을 때가 아닌, 10진법으로 보았을 때 소수여야 한다는 점에 주의합니다.)
   * 211은 P0 형태에서 찾을 수 있으며, 2는 0P0에서, 11은 0P에서 찾을 수 있습니다.
   *
   * 제한시간 안내
   * 정확성 테스트 : 10초
   *
   */

  @Test
  @Timeout(10)
  void test1() {
    assertEquals(3, l.solution(437674, 3));
  }

  /**
   * 제한사항
   * 1 ≤ n ≤ 1,000,000
   * 3 ≤ k ≤ 10
   *
   * 입출력 예 #2
   * 110011을 10진수로 바꾸면 110011입니다. 여기서 찾을 수 있는 조건에 맞는 소수는 11, 11 2개입니다.
   * 이와 같이, 중복되는 소수를 발견하더라도 모두 따로 세어야 합니다.
   *
   * 제한시간 안내
   * 정확성 테스트 : 10초
   *
   */

  @Test
  @Timeout(10)
  void test2() {
    assertEquals(2, l.solution(110011, 10));
  }

  @Test
  @Timeout(10)
  void test3() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
    assertEquals(0, l.solution(1, 3));
  }

  @Test
  @Timeout(10)
  void test4() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
    assertEquals(0, l.solution(1, 10));
  }

  @Test
  @Timeout(10)
  void test5() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
    assertEquals(2, l.solution(1_000_000, 3));
  }

  @Test
  @Timeout(10)
  void test6() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
    assertEquals(0, l.solution(1_000_000, 10));
  }

  // 모든 경우의수 테스트
  // 시간이 너무 오래 걸려서 사용 하지 않음
  @Test
//  @Disabled("시간이 너무 오래 걸림")
  void test7() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
//    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","100");

    boolean[] checked = new boolean[1_000_000 + 1];

//    IntStream.rangeClosed(1, 1_000_000)
//        .parallel()
//        .forEach(n -> {
//          l.solution(n, 3);
//          checked[n] = true;
//          if (n % 1000 == 0) {
//            int checkedCount = 0;
//            for (boolean b : checked) {
//              if (b) checkedCount += 1;
//            }
//            System.out.println(
//                "[" + Thread.currentThread().getName() + "]" + n + " checkCount: " + checkedCount);
//          }
//        });




    /*
    1_000_000
    digit: [1212210202001], k: 3
digit: [3310021000], k: 4
digit: [224000000], k: 5
digit: [33233344], k: 6
digit: [11333311], k: 7
digit: [3641100], k: 8
digit: [1783661], k: 9
digit: [1000000], k: 10

     */

    System.out.println(Integer.valueOf("1000000", 10));
    System.out.println(Integer.valueOf("1000000", 9));
    System.out.println(Integer.valueOf("1000000", 8));
    System.out.println(Integer.valueOf("1000000", 7));
    System.out.println(Integer.valueOf("1000000", 6));
    System.out.println(Integer.valueOf("1000000", 5));
    System.out.println(Integer.valueOf("1000000", 4));
    System.out.println(Integer.valueOf("1000000", 3));
    System.out.println(Integer.valueOf("1212210202001", 3));
    // 797161
    System.out.println(Integer.valueOf("1111111111111", 3));
    // 531441
    System.out.println(Integer.valueOf("1000000000000", 3));
    System.out.println(Integer.valueOf("0000000000001", 3));

    System.out.println(Integer.valueOf("1783661", 9));
    // 584502 9진수
    System.out.println(Integer.valueOf("1080706", 9));
    System.out.println("###############");

//    IntStream.rangeClosed(3, 10)
//        .parallel()
//        .forEach(k -> {
//          IntStream.rangeClosed(1, 1_000_000)
//              .parallel()
//              .forEach(n -> {
//                l.solution(n, k);
//              });
//
//          System.out.println("[" + Thread.currentThread().getName() + "]" + k);
//        });

  }

  @Test
  void test8() {
    // 1 ≤ n ≤ 1,000,000
    //3 ≤ k ≤ 10
    //     // n=797161, k=3, 변환된 값 = 1111111111111
    //    System.out.println(Integer.valueOf("1111111111111", 3));
    l.solution(797161, 3);
    //    // n=531441, k=3, 변환된 값 = 1000000000000
    l.solution(531441, 3);
    // 584502 9진수, 변환값 1080706
    l.solution(584502, 9);
  }

}