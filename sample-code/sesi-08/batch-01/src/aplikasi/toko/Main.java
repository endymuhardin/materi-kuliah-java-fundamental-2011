package aplikasi.toko;

public class Main {
    public static void main(String[] xx){
        Pembayaran p = new Pembayaran();
        Pembayaran px = p; // tipe data sama

        Tunai t = new Tunai();
        // Tunai adalah subclass, memiliki tipe data superclass
        px = t; // tidak error

        //t = p; // error, karena pembayaran memiliki informasi < tunai
    }
}
