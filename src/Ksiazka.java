/**
 <Klasa Ksiazka>
 <tytul> : <String>, <pole pryjmujące tytul>
 <autor> : <String>, <pole pryjmujące autora>
 <dataWydania> : <String>, <pole pryjmujące date wydania>
 @author : Szymon Michna
 **/
import java.util.Date;

public class Ksiazka {

    private final String tytul;
    private final String autor;
    private final Date dataWydania;


    public Ksiazka(String tytul, String autor, Date dataWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", dataWydania=" + dataWydania +
                '}';
    }
}
