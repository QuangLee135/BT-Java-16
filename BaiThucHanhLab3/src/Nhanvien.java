import java.util.Scanner;
public class Nhanvien {
    //khai bao cac thuoc tinh
    public String hoTen;
    public int Tuoi;
    public float heSoLuong;
    public float luong;
    final public float luongCoBan = 1.49f;
    Scanner sc = new Scanner(System.in);
    //khai bao hinh thuc
    public void thongtinNhanVien()
    {
        System.out.print("Nhap ho va ten Nhan Vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi cua Nhan Vien: ");
        Tuoi = sc.nextInt();
        System.out.print("He so luong cua Nhan Vien: ");
        heSoLuong = sc.nextFloat();
    }

    public void tinhluong()
    {
        luong = heSoLuong * luongCoBan;
    }

    public void phuongthuchienthinhanvien()
    {
        System.out.printf("Ho ten Nhan vien: %s, Tuoi: %d, luong: %f ", hoTen, Tuoi, luong );
    }
    
}