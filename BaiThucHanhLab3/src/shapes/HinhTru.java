package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru()
    {
        ten = "Hinh Tru";
    }
    public void nhapchieucao()
    {
        nhapbankinh();
        System.out.println("Chieu cao = ");
        try (Scanner sc = new Scanner(System.in)) {
            chieucao = sc.nextFloat();
        }
    }
    public void tinhthetich()
    {
        tinhdientich();
        thetich = dientich * chieucao;
    }
}