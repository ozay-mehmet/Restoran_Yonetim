import java.lang.String;
import java.util.Date;

public class Musteri extends Kisi{
    public Musteri(){}
    public Musteri(String ad){
        super(ad);
    }

    // siparis ver metodu sayesinde siparis verilmiştir.
    public Siparis siparisVer(Yemek yemek, Icecek icecek){
        System.out.println(yemek.getAd()+" ten almak istiyorum");
        System.out.println(icecek.getAd()+" dan almak istiyorum\n");
        return new Siparis(yemek,icecek,new Garson(),new Musteri(),new Date());
    }
}
