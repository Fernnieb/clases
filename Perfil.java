package clases;

public class Perfil {
	
	private String esc;
	private int Altura;
	private double Peso;
	
	public Perfil(String perfil){
	
		esc=perfil;
	}
	public double getPeso() {
		
		for(int i=2;i<esc.length();i++) {
			
			if(esc.substring(i,i+1).equals("X")==true) {
			
				double pp=Double.parseDouble(esc.substring(i+1, esc.length()));
				Peso=pp;
			}			
			else {
				i=i+1;
			}
		}
				
		return Peso;
	}
	public int getAltura() {
	
		for(int i=2;i<esc.length();i++) {
			if(esc.substring(i,i+1).equals("X")==true) {
			
			int a=Integer.parseInt(esc.substring(2,i));
			Altura =a;
		}
			else {
				i=i+1;
			}
		}
		return Altura;
	}
}	


	
	
		
	
