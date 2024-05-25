import java.lang.String;

public class Icecek extends Urun{
    private String boy;

    public Icecek(){}
    public Icecek(String ad, double fiyat, String boy){
        super(ad,fiyat);
        this.boy = boy;
    }

    // urun bilgisi override edilmiştir.
    public void urunBilgisi(){
        System.out.println("Icecek Adi : "+super.ad+"\nFiyat : "+super.getFiyat()+"\nBoyut : "+boy);
        System.out.println("------------------");
    }
}
