package aplikasi.kuliah.domain;

import java.util.List;
import java.util.ArrayList;

public class Kehadiran {
    private String status;
    
    private Mahasiswa mahasiswa;
    private List<Pertemuan> daftarPertemuan = 
        new ArrayList<Pertemuan>();
}
