package aplikasi.krs;

import java.util.List;
import java.util.ArrayList;

public class RencanaStudi {
    private String npm;
    private String nama;
    private Double ipk;
    private Integer semester;

    private List<RencanaStudiDetail> daftarRencanaStudiDetail
        = new ArrayList<RencanaStudiDetail>();

    public void tambahDetail(RencanaStudiDetail rd){
        rd.setRencanaStudi(this);
        daftarRencanaStudiDetail.add(rd);
    }

    public List<RencanaStudiDetail> getDaftarRencanaStudiDetail(){
        return daftarRencanaStudiDetail;
    }

    public String getNpm(){
        return npm;
    }

    public void setNpm(String s){
        this.npm = s;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String s){
        this.nama = s;
    }

    public Double getIpk(){
        return ipk;
    }

    public void setIpk(Double s){
        this.ipk = s;
    }

    public Integer getSemester(){
        return semester;
    }

    public void setSemester(Integer s){
        this.semester = s;
    }
}
