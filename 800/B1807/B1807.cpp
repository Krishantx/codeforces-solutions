#include <iostream>

using namespace std;

int main() {
  int t;
  cin >> t;
  while (t-- > 0) {
    int n;
    cin >> n;
    int a[n];
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < n; i++) {
      cin >> a[i];
      if (a[i] % 2 == 0) {
        evenSum += a[i];
      } else {
        oddSum += a[i];
      }
    }
    if (oddSum >= evenSum) {
      cout << "NO" << endl;
    } else {
      cout << "YES" << endl;
    }
  }
  return 0;
}
