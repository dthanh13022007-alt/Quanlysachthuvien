package BaiThucHanh7;

import java.time.Year;
import java.util.ArrayList;

public class BTT8 {

    static class Sach {
        private String maSach;
        private String tieuDe;
        private String tacGia;
        private int namXuatBan;
        private int soLuong;

        public Sach() {
        }

        public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
            this.maSach = maSach;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
            setNamXuatBan(namXuatBan);
            setSoLuong(soLuong);
        }

        public String getMaSach() { return maSach; }
        public String getTieuDe() { return tieuDe; }
        public String getTacGia() { return tacGia; }
        public int getNamXuatBan() { return namXuatBan; }
        public int getSoLuong() { return soLuong; }

        public void setMaSach(String maSach) { this.maSach = maSach; }
        public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
        public void setTacGia(String tacGia) { this.tacGia = tacGia; }

        public void setNamXuatBan(int namXuatBan) {
            int currentYear = Year.now().getValue();
            if (namXuatBan > 0 && namXuatBan <= currentYear) {
                this.namXuatBan = namXuatBan;
            } else {
                System.out.println("Nam xuat ban khong hop le: " + namXuatBan);
            }
        }

        public void setSoLuong(int soLuong) {
            if (soLuong >= 0) {
                this.soLuong = soLuong;
            } else {
                System.out.println("So luong khong hop le: " + soLuong);
            }
        }

        public void hienThiThongTin() {
            System.out.println("Ma sach: " + maSach);
            System.out.println("Tieu de: " + tieuDe);
            System.out.println("Tac gia: " + tacGia);
            System.out.println("Nam xuat ban: " + namXuatBan);
            System.out.println("So luong: " + soLuong);
            System.out.println("------------------");
        }
    }

    public static void main(String[] args) {
        Sach s1 = new Sach("S01", "Lap trinh Java", "Nguyen Van A", 2020, 10);
        Sach s2 = new Sach("S02", "Cau truc du lieu", "Tran Van B", 2018, 5);

        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(s2);

        System.out.println("=== DANH SACH SACH ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }

        System.out.println("Tieu de sach 1: " + s1.getTieuDe());
        s1.setSoLuong(20);
        System.out.println("So luong sach 1 sau khi sua: " + s1.getSoLuong());

        s1.setSoLuong(-5);
        s1.setNamXuatBan(3000);
        System.out.println("So luong van la: " + s1.getSoLuong());
        System.out.println("Nam xuat ban van la: " + s1.getNamXuatBan());
    }
}