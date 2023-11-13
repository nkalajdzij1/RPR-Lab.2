package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImenikTest {

    @Test
    void dajBroj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Nedim", new MobilniBroj(61, "055-916"));
        assertEquals("061/055-916", imenik.dajBroj("Nedim"));

    }

    @Test
    void dajIme() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Nedim", new MobilniBroj(61, "055-916"));
        MobilniBroj br = new MobilniBroj(61, "055-916");
        assertEquals("Nedim", imenik.dajIme(br));
    }

    @Test
    void testMockitoExternal(){
        Imenik i = Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Nedim")).thenReturn("Ne postoji");
    }


}