public class SimEngine {
private double m; //masa
private double k; //wspolczynnik sprezystosci
private double c; //wspolczynnik tlumienia
private double L0; //dlugosc swodobna sprezyny
private double xMasy; //po³ozenie masy
private double yMasy;
private double xPunkt; //polozenie punktu zawieszenia
private double yPunkt;
private double xV; //predkosc
private double yV;
private double g; //przyspiesznie grawitacyjne
public double ay;
public double t;
public double temp;
Vector2D polozenieMasy; //wektor okreslajacy polozenie masy
Vector2D polozeniePunkt;//wektor okreslajacy polozenie zawieszenia
public void getM(double podajM){ //akcesory
m=podajM;
}
public void getK(double podajK){
k=podajK;
}
public void getC(double podajC){
c=podajC;
}
public void getL0(double podajL0){
L0=podajL0;
}
public void getxMasy(double podajxMasy){
xMasy=podajxMasy;
}
public void getyMasy(double podajyMasy){
yMasy=podajyMasy;
}
public void getxPunkt(double podajxPunkt){
xPunkt=podajxPunkt;
}
public void getyPunkt(double podajyPunkt){
yPunkt=podajyPunkt;
}
public void getyV(double podajyV){
yV=podajyV;
}
public void getG(double podajG){
g=podajG;
}
public double showxPunkt(){
return polozenieMasy.x;
}
public double showyPunkt(){
return polozeniePunkt.y;
}
public double showxMasy(){
return polozenieMasy.x;
}
public double showyMasy(){
System.out.println(polozenieMasy.y);
return polozenieMasy.y;
}
//konstruktor z parametrami, nadajacy wartosci
public SimEngine(double m1, double k1, double c1, double L1, double g1,
double xMasy1, double yMasy1, double yPunkt1){
m=m1;
k=k1;
c=c1;
L0=L1;
xV=0;
yV=0;
g=g1;
ay=0;
xMasy=xMasy1;
yMasy=yMasy1;
xPunkt=xMasy1; //wisz¹ w jednej linii
yPunkt=yPunkt1;
t=0;
polozenieMasy=new Vector2D(xMasy1, yMasy1);
polozeniePunkt=new Vector2D(xMasy1, yPunkt1);
}
//metoda z krokiem czasowym obliczajaca przebieg symulacji
public void przebieg (double krok){
t=krok;
ay = (m * g - k * polozenieMasy.y - c *yV)/m;
yV = yV + ay * t;
temp = temp +yV*t+ay*t*t/2;
polozenieMasy.y=(int)temp;
}
//metoda resetuj¹ca symulacje
public void zerowanie(){
yV=0;
ay=0
}
}