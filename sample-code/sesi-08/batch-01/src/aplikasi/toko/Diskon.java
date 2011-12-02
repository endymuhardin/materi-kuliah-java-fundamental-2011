package aplikasi.toko;

import java.math.BigDecimal;

public interface Diskon {

    // di dalam interface, keyword abstract optional
    // boleh dipakai boleh tidak,
    // karena semua method dalam interface *pasti* abstract
    public BigDecimal hitungDiskon(Penjualan p);
}
