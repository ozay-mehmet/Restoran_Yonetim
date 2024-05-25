import java.util.*;
import java.io.*;

public class Siparis {
    private Yemek yemek;
    private Icecek icecek;
    public Garson garson;
    private Musteri musteri;

    public Date tarih;
    public static long siparisNo = 0;

    public Siparis(){}
    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih){
        this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        this.tarih = tarih;
       
    }

    // siparis bilgileri konsola yazdırılıyor
    public void siparisBilgisi(){
        System.out.println("**** Siparis Bilgileri ****");
        System.out.println(
                "Yemek : "+yemek.getAd()
                +" - "+yemek.fiyat
                +"\nIcecek : "+ icecek.getAd()
                +" - "+icecek.fiyat
                +"\nGarson : "+garson.getAd()
                +"\nMusteri : "+musteri.getAd()
                +"\nZaman : "+tarih
        );
        System.out.println("\nSiparis Alindi...\n");
        siparisNo++;

    }

    // siparis bilgileri dosyaya yazdırılıyor
    public void siparisYazdir(PrintWriter yazici){
        try{
            yazici.println("**** Siparis Bilgileri ****");
            yazici.println("Yemek : "+yemek.getAd()+" - "+yemek.getFiyat());
            yazici.println("Icecek : "+icecek.getAd()+" - "+icecek.getFiyat());
            yazici.println("Garson : "+garson.getAd());
            yazici.println("Musteri : "+musteri.getAd());
            yazici.println("Zaman : "+tarih.toString());
            yazici.println("Siparis Alindi...\n");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (yazici != null) yazici.close();
        }
    }

}
