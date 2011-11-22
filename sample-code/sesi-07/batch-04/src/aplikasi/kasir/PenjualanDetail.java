package aplikasi.kasir;

import java.math.BigDecimal;

public class PenjualanDetail {
    private Integer quantity;
    private Penjualan penjualan;
    private Produk produk;
    
    public BigDecimal hitungSubtotal(){
        return null;
    }
    
    public void setProduk(Produk p){
        this.produk = p;
    }
    
    public void setQuantity(Integer q){
        this.quantity = q;
    }
}
