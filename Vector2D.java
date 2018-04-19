import static java.lang.Math.*;

public class Vector2D {
     public double x,y;
     //konstruktor domyślny
      Vector2D (){
     x=0;
     y=0;
     }
	 
	 //konstruktor z parametrami
     
	 Vector2D (double a, double b){
     x=a;
     y=b;
     }
     
	 //Dodawanie wektorów
     
	 Vector2D Suma (Vector2D ab){
     Vector2D wynik = new Vector2D(x + ab.x, y + ab.y);
     System.out.println("\nWynik dodawania");
     wynik.Info();
     return wynik;
     }
     
	 //Odejmowanie wektorów
     
	 Vector2D Roznica (Vector2D ab){
     Vector2D wynik = new Vector2D(x - ab.x, y - ab.y);
     System.out.println("\nWynik odejmowania");
     wynik.Info();
     return wynik;
     }
     
	 //Przemnażanie wektora o stałą powiekszajaca wektor
     
	 Vector2D Powieksz (double a){
     Vector2D wynik = new Vector2D(x*a, y*a);
     System.out.println("\nWynik mnozenia");
     wynik.Info();
     return wynik;
     }
     
	 //Normalizacja wektora
     
	 Vector2D Normalizuj (){
     Vector2D wynik = new Vector2D();
     
	 //kontrola wartości
     
	 if(x == 0 && y == 0) {
     System.out.println("\nZły wektor");
     return wynik;
     }else {
     
	 // normalizacja
     
	 wynik.x = x/Dlugosc();
     wynik.y = y/Dlugosc();
     System.out.println("\nWektor znormalizowany:");
     wynik.Info();
     return wynik;
     }
     }
     
	 //Dlugosc wektora
     
	 double Dlugosc () {
     double wynik = sqrt(pow(x,2)+pow(y,2));
     System.out.println("\nDlugosc wektora = " + wynik);
     return wynik;
     }
     
	 //wyswietlanie danych
     
	 void Info () {
     System.out.println("\nx = " + x + "\ny = " + y);
     }
     
	 //test klasy Vector2D
     
	 public static void main(String[] args) {
     
	 //Nowe wektory
     
	 Vector2D AB = new Vector2D(3, 4);
     Vector2D CD = new Vector2D(3, -3);
     
	 //Dodawanie
     
	 Vector2D Dodawanie = AB.Suma(CD);
     
	 //Odejmowanie
     
	 Vector2D Odejmowanie = AB.Roznica(CD);
     
	 //Mnożenie o stala
     
	 Vector2D MnozenieAB1 = AB.Powieksz(2);
     Vector2D MnozenieAB2 = AB.Powieksz(-3);
     Vector2D MnozenieCD1 = CD.Powieksz(2);
     Vector2D MnozenieCD2 = CD.Powieksz(-3);
     
	 //Normalizowanie wektorów
     
	 Vector2D NormalizacjaAB = AB.Normalizuj();
     Vector2D NormalizacjaCD = CD.Normalizuj();
     
	 // Dlugość wektorów
     
	 double DlugoscAB = AB.Dlugosc();
     double DlugoscCD = CD.Dlugosc();
     }
}