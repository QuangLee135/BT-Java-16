package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong()
    {
        ten = "Hinh vuong ";
    }
    public void nhapcanh()
    {
        System.out.println("Canh = ");
        try (Scanner sc = new Scanner(System.in)) {
            dai = rong = sc.nextFloat();
        }
    }
}