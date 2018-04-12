
public class rod extends point{
	

	public rod(){
		this.mass = 1;
		this.dist = 1;
		this.radius = 1;
		this.length = 1;
		this.gmb();
		this.mbS();
	}
	
	public rod(double x , double y , double z ,double c ){
		this.mass = x;
		this.dist = y;
		this.radius = z;
		this.length = c;
		this.gmb();
		this.mbS();
	}
	
	public void gmb(){
		this.gmb = this.mass * this.length * this.length / 12;
	}
	
	public String opis(){
		return "Pret";
	}
	
	public static void main(String[] args) {
    rod zenek = new rod();
	rod arnold = new rod( 2.4 , 4.5 , 4.4 , 6.4 );
	System.out.println(arnold.getmass());
	
	}
}