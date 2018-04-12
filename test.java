public class test extends point{
 
 
 public static void main(String[] args) {
	 
		cylinder walec = new cylinder(0.3 , 2.0 ,6.4 , 1.5);
		
		ball kula = new ball(0.666 , 5.0 , 2.7);
		
		rod kij = new rod(0.4 , 1.0 , 5.5, 4.5);
		
		/*walec.gmb();
		
		walec.mbS();
		
		kula.gmb();
		
		kula.mbS();
		
		kij.gmb();
		
		kij.mbS();*/
		
		System.out.println("\nOpis pierwszego obiektu : "+walec.opis());
		
		System.out.println("Masa pierwszego obiektu : "+walec.getmass());
		
		System.out.println("Odleglosc od osi specjalnej pierwszego obiektu : "+walec.getdist());
		
		System.out.println("Promien pierwszego obiektu : "+walec.getradius());
		
		System.out.println("Wysokosc pierwszego obiektu : "+walec.getheight());
		
		

		System.out.println("\nOpis drugiego obiektu : "+kula.opis());
		
		System.out.println("Masa drugiego obiektu : "+kula.getmass());
		
		System.out.println("Odleglosc od osi specjalnej drugiego obiektu : "+kula.getdist());
		
		System.out.println("Promien drugiego obiektu : "+kula.getradius());
		
		
		
		System.out.println("\nOpis trzeciego obiektu : "+kij.opis());
		
		System.out.println("Masa trzeciego obiektu : "+kij.getmass());
		
		System.out.println("Odleglosc od osi specjalnej trzeciego obiektu : "+kij.getdist());
		
		System.out.println("Promien trzeciego obiektu : "+kij.getradius());
		
		System.out.println("Dlugosc trzeciego obiektu : "+kij.getlength());
		

		point[] tablica = new point[3];
		
		tablica[0]=new cylinder(3.9,2.0,3.0,4.0);
		
		tablica[1]=new ball(1.0,4.2,5.3);
		
		tablica[2]=new rod(4.0,1.4,8.8,9.0);
		
		
		for(int i=0;i<3;i++){
			tablica[i].setdist(5 - i);
			
			System.out.println("\nOpis "+ i +"-ego obiektu : "+tablica[i].opis());
			
			System.out.println("\nMasa "+ i +"-ego obiektu : "+tablica[i].getmass());
			
			System.out.println("Odleglosc od osi specjalnej "+i+"-ego obiektu : "+tablica[i].getdist());
			
			System.out.println("Promien "+ i +"-ego obiektu : "+tablica[i].getradius());
			
			{if(tablica[i] instanceof cylinder){
				
				System.out.println("Wysokosc "+ i +"-ego obiektu : "+tablica[i].getheight());
				
			} else if(tablica[i] instanceof rod){
				
				System.out.println("Dlugosc "+ i +"-ego obiektu : "+tablica[i].getlength());
			}
			}
			System.out.println("Glowny moment bezwladnosci "+i+"-ego obiektu : "+tablica[i].gmb);
		}
		for(int i=0;i<3;i++){
			tablica[i].setdist(2);
			System.out.println("Moment bezwladnosci Steinera "+i+"-ego obiektu dla osi odleglej o 2 : "+tablica[i].mbS);
		}
    }
 }