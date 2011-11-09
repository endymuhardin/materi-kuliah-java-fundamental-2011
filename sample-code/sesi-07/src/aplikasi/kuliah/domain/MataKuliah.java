package aplikasi.kuliah.domain;

import java.util.List;
import java.util.ArrayList;

public class MataKuliah {
    private String nama;
    private Integer sks;
    
    private List<Batch> daftarBatch = 
        new ArrayList<Batch>();
        
    public void setNama(String nama) {
        this.nama = nama;
    }
}
