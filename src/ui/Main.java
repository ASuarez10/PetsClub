package ui;
import model.*;
public class Main {
	
	private Information information;
	
	public static void main(String[] args) {
		Pet p1 = new Pet("1005050", "Andres", "10 de mayo", 1, "Perro");
		Pet p2 = new Pet("1445050", "Andrea", "10 de mayo", 1, "Perro");
		Pet p3 = new Pet("1005450", "Andrew", "10 de mayo", 1, "Perro");
		
		Pet[] petos = new Pet[3];
		
		petos[0] = p1;
		petos[1] = p2;
		petos[2] = p3;
		System.out.println(petos[0]);
		
	}
	
	public void pintar() {
		
		Pet p1 = new Pet("1005050", "Andres", "10 de mayo", 1, "Perro");
		Pet p2 = new Pet("1445050", "Andrea", "10 de mayo", 1, "Perro");
		Pet p3 = new Pet("1005450", "Andrew", "10 de mayo", 1, "Perro");
		
		Pet[] petos = new Pet[3];
		
		petos[0] = p1;
		petos[1] = p2;
		petos[2] = p3;
		System.out.println(petos);
	}

}//final
