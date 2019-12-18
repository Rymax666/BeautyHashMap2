package Praktikum;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,DataNasabah> data = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        DataNasabah nasabah;
        char jwb;
        do {
            System.out.println(">>Tambah Data<<");
            System.out.print("Masukkan Nomor Rekening : ");
            String norek = scan.next();
            System.out.print("Masukkan Nama : ");
            String nama = scan.next();
            System.out.print("Masukkan Nomor HP : ");
            int nope = scan.nextInt();

            data.put(norek, new DataNasabah(nama, nope));

            System.out.print("Mau Lagi ? y/n : ");
            jwb = scan.next().charAt(0);
        }while (jwb == 'y' || jwb == 'Y');

        System.out.println(">>Cari Nasabah<<");
        System.out.print("Masukan Nomor Rekening : ");
        String key = scan.next();

        if (data.get(key) == null){
            System.out.println("Data Tidak Ditemukan!");
        }else{
            nasabah = data.get(key);
            System.out.println("Nomor Rekening  : "+key);
            System.out.println("Nama            : "+nasabah.getNama());
            System.out.println("Nomor HP        : "+nasabah.getNope());
        }


        System.out.print("Mau Hapus Data ? y/n : ");
        char jjjwb = scan.next().charAt(0);
        if (jjjwb == 'y' || jjjwb == 'Y'){
            System.out.print("Masukkan Key yg mau dihapus : ");
            String bb = scan.next();
            if (data.get(bb) == null){
                System.out.println("Data tidak valid");
            }else {
                data.remove(bb);
            }
        }

        System.out.print("Tampilkan Semua Data ? y/n : ");
        char jjwb = scan.next().charAt(0);

        if (jjwb == 'y' || jjwb == 'Y'){
            System.out.println(">>Menampilkan Semua Data<<");
            System.out.println();
            for (String nsb : data.keySet()){
                DataNasabah value = data.get(nsb);
                System.out.println("[Nomor Rekening : "+nsb+", Nama : "+value.getNama()+", Nomor HP : "+value.getNope()+"]");
            }
        }else {
            System.out.println("Byee");
        }


    }
}
