package 作业一;

public class HomeworkOne {
    public static void main(String[] args) {
        People p = new People();
        p.name = "张三";
        p.setAge(25);
        p.setHeight(180);
        System.out.println(p);
        p.eat();
        p.run();
    }
}
