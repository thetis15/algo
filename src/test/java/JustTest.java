import java.math.BigDecimal;
import java.math.MathContext;
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
  public static void main(String[] args) {

    int n = 10;
    int count = 0;
    int idx = 0;
    boolean goingUp = true;
    int start = 0;
    int end = n;


    /*
    - 문제 : 첫째 줄에 수의 개수 N (1 ≤ N ≤ 100,000), 합을 구해야 하는 횟수 M (1 ≤ M ≤ 100,000)이 주어진다.
    둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
    셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

- 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

* 풀이
다음과 같은 문제에서 처음 입력받은 N개의 숫자에 대하여 미리 구간합 (sum[i+1] = sum[i] + num)을 구함으로 인해
M번의 연산에서 이전에 sum[i] 에 저장되어 있는 0~i번째 수까지의 구간 합을 사용함으로써 문제를 정해진 시간 내에 풀 수 있다.



다음과 같은 문제를 미리 구간합을 구하지 않고 합을 구할 때 마다 반복문 내에서 index까지의 합을 구하여 중첩 반복문을 사용하여 풀 경우
M(연산횟수) 에 따라 전체 시간이 증가하게 되어 시간 복잡도가 O(M*N*N)으로 주어진 시간을 초과하게 된다.
     */

    /*
    수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

출력
총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

제한
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N

예제 입력 1
5 3
5 4 3 2 1
1 3
2 4
5 5

예제 출력 1
12
9
1

     */
  }

  private static void bigDecimnalTest() {
    MathContext mc = new MathContext(10);

    for (int i = 0; i <= 100; i++) {
      try {
        double mathSqrt = Math.sqrt(i);
        BigDecimal bd32 = BigDecimal.valueOf(i).sqrt(MathContext.DECIMAL32);
        BigDecimal bd64 = BigDecimal.valueOf(i).sqrt(MathContext.DECIMAL64);
        BigDecimal bd128 = BigDecimal.valueOf(i).sqrt(MathContext.DECIMAL128);
        BigDecimal bd10 = BigDecimal.valueOf(i).sqrt(mc);


//      System.out.println(mathSqrt);
//      System.out.println(bd32);
//      System.out.println(bd64);
//      System.out.println(bd128);
//      System.out.println(bdUn);
//      System.out.println(bd10);
        System.out.printf("""
            i: %s \tmathSqrt: %s \tbd32: %s \tbd64: %s \tbd128: %s \tbd10: %s
            """,
            i, mathSqrt, bd32, bd64, bd128, bd10);
      } catch (Exception e) {
        System.out.printf("i: %s, msg: %s%n", i, e.getMessage());
      }
    }
  }

  private static int fibonacci(int num, int sum, int prev) {
    if (num <= 2) {
      return sum;
    }
    return fibonacci(num - 1, prev + sum, sum);
  }

  private static void recursiveTest(int i) {
    if (i <= 0) {
      System.out.println(">> recursive ended: " + i);
      return;
    }
    System.out.println("before: " + i);
    recursiveTest(i - 1);
    System.out.println("after: " + i);
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
