import java.util.Scanner;

public class B2238 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuilder out = new StringBuilder();
    for (int ta = 0; ta < t; ta++) {
      int n = sc.nextInt();
      long sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += Math.pow(Math.floor(n / i), 2);
      }
      out.append(sum).append("\n");
    }
    sc.close();
    System.out.println(out);
  }
}
