package przychodnia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Klasa oznaczająca Lekarza
 * @author Radosław
 */
public class Lekarz {
    
    private String Imie;
    private String Nazwisko;
    private String Specjalizacja;
    private int ID;
    
    
    public Lekarz(String Imie, String Nazwisko) //konstruktor
    {
        
    }
    
     int NadajID() // Metoda nadaje ID lekarzowi
    {
     
        
        return ID;
    }
     
     String DodajSpecjalizacje() // Metoda dodaje Specjalizacje lekarzowi
     {
         
         return Specjalizacja;
     }
    
}
