package BaiThucHanh9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> dsGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> dsThamKhao = new ArrayList<>();

        // Nhap danh sach
        System.out.print("Nhap so sach giao khoa: ");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; i++) {
            System.out.println("--- Sach giao khoa " + (i + 1) + " ---");
            SachGiaoKhoa s = new SachGiaoKhoa();
            s.nhap(sc);
            dsGiaoKhoa.add(s);
        }

        System.out.print("Nhap so sach tham khao: ");
        int n2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n2; i++) {
            System.out.println("--- Sach tham khao " + (i + 1) + " ---");
            SachThamKhao s = new SachThamKhao();
            s.nhap(sc);
            dsThamKhao.add(s);
        }

        // Xuat danh sach
        System.out.println("===== SACH GIAO KHOA =====");
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            s.xuat();
        }
        System.out.println("===== SACH THAM KHAO =====");
        for (SachThamKhao s : dsThamKhao) {
            s.xuat();
        }

        // Tong thanh tien tung loai
        double tongGiaoKhoa = 0;
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            tongGiaoKhoa += s.thanhTien();
        }
        double tongThamKhao = 0;
        for (SachThamKhao s : dsThamKhao) {
            tongThamKhao += s.thanhTien();
        }
        System.out.println("Tong thanh tien sach giao khoa: " + tongGiaoKhoa);
        System.out.println("Tong thanh tien sach tham khao: " + tongThamKhao);

        // Trung binh cong don gia sach tham khao
        if (dsThamKhao.size() > 0) {
            double tongDonGia = 0;
            for (SachThamKhao s : dsThamKhao) {
                tongDonGia += s.getDonGia();
            }
            System.out.println("Trung binh cong don gia sach tham khao: "
                    + tongDonGia / dsThamKhao.size());
        } else {
            System.out.println("Khong co sach tham khao.");
        }

        // Xuat sach giao khoa cua nha xuat ban X
        System.out.print("Nhap nha xuat ban X: ");
        String x = sc.nextLine();
        System.out.println("===== SACH GIAO KHOA CUA NXB " + x + " =====");
        boolean coSach = false;
        for (SachGiaoKhoa s : dsGiaoKhoa) {
            if (s.getNhaXuatBan().equalsIgnoreCase(x)) {
                s.xuat();
                coSach = true;
            }
        }
        if (!coSach) {
            System.out.println("Khong tim thay sach.");
        }
    }
}