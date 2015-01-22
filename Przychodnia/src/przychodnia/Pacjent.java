package przychodnia;

/**
 * Klasa ma służyć to reprezentowania pacjenta
 * @author Sebastian
 */
public class Pacjent extends Choroby {
    //pola
    private String imie;
    private String nazwisko;
    private int pesel;
    private int Idwizyty;
    
    
    //konstruktor klasy pacjent
    public Pacjent(String imie, String nazwisko, int pesel){
        
    }
    //public Pacjent
    
    //metoda nadaje id wizyty
    int dodajWizyte(){
        return Idwizyty;
    }// int dodajWizyte
    
    
}
