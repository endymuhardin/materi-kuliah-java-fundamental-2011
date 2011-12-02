package aplikasi.toko;

import java.math.BigDecimal;

public class Produk {
    public String getNama(){
        return "Roti Tawar";
    }

    public BigDecimal getHarga(){
        return new BigDecimal(3000);
    }

    public Boolean sedangDiskon(){
        return true;
    }

    public BigDecimal nilaiDiskon(){
        return new BigDecimal(0.05);
    }
}
