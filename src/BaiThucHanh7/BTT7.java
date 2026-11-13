package BaiThucHanh7;

import java.util.ArrayList;

class Sach {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("------------------");
    }
}

public class BTT7 {
    public static void main(String[] args) {
        Sach s1 = new Sach();
        s1.maSach = "S01";
        s1.tieuDe = "Lap trinh Java";
        s1.tacGia = "Nguyen Van A";
        s1.namXuatBan = 2020;
        s1.soLuong = 10;
        s1.hienThiThongTin();

        Sach s2 = new Sach();
        s2.maSach = "S02";
        s2.tieuDe = "Cau truc du lieu";
        s2.tacGia = "Tran Van B";
        s2.namXuatBan = 2018;
        s2.soLuong = 5;

        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(s2);

        System.out.println("=== DANH SACH SACH ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }
    }
}