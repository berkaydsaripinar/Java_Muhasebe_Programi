package MuhasebeProgrami;
//urun
public class UrunSinifi {
    private String urunIsmi;
    private double urunFiyati;

    public UrunSinifi(String urunIsmi, double urunFiyati){
        this.urunIsmi = urunIsmi;
        this.urunFiyati = urunFiyati;

    }
    public String getUrunIsmi(){
        return urunIsmi;
    }
    public double getUrunFiyati(){
        return urunFiyati;
    }
}
