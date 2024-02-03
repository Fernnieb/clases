package clases;

public class Perfil {
	
	static String esc;
	String dato;
	
	public String Peso(){
	
		for(int i=2;i<esc.length();i++) {
			
			if(esc.substring(i,i+1).equals("X")==true) {
			
				String pp=(esc.substring(i+1, esc.length()));
				dato=pp;
			}
			else {
				i=i+1;
			}
		
		}
		
		return dato;
	}
}


	
	
		
	
