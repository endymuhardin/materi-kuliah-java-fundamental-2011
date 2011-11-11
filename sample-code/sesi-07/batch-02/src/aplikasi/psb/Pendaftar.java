package aplikasi.psb;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Pendaftar {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    private HasilTes hasilTes = new HasilTes();
    
    public HasilTes getHasilTes(){
        return hasilTes;
    }
    
    private List<Pembayaran> daftarPembayaran 
        = new ArrayList<Pembayaran>();
    
    public BigDecimal hitungTotalPembayaran(){
        return null;
    }

}
