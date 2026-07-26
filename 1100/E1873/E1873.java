import java.util.Scanner;

public class E1873 {
  public static long bs(int[] arr, long f, long l, int t) {
    // System.out.println("First = " + f + ", Last = " + l);
    long mid = Math.ceilDiv(f + l, 2);
    long x = helper(arr, mid);
    if (f >= l) {
      return f;
    }
    if (x > t) {
      return bs(arr, f, mid - 1, t);
    } else {
      return bs(arr, mid, l, t);
    }
  }

  public static long helper(int[] arr, long h) {
    long water = 0;
    for (int i = 0; i < arr.length; i++) {
      if (h >= arr[i]) {
        water += h - arr[i];
      }
    }
    return water;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuilder out = new StringBuilder("");
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] arr = new int[n];
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        min = Math.min(min, arr[i]);
      }
      out.append(bs(arr, min, min + x, x)).append("\n");
    }
    sc.close();
    System.out.println(out);
    return;
  }
}
