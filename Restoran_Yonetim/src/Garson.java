import java.io.*;
import java.util.ArrayList;
import java.lang.String;

public class Garson extends Kisi{
    public Garson(){}
    public Garson(String ad){
        super(ad);
    }

    // siparis al metodu sayesinde dosya oluşturumu saglanmiştir.
    public void siparisAl(Siparis s, ArrayList<Siparis> siparisler) {

        String klasorYolu = "Siparisler"; 

        try {
            File klasor = new File(klasorYolu);
            
            while(klasor.exists() != true) {
            	if(klasor.mkdir()) {
            		System.out.println("Klasor basariyla olusturuldu : "+klasor.getName()+"\n");
            	}
            	else {
            		System.out.println("Klasor olusturulurken bir hata olustu.\n");
            	}
            }
            
            String dosyaYolu = "Siparisler\\"+Siparis.siparisNo+".txt"; 
            
            File dosya = new File(dosyaYolu);
            
            FileWriter fileWriter = new FileWriter(dosya, true);
            PrintWriter yazici = new PrintWriter(fileWriter);
            s.siparisYazdir(yazici);

            yazici.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Hata : " + e.getMessage()+"\n");
            e.printStackTrace();
        }
        
    }
}
