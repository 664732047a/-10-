package 作业二;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.brand = "苹果";
        apple.setSize(25);
        apple.setStatus(true);
        System.out.println(apple);
        apple.call();
        apple.shangwang();
    }
}
