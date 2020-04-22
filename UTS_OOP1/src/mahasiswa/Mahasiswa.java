/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.*;


/**
 *
 * @author Tiseka
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public void printMenu() {
        Scanner x = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Data Mahasiswa Poltek Harber Tegal");
        System.out.println("=====================================");
        System.out.println("1. Tambah Data" + "\n2. Ubah Data" + "\n3. Hapus Data" + "\n4. Lihat Data" + "\n5. Keluar");
        System.out.print("Pilihan: ");
    }

    public void HapusData() {
        Scanner x = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus: ");
        int id = Integer.parseInt(x.nextLine());
        // proses hapus data
        Proses.removeData(id - 1);
    }

    public void UbahData() {
        Scanner x = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah: ");
        int id = Integer.parseInt(x.nextLine());
        System.out.println("--------------------------");
        System.out.print("Nim       : ");
        String nim = x.nextLine();
        System.out.print("Nama      : ");
        String nama = x.nextLine();
        System.out.print("Kelas     : ");
        String kelas = x.nextLine();
        System.out.print("Alamat    : ");
        String alamat = x.nextLine();
        // proses ubah data
        Proses.editData(new Data(nim, nama, kelas, alamat), id - 1);
    }

    public void ListData() {
        List<Data> result = Proses.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  Nim       : " + result.get(i).getnim());
            System.out.println("  Nama      : " + result.get(i).getnama());
            System.out.println("  Kelas     : " + result.get(i).getkelas());
            System.out.println("  Alamat    : " + result.get(i).getalamat());
        }
    }

    public void AddData() {
        Scanner x = new Scanner(System.in);
        System.out.println();
        System.out.print("Nim : ");
        String nim = x.nextLine();
        System.out.print("Nama : ");
        String nama = x.nextLine();
        System.out.print("Kelas : ");
        String kelas = x.nextLine();
        System.out.print("Alamat : ");
        String alamat = x.nextLine();
        // proses tambah data
        Proses.AddData(new Data(nim, nama, kelas, alamat));
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Mahasiswa app = new Mahasiswa();
        while (true) {
            app.printMenu();
            int pilihan = Scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.AddData();
                    break;
                case 2:
                    System.out.println("Daftar Data");
                    app.ListData();
                    System.out.println("Formulir Ubah Data");
                    app.UbahData();
                    break;
                case 3:
                    System.out.println("Daftar Data");
                    app.ListData();
                    System.out.println("Formulir Hapus Data");
                    app.HapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.ListData();
                    break;
                case 5:
                    System.out.println("\nApakah Anda Ingin Melanjutkan ?");
                    System.out.println("1.Ya \t2.Tidak");
                    char setuju = Scan.next().charAt(0);
                    if (setuju == '1') {
                        app.printMenu();


                    } else if (setuju == '2') {
                        System.out.println("Terimakasih");
                        System.exit(0);
                    }
            }
        }
    }
}
