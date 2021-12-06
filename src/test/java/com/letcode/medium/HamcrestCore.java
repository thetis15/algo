package com.letcode.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class HamcrestCore {
  @Test
  void testAnything() {
    assertThat("test", anything());
  }

  @Test
  void testDescribedAs () {
    assertThat("test12", describedAs("for 0%", is("test"), "test12312"));
  }

  @Test
  void testIs() {
    assertThat("test", is("test"));
  }

  @Test
  void testOr() {
    assertThat("test", anyOf(is("test"), is("test2")));
  }

  @Test
  void testOr0() {
    assertThat("test0", anyOf(is("test"), is("test2")));
  }

  @Test
  void testOr1() {
    assertThat("test1", anyOf(is("test"), is("test2")));
  }

  @Test
  void testOr2() {
    assertThat("test2", anyOf(is("test"), is("test2")));
  }
}
