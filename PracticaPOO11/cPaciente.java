import java.util.Scanner;

/**
 * Write a description of class cPaciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cPaciente extends cPersona
{
    // instance variables - replace the example below with your own
    public String telefono;
    public int edad;
    public boolean confinado;
    public int tiempoConfinado;
    public String vacuna;
    public int dosis;
    Scanner sc = new Scanner(System.in);
    Scanner scLine = new Scanner(System.in);

    /**
     * Constructor for objects of class cPaciente
     */
    public cPaciente()
    {
        dosis = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setEdad(int usEdad)
    {
        edad = usEdad;
    }
    
    public void setTel(String usTel)
    {
        telefono = usTel;
    }
    
    public void setId(int usId)
    {
        id = usId;
    }
    
    public cPaciente darAlta(int contador){
        int temp;
        int sn;
        boolean correcto;
        
        do{
            temp = contador + 1;
            System.out.println("\nVan a completarse los datos para el paciente num."+ temp);
            setId(temp);
            System.out.print("    Por favor, introduzca el nombre y apellido del paciente: ");
            setName(scLine.nextLine());
            System.out.print("    Por favor, introduzca la edad del paciente: ");
            setEdad(sc.nextInt());
            System.out.print("    Por favor, introduzca un tel. de contacto sin espacios: ");
            setTel(sc.nextLine());
            System.out.println("¿Datos correctos? Si[0] No[1]: ");
            do{    
            sn = sc.nextInt();
            }while(sn < 0 || sn > 1);
                if(sn == 0){
                    correcto = true;
                }else{
                    correcto = false;
                }

        }while(!correcto);
        return this;
    }
}
