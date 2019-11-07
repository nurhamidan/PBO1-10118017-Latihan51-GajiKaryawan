package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class Main, dimana program pertama yang dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + manager.getNik());
        System.out.println("NAMA\t\t: " + manager.getNama());
        System.out.println("GOLONGAN\t: " + manager.getGolongan());
        System.out.println("JABATAN\t\t: " + manager.getJabatan());
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + manager.gajiTotal());
    }
    
}
