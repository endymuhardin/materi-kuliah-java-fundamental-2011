package aplikasi.toko;

import java.util.Date;
import java.util.List;

public class Pembelian {
    private Date tanggalTransaksi;
    private List<PembelianDetail> daftarPembelianDetail;
}

// struktur folder
// src > aplikasi > toko > Pembelian.java

// compile (prompt berada di atas folder src)
// folder bin dibuat dulu, sejajar dengan src
// javac -cp src -d bin src/aplikasi/toko/*
