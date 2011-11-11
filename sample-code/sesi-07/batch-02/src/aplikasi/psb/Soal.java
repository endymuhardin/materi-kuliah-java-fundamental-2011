package aplikasi.psb;

public class Soal {
    private String pertanyaan;
    private String jawabanBenar; 
    
    private TesMasuk tesMasuk;
    
    public void setPertanyaan(String pertanyaan){
        this.pertanyaan = pertanyaan;
    }
    
    public void setJawabanBenar(String j){
        this.jawabanBenar = j;
    }
    
    public String getJawabanBenar(){
        return this.jawabanBenar;
    }
    
}
