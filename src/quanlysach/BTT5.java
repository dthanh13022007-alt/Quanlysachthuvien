package quanlysach;

import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sach n: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] ma = new String[n];
        String[] ten = new String[n];
        int[] soLuong = new int[n];
        double[] donGia = new double[n];

        // Bai 1: nhap n sach bang vong lap
        for (int i = 0; i < n; i++) {
            System.out.println("--- Sach thu " + (i + 1) + " ---");
            System.out.print("Ma sach: ");
            ma[i] = sc.nextLine();
            System.out.print("Ten sach: ");
            ten[i] = sc.nextLine();
            System.out.print("So luong: ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            System.out.print("Don gia: ");
            donGia[i] = Double.parseDouble(sc.nextLine());
        }

        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Tong so luong va tong gia tri");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println(ma[i] + " | " + ten[i] + " | " + soLuong[i] + " | " + donGia[i]);
                    }
                    break;
                case 2: // Bai 2
                    int tongSL = 0;
                    double tongGiaTri = 0;
                    for (int i = 0; i < n; i++) {
                        tongSL += soLuong[i];
                        tongGiaTri += soLuong[i] * donGia[i];
                    }
                    System.out.println("Tong so luong: " + tongSL);
                    System.out.println("Tong gia tri: " + tongGiaTri);
                    break;
                case 3: // Bai 4
                    System.out.print("Nhap ma can tim: ");
                    String maTim = sc.nextLine();
                    boolean thay = false;
                    for (int i = 0; i < n; i++) {
                        if (ma[i].equalsIgnoreCase(maTim)) {
                            System.out.println("Tim thay: " + ten[i] + " | SL: " + soLuong[i] + " | Gia: " + donGia[i]);
                            thay = true;
                            break;
                        }
                    }
                    if (!thay) System.out.println("Khong tim thay!");
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0); // Bai 3: lap den khi chon Thoat
    }
}
