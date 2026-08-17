#include <iostream>
using namespace std;
string flipBit(string bit) {
  if (bit == "1") {
    return "0";
  } else {
    return "1";
  }
}
int main() {
  int t;
  cin >> t;
  string out = "";
  while (t--) {
    int n, k;
    cin >> n;
    cin >> k;
    bool possible = (k <= n/2);
    if (!possible) {
      out = out.append("-1");
    }
    string bit = "1";
    while (possible && k-- && n--) {
      out = out.append(bit);
    }
    while (n-- && possible) {
      bit = flipBit(bit);
      out = out.append(bit);
    }
    out = out.append("\n");
  }
  cout<<out<<endl;
  return 0;
}
