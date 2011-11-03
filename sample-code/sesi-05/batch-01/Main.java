public class Main {
    public static void main(String[] xx){
        Integer x = 10;        
        
        // Tidak perlu ada object/instance
        // untuk menggunakan static variable/method
        System.out.println(Mahasiswa.jumlahMahasiswa);
        Mahasiswa.coba();
        
        
        // membuat object m1 dari class Mahasiswa
        // proses disebut : instantiate
        // hasilnya adalah object / instance
        // object m1 adalah instance dari class Mahasiswa
        Mahasiswa m1 = new Mahasiswa();
        
        m1.npm = "123";
        System.out.println("NPM : "+m1.npm);
        
        // private tidak boleh diakses
        //m1.nama = "Endy"; 
        //System.out.println("Nama : "+m1.nama);
        
        m1.setNama("Endy");
        System.out.println("Nama : "+m1.getNama());
        
        m1.jumlahMahasiswa = 1;
        System.out.println("Jumlah : "+m1.jumlahMahasiswa);
        
        Mahasiswa m2 = new Mahasiswa();
        m2.npm = "456";
        m2.setNama("Ridho");
        m2.jumlahMahasiswa = 2;
        
        System.out.println("NPM : "+m2.npm);
        System.out.println("Nama : "+m2.getNama());
        System.out.println("Jumlah m2 : "+m2.jumlahMahasiswa);        
        System.out.println("Jumlah m1 : "+m1.jumlahMahasiswa);
        
        // nilai npm untuk m1 dan m2 berbeda
        // karena npm adalah instance variabel
        
        // nilai jumlahMahasiswa sama, 
        // karena sharing di semua instance
         
    }
}










