package MuhasebeProgrami;
//urun
public class UrunSinifi {
    private String urunIsmi;
    private double urunFiyati;
    private int urunStok;
    public UrunSinifi(String urunIsmi, double urunFiyati, int urunStok){
        this.urunIsmi = urunIsmi;
        this.urunFiyati = urunFiyati;
        this.urunStok = urunStok;

    }
    public String getUrunIsmi(){
        return urunIsmi;
    }
    public double getUrunFiyati(){
        return urunFiyati;
    }
    public int getUrunStok(){return urunStok;}
}
