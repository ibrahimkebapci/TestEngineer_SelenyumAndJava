import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> isimlerListesi = new ArrayList<>();

        isimlerListesi.add("Ozan");
        isimlerListesi.add("Suzi");
        System.out.println(isimlerListesi);

        isimlerListesi.add("Onur");
        isimlerListesi.add("Tibet");
        System.out.println(isimlerListesi);

        System.out.println(isimlerListesi.get(0));
        isimlerListesi.set(1,"Hazal");

        String silinenIsim = isimlerListesi.remove(0);

        System.out.println(silinenIsim + " Listemizden çıkartılmıştır.");
        System.out.println(isimlerListesi);

        isimlerListesi.add("Canberk");
        isimlerListesi.add("Sofia");
        isimlerListesi.add("gulin");

        System.out.println(isimlerListesi);
        System.out.println("Listemizde olan element sayisi " + isimlerListesi.size() + " dir.");

        System.out.println("Listemizde ozan ismi " + isimlerListesi.contains("Ozan"));
        System.out.println("Listemizde Tibet ismi " + isimlerListesi.contains("Tibet"));

        System.out.println("İsmin Liste Numarasi " + isimlerListesi.indexOf("Canberk"));
        System.out.println(isimlerListesi.isEmpty());
    */

        ArrayList<String> Listem = new ArrayList<>();

        Listem.add("Ali");
        Listem.add("Mehmet");
        Listem.add("Murat");

        System.out.println(Listem);

        System.out.println("İlk eleman kaldırıldı " + Listem.remove(0));

        System.out.println(Listem.get(1));
        System.out.println(Listem.set(0,"Kerem"));

        System.out.println(Listem);
        System.out.println("Listemizde olan toplam eleman sayisi: " + Listem.size());
        System.out.println(Listem.contains("Ozan"));
        System.out.println(Listem.contains("Kerem"));
        System.out.println(Listem.isEmpty());
    }
}