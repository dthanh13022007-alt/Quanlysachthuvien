package btt3;

import java.util.Scanner;

public class BTT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap thong tin sach (nhu tuan 3)
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        System.out.print("Chon loai sach (1. Giao khoa, 2. Tham khao, 3. Chuyen nganh, 4. Khac): ");
        int loaiSach = sc.nextInt();

        // Bai 1: kiem tra hop le
        if (donGia <= 0) {
            System.out.println("Du lieu khong hop le: don gia phai > 0");
            return;
        }
        if (soLuong < 0) {
            System.out.println("Du lieu khong hop le: so luong phai >= 0");
            return;
        }
        if (namXuatBan < 1900 || namXuatBan > 2026) {
            System.out.println("Du lieu khong hop le: nam xuat ban phai tu 1900 den 2026");
            return;
        }
        System.out.println("\nSach hop le");

        // Hien thi thong tin
        System.out.println("--- THONG TIN SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Tinh tien (tuan 3)
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTien = thanhTien + phiVanChuyen;
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTien);

        // Bai 2: phan loai gia
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        // Bai 3: phan loai ton kho
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        // Bai 4: switch chon loai sach
        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai sach: Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }
    }
}