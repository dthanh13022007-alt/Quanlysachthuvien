package BaiThucHanh9;

import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected int ngay, thang, nam;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public void nhap(Scanner sc) {
        System.out.print("Ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Ngay nhap (ngay): ");
        ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Ngay nhap (thang): ");
        thang = Integer.parseInt(sc.nextLine());
        System.out.print("Ngay nhap (nam): ");
        nam = Integer.parseInt(sc.nextLine());
        System.out.print("Don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public double thanhTien() {
        return soLuong * donGia;
    }

    public void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
}