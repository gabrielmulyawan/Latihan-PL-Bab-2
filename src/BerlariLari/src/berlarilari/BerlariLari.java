package berlarilari;

import java.util.Scanner;

public class BerlariLari {

    static Scanner in = new Scanner(System.in);
    static Scanner masukan = new Scanner(System.in);

    public static void main(String[] args) {
        long nim;
        String nama;
        double putaran;
        double waktu;
        double panjang, lebar;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int x = in.nextInt();
        Mahasiswa[] data = new Mahasiswa[x];
        System.out.print("Masukkan panjang \t  : ");
        panjang = in.nextDouble();
        System.out.print("Masukkan lebar \t\t  : ");
        lebar = in.nextDouble();
        Lapangan ukuran = new Lapangan(panjang, lebar);

        for (int i = 0; i < data.length; i++) {

            System.out.println("Masukkan Data Mahasiswa " + (i + 1));
            System.out.print("NIM \t\t : ");
            nim = in.nextLong();
            System.out.print("Nama \t\t : ");
            nama = masukan.nextLine();
            System.out.print("Jumlah Putaran   : ");
            putaran = in.nextDouble();
            System.out.print("Jumlah Waktu     : ");
            waktu = in.nextDouble();
            data[i] = new Mahasiswa(nim, nama, putaran, waktu);

            System.out.println("");
        }
        for (int i = 0; i < x; i++) {
            System.out.println("Data Mahasiswa ke " + (i + 1));
            System.out.println("Nama\t: " + data[i].getNama());
            System.out.println("Jarak\t: " + data[i].getJarak(ukuran));
           

        }
        System.out.println("");
        double max = 0;
        String namaterbaik="";
        for (int i = 0; i < x; i++) {
            if (max < data[i].getNilai(ukuran)) {
                max = data[i].getNilai(ukuran);
                namaterbaik = data[i].getNama();
            }
        }
        System.out.println("Waktu tercepatnya adalah : " + namaterbaik);

    }

}
