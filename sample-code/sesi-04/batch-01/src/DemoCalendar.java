public class DemoCalendar{
    public static void main(String[] xx){
        DemoCalendar c = new DemoCalendar();
        c.hitungHariSwitch(1, 2011);
    }

    public Integer hitungHariSwitch(Integer bulan, Integer tahun){
        switch(bulan){
            case 1: // fall through            
            case 3:            
            case 5:            
            case 7:     
                return 31;    
        }
        
        return 0;
    }
    
    public Integer hitungHariIf(Integer bulan, Integer tahun){
        if(bulan == 1){
            return 31;
        } else if(bulan == 1){
            return 31;
        } else if(bulan == 3){
            return 31;
        } else if(bulan == 5){
            return 31;
        } else if(bulan == 7){
            return 31;
        } else if(bulan == 8){
            return 31;
        } else if(bulan == 10){
            return 31;
        } else if(bulan == 10){
            return 31;
        } 
        
        return 0;
    }
}
