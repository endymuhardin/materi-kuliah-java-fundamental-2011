package aplikasi.kasir;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class RekapTransaksiPerProduk {
    public static void main(String[] xx){
        // 1. bikin 5 produk
        Produk p1 = new Produk();
        Produk p2 = new Produk();
        Produk p3 = new Produk();
        Produk p4 = new Produk();
        Produk p5 = new Produk();
        
        p1.setKode("P-001");
        p2.setKode("P-002");
        p3.setKode("P-003");
        p4.setKode("P-004");
        p5.setKode("P-005");
        
        p1.setHarga(new BigDecimal(100000.00));
        p2.setHarga(new BigDecimal(200000.00));
        p3.setHarga(new BigDecimal(300000.00));
        p4.setHarga(new BigDecimal(400000.00));
        p5.setHarga(new BigDecimal(500000.00));
        
        List<Produk> daftarProduk = new ArrayList<Produk>();
        daftarProduk.add(p1);
        daftarProduk.add(p2);
        daftarProduk.add(p3);
        daftarProduk.add(p4);
        daftarProduk.add(p5);
        
        // 2. bikin 2 kasir
        Kasir k1 = new Kasir();
        Kasir k2 = new Kasir();
        
        k1.setKode("K-001");
        k2.setKode("K-002");
        
        k1.setSaldoAwal(new BigDecimal(1000000.00));
        k2.setSaldoAwal(new BigDecimal(1100000.00));
        
        // 3.a. Kasir 1 : 2 penjualan
        Penjualan p1k1 = new Penjualan();
        
        PenjualanDetail p1k1d1 = new PenjualanDetail();
        p1k1d1.setProduk(p1);
        p1k1d1.setQuantity(1);
        p1.getDaftarPenjualanDetail().add(p1k1d1);
        
        PenjualanDetail p1k1d2 = new PenjualanDetail();
        p1k1d2.setProduk(p2);
        p1k1d2.setQuantity(5);
        p2.getDaftarPenjualanDetail().add(p1k1d2);
        
        p1k1.getDaftarPenjualanDetail().add(p1k1d1);
        p1k1.getDaftarPenjualanDetail().add(p1k1d2);
        
        Penjualan p2k1 = new Penjualan();
        
        PenjualanDetail p2k1d1 = new PenjualanDetail();
        p2k1d1.setProduk(p2);
        p2k1d1.setQuantity(2);
        p2.getDaftarPenjualanDetail().add(p2k1d1);
        
        PenjualanDetail p2k1d2 = new PenjualanDetail();
        p2k1d2.setProduk(p5);
        p2k1d2.setQuantity(3);
        p5.getDaftarPenjualanDetail().add(p2k1d2);
        
        p2k1.getDaftarPenjualanDetail().add(p2k1d1);
        p2k1.getDaftarPenjualanDetail().add(p2k1d2);
        
        // 3.b. Kasir 2 : 3 penjualan
        Penjualan p1k2 = new Penjualan();
        PenjualanDetail p1k2d1 = new PenjualanDetail();
        p1k2d1.setProduk(p4);
        p1k2d1.setQuantity(10);
        p4.getDaftarPenjualanDetail().add(p1k2d1);
        
        PenjualanDetail p1k2d2 = new PenjualanDetail();
        p1k2d2.setProduk(p5);
        p1k2d2.setQuantity(2);
        p5.getDaftarPenjualanDetail().add(p1k2d2);
        
        p1k2.getDaftarPenjualanDetail().add(p1k2d1);
        p1k2.getDaftarPenjualanDetail().add(p1k2d2);
        
        Penjualan p2k2 = new Penjualan();
        PenjualanDetail p2k2d1 = new PenjualanDetail();
        p2k2d1.setProduk(p1);
        p2k2d1.setQuantity(3);
        p1.getDaftarPenjualanDetail().add(p2k2d1);
        
        PenjualanDetail p2k2d2 = new PenjualanDetail();
        p2k2d2.setProduk(p5);
        p2k2d2.setQuantity(1);
        p5.getDaftarPenjualanDetail().add(p2k2d2);
        
        p2k2.getDaftarPenjualanDetail().add(p2k2d1);
        p2k2.getDaftarPenjualanDetail().add(p2k2d1);
        
        Penjualan p3k2 = new Penjualan();
        PenjualanDetail p3k2d1 = new PenjualanDetail();
        p3k2d1.setProduk(p2);
        p3k2d1.setQuantity(2);
        p2.getDaftarPenjualanDetail().add(p3k2d1);
        
        p3k2.getDaftarPenjualanDetail().add(p3k2d1);
        
        // 4. rekap penjualan per produk
        for(Produk x : daftarProduk){
            System.out.print("Produk "+x.getKode());
            System.out.println(", penjualan : "
            + x.hitungJumlahTerjual());
        }
    }
}
