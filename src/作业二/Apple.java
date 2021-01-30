package 作业二;

public class Apple {
    String brand;
    private int size;
    private boolean status = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void call(){
        System.out.println("打电话");
    }

    public void shangwang(){
        System.out.println("正在上网");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", status=" + status +
                '}';
    }
}
