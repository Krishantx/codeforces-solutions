
// Brr Brr Patapim
import java.util.Arrays;
import java.util.Scanner;

public class C2094 {
  public static StringBuilder arrToString(int[] p) {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < p.length; i++) {
      str.append(p[i]).append(" ");
    }
    return str;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuilder out = new StringBuilder();
    for (int nt = 0; nt < t; nt++) {
      int n = sc.nextInt();
      int[] p = new int[2 * n];
      Arrays.fill(p, 0);
      int sum = ((2 * n + 1) * (n));
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int x = sc.nextInt();
          if (p[i + j + 1] != x) {
            sum = sum - x;
            p[i + j + 1] = x;
          }
        }
      }
      p[0] = sum;
      out.append(arrToString(p)).append("\n");
    }
    System.out.println(out);
    sc.close();
  }
}
