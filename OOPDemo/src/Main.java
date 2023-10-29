// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
           Kopek ilkKopek = new Kopek("Mett","puppy",12);
        {
            System.out.println("Kopegimin adi " + ilkKopek.getIsim() + " Cins " + ilkKopek.getCins()
                    + " Ve yasi " + ilkKopek.getYas());
            ilkKopek.setIsim("Pel");
            System.out.println("Kopek Yeni ad: " + ilkKopek.getIsim());

            ilkKopek.setCins("bully");
            System.out.println("Kopek Yeni Cins: " + ilkKopek.getCins());

            ilkKopek.setYas(14);
            System.out.println("Kopek Yeni Yas: " + ilkKopek.getYas());


            ilkKopek.sesCikar();
            ilkKopek.uyku();

            Kavak kavak = new Kavak();
            kavak.BitkiTürü();

            Kedi kedi = new Kedi();
            kedi.sesCikar();
        }
        }
    }
