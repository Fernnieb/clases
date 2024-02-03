package clases;

public class prueb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Perfil miPerfil=new Perfil("HN20X50");
	 System.out.println("La altura es:"+miPerfil.getAltura()*10);
	 System.out.println("El peso es:"+miPerfil.getPeso());
	
	 double den=0.00785;
	
	 double Ancho, espesoralm, espesorala;
	 
	 // Primer supuesto
	 
	 Ancho=150;
	 espesoralm=6;
	 espesorala=6;
	 
	 double Area=(miPerfil.getAltura()*10-2*espesorala)*espesoralm+2*Ancho*espesorala;
	 
	 System.out.println("El area es: "+Area);
	System.out.println("El peso del supuesto es: "+Area*den);
	}
	
	
	
}
