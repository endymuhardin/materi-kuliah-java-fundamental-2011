package aplikasi.kuliah.domain;

import java.util.List;
import java.util.ArrayList;

public class Batch {
    private String mulai;
    private String selesai;
    private String tahunAjaran;
    private String status;
    
    private MataKuliah mataKuliah;
    private Dosen dosen;
    
    private List<Mahasiswa> daftarMahasiswa = 
        new ArrayList<Mahasiswa>();
    
    private List<Pertemuan> daftarPertemuan = 
        new ArrayList<Pertemuan>();
    
    public Integer jumlahMahasiswa(){
        return 0;
    }
    
    public Integer jumlahPertemuan(){
        return 0;
    }
    
    public Double ratarataKehadiran(){
        return 0d;
    }
    
    public void setMataKuliah(MataKuliah mk) {
        this.mataKuliah = mk;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}
