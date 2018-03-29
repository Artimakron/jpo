	import java.util.Random;

public class point{

    private double mass;
    public double gmb;
    public double mbS;

    public double getmass(){
        return mass;
    }
	
	public void setmass(double z){
		this.mass=z;
	}
	
    public point(){
        this.mass=1;
    }
	
    public point(double x){
        this.mass=x;
    }
	
    public void gmb(){
        this.gmb = 0;
    }
	
    public void mbS(double y){
        this.mbS=((this.mass)*y*y);
    }
	
	public String opis(){
		return "Punkt Materialny";
	}

    public static void main(String[] args) {
		double R = 9.81;
        point oni = new point();
        point ichigo = new point(5);
		System.out.println("Opis 002 : "+oni.opis());
		System.out.println("Opis 016 : "+ichigo.opis());
        System.out.println("Masa 002 = "+oni.getmass());
		System.out.println("Masa 016 = "+ichigo.getmass());
		oni.gmb();
		ichigo.gmb();
		oni.mbS(R);
		ichigo.mbS(R);
		System.out.println("Glowny Moment Bezwladnosci 002 = "+ oni.gmb);
		System.out.println("Moment Bezwladnosci Steinera Wzgledem Osi Odleglej O R = "+R+" Dla 002 = "+ oni.mbS);
		System.out.println("Glowny Moment Bezwladnosci 016 = "+ ichigo.gmb);
		System.out.println("Moment Bezwladnosci Steinera Wzgledem Osi Odleglej O R = "+R+" Dla 016 = "+ ichigo.mbS);
		oni.setmass(6.37);
		System.out.println("Nowa Masa 002 = "+oni.getmass());
		oni.mbS(R);
		System.out.println("Nowy Glowny Moment Bezwladnosci 002 = "+ oni.gmb);
		System.out.println("Nowy Moment Bezwladnosci Steinera Wzgledem Osi Odleglej O R = "+R+" Dla 002 = "+ oni.mbS+"\n\n\n");
		Random gen = new Random();
		point[] tablica = new point[5];
			for(int k=0;k<5;k++){
				point b = new point(10*gen.nextDouble());
				tablica[k] = b;
			}
			for(int k=0;k<5;k++){
				System.out.println("Opis "+k+" : "+tablica[k].opis());
				System.out.println("Masa punktu numer "+k+" = "+tablica[k].getmass());
				tablica[k].gmb();
				tablica[k].mbS(R);
				System.out.println("Glowny Moment Bezwladnosci "+k+" = "+ tablica[k].gmb);
				System.out.println("Moment Bezwladnosci Steinera Wzgledem Osi Odleglej O R = "+R+" Dla "+k+" = "+ tablica[k].mbS+"\n\n\n");
			}
				
				
				
				
    }

}