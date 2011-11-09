package aplikasi.kuliah.domain;

import java.util.List;
import java.util.ArrayList;

public class Pertemuan {
    private String tanggal;
    private String ruangan;
    
    private List<Kehadiran> daftarKehadiran 
        = new ArrayList<Kehadiran>();
    private Dosen dosen;
    private Batch batch;
    
    public Integer jumlahHadir(){
        return 0;
    }
    
    public Integer jumlahSakit(){
        return 0;
    }
    
    public List<Kehadiran> getDaftarKehadiran(){
        return daftarKehadiran;
    }
 
    public void setBatch(Batch b){
        this.batch = b;
    }
}
