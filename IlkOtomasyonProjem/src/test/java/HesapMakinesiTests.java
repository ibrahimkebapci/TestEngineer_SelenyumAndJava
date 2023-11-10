import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    @BeforeAll
    public static void setupClass()
    {
        System.out.println(" Setup calss Metodu çalıştırıldı");
    }
    HesapMakinesi hesapMakinesi;
    @BeforeEach
    public  void  setup()
    {
        hesapMakinesi = new HesapMakinesi();
        System.out.println("Stup metodu çalıştırıldı");
    }
    @Test
    public void ToplamaTesti()
    {
        hesapMakinesi = new HesapMakinesi();
        double toplamaSonucu = hesapMakinesi.toplama(1.5,21.3);
        Assertions.assertEquals(22.8,toplamaSonucu);
    }

    @Test
    public  void CikarmaTesti()
    {
        hesapMakinesi = new HesapMakinesi();
        Double cikarmaSonucu = hesapMakinesi.cikartma(5,2);
        Assertions.assertEquals(3,cikarmaSonucu);
    }

    @Test
    public  void CarpmaTesti()
    {
        hesapMakinesi = new HesapMakinesi();
        Double carpmaSonucu = hesapMakinesi.carpma(5,2);
        Assertions.assertEquals(10,carpmaSonucu);
    }

    @AfterEach
    public void teardown()
    {
        System.out.println("teardown metodu çalıştırıldı");
    }


}
