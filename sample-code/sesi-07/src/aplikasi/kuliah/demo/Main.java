package aplikasi.kuliah.demo;

import java.util.List;
import java.util.ArrayList;

import aplikasi.kuliah.domain.Mahasiswa;
import aplikasi.kuliah.domain.MataKuliah;
import aplikasi.kuliah.domain.Batch;
import aplikasi.kuliah.domain.Kehadiran;
import aplikasi.kuliah.domain.Pertemuan;

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
        
        Pertemuan p1 = new Pertemuan();
        Pertemuan p2 = new Pertemuan();
        Pertemuan p3 = new Pertemuan();
        Pertemuan p4 = new Pertemuan();
        
        List<Pertemuan> daftarPertemuan 
          = new ArrayList<Pertemuan>();
        daftarPertemuan.add(p1);
        daftarPertemuan.add(p2);
        daftarPertemuan.add(p3);
        daftarPertemuan.add(p4);
        
        p1.setTanggal("1 Nov 2011");
        p2.setTanggal("2 Nov 2011");
        p3.setTanggal("3 Nov 2011");
        p4.setTanggal("4 Nov 2011");
        
        p1.setBatch(batchPemrograman1);
        p2.setBatch(batchPemrograman1);
        p3.setBatch(batchPemrograman1);
        p4.setBatch(batchPemrograman1);
        
        // daftar hadir pertemuan 1
        Kehadiran p1k1 = new Kehadiran();
        Kehadiran p1k2 = new Kehadiran();
        Kehadiran p1k3 = new Kehadiran();
        Kehadiran p1k4 = new Kehadiran();
        Kehadiran p1k5 = new Kehadiran();
        
        p1k1.setMahasiswa(m1);
        p1k2.setMahasiswa(m2);
        p1k3.setMahasiswa(m3);
        p1k4.setMahasiswa(m4);
        p1k5.setMahasiswa(m5);
        
        p1k1.setStatus("Hadir");
        p1k2.setStatus("Hadir");
        p1k3.setStatus("Hadir");
        p1k4.setStatus("Hadir");
        p1k5.setStatus("Hadir");
        
        p1.getDaftarKehadiran().add(p1k1);
        p1.getDaftarKehadiran().add(p1k2);
        p1.getDaftarKehadiran().add(p1k3);
        p1.getDaftarKehadiran().add(p1k4);
        p1.getDaftarKehadiran().add(p1k5);
        
        // daftar hadir pertemuan 2
        Kehadiran p2k1 = new Kehadiran();
        Kehadiran p2k2 = new Kehadiran();
        Kehadiran p2k3 = new Kehadiran();
        Kehadiran p2k4 = new Kehadiran();
        Kehadiran p2k5 = new Kehadiran();
        
        p2k1.setMahasiswa(m1);
        p2k2.setMahasiswa(m2);
        p2k3.setMahasiswa(m3);
        p2k4.setMahasiswa(m4);
        p2k5.setMahasiswa(m5);
        
        p2k1.setStatus("Ijin");
        p2k2.setStatus("Hadir");
        p2k3.setStatus("Sakit");
        p2k4.setStatus("Hadir");
        p2k5.setStatus("Hadir");
        
        p2.getDaftarKehadiran().add(p2k1);
        p2.getDaftarKehadiran().add(p2k2);
        p2.getDaftarKehadiran().add(p2k3);
        p2.getDaftarKehadiran().add(p2k4);
        p2.getDaftarKehadiran().add(p2k5);
        
        // daftar hadir pertemuan 3
        Kehadiran p3k1 = new Kehadiran();
        Kehadiran p3k2 = new Kehadiran();
        Kehadiran p3k3 = new Kehadiran();
        Kehadiran p3k4 = new Kehadiran();
        Kehadiran p3k5 = new Kehadiran();
        
        p3k1.setMahasiswa(m1);
        p3k2.setMahasiswa(m2);
        p3k3.setMahasiswa(m3);
        p3k4.setMahasiswa(m4);
        p3k5.setMahasiswa(m5);
        
        p3k1.setStatus("Ijin");
        p3k2.setStatus("Sakit");
        p3k3.setStatus("Ijin");
        p3k4.setStatus("Hadir");
        p3k5.setStatus("Hadir");
        
        p3.getDaftarKehadiran().add(p3k1);
        p3.getDaftarKehadiran().add(p3k2);
        p3.getDaftarKehadiran().add(p3k3);
        p3.getDaftarKehadiran().add(p3k4);
        p3.getDaftarKehadiran().add(p3k5);
        
        // daftar hadir pertemuan 4
        Kehadiran p4k1 = new Kehadiran();
        Kehadiran p4k2 = new Kehadiran();
        Kehadiran p4k3 = new Kehadiran();
        Kehadiran p4k4 = new Kehadiran();
        Kehadiran p4k5 = new Kehadiran();
        
        p4k1.setMahasiswa(m1);
        p4k2.setMahasiswa(m2);
        p4k3.setMahasiswa(m3);
        p4k4.setMahasiswa(m4);
        p4k5.setMahasiswa(m5);
        
        p4k1.setStatus("Hadir");
        p4k2.setStatus("Sakit");
        p4k3.setStatus("Sakit");
        p4k4.setStatus("Ijin");
        p4k5.setStatus("Ijin");
        
        p4.getDaftarKehadiran().add(p4k1);
        p4.getDaftarKehadiran().add(p4k2);
        p4.getDaftarKehadiran().add(p4k3);
        p4.getDaftarKehadiran().add(p4k4);
        p4.getDaftarKehadiran().add(p4k5);
        
        // tampilkan jumlah hadir masing-masing pertemuan
        
        for(Pertemuan x : daftarPertemuan){
            System.out.print("Mata kuliah "+x.getBatch().getMataKuliah().getNama());
            System.out.print(", tanggal "+x.getTanggal());
            System.out.print(", hadir "+x.hitungJumlahHadir());
            System.out.println(" orang");
        }
    }    
    
}





