public class DemoException {
    private static Integer jumlah = 10;
    private String nama = "Dadang";
    
    public static Double pembagian(Double x, Double y) 
        throws PembagiNolException {
        System.out.println(jumlah);
        //System.out.println(nama);
        
        if(y == null || y == 0){
            throw new PembagiNolException();
        }
        
        return x/y;
    }
    
    private void testPrivate(){ 
        System.out.println(jumlah);
        System.out.println(nama);
    }
    
    public static void main(String[] xx) 
        throws PembagiNolException {
        System.out.println(DemoException.pembagian(3d,2d));
    }

}

class Demo {
    public void coba() {
        try {
            DemoException.pembagian(3d,2d);
        } catch (PembagiNolException err){
            System.out.println("Pembagi tidak boleh nol");
        }
        //new DemoException().testPrivate();
    }
}

class PembagiNolException extends Exception {}






