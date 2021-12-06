package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class L721Test {
  L721 r = new L721();

  /*

Example 1:
Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
Explanation:
The first and second John's are the same person as they have the common email "johnsmith@mail.com".
The third John and Mary are different people as none of their email addresses are used by other accounts.
We could return these lists in any order, for example the answer [['Mary', 'mary@mail.com'], ['John', 'johnnybravo@mail.com'],
['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.
   */
  @Test
  void testCase1() {
    assertThat(r.accountsMerge(Arrays.asList(
        Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
        Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
        Arrays.asList("Mary", "mary@mail.com"),
        Arrays.asList("John", "johnnybravo@mail.com")
    )), is(Arrays.asList(
        Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
        Arrays.asList("Mary", "mary@mail.com"),
        Arrays.asList("John", "johnnybravo@mail.com")
    )));
  }

  /*
Example 2:

Input: accounts = [["Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"],["Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"],["Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"],["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"],["Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"]]
Output: [["Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"],["Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"],["Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"],["Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"],["Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co"]]
 */
  @Test
  void testCase2() {
    assertThat(r.accountsMerge(Arrays.asList(
        Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
        Arrays.asList("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
        Arrays.asList("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
        Arrays.asList("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
        Arrays.asList("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co")
    )), is(Arrays.asList(
        Arrays.asList("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
        Arrays.asList("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
        Arrays.asList("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
        Arrays.asList("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
        Arrays.asList("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co")
    )));
  }

  @Test
  void testCase3() {
    assertThat(r.accountsMerge(Arrays.asList(
        Arrays.asList("Alex","Alex5@m.co","Alex4@m.co","Alex0@m.co"),
        Arrays.asList("Ethan","Ethan3@m.co","Ethan3@m.co","Ethan0@m.co"),
        Arrays.asList("Kevin","Kevin4@m.co","Kevin2@m.co","Kevin2@m.co"),
        Arrays.asList("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe2@m.co"),
        Arrays.asList("Gabe","Gabe3@m.co","Gabe4@m.co","Gabe2@m.co")
    )), is(Arrays.asList(
        Arrays.asList("Alex","Alex0@m.co","Alex4@m.co","Alex5@m.co"),
        Arrays.asList("Ethan","Ethan0@m.co","Ethan3@m.co"),
        Arrays.asList("Gabe","Gabe0@m.co","Gabe2@m.co","Gabe3@m.co","Gabe4@m.co"),
        Arrays.asList("Kevin","Kevin2@m.co","Kevin4@m.co")
    )));
  }

}