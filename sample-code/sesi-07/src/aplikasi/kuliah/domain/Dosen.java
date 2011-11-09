package aplikasi.kuliah.domain;

import java.util.List;
import java.util.ArrayList;

public class Dosen {
    private String nama;
    private String email;
    
    private List<Pertemuan> daftarPertemuan = 
        new ArrayList<Pertemuan>();
    
    private List<Batch> daftarBatch = 
        new ArrayList<Batch>();
    
    public Double hitungJamHadir(){
        return 0d;
    }
}
