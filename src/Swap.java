public class Swap {
  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
  }
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // 调用 swap 方法
    swap(a, b);

    // 输出 a 和 b 的值
    System.out.println("a = " + a + ", b = " + b);
  }
}
