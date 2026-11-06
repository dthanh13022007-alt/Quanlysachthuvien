package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class BTT6 {
    static Scanner sc = new Scanner(System.in);

    // Bai 1: mang so luong 5 cuon
    static void bai1() {
        int[] soLuong = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("So luong sach " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }
        int tong = 0, max = soLuong[0];
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];
            if (soLuong[i] > max) max = soLuong[i];
        }
        System.out.println("Tong: " + tong + " | Lon nhat: " + max);
    }

    // Bai 2: ArrayList<String> luu ma sach
    static void bai2() {
        ArrayList<String> dsMa = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n1. Them ma  2. Hien thi  3. Tim  4. Xoa  0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());
            if (chon == 1) {
                System.out.print("Nhap ma: ");
                dsMa.add(sc.nextLine());
            } else if (chon == 2) {
                for (int i = 0; i < dsMa.size(); i++) System.out.println(i + ". " + dsMa.get(i));
            } else if (chon == 3) {
                System.out.print("Ma can tim: ");
                String m = sc.nextLine();
                System.out.println(dsMa.contains(m) ? "Co, vi tri " + dsMa.indexOf(m) : "Khong co");
            } else if (chon == 4) {
                System.out.print("Ma can xoa: ");
                String m = sc.nextLine();
                System.out.println(dsMa.remove(m) ? "Da xoa" : "Khong co ma nay");
            }
        } while (chon != 0);
    }

    // Bai 3 + 4: danh sach sach, moi phan tu = "ma;ten;soLuong;donGia"
    static void bai3va4() {
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    danhSachSach.add(nhapSach());
                    break;
                case 2:
                    for (int i = 0; i < danhSachSach.size(); i++)
                        System.out.println(i + ". " + danhSachSach.get(i));
                    break;
                case 3:
                    System.out.print("Nhap ma can tim: ");
                    int viTri = timTheoMa(danhSachSach, sc.nextLine());
                    System.out.println(viTri >= 0 ? danhSachSach.get(viTri) : "Khong tim thay!");
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    viTri = timTheoMa(danhSachSach, sc.nextLine());
                    if (viTri >= 0) { danhSachSach.remove(viTri); System.out.println("Da xoa"); }
                    else System.out.println("Khong tim thay!");
                    break;
                case 5:
                    System.out.print("Nhap ma can sua: ");
                    viTri = timTheoMa(danhSachSach, sc.nextLine());
                    if (viTri >= 0) {
                        System.out.println("Nhap thong tin moi:");
                        danhSachSach.set(viTri, nhapSach());
                    } else System.out.println("Khong tim thay!");
                    break;
                case 6:
                    int tongSL = 0;
                    for (String s : danhSachSach) tongSL += Integer.parseInt(s.split(";")[2]);
                    System.out.println("Tong so luong: " + tongSL);
                    break;
                case 7:
                    double tongGT = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(";");
                        tongGT += Integer.parseInt(p[2]) * Double.parseDouble(p[3]);
                    }
                    System.out.println("Tong gia tri: " + tongGT);
                    break;
                case 8:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    static String nhapSach() {
        System.out.print("Ma: ");       String ma = sc.nextLine();
        System.out.print("Ten: ");      String ten = sc.nextLine();
        System.out.print("So luong: "); String sl = sc.nextLine();
        System.out.print("Don gia: ");  String dg = sc.nextLine();
        return ma + ";" + ten + ";" + sl + ";" + dg;
    }

    static int timTheoMa(ArrayList<String> ds, String ma) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).split(";")[0].equalsIgnoreCase(ma)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        bai1();
        bai2();
        bai3va4();
    }
}