public class ball extends point{
	
	public ball(){
		this.mass = 1;
		this.dist = 1;
		this.radius = 1;
		this.gmb();
		this.mbS();
	}
	
	public ball(double x , double y , double z ){
		this.mass = x;
		this.dist = y;
		this.radius = z;
		this.gmb();
		this.mbS();
	}
	
	public void gmb(){
		this.gmb = this.mass * this.radius * this.radius * 0.4;
	}
	
	public String opis(){
		return "Kula";
	}
	
	public static void main(String[] args) {
    ball zenek = new ball();
	ball arnold = new ball( 2.4 , 4.5 , 4.4 );
	System.out.println(arnold.getmass());
	
	}
}