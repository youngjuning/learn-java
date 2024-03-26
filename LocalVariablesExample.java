public class LocalVariablesExample {
  public static void main(String[] args) {
    int a = 10;
    int b;

    b = 20;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // 如果在使用之前不初始化局部变量，编译器会报错
    // int c;
    // System.out.println("c = " + c);
  }
}
