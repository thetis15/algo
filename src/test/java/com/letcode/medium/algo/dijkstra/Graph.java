package com.letcode.medium.algo.dijkstra;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Graph {
  // 노드들의 수
  private int n;
  // 노드들간의 가중치 지정할 변수
  private int maps[][];

  public Graph(int n) {
    this.n = n;
    maps = new int[n + 1][n + 1];
  }

  public void input(int i, int j, int w) {
    maps[i][j] = w;
    maps[j][i] = w;
  }

  public void dijkstra(int v) {
    // 최단 거리를 지정할 변수
    int[] distance = new int[n + 1];
    // 해당 노드를 방문했는지 체크할 변수
    boolean[] check = new boolean[n + 1];

    // distance 값 초기화
    for (int i = 1; i < n + 1; i++) {
      distance[i] = Integer.MAX_VALUE;
    }

    // 시작 노드값 초기화
    distance[v] = 0;
    check[v] = true;

    // 연결노드 distance갱신
    for (int i = 1; i < n + 1; i++) {
      if (!check[i] && maps[v][i] != 0) {
        distance[i] = maps[v][i];
      }
    }

    print(distance, check);


    for (int a = 0; a < n - 1; a++) {
      // 원래는 모든 노드가 true 될땎/ㅏ지 인데
      // 노드가 n개 있을 때 다익스트라ㄴ를 위해서 반복수는 n-1번이면 된다.
      // 원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
      int min = Integer.MAX_VALUE;
      int minIndex = -1;

//      System.out.println("a: " + a);
      // 최소값 찾기
      for (int i = 1; i < n + 1; i++) {
        if (!check[i] && distance[i] != Integer.MAX_VALUE) {
          if (distance[i] < min) {
//            System.out.println(String.format(">> i: %s distance[i]: %s min: %s", i, distance[i], min));
            min = distance[i];
            minIndex = i;
          }
        }
      }

      check[minIndex] = true;

      for (int i = 1; i < n + 1; i++) {
        if (!check[i] && maps[minIndex][i] != 0) {
//          System.out.println(String.format(">> i:%s check[i]:%s maps[minIndex][i]:%s",i, check[i], maps[minIndex][i]));
          if (distance[i] > distance[minIndex] + maps[minIndex][i]) {
//            System.out.println(String.format(">>> i:%s distance[i]:%s maps[minIndex][i]:%s",i, distance[i], maps[minIndex][i]));
            distance[i] = distance[minIndex] + maps[minIndex][i];
          }
        }
      }

      System.out.println("a: " + a);
      print(distance, check);

    }



    // 결과값 출력
    for (int i = 1; i < n + 1; i++) {
      System.out.print(distance[i] + " ");
    }
    System.out.println("");

  }

  private void print(int[] distance, boolean[] check) {
    System.out.println("dis: " + ToStringBuilder.reflectionToString(distance, ToStringStyle.SIMPLE_STYLE));
    System.out.println("map: " + ToStringBuilder.reflectionToString(maps, ToStringStyle.SIMPLE_STYLE));
    System.out.println("chk: " + ToStringBuilder.reflectionToString(check, ToStringStyle.SIMPLE_STYLE));
  }
}
