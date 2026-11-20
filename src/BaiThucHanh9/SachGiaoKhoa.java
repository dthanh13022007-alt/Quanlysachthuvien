package BaiThucHanh9;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang; // "moi" hoac "cu"

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Tinh trang (moi/cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        }
        return soLuong * donGia * 0.5;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + thanhTien());
        System.out.println("------------------");
    }
}
