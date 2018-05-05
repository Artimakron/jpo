import javax.swing.*;
import java.awt.*;
import java.util.Timer;
public class SpringApplet extends JApplet{
private static final long serialVersionUID = 1L;
private SimEngine simE; // prywatne pole do przechowywania obiektu klasy
SimEngine
private SimTask simT; // prywatne pole do przechowywania obiektu klasy
SimTask
private Timer czas; // prywatne pole do przechowywania obiektu klasy
Timer
//publiczna bezparametrowa metoda
@Override public void init() {
this.setSize(400,300);
// nowy obiekt klasy SimEngine
simE=new SimEngine( 3,0.5,0.1, 100,10 ,100, 100 , 0);
// nowy obiekt klasy SimTask
simT=new SimTask(simE,this, 0.01);
// nowy obiekt klasy Timer
czas=new Timer();
// uruchomienie timera
czas.scheduleAtFixedRate(simT, 0, 1);
}
@Override public void paint(Graphics gDC){
gDC.fillRect(0, 0, 400, 300); //wyczyszczenie powierzchni appletu
//narysowanie linii (sprê¿yna)
gDC.setColor(Color.red);
gDC.drawLine((int) simE.showxPunkt(),(int) simE.showyPunkt(), (int)
simE.showxMasy(), (int) simE.showyMasy());
gDC.setColor(Color.yellow);
//narysowanie owalu (masa)
gDC.fillOval(((int) simE.showxMasy()-25), (int) simE.showyMasy(),50,
100);
}
}