package aplikasi.psb;

public class Jawaban {
    private Soal soal;
    private String jawaban;

    public void setSoal(Soal s){
        this.soal = s;
    }

    public void setJawaban(String j){
        this.jawaban = j;
    }

    public Boolean benar(){
        return soal
        .getJawabanBenar()
        .equalsIgnoreCase(this.jawaban);
    }
}
