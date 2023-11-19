package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TestKolekcijaImenaIPrezimena {
    @Test

    void Test1(){
        List<String>ime= Arrays.asList("Mirko", "Maksimilijan");
        List<String>prezime= Arrays.asList("Hadzihafizbegovic", "Jure-Kucina");
        KolekcijaImenaIPrezimena n= new KolekcijaImenaIPrezimena();
        n.setImena(ime);
        n.setPrezimena(prezime);
        assertTrue(1==n.getIndexNajduzegPara());
        assertEquals("Mirko Hadzihafizbegovic", n.getImeiPrezime(0));

    }
}
