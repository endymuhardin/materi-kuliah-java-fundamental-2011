package aplikasi.kasir;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Penjualan {
    private String kodeTransaksi;
    private Date waktuTransaksi;
    private BigDecimal jumlahPembayaran;
    
    private Kasir kasir;
    private List<PenjualanDetail> daftarPenjualanDetail
        = new ArrayList<PenjualanDetail>();
        
    public BigDecimal hitungTotal(){
        return null;
    }
    
    public BigDecimal hitungKembalian(){
        return null;
    }
    
    public List<PenjualanDetail> getDaftarPenjualanDetail(){
        return this.daftarPenjualanDetail;
    }
}
