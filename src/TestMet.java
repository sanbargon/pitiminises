/**
 * 
 * @author Sandra
 *
 */
public class TestMet {

	
		/*
		 * En el programa principal crea una estaci�n, introduce cinco d�as pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos d�as.
		Luego borra dos (pedida por teclado y valid�ndola de nuevo) y los vuelve a listar.
		 *
		 */
	/**
	 * metodo main
	 * @param argv
	 */
		public static void main (  String [] argv ){
		        
		        EstacionClimatica estaci�n  = new EstacionClimatica("Burgos",2017);
		       

		        System.out.println(" Introducir 5 medidas :");
		        

		        for (int i=0; i< 5; i++){
		             TempHumDia  medicion = EstacionClimatica.leerMedida ();
		             estaci�n.addDia( medicion);
		        }
		        
		       estaci�n.listarDias();
		        
		       System.out.println("Introduca 2 medidas a Borrar:");
		       TempHumDia  medida1 = EstacionClimatica.leerMedida();
		       TempHumDia  medida2 = EstacionClimatica.leerMedida();
		       
		       estaci�n.delDia(medida1);
		       estaci�n.delDia(medida2);

		       
		       estaci�n.listarDias();      


	}

}
