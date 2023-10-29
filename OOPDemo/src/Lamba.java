public class Lamba {
    public  boolean durumu = false;
    private String konum;
    public Lamba(String OdaKonumu)
    {
        konum = OdaKonumu;
        System.out.println(" Odamizin Konumu" + konum);
    }
    public void lambaDurumu()
    {
        if(durumu)
        {
            System.out.println(konum+ " Lamba Acik");
        }
        else
        {
            System.out.println(konum + " Lamba Kapali");
        }
    }
}
