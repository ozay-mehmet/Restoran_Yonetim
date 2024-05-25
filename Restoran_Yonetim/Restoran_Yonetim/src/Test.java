public class Test {
    public static void main(String[] args) {   
        	System.out.println("-------- MENU --------");
    	// Restoran oluştur
        Restoran restoran = new Restoran();

        // Menü öğelerini oluştur ve ekle
        Yemek[] yemekler = new Yemek[5];
        Icecek[] icecekler = new Icecek[5];
        
        // yemekler olusturuldu
        yemekler[0] = new Yemek("Corba",50,"Corba");
        yemekler[1] = new Yemek("Kofte",200,"Firin");
        yemekler[2] = new Yemek("Kebab",250,"Firin");
        yemekler[3] = new Yemek("Patlican",80,"Kizartma");
        yemekler[4] = new Yemek("Iskender",300,"Firin");
        
        // icecekler olusturuldu
        icecekler[0] = new Icecek("Kola",50,"Buyuk");
        icecekler[1] = new Icecek("Ayran",20,"Kucuk");
        icecekler[2] = new Icecek("Fanta",25,"Kutu");
        icecekler[3] = new Icecek("Sira",40,"Orta");
        icecekler[4] = new Icecek("Salgam",45,"Buyuk");
        
        // yemekler menuye eklendi
        for(int i = 0; i < yemekler.length; i++) {
        	restoran.menuyeEkle(yemekler[i]);
        }
        
        // icecekler menuye eklendi
        for(int i = 0; i < icecekler.length; i++) {
        	restoran.menuyeEkle(icecekler[i]);
        }
        
        // menu gösteriliyor 
        restoran.menuyuGoster();
        
        Musteri[] musteriler = new Musteri[5];
        Garson[] garsonlar = new Garson[5];
         
        // musteriler olusturuldu
        musteriler[0] = new Musteri("Mehmet");
        musteriler[1] = new Musteri("Zeynep");
        musteriler[2] = new Musteri("Yusuf");
        musteriler[3] = new Musteri("Ayse");
        musteriler[4] = new Musteri("Ahmet");
        
        // garsonlar olusturuldu
        garsonlar[0] = new Garson("Eslem");
        garsonlar[1] = new Garson("Ismail");
        garsonlar[2] = new Garson("Irem");
        garsonlar[3] = new Garson("Furkan");
        garsonlar[4] = new Garson("Yagmur");
        
        // musteriler restorana eklendi
        for(Musteri x : musteriler) {
        	restoran.musteriEkle(x);
        }
        
        // garsonlar restorana eklendi
        for(Garson y : garsonlar) {
        	restoran.garsonEkle(y);
        }
    
        // rastgele siparis olusturuluyor.
        restoran.rastgeleSiparisOlustur(10);
        
        System.out.println("Siparisiniz hazirlaniyor...\n");
         
    }
}