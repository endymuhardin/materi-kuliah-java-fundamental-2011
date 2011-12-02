package aplikasi.toko;

import java.math.BigDecimal;

public class DiskonTotal implements Diskon {
    private BigDecimal minimumPembelian = new BigDecimal(100000.00);

    public BigDecimal hitungDiskon(Penjualan p){
        if(minimumPembelian.compareTo(p.hitungTotal()) > 0) {
            return BigDecimal.ZERO;
        }

        return new BigDecimal(0.1).multiply(p.hitungTotal());
    }
}
