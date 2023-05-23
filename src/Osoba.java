/**
 <Klasa Osoba>
 <imie> : <String>, <pole przyjumjące imię>
 <nazwisko> : <String>, <pole przyjumjące nazwisko>
 <wiek> : <int>, <pole przyjumjące wiek>
 @author : Szymon Michna
 **/
import java.util.ArrayList;
import java.util.Objects;

public class Osoba {

    private final String imie;
    private final String nazwisko;
    private final int wiek;

    ArrayList<Osoba> osoby = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
