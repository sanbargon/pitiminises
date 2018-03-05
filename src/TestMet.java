/**
 * 
 * @author Sandra
 *
 */
public class TestMet {

	
		/*
		 * En el programa principal crea una estación, introduce cinco días pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos días.
		Luego borra dos (pedida por teclado y validándola de nuevo) y los vuelve a listar.
		 *
		 */
	/**
	 * metodo main
	 * @param argv
	 */
		public static void main (  String [] argv ){
		        
		        EstacionClimatica estación  = new EstacionClimatica("Burgos",2017);
		       

		        System.out.println(" Introducir 5 medidas :");
		        

		        for (int i=0; i< 5; i++){
		             TempHumDia  medicion = EstacionClimatica.leerMedida ();
		             estación.addDia( medicion);
		        }
		        
		       estación.listarDias();
		        
		       System.out.println("Introduca 2 medidas a Borrar:");
		       TempHumDia  medida1 = EstacionClimatica.leerMedida();
		       TempHumDia  medida2 = EstacionClimatica.leerMedida();
		       
		       estación.delDia(medida1);
		       estación.delDia(medida2);

		       
		       estación.listarDias();      


	}

}
