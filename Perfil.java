package clases;

public class Perfil {
	
	private String esc;
	private String Altura;
	private String Peso;
	
	public Perfil(String perfil){
	
		esc=perfil;
	}
	public String getPeso() {
		
		for(int i=2;i<esc.length();i++) {
			
			if(esc.substring(i,i+1).equals("X")==true) {
			
				String pp=(esc.substring(i+1, esc.length()));
				Peso=pp;
			}			
			else {
				i=i+1;
			}
		}
				
		return Peso;
	}
	public String getAltura() {
	
		for(int i=2;i<esc.length();i++) {
			if(esc.substring(i,i+1).equals("X")==true) {
			
			String a=esc.substring(2,i);
			Altura =a;
		}
			else {
				i=i+1;
			}
		}
		return Altura;
	}
}	


	
	
		
	
