package aplikasi.perpustakaan;

import java.util.List;
import java.util.ArrayList;

public class Buku {
    private String kode;
    private String pengarang;
    private String judul;

    private List<PeminjamanDetail> daftarPinjaman
        = new ArrayList<PeminjamanDetail>();

    public void tambahDaftarPinjaman(PeminjamanDetail d){
        daftarPinjaman.add(d);
    }

    public List<PeminjamanDetail> getDaftarPinjaman(){
        return daftarPinjaman;
    }
}
