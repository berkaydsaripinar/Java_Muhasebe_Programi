package MuhasebeProgrami;

public class MusteriSinifi {
    private String musteriIsmi, musteriSoyadi, musteriMail;
    private int musteriNum;

    public MusteriSinifi(String musteriIsmi, String musteriSoyadi, String musteriMail, int musteriNum) {
        this.musteriIsmi = musteriIsmi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriMail = musteriMail;
        this.musteriNum = musteriNum;
    }

    public String getMusteriIsmi() {
        return musteriIsmi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public String getMusteriMail() {
        return musteriMail;
    }

    public int getMusteriNum() {
        return musteriNum;
    }


}
