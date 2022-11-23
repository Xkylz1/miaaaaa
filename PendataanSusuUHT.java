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
        int stokIndomilk=10;
        int stokUltramilk=11;
        int milo;
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
                case 1://error
                    namaBrand();
                    int id;
                    System.out.print("Pilihan barang: ");
                    id=in.nextInt();
                    System.out.print("Masukan jumlah barang yang ingin dikirim : ");
                    int jmlKirim=in.nextInt();
                    String namaBarang=id(id);
                    kirim(namaBarang,);

//                    System.out.print("Tulis nama barang yang ingin dikirim : ");
//                    String namaBarang=in2.nextLine().toLowerCase();
//                    int idBarang;

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

    public static int kirim(String brand, int stok, int jmlKirim) {
        System.out.println("Anda mengirim "+brand+" sebanyak "+jmlKirim);
        return stok - jmlKirim;
    }

    public static int restock(String brand, int stok, int jmlRestock) {
        System.out.println(brand+" telah di-restock sebanyak "+jmlRestock);
        return stok+jmlRestock;
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
    public static void namaBrand(){
        System.out.println("1. Indomilk");
        System.out.println("2. Ultra Milk");
        System.out.println("3. Milo");
        System.out.println("4. Frisian Flag");
        System.out.println("5. HiLo Teen");
        System.out.println("6. Cimmory Freshmilk");

    }

    public static String id(int idBarang){
        String id="";
        switch (idBarang){
            case 1:
                id = "Indomilk";
                break;
            case 2:
                id = "Ultra Milk";
                break;
            case 3:
                id = "Milo";
                break;
            case 4:
                id = "Frissian Flag";
                break;
            case 5:
                id = "HiLo Teen";
                break;
            case 6:
                id = "Cimmory Freshmilk";
                break;
            default:

        }
        return id;
    }
}
