package aplikasi.perpustakaan;

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
        PeminjamanDetail p1d1 = new PeminjamanDetail();
        PeminjamanDetail p1d2 = new PeminjamanDetail();
        PeminjamanDetail p1d3 = new PeminjamanDetail();

        Peminjaman p2 = new Peminjaman();
        PeminjamanDetail p2d1 = new PeminjamanDetail();
        PeminjamanDetail p2d2 = new PeminjamanDetail();


        // 3. Tampilkan report
        // 3.1. Buku dan jumlah dipinjam

        // 3.2. Anggota dan jumlah pinjaman

    }
}
