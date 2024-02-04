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
	 double Area;
	 double Peso;
	 for(int i=6;i<=22;i=i+2) {
		 espesorala=i; 
		 Area=(miPerfil.getAltura()*10-2*espesorala)*espesoralm+2*Ancho*espesorala;
		 Peso=Area*den;
		 if (miPerfil.getPeso()==Peso) {
		continue;
	   }
		 else{System.out.println(miPerfil.getPeso()<=Peso);
		System.out.println("El espesor del ala debe ser:"+i);
		System.out.println("El peso del supuesto es: "+Peso);
			 break;
		 }
	 }
}
	
}
