package aplikasi.krs;

import java.util.List;
import java.util.ArrayList;

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

        // 2. 2 Rencana Studi
        RencanaStudi r1 = new RencanaStudi();
        r1.setNpm("001");
        r1.setNama("Endy");
        r1.setIpk(3.2);
        r1.setSemester(3);

        RencanaStudiDetail r1d1 = new RencanaStudiDetail();
        r1d1.setMatakuliah(p1);
        r1.tambahDetail(r1d1);

        RencanaStudiDetail r1d2 = new RencanaStudiDetail();
        r1d2.setMatakuliah(p3);
        r1.tambahDetail(r1d2);

        RencanaStudi r2 = new RencanaStudi();
        r2.setNpm("002");
        r2.setNama("Adi");
        r2.setIpk(3.5);
        r2.setSemester(3);

        RencanaStudiDetail r2d1 = new RencanaStudiDetail();
        r2d1.setMatakuliah(p2);
        r2.tambahDetail(r2d1);

        RencanaStudiDetail r2d2 = new RencanaStudiDetail();
        r2d2.setMatakuliah(p3);
        r2.tambahDetail(r2d2);

        List<RencanaStudi> daftarRencanaStudi = new ArrayList<RencanaStudi>();
        daftarRencanaStudi.add(r1);
        daftarRencanaStudi.add(r2);

        System.out.println("====== Daftar Pengajuan RS ======");
        tampilkanRencanaStudi(daftarRencanaStudi);

        // 3. Approval
        Dosen d1 = new Dosen();
        d1.setKode("G");
        d1.setNama("Greg");

        r1d1.setStatus(StatusRencanaStudiDetail.APPROVED);
        r1d1.setReviewer(d1);

        r1d2.setStatus(StatusRencanaStudiDetail.APPROVED);
        r1d2.setReviewer(d1);

        r2d1.setStatus(StatusRencanaStudiDetail.REJECTED);
        r2d1.setReviewer(d1);

        r2d2.setStatus(StatusRencanaStudiDetail.APPROVED);
        r2d2.setReviewer(d1);

        System.out.println("====== Hasil Pengajuan RS ======");
        tampilkanRencanaStudi(daftarRencanaStudi);
    }

    private static void tampilkanRencanaStudi(List<RencanaStudi> daftarRencanaStudi){
        Integer hitung = 1;
        for(RencanaStudi r : daftarRencanaStudi){
            System.out.print(hitung++);
            System.out.print(". Mahasiswa : ");
            System.out.print(r.getNpm() + " - " + r.getNama() + " - "+r.getIpk());
            System.out.println();

            for(RencanaStudiDetail rd : r.getDaftarRencanaStudiDetail()){
                System.out.print("\t");
                System.out.print("Mata Kuliah : ");
                System.out.print(rd.getMatakuliah().getKode() + " - ");
                System.out.print(rd.getMatakuliah().getNama() + ", ");
                System.out.print(rd.getMatakuliah().getSks() + " sks");
                System.out.print(" ["+rd.getStatus()+"]");

                if(StatusRencanaStudiDetail.APPROVED.equals(rd.getStatus()) ||
                StatusRencanaStudiDetail.REJECTED.equals(rd.getStatus())) {
                    System.out.print(" direview oleh ");
                    System.out.print(rd.getReviewer().getNama());
                }

                System.out.println();
            }
        }
    }
}
