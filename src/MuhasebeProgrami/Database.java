package MuhasebeProgrami;

import java.util.*;

public class Database {

    public static UrunSinifi[] urunler = {
            new UrunSinifi("Gofret", 100.0, 250),
            new UrunSinifi("Bisküvi", 10.5, 150),
            new UrunSinifi("Un", 20.0, 500),
            new UrunSinifi("Pirinç", 12.5, 300),
            new UrunSinifi("Şeker", 8.0, 200),
            new UrunSinifi("Süt", 2.5, 1000),
            new UrunSinifi("Yoğurt", 3.0, 800),
            new UrunSinifi("Tavuk Göğsü", 25.0, 120),
            new UrunSinifi("Dondurma", 7.0, 180),
            new UrunSinifi("Çikolata", 4.5, 250),
            new UrunSinifi("Makarna", 6.0, 350),
            new UrunSinifi("Salça", 8.0, 300),
            new UrunSinifi("Zeytinyağı", 15.0, 400),
            new UrunSinifi("Domates", 2.0, 700),
            new UrunSinifi("Patates", 1.5, 600),
            new UrunSinifi("Elma", 3.0, 900),
            new UrunSinifi("Armut", 4.0, 800),
            new UrunSinifi("Portakal", 5.0, 750),
            new UrunSinifi("Muz", 6.0, 600),
            new UrunSinifi("Çilek", 10.0, 400),
            new UrunSinifi("Ananas", 9.0, 150),
            new UrunSinifi("Kavun", 11.0, 300),
            new UrunSinifi("Limon", 2.5, 500),
            new UrunSinifi("Karpuz", 18.0, 250),
            new UrunSinifi("Kivi", 5.0, 400),
            new UrunSinifi("Mango", 12.0, 200),
            new UrunSinifi("Kiraz", 7.0, 300),
            new UrunSinifi("Vişne", 9.0, 250),
            new UrunSinifi("Ahududu", 6.5, 350),
            new UrunSinifi("Böğürtlen", 14.0, 180),
            new UrunSinifi("Dut", 3.5, 200),
            new UrunSinifi("Limon", 3.5, 400),
            new UrunSinifi("Üzüm", 7.0, 300),
            new UrunSinifi("Paket Çay", 15.0, 180),
            new UrunSinifi("Kahve", 25.0, 100),
            new UrunSinifi("Salatalık", 2.0, 350),
            new UrunSinifi("Salam", 8.5, 250),
            new UrunSinifi("Sosis", 7.0, 300),
            new UrunSinifi("Mısır Gevreği", 12.0, 400),
            new UrunSinifi("Zeytin", 10.0, 280),
            new UrunSinifi("Kraker", 6.0, 500),
            new UrunSinifi("Makarna", 3.5, 600),
            new UrunSinifi("Ton Balığı", 18.0, 200),
    };
    public static ArrayList<UrunSinifi> urunArrayList = new ArrayList<>();

    public static MusteriSinifi[] musteriler = {
            new MusteriSinifi("Berkay", "Sarıpınar", "berkaysaripinar@gmail.com", 1),
            new MusteriSinifi("Doğancan", "Öztürk", "dogancan@gmail.com", 2),
            new MusteriSinifi("Ayşe", "Yılmaz", "ayseyilmaz@gmail.com", 3),
            new MusteriSinifi("Mehmet", "Kaya", "mehmetkaya@gmail.com", 4),
            new MusteriSinifi("Zeynep", "Aydın", "zeynepaydin@gmail.com", 5),
            new MusteriSinifi("Ahmet", "Demir", "ahmetdemir@gmail.com", 6),
            new MusteriSinifi("Elif", "Özdemir", "elifozdemir@gmail.com", 7),
            new MusteriSinifi("Cem", "Can", "cemcan@gmail.com", 8),
            new MusteriSinifi("Aslı", "Aksoy", "asliaksoy@gmail.com", 9),
            new MusteriSinifi("Emre", "Güneş", "emregunes@gmail.com", 10),
            new MusteriSinifi("Zehra", "Ateş", "zehraates@gmail.com", 11),
            new MusteriSinifi("Okan", "Korkmaz", "okankorkmaz@gmail.com", 12),
            new MusteriSinifi("Selin", "Toprak", "selintoprak@gmail.com", 13),
            new MusteriSinifi("Batuhan", "Yıldız", "batuhanyildiz@gmail.com", 14),
            new MusteriSinifi("Ceren", "Kara", "cerenkara@gmail.com", 15),
            new MusteriSinifi("Murat", "Çelik", "muratcelik@gmail.com", 16),
            new MusteriSinifi("Ebru", "Kurt", "ebrukurt@gmail.com", 17),
            new MusteriSinifi("Oğuz", "Türk", "oguzturk@gmail.com", 18),
            new MusteriSinifi("Yasemin", "Başar", "yaseminbasar@gmail.com", 19),
            new MusteriSinifi("Ali", "Özkan", "aliozkan@gmail.com", 20),
            new MusteriSinifi("Fatma", "Yıldırım", "fatmayildirim@gmail.com", 21),
            new MusteriSinifi("Hüseyin", "Açıkgöz", "huseyinacikgoz@gmail.com", 22),
            new MusteriSinifi("Gizem", "Kaya", "gizemkaya@gmail.com", 23),
            new MusteriSinifi("Selim", "Demir", "selimdemir@gmail.com", 24),
            new MusteriSinifi("Esra", "Akçay", "esraakcay@gmail.com", 25),
            new MusteriSinifi("Ömer", "Kurtuluş", "omerkurtulus@gmail.com", 26),
            new MusteriSinifi("Nur", "Doğan", "nurdogan@gmail.com", 27),
            new MusteriSinifi("Mert", "Ergin", "mertergin@gmail.com", 28),
            new MusteriSinifi("Seda", "Yılmaz", "sedayilmaz@gmail.com", 29),
            new MusteriSinifi("Umut", "Güler", "umutguler@gmail.com", 30),
    };
    public static ArrayList<MusteriSinifi> musteriArrayList = new ArrayList<>();
    public static KarZararSinifi[] karZararVerileri = {
            new KarZararSinifi(5000.0, 3000.0), // Dönemler
            new KarZararSinifi(6000.0, 4000.0),
            new KarZararSinifi(7000.0, 4500.0)
    };
    public static ArrayList<KarZararSinifi> karZararSinifiArrayList = new ArrayList<>();

    public static UrunSinifi urunBul(String urunAdi) {
        for (UrunSinifi urun : urunArrayList) {
            if (urun.getUrunIsmi().equals(urunAdi)) {
                return urun;
            }
        }
        return null;
    }

    public static void urunEkle(UrunSinifi urun) {
        urunArrayList.add(urun);
    }

    public static MusteriSinifi musteriBul(String musteriAdi) {
        for (MusteriSinifi musteri : musteriArrayList) {
            if (musteri.getMusteriIsmi().equals(musteriAdi)) {
                return musteri;
            }
        }
        return null;
    }

    public static void musteriEkle(MusteriSinifi musteri) {
        musteriArrayList.add(musteri);
    }

    public static void karZararEkle(KarZararSinifi karZararSinifi) {
        karZararSinifiArrayList.add(karZararSinifi);
    }

    public static void urunSil(String urunAdi) {
        UrunSinifi urun = urunBul(urunAdi);
        if (urun != null) {
            urunArrayList.remove(urun);
            System.out.println(urunAdi + " adlı ürün silindi.");
        } else {
            System.out.println(urunAdi + " adlı ürün bulunamadı.");
        }
    }


    public static void urunStokGuncelle(String urunAdi, int yeniStokMiktar) {
        UrunSinifi urun = urunBul(urunAdi);
        if (urun != null) {
            urun.setUrunStok(yeniStokMiktar);
            System.out.println(urunAdi + " adlı ürünün stok miktarı güncellendi.");
        } else {
            System.out.println(urunAdi + " adlı ürün bulunamadı.");
        }
    }

    public static void urunFiyatGuncelle(String urunAdi, int yeniFiyat) {
        UrunSinifi urun = urunBul(urunAdi);
        if (urun != null) {
            urun.setUrunFiyati(yeniFiyat);
            System.out.println(urunAdi + " adlı ürünün fiyatı güncellendi");
        } else {
            System.out.println(urunAdi + " adlı ürün bulunamadı");
        }
    }

}


