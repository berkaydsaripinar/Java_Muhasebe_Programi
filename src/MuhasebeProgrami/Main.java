package MuhasebeProgrami;

import java.util.*;

import static MuhasebeProgrami.Database.urunBul;
import static MuhasebeProgrami.Database.urunFiyatGuncelle;

public class Main {
    static int stokToplam = 0;
    static int toplamUrunStok = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (KarZararSinifi karZararSinifi : Database.karZararVerileri) {
            Database.karZararEkle(karZararSinifi);
        }
        for (MusteriSinifi musteri : Database.musteriler) {
            Database.musteriEkle(musteri);
        }
        for (UrunSinifi urun : Database.urunler) {
            Database.urunEkle(urun);
        }
        // Oluşturduğum database'i daha rahat ekleme çıkarma yapmak için Array'e aktarıyorum.

        while (true) {
            System.out.print("(1) - Müşteri Menüsü\n(2) - Depo Menüsü\n(3) - Kar-Zarar Hesaplama\n(0) - Çıkış\nLütfen seçimizi yapınız: ");
            int giris = scanner.nextInt();
            if (giris == 1) {
                musteriIslemleri();
            } else if (giris == 2) {
                depoIslemleri();
            } else if (giris == 3) {
                karZararHesapla();
            } else if (giris == 0) {
                scanner.close();
                break;
            } else {
                System.out.println("Yanlış seçim yaptınız.");
            }
        }
    }

    private static void depoIslemleri() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1) - Depodaki Ürünleri Listele\n(2) - Ürün Ara\n(3) - Ürün Ekle\n(4) - Ürün Sil\n(5) - Stok Güncelle\n(6) - Ürün Fiyatı Güncelle\nLütfen seçiminizi yapınız: ");
        int secim = scanner.nextInt();

        if (secim == 1) {
            urunListele();
        } else if (secim == 2) {
            urunAra();
        } else if (secim == 3) {
            urunEkle();
        } else if (secim == 4) {
            urunSil();
        } else if (secim == 5) {
            urunStokGuncelle();
        } else if (secim == 6) {
            urunFiyatGuncelle();
        } else {
            System.out.println("Yanlış seçim yaptınız.");
        }
    }

    private static void musteriIslemleri() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1) - Müşteri Listele\n(2) - Müşteri Ara\n(3) - Müşteri Ekle\nLütfen seçimizi yapınız: ");
        int secim = scanner.nextInt();

        if (secim == 1) {
            musteriListele();
        } else if (secim == 2) {
            musteriAra();
        } else if (secim == 3) {
            musteriEkle();
        } else {
            System.out.println("Yanlış seçim yaptınız.");
        }
    }

    private static void urunListele() {
        stokToplam = 0;
        for (UrunSinifi urun : Database.urunArrayList) {
            stokToplam++;

            System.out.println("Ürün Adı: " + urun.getUrunIsmi());
            System.out.println("Ürün Fiyatı: " + urun.getUrunFiyati());
            System.out.println("Ürün Stoğu: " + urun.getUrunStok());
            System.out.println("\n************************\n");

        }
        System.out.println("\nToplam farklı ürün stoğu: " + stokToplam);
        int kalanStok = toplamUrunStok - stokToplam;
        System.out.println("Depoya " + kalanStok + " farklı ürün daha alabilirsiniz\n");
    }

    private static void urunAra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün Adı: ");
        String urunAdi = scanner.nextLine();

        UrunSinifi urun = Database.urunBul(urunAdi);
        if (urun != null) {
            System.out.println("\nÜrün bulundu.");
            System.out.println("Ürün Adı: " + urun.getUrunIsmi());
            System.out.println("Ürün Fiyatı: " + urun.getUrunFiyati());
            System.out.println("Ürün Stoğu: " + urun.getUrunStok());
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }

    public static void urunEkle() {
        Scanner scanner = new Scanner(System.in);
        if (!(stokToplam > toplamUrunStok)) {
            System.out.print("Ürün Adı: ");
            String urunIsmi = scanner.nextLine();

            System.out.print("Ürün Fiyatı: ");
            double urunFiyati = scanner.nextDouble();

            System.out.print("Ürün Stoğu: ");
            int urunStok = scanner.nextInt();

            scanner.nextLine(); // Enter karakterini tüketmek için

            UrunSinifi urun = new UrunSinifi(urunIsmi, urunFiyati, urunStok);

            Database.urunEkle(urun);

            System.out.println("Ürün başarıyla eklendi.");
        } else {
            System.out.println("Toplam farklı ürün stoğu dolu. Daha fazla ürün ekleyemezsiniz.");
        }
    }

    private static void urunSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz ürünün adını girin: ");
        String urunAdi = scanner.nextLine();
        Database.urunSil(urunAdi);
    }

    private static void urunStokGuncelle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stok miktarını güncellemek istediğiniz ürünün adını girin: ");
        String urunAdi = scanner.nextLine();

        System.out.print("Yeni stok miktarını girin: ");
        int yeniStok = scanner.nextInt();

        Database.urunStokGuncelle(urunAdi, yeniStok);
    }

    private static void urunFiyatGuncelle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fiyatını güncellemek istediğiniz ürünün adını girin: ");
        String urunAdi = scanner.nextLine();

        System.out.print("Yeni fiyatı  girin: ");
        int yeniFiyat = scanner.nextInt();

        Database.urunFiyatGuncelle(urunAdi, yeniFiyat);
    }

    private static void musteriAra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Müşteri Adı: ");
        String musteriAdi = scanner.nextLine();

        MusteriSinifi musteri = Database.musteriBul(musteriAdi);

        if (musteri != null) {
            System.out.println("Müşteri bulundu.");
            System.out.println("Müşteri Numarası: " + musteri.getMusteriNum());
            System.out.println("Müşteri Adı: " + musteri.getMusteriIsmi());
            System.out.println("Müşteri Soyadı: " + musteri.getMusteriSoyadi());
            System.out.println("Müşteri Maili: " + musteri.getMusteriMail());
        } else {
            System.out.println("Müşteri bulunamadı.");
        }
    }

    public static void musteriEkle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Müşteri Adı: ");
        String musteriAdi = scanner.nextLine();

        System.out.print("Müşteri Soyadı: ");
        String musteriSoyadi = scanner.nextLine();

        System.out.print("Müşteri Maili: ");
        String musteriMail = scanner.nextLine();

        System.out.print("Müşteri Numarası(Lütfen 30'dan büyük bir sayı girin): ");
        int musteriNum = scanner.nextInt();
        scanner.nextLine(); // Enter karakterini tüketmek için

        MusteriSinifi musteri = new MusteriSinifi(musteriAdi, musteriSoyadi, musteriMail, musteriNum);

        Database.musteriEkle(musteri);

        System.out.println("Müşteri başarıyla eklendi.");
    }

    private static void musteriListele() {
        int toplam = 0;
        for (MusteriSinifi musteri : Database.musteriArrayList) {
            toplam++;
            System.out.println("Müşteri Numarası: " + musteri.getMusteriNum());
            System.out.println("Müşteri Adı: " + musteri.getMusteriIsmi());
            System.out.println("Müşteri Soyadı: " + musteri.getMusteriSoyadi());
            System.out.println("Müşteri Maili: " + musteri.getMusteriMail());
            System.out.println("\n************************\n");
        }
        System.out.println("Toplam müşteri sayısı: " + toplam);
    }

    private static void karZararHesapla() {
        double toplamKarZarar = 0.0;
        System.out.print("(1) - Mevcut Verileri Gör\n(2) - Kar-Zarar Ekle\nLütfen seçim yapın:");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();
        if (secim == 1) {
            int donemHesap = 0;
            for (KarZararSinifi karZarar : Database.karZararSinifiArrayList) {

                double donemKarZarar = karZarar.hesaplaKarZarar();
                toplamKarZarar += donemKarZarar;
                if (donemKarZarar > 0) {
                    donemHesap++;
                    System.out.println(donemHesap + ".Dönem Kar/Zarar: + " + donemKarZarar);
                } else {
                    System.out.println("Dönem Kar/Zarar: - " + donemKarZarar);
                }
            }
            if (toplamKarZarar > 0) {
                System.out.println("Toplam Kar/Zarar(Kasada olması gereken para): + " + toplamKarZarar);
            } else {
                System.out.println("(DİKKAT, ZARAR ! )Toplam Kar/Zarar: " + toplamKarZarar);
            }
        } else if (secim == 2) {
            System.out.print("(!!) - Dönemsel Kar/Zarar Girişi Yapabilirsiniz.");
            System.out.print("(!!) - Bu dönemin kârını giriniz: ");
            double gelir = scanner.nextDouble();
            System.out.print("(!!) - Bu dönemin zararını giriniz: ");
            double gider = scanner.nextDouble();
            scanner.nextLine();
            KarZararSinifi karZararSinifi = new KarZararSinifi(gelir, gider);

            Database.karZararEkle(karZararSinifi);
        }
    }
}