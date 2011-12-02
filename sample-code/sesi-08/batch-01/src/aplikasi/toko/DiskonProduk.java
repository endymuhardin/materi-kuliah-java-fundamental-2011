package aplikasi.toko;

import java.math.BigDecimal;

import java.util.List;
import java.util.Arrays;

public class DiskonProduk implements Diskon {

    public BigDecimal hitungDiskon(Penjualan p){
        BigDecimal totalDiskon = BigDecimal.ZERO;

        for(Produk x : p.getDaftarProduk()){
            if(x.sedangDiskon()){
                BigDecimal diskon = x.nilaiDiskon()
                    .multiply(x.getHarga());
                totalDiskon = totalDiskon.add(diskon);
            }
        }

        return totalDiskon;
    }
}
