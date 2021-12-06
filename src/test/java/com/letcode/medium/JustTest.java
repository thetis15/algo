package com.letcode.medium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class JustTest {
  public static void main(String[] args) throws Throwable {
    String a = "my text\u205F";

    System.out.println("[" + a.strip() + "]");
    System.out.println("[" + a.stripLeading() + "]");

  }

  private static void debug(String asdf) {
    debug(asdf, 0);
  }

  private static void debug(String asdf, int indent) {
    StringBuilder sb = new StringBuilder();
    sb.append(">".repeat(Math.max(0, indent)));

    if (sb.length() > 0) {
      sb.append(" ");
    }

    System.out.println(sb.toString() + asdf);
  }

  private static void timezoneTest() {
    //    TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
//    Calendar calendar = Calendar.getInstance(seoul);
//    calendar.set(1988, Calendar.MAY , 7, 23, 0);
//    String pattern = "yyyy.MM.dd HH:mm";
//    String theTime = toString(calendar, pattern, seoul);
//    assertThat(theTime).isEqualTo("1988.05.07 23:00");
//
//    calendar.add(Calendar.HOUR_OF_DAY, 1);
//    String after1Hour = toString(calendar, pattern, seoul);
//    assertThat(after1Hour).isEqualTo("1988.05.08 00:00");
    final ZonedDateTime of = ZonedDateTime.of(1988, 05, 07, 23, 00, 0, 0, ZoneId.systemDefault());

    System.out.println(of);
    for (int i = 1; i < 10; i++) {
      System.out.println(of.plusHours(i) + " " + of.withZoneSameInstant(ZoneId.of("UTC")).plusHours(i));
    }
    System.out.println("###########");

    TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
    Calendar calendar = Calendar.getInstance(seoul);
    calendar.set(1988, Calendar.MAY , 7, 23, 0);
    String pattern = "yyyy.MM.dd HH:mmXXX[zzzz]";
    String theTime = toString(calendar, pattern, seoul);
    System.out.println(theTime);

    for (int i = 1; i < 10; i++) {
      calendar.add(Calendar.HOUR_OF_DAY, 1);
      System.out.println(toString(calendar, pattern, seoul));
    }
  }

  private static String toString(Calendar calendar, String pattern, TimeZone zone) {
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    format.setTimeZone(zone);
    return format.format(calendar.getTime());
  }

  private static void mysqlConnectTest()
      throws ClassNotFoundException, SQLException, InterruptedException {
    Class.forName("com.mysql.cj.jdbc.Driver");

    try (Connection connection = DriverManager.getConnection(
            "jdbc:mysql://db-1injs.pub-cdb.ntruss.com:3306/bread", "sauce_admin", "SdzguU8EMUAxw89K")) {

      boolean printLog = true;

      while (true) {
        TimeUnit.SECONDS.sleep(1);
        execQuery(connection, false);
      }
    }
  }

  private static void execQuery(Connection connection, boolean printLog) throws SQLException {
    final UUID uuid = UUID.randomUUID();
    System.out.println("call " + uuid + " at " + ZonedDateTime.now().truncatedTo(ChronoUnit.MILLIS));
    final Statement statement = connection.createStatement();
    final ResultSet resultSet = statement.executeQuery("select 1 as 'asdf' ");

    final ResultSetMetaData metaData = resultSet.getMetaData();
    final int columnCount = metaData.getColumnCount();
    final StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i <= columnCount; i++) {
      stringBuilder.append(metaData.getColumnName(i));
      if (i != columnCount) {
        stringBuilder.append("\t");
      }
    }

    if (printLog) {
      System.out.println(">>> column name");
      System.out.println(stringBuilder.toString());
      System.out.println(">>>>> data");
    }
    while (resultSet.next()) {
      stringBuilder.setLength(0);
      for (int i = 1; i <= columnCount ; i++) {
        stringBuilder.append(resultSet.getString(i));
        if (i != columnCount) {
          stringBuilder.append("\t");
        }
      }
      if (printLog) {
        System.out.println(stringBuilder);
      }
    }
    System.out.println(" fin " + uuid + " at " + ZonedDateTime.now().truncatedTo(ChronoUnit.MILLIS));
    System.out.println("#########################################################################################");
  }

  private static void mapTest() {
    TreeMap<String, Integer> tm = new TreeMap<>();

    tm.put("c", 1);
    tm.put("a", 1);
    tm.put("b", 1);

    System.out.println(tm);

    Map<String, Integer> hm = new HashMap<>();

    hm.put("c", 1);
    hm.put("a", 1);
    hm.put("b", 1);

    System.out.println(hm);
  }

  int binarySearch(int[] a, int x) {
    int low = 0;
    int high = a.length - 1;
    int mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (a[mid] < x) {
        low = mid + 1;
      } else if (a[mid] > x) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1; // 에러
  }

  int binarySearchRecursive(int[] a, int x, int low, int high) {
    if (low > high) {
      return -1; // 에러
    }
    int mid = (low + high) / 2;
    if (a[mid] < x) {
      return binarySearchRecursive(a, x, mid + 1, high);
    } else if (a[mid] > x) {
      return binarySearchRecursive(a, x, low, mid - 1);
    } else {
      return mid;
    }
  }



    private static void loopInLoop() {
    int loopCount = 0;
    int scanCount = 0;
    int n2Count = 0;
    int left = 1;
    int length = 100;
    int right = length;
    boolean isIncrease = true;
    while (left < right) {
      loopCount++;
      System.out.println(
          String.format(">> left:%s right:%s scanCount: %s", left, right, scanCount));
      if (isIncrease) {
        System.out.print(">>>> increment print i:");
        for (int i = left; i <= right; i++) {
          System.out.print(i + ", ");
          scanCount++;
        }
        right--;
        isIncrease = false;
      } else {
        System.out.print(">>>> decrement print i:");
        for (int i = right; i >= left; i--) {
          System.out.print(i + ", ");
          scanCount++;
        }
        left++;
        isIncrease = true;
      }
      System.out.println();
    }

    System.out.println(String.format("loopCount: %s", loopCount));
    System.out.println(String.format("scanCount: %s", scanCount));
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        n2Count++;
      }
    }
    System.out.println(String.format("n^2 count: %s", n2Count));
  }
}
