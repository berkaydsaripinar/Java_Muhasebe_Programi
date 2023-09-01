package MuhasebeProgrami;

public class KarZararSinifi {
    private double gelir;
    private double gider;

    public KarZararSinifi(double gelir, double gider) {
        this.gelir = gelir;
        this.gider = gider;
    }

    public double getGelir() {
        return gelir;
    }

    public void setGelir(double gelir) {
        this.gelir = gelir;
    }

    public double getGider() {
        return gider;
    }

    public void setGider(double gider) {
        this.gider = gider;
    }

    public double hesaplaKarZarar() {
        return gelir - gider;
    }
}
