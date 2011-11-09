package aplikasi.kuliah.domain;

public class Pertemuan {
    private String tanggal;
    private String ruangan;
    
    private Kehadiran kehadiran;
    private Dosen dosen;
    private Batch batch;
    
    public Integer jumlahHadir(){
        return 0;
    }
    
    public Integer jumlahSakit(){
        return 0;
    }
}
