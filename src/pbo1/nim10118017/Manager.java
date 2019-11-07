package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini berfungsi untuk menghitung tunjangan dan gaji total.
 * 
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        return hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan) {
        switch (jabatan.toUpperCase()) {
            case "MANAGER":
                return 2000000;
            case "KABAG":
                return 1000000;
            default:
                return 0;
        }
    }
    
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                return 500000;
            case 2:
                return 1000000;
            case 3:
                return 1500000;
            default:
                return 0;
        }
    }
    
    public float gajiTotal() {
        return tunjanganJabatan(jabatan) + tunjanganGolongan(golongan) + tunjanganKehadiran(kehadiran);
    }
}
