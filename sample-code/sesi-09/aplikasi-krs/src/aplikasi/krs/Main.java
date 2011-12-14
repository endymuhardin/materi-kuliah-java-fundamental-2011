package aplikasi.krs;

public class Main {
    public static void main(String[] xx){
        // 1. 3 matakuliah
        Matakuliah p1 = new Matakuliah();
        p1.setKode("P1");
        p1.setNama("Pemrograman 1");
        p1.setSks(3);

        Matakuliah p2 = new Matakuliah();
        p2.setKode("P2");
        p2.setNama("Pemrograman 2");
        p2.setSks(3);

        Matakuliah p3 = new Matakuliah();
        p3.setKode("B1");
        p3.setNama("Basis Data 1");
        p3.setSks(3);
    }
}
