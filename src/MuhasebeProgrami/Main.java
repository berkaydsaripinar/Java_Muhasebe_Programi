package MuhasebeProgrami;

public class Main {
    public static void main(String[] args) {
       urunListele();
    }

    private static void urunListele() {
        for(UrunSinifi urun : Database.urunler){
            System.out.println("Ürün Adı: " + urun.getUrunIsmi());
            System.out.println("Ürün Fiyatı: " + urun.getUrunFiyati());
            System.out.println("\n************************\n");
        }
    }
}