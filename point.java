import class java.unit.Random

public class point{

    protected double mass; //masa obiektu
	protected double dist; //odległość od osi
    public double gmb;  //główny moment bezwładności obiektu
    public double mbS;  //moment bezwładności z twierdzenia Steinera obiektu

    public double getmass(){ //akcesor masy
        return mass;
    }
	
	public void setmass(double z){ //modyfikator masy
		if (z>=0)
			this.mass=z;
		else this.mass=0;
	}
	
	
    public double getdist(){ //akcesor odległości
        return this.dist;
    }
	
	public void setdist(double z){ //modyfikator odległości
	    if (z>=0)
			this.dist=z;
		else this.dist=0;
	}
	
	protected double radius;
    
	protected double height;
    
	public double getradius(){
    return this.radius;
	}
	
	public void setradius(double x){
	if (x>=0)
			this.radius=x;
		else this.radius=0;
	}
	
	public void setheight(double x){
	if (x>=0)
			this.height=x;
		else this.height=0;
	}
	
	public double getheight(){
    return this.height;
	}
    
	protected double length;

	public void setlength(double x){
	if (x>=0)
			this.length=x;
		else this.length=0;
	}
	
	public double getlength(){
    return this.length;
	}
	
    public point(){ //konstruktor bez parametru
        this.mass=1;
		this.dist=1;
		this.length=0;
		this.height=0;
		this.radius=0;
		this.gmb();
		this.mbS();
    }
	
    public point(double x, double y){ //kontruktor z parametrem ustawiający mase obiektu na wartość parametru
        this.mass=x;
		this.dist=y;
		this.gmb();
		this.mbS();
		
    }
	
    public void gmb(){ //metoda wyliczająca i ustawiająca główny moment bezwładności obiektu
        this.gmb = 0;
    }
	
    
    public void mbS(){ //metoda wyliczająca i ustawiająca moment bezwładności z twierdzenia Steinera obiektu
		this.mbS=this.gmb + this.mass * this.dist * this.dist;
	}
	
	
	public String opis(){ //metoda zwracająca opis obiektu
		return "Punkt Materialny";
	}
	
	 public static void main(String[] args) {
		 System.out.println("Ok");
	 }
	 
}