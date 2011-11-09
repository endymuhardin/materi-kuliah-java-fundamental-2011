package aplikasi.kuliah.demo;

import aplikasi.kuliah.domain.Mahasiswa;
import aplikasi.kuliah.domain.MataKuliah;
import aplikasi.kuliah.domain.Batch;

public class Main {
    public static void main(String[] xx) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        Mahasiswa m4 = new Mahasiswa();
        Mahasiswa m5 = new Mahasiswa();
        
        m1.setNama("Mahasiswa 1");
        m2.setNama("Mahasiswa 2");
        m3.setNama("Mahasiswa 3");
        m4.setNama("Mahasiswa 4");
        m5.setNama("Mahasiswa 5");
        
        MataKuliah prog1 = new MataKuliah();
        MataKuliah bd1 = new MataKuliah();
        
        prog1.setNama("Pemrograman 1");
        bd1.setNama("Basis Data 1");
        
        Batch batchPemrograman1 = new Batch();
        batchPemrograman1.setMataKuliah(prog1);
        batchPemrograman1.setStatus("berjalan");
        batchPemrograman1.getDaftarMahasiswa().add(m1);
        batchPemrograman1.getDaftarMahasiswa().add(m2);
        batchPemrograman1.getDaftarMahasiswa().add(m3);
        batchPemrograman1.getDaftarMahasiswa().add(m4);
        batchPemrograman1.getDaftarMahasiswa().add(m5);
    }
}





