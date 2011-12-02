package aplikasi.toko;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] xx){
        Pembayaran p = new Pembayaran();
        Pembayaran px = p; // tipe data sama

        Tunai t = new Tunai(); // concrete class, bisa diinstankan

        // Tunai adalah subclass, memiliki tipe data superclass
        px = t; // tidak error

        //t = p; // error, karena pembayaran memiliki informasi < tunai

        // NonTunai n = new NonTunai(); // abstract class, tidak bisa diinstankan

        System.out.println(p.hitungTotal());

        // t mendapatkan implementasi hitungTotal dari superclass
        System.out.println(t.hitungTotal());

        // kedua implementasi (DiskonTotal dan DiskonProduk)
        // memiliki tipe data Diskon
        // sehingga bisa dipassing ke method yang meminta input bertipe Diskon
        tampilkanDiskon(new DiskonTotal());
        tampilkanDiskon(new DiskonProduk());

    }

    public static void tampilkanDiskon(Diskon d){
        Penjualan j = new Penjualan();
        BigDecimal diskon = d.hitungDiskon(j);
    }
}
