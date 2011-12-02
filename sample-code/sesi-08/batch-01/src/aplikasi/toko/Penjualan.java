package aplikasi.toko;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class Penjualan {
    private List<Produk> daftarProduk = new ArrayList<Produk>();

    public BigDecimal hitungTotal(){
        return new BigDecimal(120000.00);
    }

    public List<Produk> getDaftarProduk(){
        return daftarProduk;
    }
}
