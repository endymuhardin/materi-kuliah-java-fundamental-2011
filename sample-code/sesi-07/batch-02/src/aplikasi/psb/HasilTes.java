package aplikasi.psb;

import java.util.List;
import java.util.ArrayList;

public class HasilTes {
    private Pendaftar pendaftar;
    private TesMasuk tesMasuk;
    
    private List<Jawaban> daftarJawaban 
        = new ArrayList<Jawaban>();
        
    private Integer nilai;
    
    public List<Jawaban> getDaftarJawaban(){
        return daftarJawaban;
    }
    
    public String hitungPeringkat() {
        return null;
    }
    
    /**
    * menghitung kelulusan pendaftar. 
    * Lulus bila lebih dari satu jawaban benar
    * @return true kalau lulus
    */
    public Boolean lulus() {
        Integer jumlahBenar = 0;
        
        for(Jawaban j : daftarJawaban){
            if(j.benar()){
                jumlahBenar++;
            }
        }
        
        return jumlahBenar > 1;
    }
}
