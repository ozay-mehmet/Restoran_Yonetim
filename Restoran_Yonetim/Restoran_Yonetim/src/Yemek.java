import java.lang.String;

public class Yemek extends Urun{
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    private String tur;
    public Yemek(){}
    public Yemek(String ad,double fiyat, String tur){
        super(ad,fiyat);
        this.tur = tur;
    }

    // urun bilgisi override edilmiştir.
    public void urunBilgisi(){
        System.out.println("Yemek adi : "+super.ad+"\nFiyat : "+super.getFiyat()+"\nTur : "+getTur());
        System.out.println("------------------");
    }
}
