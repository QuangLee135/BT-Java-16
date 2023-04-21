import java.util.Scanner;

public class HinhTron {
    //khai bao thuoc tinh
    public float bk;
    public float cv;
    public float dt;
    final float Pi = 3.14f;
    Scanner sc = new Scanner(System.in);
    //khai bao phuong thuc
    public void tinhbankinh()
    {
        System.out.println("Nhap ban kinh");
        bk = sc.nextFloat();        

    }
    public void tinhchuvi()
    {
        cv = 2 * bk * Pi;
    }
    public void tinhdientich()
    {
        dt = Pi * bk * bk;
    }
    public void phuongthuchienthihinhtron()
    {
        System.out.println("Chu vi hinh tron =" + cv);
        System.out.println("Dien tich hinh tron =" + dt);
    }
}