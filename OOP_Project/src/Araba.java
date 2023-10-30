public class Araba {

    private String kasaTipi;
    private String model;
    private  int kullanimKm;
    private int fiyat;

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public void setKullanimKm(int kullanimKm) {
        this.kullanimKm = kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    private int kapi;

    public Araba(String kasaTipi, String model,int kullanimKm,int fiyat, int kapi)
    {
        this.kasaTipi=kasaTipi;
        this.kapi=kapi;
        this.kullanimKm=kullanimKm;
        this.model=model;
        this.fiyat=fiyat;
    }
    public void arabayiSur(int surulenKm)
    {
        this.kullanimKm += surulenKm;
        System.out.println("Arabanin yeni kilometresi "+ this.kullanimKm);
    }

    public int satisFiyati(int yeniSatisFiyati)
    {
        return this.fiyat = yeniSatisFiyati;
    }
}
