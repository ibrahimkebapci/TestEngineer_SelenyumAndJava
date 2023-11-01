import java.util.HashMap;
public class HashMapDemo {
    public static void  main(String[] args) {
        HashMap<String, Integer> Ogrenci = new HashMap<String, Integer>();
        Ogrenci.put("Ali", 15);
        Ogrenci.put("Veli", 45);
        Ogrenci.put("Murat", 156);

        System.out.println(Ogrenci);

        System.out.println("Alinin Ders Notu " + Ogrenci.get("Ali"));
        System.out.println("Butun anahtar değerleri " + Ogrenci.keySet());
        System.out.println("Butun degerler: " + Ogrenci.values());
        System.out.println("Butun Girdi ciftleri: " + Ogrenci.entrySet());

        Ogrenci.replace("Ali",150);
        System.out.println(Ogrenci);
        Ogrenci.remove("Ali");
        System.out.println(Ogrenci);
    }
}
