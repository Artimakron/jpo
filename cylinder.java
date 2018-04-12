
public class cylinder extends point{
	
	
	
	public cylinder(){
		this.mass = 1;
		this.dist = 1;
		this.radius = 1;
		this.height = 1;
		this.gmb();
		this.mbS();
	}
	
	public cylinder(double x , double y , double z ,double c ){
		this.mass = x;
		this.dist = y;
		this.radius = z;
		this.height = c;
		this.gmb();
		this.mbS();
	}
	
	public void gmb(){
		this.gmb = this.mass * this.radius * this.radius * 0.5;
	}
	
	public String opis(){
		return "Cylinder";
	}
	
	public static void main(String[] args) {
    cylinder zenek = new cylinder();
	cylinder arnold = new cylinder( 2.4 , 4.5 , 4.4 , 6.4 );
	System.out.println(arnold.getmass());
	
	}
}