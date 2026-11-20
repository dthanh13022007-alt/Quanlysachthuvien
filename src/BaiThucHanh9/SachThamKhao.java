package BaiThucHanh9;

import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + thanhTien());
        System.out.println("------------------");
    }
}
