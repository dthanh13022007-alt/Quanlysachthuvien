package btt3;

import java.util.Scanner;

public class BTT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap thong tin sach
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

        System.out.println("\n--- THONG TIN SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // thanh tien
        double thanhTien = donGia * soLuong;
        System.out.println("Thanh tien: " + thanhTien);

        // phi van chuyen = 5% gia tri sach
        double phiVanChuyen = thanhTien * 0.05;
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);

        // tong tien nhap
        double tongTien = thanhTien + phiVanChuyen;
        System.out.println("Tong tien nhap: " + tongTien);
    }
}