import java.util.Scanner;
/**
 * 
 * @author Sandra
 *
 */
public class EstacionClimatica {
	
	
	// instance variables - replace the example below with your own
	
    private String nombre;
    private int anio;
    private TempHumDia mediciones[];  // Tabla de mediciones
    private int nummediciones;      // Número de mediciones almacenadas

    /**
     * Constructor for objects of class EstacionClimatica
     */
    
    public EstacionClimatica()
   
    {
         this.nombre = "";
         this.anio = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0;
    }
    /**
     * Constructor con parametros
     * @param nombre
     * @param año
     */
    public EstacionClimatica( String nombre, int año)
    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.anio = año;
         
    }
    /**
     * si el año de la fecha
		corresponde con el año de la estación, introduce el nuevo objeto en el vector
     * @param media
     * @return true si el año coincide y false si el año no coincide
     */
    public boolean addDia ( TempHumDia media){
    	boolean metido=true;
    	for (int i = 0;i<mediciones.length;i++)
    	{
    		if (mediciones[i]==null)
    		{
    			mediciones[i] = media;
    			metido=true;
    		}
    		if(mediciones[i].getanio()!=media.getanio()) {
    			mediciones[i]=null;
    			metido=false;
    		}
    	}
        return metido; 
    }
    /*Un método DelDia, que reciba una fecha y borre ese día si existen datos.*/
    /**
     * reciba una fecha y borre ese día si existen datos
     * @param media
     * @return true si ese dia ya estaba relleno, false en caso contrario
     */
    public boolean delDia ( TempHumDia media){
    	boolean existe=true;
    	for (int i=0; i<mediciones.length;i++) {
    		if(mediciones[i].getDia()==media.getDia() && mediciones[i].getanio()==media.getMes() && mediciones[i].getanio()==media.getanio()) {
    			mediciones[i]=null;
    			existe=true;
    		}
    		else {
    			existe=false;
    		}
    		
    	}
        return existe;  // COMPLETAR
    }
    /*Un método ListarDias que te muestre en pantalla los datos de los días que hemos
     *  introducidos:fecha, temperatura máxima, mínima y media,
		humedad máxima, mínima y media.
     */
    /**
     * muestre en pantalla los datos de los días que hemos introducidos: fecha, temperatura máxima, mínima y media,
humedad máxima, mínima y media.

     */
    public void listarDias(){
        for(int i=0; i<mediciones.length;i++){
        	if(mediciones[i]!=null) {
        		mediciones[i].toString();
        	}
        	
        }
     
    }
    
    // Método auxiliar que me indica si una fecha es correcta
    /**
     * Comprueba que la fecha introducida sea correcta
     * @param dia
     * @param mes
     * @param año
     * @return true si la fecha es correcta y false en caso contrario
     */
    static boolean fechaOK ( int dia, int mes, int año){
    	boolean fecha=true;
        if(dia<=30 && (mes==4||mes==6||mes==9||mes==11)) {
        	fecha=true;
        }
        if(dia<=31 && (mes==1||mes==3||mes==7||mes==8||mes==10||mes==12)) {
        	fecha=true;
        }
        if(dia<=28 && mes==2) {
        	fecha=true;
        }
        else {
        	fecha=false; 
        }
       
       return fecha;
    }
    /**
     * lee medida
     * @return true si hay error, false en caso contrario
     */
    static TempHumDia leerMedida () {

        Scanner leer = new Scanner(System.in);
        int dia,mes,año, tempmax, tempmin, hummax, hummin;
        TempHumDia  medicion = null;
        
       boolean error = true;
       do {
       System.out.println("Día:"); dia = leer.nextInt();
       System.out.println("Mes:");  mes = leer.nextInt();
       System.out.println("Año:");  año = leer.nextInt();
 
       if ( fechaOK( dia,mes,año) ) {
            System.out.println ( " Tº Máxima:"); tempmax = leer.nextInt();
            System.out.println ( " Tº Mínima:"); tempmin = leer.nextInt();
            System.out.println ( " Hº Máxima:"); hummax = leer.nextInt();
            System.out.println ( " Hº Mínima:"); hummin = leer.nextInt();
            medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin);
            error = false;
           }
       else
       {
           System.out.println(" Fecha érronea");
       }
   
   } while (  error);
   
   return medicion;
    }
}