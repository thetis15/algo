package com.letcode.medium.algo.dijkstra;

import org.junit.jupiter.api.Test;

public class Dijkstra {
  @Test
  void testCase1() {
    Graph g = new Graph(8);
    g.input(1, 2, 3);
    g.input(1, 5, 4);
    g.input(1, 4, 4);
    g.input(2, 3, 2);
    g.input(3, 4, 1);
    g.input(4, 5, 2);
    g.input(5, 6, 4);
    g.input(4, 7, 6);
    g.input(7, 6, 3);
    g.input(3, 8, 3);
    g.input(6, 8, 2);
    g.dijkstra(1);

  }
}
