package aplikasi.kasir;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Produk {
    private String kode;
    private String nama;
    private BigDecimal harga;
    
    private List<PenjualanDetail> daftarPenjualanDetail
        = new ArrayList<PenjualanDetail>();
}
