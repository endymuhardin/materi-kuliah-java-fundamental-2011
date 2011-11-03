public class Mahasiswa {
    // static variabel : variabel milik class
    // nilainya sama, di-sharing di semua instance
    public static Integer jumlahMahasiswa = 0;

    // instance variable : variabel milik object
    // nilainya berbeda untuk masing2 object
    private String nama;
    public String npm;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String n){
        this.nama = n;
    }
    
    // static method
    public static void coba(){
        System.out.println("Static Method");
        // tidak boleh menggunakan instance variable/method
        //System.out.println("NPM : "+npm);
    }
}





