import java.util.TimerTask;
public class SimTask extends TimerTask {
private static final long serialVersionUID = 1L;
private SimEngine pole1; // pole do przechowywania obiektu klasy SimEngine
private SpringApplet pole2; //pole do przechowywania obiektu klasy
SpringApplet
private double odstep; // pole do przechowywania odstepu czasowego
// przypisanie do pól klasy obiektu klasy SimEngine, obiektu klasy SpringApplet
i odstêpu
public SimTask (SimEngine pole1, SpringApplet pole2, double odstep){
this.pole1=pole1;
this.pole2=pole2;
this.odstep=odstep;
}
public void run() {
pole1.przebieg(odstep); //uruchomienie obliczenia kroku
pole2.repaint(); //odœwie¿enie wyœwietlania powierzchni appletu
}
}