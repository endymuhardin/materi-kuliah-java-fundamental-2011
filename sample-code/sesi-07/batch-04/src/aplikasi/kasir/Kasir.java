package aplikasi.kasir;

import java.math.BigDecimal;

import java.util.List;
import java.util.ArrayList;

public class Kasir {
    private String kode;
    private String nama;
    private BigDecimal saldoAwal;
    
    private List<Penjualan> daftarPenjualan
        = new ArrayList<Penjualan>();
        
    public BigDecimal hitungSetoran(){
        return null;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public void setSaldoAwal(BigDecimal saldo){
        this.saldoAwal = saldo;
    }
}
