package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


public class TestPobjednik {
    @Test
    void testNajduzegImena(){
        List<String> proba=Arrays.asList("Nedim Kalajdzija", "Mirko Miric-Stepanisevic");
        KolekcijaImena n= new KolekcijaImena();
        n.setImenaPrezimena(proba);
        Pobjednik pobo=new Pobjednik(n);

        assertEquals("Mirko",pobo.getIme());
        assertEquals("Miric-Stepanisevic", pobo.getPrezime());
        assertTrue(5==pobo.getBrojZnakova());
    }

}