import java.lang.String;

abstract public class Urun {
    protected String ad;
    protected double fiyat;

    public Urun(){}
    public Urun(String ad, double fiyat){
        this.ad = ad;
        this.fiyat = fiyat;
    }
    public String getAd() {
        return ad;
    }
    public double getFiyat() {
        return fiyat;
    }

    // abstract metot sayesinde override edilmesi zorunlu kılınmıştır.
    abstract void urunBilgisi();
}
