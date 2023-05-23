/**
 <Klasa Recenzent>
 <imie> : <String>, <dziedziczy po polu imie w klasie osoba>
 <nazwisko> : <String>, <dziedziczy po polu nazwisko w klasie osoba>
 <wiek> : <int>, <dziedziczy po polu wiek w klasie osoba>
 @author : Szymon Michna
 **/
public class Recenzent {

    Osoba imie;
    Osoba nazwisko;
    Osoba wiek;

    public Recenzent(Osoba imie, Osoba nazwisko, Osoba wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
