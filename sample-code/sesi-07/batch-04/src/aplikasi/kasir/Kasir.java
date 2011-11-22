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
}
