package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bankinh;
    public HinhTron()
    {
        ten = " Hinh tron";
    }
    public void nhapbankinh()
    {
        System.out.println("Ban kinh = ");
        try (Scanner sc = new Scanner(System.in)) {
            bankinh = sc.nextFloat();
        }
    }
    public void tinhchuvi()
    {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich()
    {
        dientich = PI * bankinh * bankinh;
    }
}