package aplikasi.perpustakaan;

import java.util.Date;

public class PeminjamanDetail {
    private Date tanggalKembali;
    private Peminjaman peminjaman;
    private Buku buku;

    public void setBuku(Buku b){
        buku = b;
    }

    public void setPeminjaman(Peminjaman p){
        peminjaman = p;
    }
}
