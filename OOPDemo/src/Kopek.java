import java.security.PublicKey;

public class Kopek extends Hayvan{
    private String isim;
    private String cins;
    private int yas;

    public Kopek(String isim, String cins, int yas)
    {
        // this dediğin zaman sınıf içerisindekini
        // kasıt ettiğini belirtiyorsun
        this.isim=isim;
        this.cins=cins;
        this.yas=yas;
    }

    public String getIsim() {
        return isim;
    }
    public String getCins() {
        return cins;
    }
    public int getYas() {
        return yas;
    }

    public String setIsim(String yeniIsim)
    {
        return this.isim = yeniIsim;
    }

    public String setCins(String yeniCins)
    {
        return this.cins= yeniCins;
    }
    public int setYas(int yeniYas)
    {
     return this.yas = yeniYas;
    }

    @Override
    void sesCikar() {
        System.out.println();
    }
    @Override
    public void uyku()
    {
        System.out.println("Kopek uyuyor ve horluyor");
    }
}
