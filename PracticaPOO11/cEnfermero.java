
/**
 * Write a description of class cEnfermero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cEnfermero extends cEmpleado
{
    // instance variables - replace the example below with your own
    private int pruebasRealizadas;

    /**
     * Constructor for objects of class cEnfermero
     */
    public cEnfermero()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean quedanPruebas(){
            if(pruebasRealizadas < 5){
                return true;
            }else{
                return false;
            }    
    }
    
    public void reiniciarPruebas(){
        pruebasRealizadas = 0;
    }
}
