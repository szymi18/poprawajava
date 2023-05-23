/**
 <Klasa Czytelnik>
 <imie> : <String>, <dziedziczy po polu imie w klasie osoba>
 <nazwisko> : <String>, <dziedziczy po polu nazwisko w klasie osoba>
 <wiek> : <int>, <dziedziczy po polu wiek w klasie osoba>
 @author : Szymon Michna
 **/
import java.util.ArrayList;
public class Czytelnik {
    ArrayList <Ksiazka> ksiazkiPrzeczytane = new ArrayList<>();

    Osoba imie;
    Osoba nazwisko;

    Osoba wiek;

    public Czytelnik(Osoba imie, Osoba nazwisko, Osoba wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

}
