
/**
 * Write a description of class cTecnico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cTecnico extends cEmpleado
{
    int pruebasRealizadas;

    /**
     * Constructor for objects of class cTecnico
     */
    public cTecnico()
    {
        // initialise instance variables
    }
    
    public boolean quedanPruebas(){
            if(pruebasRealizadas < 4){
                return true;
            }else{
                return false;
            }    
    }
    
    public void reiniciarPruebas(){
        pruebasRealizadas = 0;
    }
    public void pruebaMasUno(){
        pruebasRealizadas++;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
