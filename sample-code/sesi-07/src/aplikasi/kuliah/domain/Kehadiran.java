package aplikasi.kuliah.domain;

public class Kehadiran {
    private String status;
    
    private Mahasiswa mahasiswa;
    private Pertemuan pertemuan;
    
    public void setMahasiswa(Mahasiswa m){
        mahasiswa = m;
    }
               
    public void setStatus(String st){
        status = st;
    }
    
    public String getStatus(){
        return status;
    }
}
