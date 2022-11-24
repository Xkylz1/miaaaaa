package gudang;

import java.util.Locale;
import java.util.Scanner;

public class GudangSusuUHT {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

//konstanta
        final String invalidInput = "Maaf, input yang anda masukan salah!";
        final String garis = "================================================================================";
        final int maxPerBrand = 60;

        //var
        boolean pengulangan = true;
        int menu;
        String namaDepan = "";
        String namaBelakang = "";
        String uname = "";
        String pw = "";
        String valUname, valPw;

        //daftar susu
        int stokIndomilk = 10;
        int stokUltramilk = 10;
        int stokMilo = 10;
        int stokFrissianFlag = 10;
        int stokHiLoTeen = 10;
        int stokCimmoryFreshmilk = 10;

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

            } else if (menu == 1) {

                System.out.print("Nama depan : ");
                namaDepan = in2.nextLine();
                System.out.print("Nama belakang : ");
                namaBelakang = in2.nextLine();
                System.out.print("NIM : ");
                pw = in2.nextLine();
                uname = namaBelakang.toLowerCase(Locale.ROOT);

                System.out.println(garis);
                System.out.println("username anda adalah " + uname);
                System.out.println("password anda sama dengan NIM anda");
                System.out.println(garis);

            } else {

                System.out.println(invalidInput);

            }

        } while (pengulangan);

        //menuGudang
        int menu2;

        do {

            System.out.println(garis);
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
                            if (stokIndomilk > jmlKirim) {
                                stokIndomilk = kirim("Indomilk", stokIndomilk, jmlKirim);
                                System.out.println("Sisa stok Indomilk sekarang adalah " + stokIndomilk);
                            } else {
                                err();
                            }
                            break;
                        case 2:
                            if (stokUltramilk > jmlKirim) {
                                stokUltramilk = kirim("Ultramilk", stokUltramilk, jmlKirim);
                                System.out.println("Sisa stok Ultramilk sekarang adalah " + stokUltramilk);
                            } else {
                                err();
                            }
                            break;
                        case 3:
                            if (stokMilo > jmlKirim) {
                                stokMilo = kirim("Milo", stokMilo, jmlKirim);
                                System.out.println("Sisa stok Milo sekarang adalah " + stokMilo);
                            } else {
                                err();
                            }
                            break;
                        case 4:
                            if (stokFrissianFlag > jmlKirim) {
                                stokFrissianFlag = kirim("Frissianflag", stokFrissianFlag, jmlKirim);
                                System.out.println("Sisa stok Frissianflag sekarang adalah " + stokFrissianFlag);
                            } else {
                                err();
                            }
                            break;
                        case 5:
                            if (stokHiLoTeen > jmlKirim) {
                                stokHiLoTeen = kirim("HiLo Teen", stokHiLoTeen, jmlKirim);
                                System.out.println("Sisa stok HiLo Teen sekarang adalah " + stokHiLoTeen);
                            } else {
                                err();
                            }
                            break;
                        case 6:
                            if (stokCimmoryFreshmilk > jmlKirim) {
                                stokCimmoryFreshmilk = kirim("Cimmory Freshmilk", stokCimmoryFreshmilk, jmlKirim);
                                System.out.println("Sisa stok Cimmory Freshmilk sekarang adalah " + stokCimmoryFreshmilk);
                            } else {
                                err();
                            }
                            break;
                        default:
                            System.out.println(invalidInput);
                    }

                    break;
                case 2:
                    namaBrand();
                    System.out.print("Pilihan barang: ");
                    id = in.nextInt();
                    System.out.print("Masukan jumlah barang yang ingin di-restock : ");
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
                            stokHiLoTeen = restock("HiLo Teen", stokHiLoTeen, jmlRestock);
                            System.out.println("Sisa stok HiLo Teen sekarang adalah " + stokHiLoTeen);
                            break;
                        case 6:
                            stokCimmoryFreshmilk = restock("Cimmory Freshmilk", stokCimmoryFreshmilk, jmlRestock);
                            System.out.println("Sisa stok Commory Freshmilk sekarang adalah " + stokCimmoryFreshmilk);
                            break;
                        default:
                            System.out.println(invalidInput);

                    }
                    break;
                case 3:
                    infoGudang(stokIndomilk, stokUltramilk, stokMilo, stokFrissianFlag, stokHiLoTeen, stokCimmoryFreshmilk);
                    break;
                case 4:
                    System.out.println("Anda menambahkan " + (maxPerBrand - stokIndomilk) + " pcs Indomilk");
                    stokIndomilk = restockFull(stokIndomilk, maxPerBrand);

                    System.out.println("Anda menambahkan " + (maxPerBrand - stokUltramilk) + " pcs Ultramilk");
                    stokUltramilk = restockFull(stokUltramilk, maxPerBrand);

                    System.out.println("Anda menambahkan " + (maxPerBrand - stokMilo) + " pcs Milo");
                    stokMilo = restockFull(stokMilo, maxPerBrand);
                    System.out.println("Anda menambahkan " + (maxPerBrand - stokFrissianFlag) + " pcs Frissian Flag");
                    stokFrissianFlag = restockFull(stokFrissianFlag, maxPerBrand);
                    System.out.println("Anda menambahkan " + (maxPerBrand - stokHiLoTeen) + " pcs Hilo Teen");
                    stokHiLoTeen = restockFull(stokHiLoTeen, maxPerBrand);
                    System.out.println("Anda menambahkan " + (maxPerBrand - stokCimmoryFreshmilk) + " pcs Cimmory Freshmilk");
                    stokCimmoryFreshmilk = restockFull(stokCimmoryFreshmilk, maxPerBrand);
                    break;
                case 5:
                    System.out.println("Anda keluar dari aplikasi, Terima kasih!");
                    break;
                default:
                    System.out.println(invalidInput);

            }
        } while (menu2 != 5);

    }

    public static int kirim(String brand, int stok, int jmlKirim) {
        System.out.println("Anda mengirim " + brand + " sebanyak " + jmlKirim);
        return stok - jmlKirim;
    }

    public static int restock(String brand, int stok, int jmlRestock) {
        System.out.println(brand + " telah di-restock sebanyak " + jmlRestock);
        return stok + jmlRestock;
    }

    public static void menuGudang() {
        System.out.println("Menu Gudang");
        System.out.println("1. Kirim Barang");
        System.out.println("2. Restock");
        System.out.println("3. Cek Gudang");
        System.out.println("4. Isi Gudang sampai full");
        System.out.println("5. Keluar");
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

    public static void infoGudang(int a, int b, int c, int d, int e, int f) {
        int total = a + b + c + d + e + f;
        System.out.println("Indomilk " + a + " pcs");
        System.out.println("Ultra Milk " + b + " pcs");
        System.out.println("Milo " + c + " pcs");
        System.out.println("Frissian Flag " + d + " pcs");
        System.out.println("HiLo Teen " + e + " pcs");
        System.out.println("Cimmory Freshmilk " + f + " pcs");
        System.out.println("Kapasitas maksimal gudang adalah 360 pcs,\ndan jumlah barang saat ini adalah " + total);
    }

    public static int restockFull(int stoksekarang, int maxBrand) {
        int stokBaru = stoksekarang;
        for (int i = stoksekarang; i < maxBrand; i++) {
            stokBaru++;
        }
        return stokBaru;
    }

    public static void err() {
        System.out.println("Terjadi error!");
    }
}
