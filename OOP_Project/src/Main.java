// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      Sedan sedan = new Sedan("Cupra",10000,500000,5);
      System.out.println("Aracimin modeli " + sedan.getModel() + " Kullanilan Km " + sedan.getKullanimKm() + " Fiyat: " + sedan.getFiyat() + " Kapi : " + sedan.getKapi());

      sedan.arabayiSur(5000);
      sedan.satisFiyati(4950000);

      System.out.println("Aracimin modeli " + sedan.getModel() + " Kullanilan Km " + sedan.getKullanimKm() + " Fiyat: " + sedan.getFiyat() + " Kapi : " + sedan.getKapi());

      Hatchback hatchback = new Hatchback("Volvo", 0, 1000000,5 );
      hatchback.arabayiSur(1000);
      hatchback.satisFiyati(950000);

      System.out.println("Aracimin modeli" + hatchback.getModel() + " Kullailan Km "+ hatchback.getKullanimKm() + " Fiyati : " + hatchback.getFiyat() + " Kapi " + hatchback.getKapi());
   }
}