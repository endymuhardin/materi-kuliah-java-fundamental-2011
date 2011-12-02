package aplikasi.toko;

public abstract class NonTunai extends Pembayaran{

    private String nomerKartu;
    private String penerbit;
    private String nama;

    public abstract Boolean valid();
}
