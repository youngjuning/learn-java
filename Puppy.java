/**
 * 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
 */
public class Puppy {
  int puppyAge;

  public Puppy(String name) {
    // 这个构造器仅有一个参数：name
    System.out.println("小狗的名字是：" + name);
  }

  public void setAge(int age) {
    // 这个方法设置小狗的年龄
    puppyAge = age;
  }

  public int getAge() {
    System.out.println("小狗的年龄为 : " + puppyAge);
    // 这个方法返回小狗的年龄
    return puppyAge;
  }

  public static void main(String[] args) {
    // 创建对象
    Puppy myPuppy = new Puppy("tommy");
    // 通过方法来设定 age
    myPuppy.setAge(2);
    // 调用另一个方法获取 age
    myPuppy.getAge();
    // 访问成员变量
    System.out.println("变量值 : " + myPuppy.puppyAge);
  }
}
