import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
//Dodawanie
    @Test
    public void DwaPlusDwaDajenamwynikCztery(){
        Main main = new Main(2,2);
        assertEquals(4,main.dodawanie());
    }
    @Test
    public void ZeroPlusZeroDajenamwynikZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.dodawanie());
    }
    @Test
    public void ZeroPlusDwaDajenamwynikZero(){
        Main main = new Main(0,2);
        assertEquals(2,main.dodawanie());
    }
    @Test
    public void minusDwaPlusDwaDajenamwynikZero(){
        Main main = new Main(-2,2);
        assertEquals(0,main.dodawanie());
    }
    @Test
    public void minusDwaPlusminusDwaDajenamwynikminusCztery(){
        Main main = new Main(-2,-2);
        assertEquals(-4,main.dodawanie());
    }
    @Test
    public void DwaPlusminusOsiemDajenamwynikZero(){
        Main main = new Main(2,-8);
        assertEquals(-6,main.dodawanie());
    }
//Odejmowanie

    @Test
    public void DziewiecminusPiecDajenamwynikCztery(){
        Main main = new Main(9,5);
        assertEquals(4,main.odejmowanie());
    }
    @Test
    public void ZerominusZeroDajenamwynikZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.odejmowanie());
    }
    @Test
    public void ZerominusDwaDajenamwynikminusDwa(){
        Main main = new Main(0,2);
        assertEquals(-2,main.odejmowanie());
    }
    @Test
    public void minusDwacminusPiecDajenamwynikcztery(){
        Main main = new Main(-2,5);
        assertEquals(-7,main.odejmowanie());
    }
    @Test
    public void minusDwaminusminusDwaDajenamwynikminuscztery(){
        Main main = new Main(-2,-2);
        assertEquals(0,main.odejmowanie());
    }
    //Mnożenie

    @Test
    public void SzescrazySzescDajenamwyniktrzydziesciszesc(){
        Main main = new Main(6,6);
        assertEquals(36,main.mnozenie());
    }

    @Test
    public void minusSzescrazyminusSzescDajenamwyniktrzydziesciszesc(){
        Main main = new Main(-6,-6);
        assertEquals(36,main.mnozenie());
    }
    @Test
    public void minusSzescrazySzescDajenamwynikminustrzydziesciszesc(){
        Main main = new Main(-6,6);
        assertEquals(-36,main.mnozenie());
    }
    @Test
    public void ZerorazyZeroDajenamwynikZero(){
        Main main = new Main(0,0);
        assertEquals(0,main.mnozenie());
    }
    @Test
    public void DwarazyZeroDajenamwynikZero(){
        Main main = new Main(2,0);
        assertEquals(0,main.mnozenie());
    }

//Dzielenie

    @Test
    public void OsiempodzielicnaCzteryDajenamwynikDwa(){
        Main main = new Main(8,4);
        assertEquals(2,main.dzielenie());
    }

    @Test
    public void minusSzescpodzielicnajedenDajenamwynikminusSzesc() {
        Main main = new Main(-6, 1);
        assertEquals(-6,main.dzielenie());
    }
    @Test
    public void minusSzescpodzielicnaminusJedenDajenamwynikSzesc() {
        Main main = new Main(-6, -1);
        assertEquals(6,main.dzielenie());
    }
    @Test
    public void DwapodzielicnaDwaDajenamwynikJeden(){
        Main main = new Main(2,2);
        assertEquals(1,main.dzielenie());
    }
    @Test
    public void ZeroodzielicnaDwaDajenamwynikJeden(){
        Main main = new Main(0,2);
        assertEquals(0,main.dzielenie());
    }
   //Potęgowanie


    @Test
    public void DziewiecPodniesdoDrugiejdajenamwynikOsiemdziesiatjeden(){
        Main main = new Main(9,2);
        assertEquals(81,main.potegowanie());
    }
    @Test
    public void minusDwaPodniesdoTrzeciejdajenamwynikminusOsiem(){
        Main main = new Main(-2,3);
        assertEquals(-8,main.potegowanie());
    }

    @Test
    public void DwaPodniesdoZeradajenamwynikminusJeden(){
        Main main = new Main(2,0);
        assertEquals(1,main.potegowanie());
    }

//Pierwiastkowanie

    @Test
    public void pierwiastekkwadratowyzDziewieciuwynosiTrzy(){
        Main main = new Main(9);
        assertEquals(3,main.pierwiastek());
    }

    @Test
    public void pierwiastekkwadratowyzZerawynosiZero(){
        Main main = new Main(0);
        assertEquals(0,main.pierwiastek());
    }

}