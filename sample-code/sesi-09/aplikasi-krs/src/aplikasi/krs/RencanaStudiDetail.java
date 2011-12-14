package aplikasi.krs;

public class RencanaStudiDetail {
    private StatusRencanaStudiDetail status = StatusRencanaStudiDetail.PROPOSED;
    private RencanaStudi rencanaStudi;
    private Matakuliah matakuliah;
    private Dosen reviewer;


    public RencanaStudi getRencanaStudi(){
        return rencanaStudi;
    }

    public void setRencanaStudi(RencanaStudi s){
        this.rencanaStudi = s;
    }

    public Matakuliah getMatakuliah(){
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah s){
        this.matakuliah = s;
    }

    public StatusRencanaStudiDetail getStatus(){
        return status;
    }

    public void setStatus(StatusRencanaStudiDetail s){
        this.status = s;
    }
}
