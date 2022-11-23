//package Gudang;

import java.util.Locale;
import java.util.Scanner;

public class PendataanSusuUHT {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        //var
        boolean pengulangan = true;
        int menu;
        String namaDepan = "";
        String namaBelakang = "";
//        String NIM="";
        String uname = "";
        String pw = "";
        String valUname, valPw;

        //daftar susu
//        MenuLogin
        do {
            System.out.println("Menu Login");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.print("Pilihan menu : ");
            menu = in.nextInt();
            if (menu == 2) {
                if (uname.equals("") || pw.equals("")) {
                    System.out.println("Anda belum mendaftar");
                } else {
                    System.out.print("Masukan username: ");
                    valUname = in2.nextLine();
                    System.out.print("Masukan password: ");
                    valPw = in2.nextLine();
                    if (valUname.equals(uname) && valPw.equals(pw)) {
                        System.out.println("Selamat datang " + namaDepan + " " + namaBelakang);
                        pengulangan = false;
                    } else {
                        System.out.println("username dan password salah");
                    }
                }
            } else {
                System.out.print("Nama depan : ");
                namaDepan = in2.nextLine();
                System.out.print("Nama belakang : ");
                namaBelakang = in2.nextLine();
                System.out.print("NIM : ");
                pw = in2.nextLine();
                uname = namaBelakang.toLowerCase(Locale.ROOT);
                System.out.println("username anda adalah " + uname);
                System.out.println("password anda sama dengan NIM anda");

            }
        } while (pengulangan);

        //menuGudang
        int menu2;
        do {
            menuGudang();
            menu2 = in.nextInt();
            switch (menu2) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Input salah!");
            }
        } while (menu2 != 4);
        //

    }

    public static int kirim(int stok, int jmlKirim) {
        return stok;
    }

    public static int restock(int stok, int jmlRestock) {
        return stok;
    }

    //    public static int cekGudang(int stok)
    public static void menuGudang() {
        System.out.println("Menu Gudang");
        System.out.println("1. Kirim Barang");
        System.out.println("2. Restock");
        System.out.println("3. Cek Gudang");
        System.out.println("4. Keluar");
        System.out.print("Pilihan menu:");
    }
}
