public class Akar {
  public int nilai;

  public int akarBF(int n) {
    for (int i = 0; i <= n; i++) {
      if (i * i == n) {
        return i;
      }
    }
    return -1;
  }

  public int akarDC(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int low = 1;
    int high = n;

    while (low <= high) {
      int mid = (low + high) / 2;
      int midAkar = mid * mid;

      if (midAkar == n) {
        return mid;
      } else if (midAkar < n) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return high;
  }

}