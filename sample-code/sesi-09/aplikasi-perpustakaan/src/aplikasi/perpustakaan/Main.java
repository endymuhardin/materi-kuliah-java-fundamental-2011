package aplikasi.perpustakaan;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] xx){
        // 1. Instankan master data
        Anggota a1 = new Anggota();
        Anggota a2 = new Anggota();

        Buku b1 = new Buku();
        Buku b2 = new Buku();
        Buku b3 = new Buku();
        Buku b4 = new Buku();

        // 2. Entri transaksi peminjaman
        Peminjaman p1 = new Peminjaman();
        p1.setPeminjam(a1);
        PeminjamanDetail p1d1 = new PeminjamanDetail();
        PeminjamanDetail p1d2 = new PeminjamanDetail();
        PeminjamanDetail p1d3 = new PeminjamanDetail();
        p1d1.setBuku(b1); b1.tambahDaftarPinjaman(p1d1);
        p1d2.setBuku(b2); b2.tambahDaftarPinjaman(p1d2);
        p1d3.setBuku(b3); b3.tambahDaftarPinjaman(p1d2);

        p1.tambahPeminjamanDetail(p1d1);
        p1.tambahPeminjamanDetail(p1d2);
        p1.tambahPeminjamanDetail(p1d3);


        Peminjaman p2 = new Peminjaman();
        p2.setPeminjam(a2);
        PeminjamanDetail p2d1 = new PeminjamanDetail();
        PeminjamanDetail p2d2 = new PeminjamanDetail();
        p2d1.setBuku(b3); b3.tambahDaftarPinjaman(p2d1);
        p2d2.setBuku(b4); b4.tambahDaftarPinjaman(p2d2);

        p2.tambahPeminjamanDetail(p2d1);
        p2.tambahPeminjamanDetail(p2d2);


        // 3. Tampilkan report
        List<Buku> daftarBuku = new ArrayList<Buku>();
        daftarBuku.add(b1);
        daftarBuku.add(b2);
        daftarBuku.add(b3);
        daftarBuku.add(b4);

        List<Anggota> daftarAnggota = new ArrayList<Anggota>();
        daftarAnggota.add(a1);
        daftarAnggota.add(a2);

        // 3.1. Buku dan jumlah dipinjam
        Integer noBuku = 1;
        for(Buku b : daftarBuku){
            System.out.print("Buku : b"+(noBuku++));
            System.out.print(", jumlah pinjaman : ");
            System.out.println(b.getDaftarPinjaman().size());
        }

        // 3.2. Anggota dan jumlah pinjaman

    }
}
