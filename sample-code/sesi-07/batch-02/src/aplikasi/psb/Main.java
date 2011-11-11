package aplikasi.psb;

public class Main {
    public static void main(String[] xx){
        // 5 pendaftar
        Pendaftar p1 = new Pendaftar();
        Pendaftar p2 = new Pendaftar();
        Pendaftar p3 = new Pendaftar();
        Pendaftar p4 = new Pendaftar();
        Pendaftar p5 = new Pendaftar();
        
        // 2 soal
        Soal s1 = new Soal();
        s1.setPertanyaan("Apa ibukota Indonesia");
        s1.setJawabanBenar("Jakarta");
        
        Soal s2 = new Soal();
        s2.setPertanyaan("Apa ibukota Jawa Barat");
        s2.setJawabanBenar("Bandung");
        
        
        // masing-masing pendaftar mengerjakan soal
        Jawaban p1j1 = new Jawaban();
        Jawaban p1j2 = new Jawaban();
        p1.getHasilTes().getDaftarJawaban().add(p1j1);
        p1.getHasilTes().getDaftarJawaban().add(p1j2);
        
        Jawaban p2j1 = new Jawaban();
        Jawaban p2j2 = new Jawaban();
        p2.getHasilTes().getDaftarJawaban().add(p2j1);
        p2.getHasilTes().getDaftarJawaban().add(p2j2);
        
        Jawaban p3j1 = new Jawaban();
        Jawaban p3j2 = new Jawaban();
        p3.getHasilTes().getDaftarJawaban().add(p3j1);
        p3.getHasilTes().getDaftarJawaban().add(p3j2);
        
        Jawaban p4j1 = new Jawaban();
        Jawaban p4j2 = new Jawaban();        
        p4.getHasilTes().getDaftarJawaban().add(p4j1);
        p4.getHasilTes().getDaftarJawaban().add(p4j2);
        
        Jawaban p5j1 = new Jawaban();
        Jawaban p5j2 = new Jawaban();
        p5.getHasilTes().getDaftarJawaban().add(p5j1);
        p5.getHasilTes().getDaftarJawaban().add(p5j2);
        
        p1j1.setSoal(s1);
        p1j2.setSoal(s2);
        p2j1.setSoal(s1);
        p2j2.setSoal(s2);
        p3j1.setSoal(s1);
        p3j2.setSoal(s2);
        p4j1.setSoal(s1);
        p4j2.setSoal(s2);
        p5j1.setSoal(s1);
        p5j2.setSoal(s2);
        
        p1j1.setJawaban("Monas");
        p1j2.setJawaban("Bandung");
                
        p2j1.setJawaban("Jakarta");
        p2j2.setJawaban("Bogor");
        
        p3j1.setJawaban("Jakarta");
        p3j2.setJawaban("Bandung");
        
        p4j1.setJawaban("Yogyakarta");
        p4j2.setJawaban("Bogor");
        
        p5j1.setJawaban("Bandung");
        p5j2.setJawaban("Jakarta");
        
        
        // lulus atau tidak
        System.out.println("Pendaftar 1 : " 
        + (p1.getHasilTes().lulus() ? "Lulus" : "Tidak Lulus"));
        
        System.out.println("Pendaftar 2 : " 
        + (p2.getHasilTes().lulus() ? "Lulus" : "Tidak Lulus"));
        
        System.out.println("Pendaftar 3 : " 
        + (p3.getHasilTes().lulus() ? "Lulus" : "Tidak Lulus"));
        
        System.out.println("Pendaftar 4 : " 
        + (p4.getHasilTes().lulus() ? "Lulus" : "Tidak Lulus"));
        
        System.out.println("Pendaftar 5 : " 
        + (p5.getHasilTes().lulus() ? "Lulus" : "Tidak Lulus"));
    }
}
