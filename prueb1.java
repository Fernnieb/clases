package clases;
import java.text.DecimalFormat;

import javax.swing.*;

public class prueb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String p=JOptionPane.showInputDialog("Ingresa el Perfil");
	 Perfil miPerfil=new Perfil(p);
	 System.out.println("La altura es:"+miPerfil.getAltura()*10);
	 System.out.println("El peso es:"+miPerfil.getPeso());
	
	 double den=0.00785;
	
	 double espesoralm, espesorala;
	 String An=JOptionPane.showInputDialog("Ingresa el ancho, mm:");
	 double Ancho=Double.parseDouble(An);
	 
	 // Primer supuesto
	 
	 espesoralm=6;
	 double Area;
	 double Peso;
	 DecimalFormat formato=new DecimalFormat("0.00");
	 
	 for(int i=6;i<=22;i=i+2) {
		 espesorala=i; 
		 Area=(miPerfil.getAltura()*10-2*espesorala)*espesoralm+2*Ancho*espesorala;
		 Peso=Area*den;
		 if (miPerfil.getPeso()>=Peso) {
		continue;
	   }
		 else{
		espesorala=i;
		System.out.println("El peso del supuesto es: "+formato.format(Peso));

			 break;
		 }
	 }
 
}
	
}
