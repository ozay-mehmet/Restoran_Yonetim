import java.util.*;

public class Restoran {
    private ArrayList<Urun> menu;
    private ArrayList<Siparis> siparisler;
    private ArrayList<Musteri> musteriler;
    private ArrayList<Garson> garsonlar;
    public Restoran(){
        this.menu = new ArrayList<>();
        this.siparisler = new ArrayList<>();
        this.musteriler = new ArrayList<>();
        this.garsonlar = new ArrayList<>();
    }

    // menuye tüm urunler (garsonlar, yemekler, icecekler ve musteriler) eklenmistir.
    public void menuyeEkle(Urun urun){
        menu.add(urun);
    }
    public void musteriEkle(Musteri musteri){
        musteriler.add(musteri);
    }
    public void garsonEkle(Garson garson){
        garsonlar.add(garson);
    }

    // menu konsolda gosterilmistir.
    public void menuyuGoster() {
        for (Urun yemek : menu) {
            yemek.urunBilgisi();
        }
    }

    // girilen sayi kadar rastgele siparis olusturulmustur.
    public void rastgeleSiparisOlustur(int sayi) {
        Random random = new Random();
        ArrayList<Yemek> yemekListesi = new ArrayList<>();
        ArrayList<Icecek> icecekListesi = new ArrayList<>();

        // Menüden yemek ve içecekler ayrıldı ==> Her bir yemek ve içecek ekleniyor
        for (Urun urunler : menu) {
            if (urunler instanceof Yemek) {
                yemekListesi.add((Yemek) urunler);
            } else if (urunler instanceof Icecek) {
                icecekListesi.add((Icecek) urunler);
            }
        }

        // müsteriler, garsonlar, yemekler ve içecekler random bir şekilde seçildi
        
        for(int i = 0; i < sayi; i++) {
            Musteri musteri = musteriler.get(random.nextInt(musteriler.size()));
            Garson garson = garsonlar.get(random.nextInt(garsonlar.size()));
            
            // Menüden rastgele bir yemek seciliyor
            Yemek yemek = yemekListesi.get(random.nextInt(yemekListesi.size()));
            
            // Menüden rastgele bir içecek seçiliyor.
            Icecek icecek = icecekListesi.get(random.nextInt(icecekListesi.size()));
            
            Date tarih = new Date();
            
            Siparis siparis = new Siparis(yemek,icecek,garson,musteri,tarih);
            
            // garson sipariş alıyor
            garson.siparisAl(siparis, siparisler); 
            
            // siparişlere müşterinin vermiş olduğu sipariş ekleniyor.
            siparisler.add(musteri.siparisVer(yemek, icecek));
            
            // sipariş bilgilerinin konsola yazdırımı gerçekleştirildi.
            siparis.siparisBilgisi();
           
        }
    }


}
