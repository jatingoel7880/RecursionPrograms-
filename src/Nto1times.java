
public class Nto1times {
  public static void main(String[] args) {
      int n=4;
      func(n, n);
  }

  public static void func(int i ,int n) {
    if (i<1) return;

    System.out.print(i);
    func(i-1,n);
  }
}