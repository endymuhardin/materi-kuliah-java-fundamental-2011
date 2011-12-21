package aplikasi.mahasiswa;

import java.io.File;
import java.io.FileWriter;

public class DatabaseMahasiswaCsv implements DatabaseMahasiswa {
    private Boolean pakaiHeader;

    private File file;
    private FileWriter writer;

    public DatabaseMahasiswaCsv(String lokasi, Boolean header){
        try {
            pakaiHeader = header;

            file = new File(lokasi);
            writer = new FileWriter(file, true);

            // untuk file kosong, tulis header bila perlu
            if(pakaiHeader && !(file.length() > 0)){
                writer.write("npm,nama\n");
                writer.flush();
            }
        } catch (Exception err){
            err.printStackTrace();
        }
    }

    public void simpan(Mahasiswa m){
        try {
            String npm = m.getNpm() == null ? "" : m.getNpm();
            String nama = m.getNama() == null ? "" : m.getNama();

            String record = String.format("%s,%s%n", npm, nama);
            writer.write(record);
            writer.flush();

        } catch (Exception err){
            err.printStackTrace();
        }
    }
}
