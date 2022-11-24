//package Gudang;

import java.util.Locale;
import java.util.Scanner;

public class PendataanSusuUHT {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
//konstanta
        final String invalidInput="Maaf, input yang anda masukan salah!";
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
        int stokIndomilk = 10;
        int stokUltramilk = 10;
        int stokMilo=10;
        int stokFrissianFlag=10;
        int stokHiLoTeen=10;
        int stokCimmoryFreshmilk=10;
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
                    id = in.nextInt();
                    System.out.print("Masukan jumlah barang yang ingin dikirim : ");
                    int jmlKirim = in.nextInt();

                    switch (id) {
                        case 1:
                            stokIndomilk = kirim("Indomilk", stokIndomilk, jmlKirim);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokIndomilk);
                            break;
                        case 2:
                            stokUltramilk = kirim("Ultramilk", stokUltramilk, jmlKirim);
                            System.out.println("Sisa stok Ultramilk sekarang adalah " + stokUltramilk);
                            break;
                        case 3:
                            stokMilo = kirim("Milo", stokMilo, jmlKirim);
                            System.out.println("Sisa stok Milo sekarang adalah " + stokMilo);
                            break;
                        case 4:
                            stokFrissianFlag = kirim("Frissianflag", stokFrissianFlag, jmlKirim);
                            System.out.println("Sisa stok Frissianflag sekarang adalah " + stokFrissianFlag);
                            break;
                        case 5:
                            stokHiLoTeen = kirim("HiLoTeen", stokHiLoTeen, jmlKirim);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokHiLoTeen);
                            break;
                        case 6:
                            stokCimmoryFreshmilk = kirim("Cimmory Freshmilk", stokCimmoryFreshmilk, jmlKirim);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokCimmoryFreshmilk);
                            break;
                        default:
                            System.out.println(invalidInput);
                    }

//                    String namaBarang=id(id);
//                    kirim(namaBarang,);

//                    System.out.print("Tulis nama barang yang ingin dikirim : ");
//                    String namaBarang=in2.nextLine().toLowerCase();
//                    int idBarang;


                    break;
                case 2:
                    namaBrand();
//                    int id;
                    System.out.print("Pilihan barang: ");
                    id = in.nextInt();
                    System.out.print("Masukan jumlah barang yang ingin dikirim : ");
                    int jmlRestock = in.nextInt();

                    switch (id) {
                        case 1:
                            stokIndomilk = restock("Indomilk", stokIndomilk, jmlRestock);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokIndomilk);
                            break;
                        case 2:
                            stokUltramilk = restock("Ultramilk", stokUltramilk, jmlRestock);
                            System.out.println("Sisa stok Ultramilk sekarang adalah " + stokUltramilk);
                            break;
                        case 3:
                            stokMilo = restock("Milo", stokMilo, jmlRestock);
                            System.out.println("Sisa stok Milo sekarang adalah " + stokMilo);
                            break;
                        case 4:
                            stokFrissianFlag = restock("Frissianflag", stokFrissianFlag, jmlRestock);
                            System.out.println("Sisa stok Frissianflag sekarang adalah " + stokFrissianFlag);
                            break;
                        case 5:
                            stokHiLoTeen = restock("HiLoTeen", stokHiLoTeen, jmlRestock);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokHiLoTeen);
                            break;
                        case 6:
                            stokCimmoryFreshmilk = restock("Cimmory Freshmilk", stokCimmoryFreshmilk, jmlRestock);
                            System.out.println("Sisa stok Indomilk sekarang adalah " + stokCimmoryFreshmilk);
                            break;
                        default:
                            System.out.println(invalidInput);
                    }
                    break;
                case 3:
infoGudang(stokIndomilk,stokUltramilk,stokMilo,stokFrissianFlag,stokHiLoTeen,stokCimmoryFreshmilk);
                    break;
                case 4:
                    System.out.println("Anda keluar dari aplikasi, Terima kasih!");
                    break;
                default:
//                    System.out.println("Input salah!");
                    System.out.println(invalidInput);
            }
        } while (menu2 != 4);
        //

    }
// public  static void invalidInput(){
//     System.out.println("Inpuy yang anda masukan salah!");
// }
    public static int kirim(String brand, int stok, int jmlKirim) {
        System.out.println("Anda mengirim " + brand + " sebanyak " + jmlKirim);
        return stok - jmlKirim;
    }

    public static int restock(String brand, int stok, int jmlRestock) {
        System.out.println(brand + " telah di-restock sebanyak " + jmlRestock);
        return stok + jmlRestock;
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

    public static void namaBrand() {
        System.out.println("1. Indomilk");
        System.out.println("2. Ultra Milk");
        System.out.println("3. Milo");
        System.out.println("4. Frisian Flag");
        System.out.println("5. HiLo Teen");
        System.out.println("6. Cimmory Freshmilk");

    }

    public static void infoGudang(int a,int b,int c,int d, int e, int f){
        System.out.println("Indomilk "+a);
        System.out.println("Ultra Milk "+b);
        System.out.println("Milo "+c);
        System.out.println("Frissian Flag "+d);
        System.out.println("HiLo Teen "+e);
        System.out.println("Cimmory Freshmilk "+f);
    }

//    public static String id(int idBarang) {//batal
//        String id = "";
//        switch (idBarang) {
//            case 1:
//                id = "Indomilk";
//                break;
//            case 2:
//                id = "Ultra Milk";
//                break;
//            case 3:
//                id = "Milo";
//                break;
//            case 4:
//                id = "Frissian Flag";
//                break;
//            case 5:
//                id = "HiLo Teen";
//                break;
//            case 6:
//                id = "Cimmory Freshmilk";
//                break;
//            default:
//
//        }
//        return id;
//    }
}
