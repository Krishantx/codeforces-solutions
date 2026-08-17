#include <iostream>

using namespace std;


// if length is odd return false


int main() {
  int t;
  cin >> t;
  string out = "";
  while (t--) {
    int n;
    cin >> n;
    int a[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      cin >> a[i];
      sum += a[i];
    }
    if (sum % 4 == 0) {
      out = out + "YES\n";
    } else {
      out = out + "NO\n";
    }
  }
  cout << out << endl;
  return 0;
}

