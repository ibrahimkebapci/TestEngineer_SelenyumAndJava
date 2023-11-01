import java.util.ArrayList;
import java.util.HashMap;
public class ListOfMaps {
    public static void main( String[]args)
    {




        HashMap<String,String> Ogrenci1 = new HashMap<String,String>();
        HashMap<String,String> Ogrenci2 = new HashMap<String,String>();
        HashMap<String,String> Ogrenci3 = new HashMap<String,String>();

        Ogrenci1.put("Ad","John");
        Ogrenci1.put("Soyad","Doe");
        Ogrenci1.put("Ders","Matematik");
        Ogrenci1.put("Not","100");

        Ogrenci2.put("Ad","Kate");
        Ogrenci2.put("Soyad","Win");
        Ogrenci2.put("Ders","Fizik");
        Ogrenci2.put("Notu","90");

        Ogrenci3.put("Ad","Juan");
        Ogrenci3.put("Soyad","Jose");
        Ogrenci3.put("Ders","Spor");

        ArrayList<HashMap<String,String>> OgrenciListesi = new ArrayList<HashMap<String,String>>();
        OgrenciListesi.add(Ogrenci1);
        OgrenciListesi.add(Ogrenci2);
        OgrenciListesi.add(Ogrenci3);
        System.out.println(OgrenciListesi);

    }
}
