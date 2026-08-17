import java.util.Arrays;

class Main {
  public static boolean isPrime(long num, long[] arr, int n) {
    for (int i = 0; i < n; i++) {
      if (num % arr[i] == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 0;
    long i = 2;
    long[] arr = new long[100];
    while (n < 100) {
      if (isPrime(i, arr, n)) {
        arr[n] = i;
        n++;
      }
      i++;
    }
    System.out.println(Arrays.toString(arr));
  }
}
