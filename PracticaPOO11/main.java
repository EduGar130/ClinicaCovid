
/**
 * El propóisto de esta clase main es el de proporcionar acceso a la plenitud del codigo
 * y sus clases. Además proporciona un menú que permite navegar entre las distintas funciones
 * del programa desde distintos niveles de acceso (administrador, enfermero y técnico de la boratorio).
 * 
 * @autor: Eduardo García Romera
 * @version 0.1
 */

import java.util.*;

public class main
{
    // instance variables - replace the example below with your own
    private cPaciente paciente = new cPaciente();
    public ArrayList<cPaciente> listaPacientes = new ArrayList<cPaciente>();
    public ArrayList<cTecnico> listaTecnicos = new ArrayList<cTecnico>();
    public ArrayList<cEnfermero> listaEnfermeros = new ArrayList<cEnfermero>();
    /*
    public ArrayList<cJhonson> listaJhonson = new ArrayList<cJhonson>();
    public ArrayList<cModerna> listaModerna = new ArrayList<cModerna>();
    public ArrayList<cPfizer> listaPfizer = new ArrayList<cPfizer>();
    */
    public int[] contador;
    public cJohnson jhon = new cJohnson();
    public cPfizer pfizer = new cPfizer();
    public cModerna moderna = new cModerna();
    private String[] menuInicio;
    private String[] menuAdmin;
    private String[] menuTecnico;
    private String[] menuEnfermero;
    Scanner sc = new Scanner(System.in);
    Scanner scLine = new Scanner(System.in);

    /**
     * Constructor for objects of class main
     */
    public main()
    {
        contador = new int[3];
        //contador de pacientes iniciados en el sistema
        contador[0] = 0;
        //contador de tecnicos iniciados en el sistema
        contador[1] = 0;
        //contador de enfermeros iniciados en el sistema
        contador[2] = 0;
        menuInicio = new String[4];
        menuAdmin = new String[12];
        menuTecnico = new String[3];
        menuEnfermero = new String[3];
        
        /** Inicializar arrays */
    }
    
    public static void main(String[] args){
        main w = new main();
        int opcion1;
        int opcion2 = 0;
        
        //Bucle que se ejecutara hasta que finalice el programa        
        do{            
            //Bucle que se ejecutara hasta que se inicie sesion                           
                    w.mostrarMenu1();
                opcion1 = w.getOpcion1();
                switch (opcion1){                    
                    case 0:{
                                for (int i=0; i < 30; i++){
                                    System.out.println("");
                                } 
                                System.out.println("Ha accedido al menú del administrador\n");
                                do{
                                    w.mostrarMenuAdmin();
                                    opcion2 = w.getOpcion2();
                                }while(w.casosAdmin(opcion2));
                           }
                    break;
                    case 1: //w.mostrarMenuTecnico();
                            //w.casosTecnico();
                    case 2: //w.mostrarMenuEnfermero();
                            //w.casosEnfermero();
                    case 3: {                        
                                System.exit(0);                    
                              }                
                }  
        }while (true);


    }
    
    private int getOpcion1(){
        int opcion;
        do{
            opcion = sc.nextInt();
        }while (opcion < 0 || opcion > 3);
        return opcion;
    } 
    
    private int getOpcion2(){
        int opcion;
        do{
            opcion = sc.nextInt();
        }while (opcion < 0 || opcion > 11);
        return opcion;
    } 
    
    private int getOpcion3(){
        int opcion;
        do{
            opcion = sc.nextInt();
        }while (opcion < 0 || opcion > 2);
        return opcion;
    } 
    
    /** Debería haber un metodo que inicialize la array de 
    menuInicio y menuAdmin, que se ejecute solo una vez, es decir
    en el construcotor de la clase main*/
    
    private void mostrarMenu1(){
        menuInicio[0] = "[0]  Administrador";
        menuInicio[1] = "[1]  Tecnico";
        menuInicio[2] = "[2]  Enfermero";
        menuInicio[3] = "[3]  Salir";
        for(int i = 0; i<menuInicio.length; i++){
        System.out.println("" + menuInicio[i]);
        }
        System.out.print("\n\n¿Cual es su nivel de acceso? seleccione un valor entre 0 y 3: ");
    }
    private void mostrarMenuAdmin(){
        menuAdmin[0] = "[0]  Dar de alta nuevo usuario";
        menuAdmin[1] = "[1]  Dar de baja un usuario";
        menuAdmin[2] = "[2]  Editar usuario";
        menuAdmin[3] = "[3]  Asignar pruebas diagnosticas";
        menuAdmin[4] = "[4]  Asignar vacunaciones";
        menuAdmin[5] = "[5]  Lista de usuarios";
        menuAdmin[6] = "[6]  Lista pacientes a cargo";
        menuAdmin[7] = "[7]  Lista confinamientos";
        menuAdmin[8] = "[8]  Pruebas post-confinamiento";
        menuAdmin[9] = "[9]  Actualizar stock vacunas";
        menuAdmin[10] = "[10]  Plan de vacunación";
        menuAdmin[11] = "[11]  Salir";
        for(int i = 0; i<menuAdmin.length; i++){
        System.out.println("" + menuAdmin[i]);
        }
        System.out.println("\nSeleccione un valor entre 0 y 11");
    }
    
    private void mostrarMenuEnfermero(){
        menuAdmin[0] = "Lista pacientes asignados           0";
        menuAdmin[1] = "Registro de pruebas por paciente    1";
        menuAdmin[11] = "Salir                              2";
        for(int i = 0; i<menuAdmin.length; i++){
        System.out.println("" + menuAdmin[i]);
        }
        System.out.println("Seleccione un valor entre 0 y 2");
    }
    
    private boolean casosAdmin(int opcion2){
        switch (opcion2){                    
                    case 0: 
                            for (int i=0; i < 50; i++){
                                    System.out.println("");
                            } 
                            darAlta();
                    break;
                    
                    case 1: darBaja();
                    break;
                    
                    case 2: editarDatos(selecCat("editar"));
                    break;
                    /*
                    case 3: asignarPrueb();
                    break;
                    case 4: asignarVacuna();
                    break;
                    */
                    case 5: if(contador[0] > 0){
                                generarLista();
                            }else{
                                System.out.println("\nNo hay pacientes para mostrar");
                            }
                    break;
                    /*
                    case 6: listaAsignada();
                    break;
                    case 7: listaConfinamiento();
                    break;
                    case 8: //pruebas post-confianmiento
                    */
                    case 9: editarStock(selecVac("editar"));
                    break;
                    /*
                    case 10: //plan
                    */
                    case 11: return false;
                }
                return true;
    }
    
    private void darAlta(){
        boolean correcto;
        int categoria;
        int sn;
        int temp;
        cPaciente paciente  = new cPaciente();
        cTecnico tecnico  = new cTecnico();
        cEnfermero enfermero  = new cEnfermero();
        
        categoria = selecCat("dar de alta");
        if(categoria == 0){
            paciente.darAlta(contador[0]);
            contador[0]++;
            listaPacientes.add(paciente);
        }else if(categoria == 1){
            //tecnico.darAlta();
            contador[1]++;
            listaTecnicos.add(tecnico);
        }else{
            //enfermero.darAlta();
            contador[2]++;
            listaEnfermeros.add(enfermero);
        }
    }
    
    private void generarLista(){
        
        Iterator<cPaciente> iterP = getListaPacientes().listIterator();
        Iterator<cEnfermero> iterE = getListaEnfermeros().listIterator();
        Iterator<cTecnico> iterT = getListaTecnicos().listIterator();
        System.out.println("\nLista de pacientes en el sistema");
            while (iterP.hasNext()){
                cPaciente p = iterP.next();
                System.out.print(p.id + "  ");
                System.out.print(p.nomApellido + "\n");
            }
        
        System.out.println("\nLista de enfermeros en el sistema");
            while (iterP.hasNext()){
                cEnfermero e = iterE.next();
                System.out.print(e.id + "  ");
                System.out.print(e.nomApellido + "\n");
            }
        
        System.out.println("\nLista de tecnicos en el sistema");
            while (iterT.hasNext()){
                cTecnico t = iterT.next();
                System.out.print(t.id + "  ");
                System.out.print(t.nomApellido + "\n");
            }
    }
    
    private ArrayList<cPaciente> getListaPacientes(){
        return this.listaPacientes;
    }
    
    private ArrayList<cEnfermero> getListaEnfermeros(){
        return this.listaEnfermeros;
    }
    
    private ArrayList<cTecnico> getListaTecnicos(){
        return this.listaTecnicos;
    }

    private void darBaja(){
        int indiceEliminar;
        int categoria;
        
        categoria = selecCat("dar de baja");
        if(categoria == 0){
            System.out.println("Elija un valor entre 1 y " + contador[0] + " para eliminar ese paciente: ");
            indiceEliminar = sc.nextInt() - 1;
            listaPacientes.remove(indiceEliminar);
            contador[0]--;
        }else if(categoria == 1){
            System.out.println("Elija un valor entre 1 y " + contador[1] + " para eliminar ese tecnico: ");
            indiceEliminar = sc.nextInt() - 1;
            listaTecnicos.remove(indiceEliminar);
            contador[1]--;
        }else{
            System.out.println("Elija un valor entre 1 y " + contador[2] + " para eliminar ese enfermero: ");
            indiceEliminar = sc.nextInt() - 1;
            listaEnfermeros.remove(indiceEliminar);
            contador[2]--;
        }
    }
    
    private int selecCat(String palabraClave){
        int eleccion;
        
        System.out.println("[0]  Paciente");
        System.out.println("[1]  Tecnico");
        System.out.println("[2]  Enfermero");
        System.out.print("\n\n¿En que categoria quiere " + palabraClave + "? seleccione un valor entre 0 y 2: ");
        eleccion = sc.nextInt();
        return eleccion;
    }
    
    private int selecVac(String palabraClave){
        int eleccion;
        
        do{
            System.out.println("[0]  Johnson&Johnson");
            System.out.println("[1]  Pfizer");
            System.out.println("[2]  Moderna");
            System.out.print("\n\nSelecciona la vacuna a " + palabraClave + " con un valor entre 0 y 2: ");
            eleccion = sc.nextInt();
        }while(eleccion < 0 || eleccion > 2);
        
        return eleccion;
    }
    
    private void editarStock(int vacuna){
        String nombreVacuna;
        
        if(vacuna == 0){
            nombreVacuna = "Johnson&Johnson";
            imprimirStock(nombreVacuna);
            System.out.print(jhon.stock);
            System.out.println("¿A que valor deasea actualizar el stock?: ");
            jhon.editStock(sc.nextInt());
        }else if(vacuna == 1){
            nombreVacuna = "Pfizer";
            imprimirStock(nombreVacuna);
            System.out.println("¿A que valor deasea actualizar el stock?: ");
            pfizer.editStock(sc.nextInt());
        }else{
            nombreVacuna = "Moderna";
            imprimirStock(nombreVacuna);
            System.out.print(moderna.stock);
            System.out.println("¿A que valor deasea actualizar el stock?: ");
            moderna.editStock(sc.nextInt());
        }
        
    }
    private void imprimirStock(String vacuna){
        System.out.print("\nEl stock actual de " + vacuna + " es de: ");
    }
    
    private void editarDatos(int categoria){
        int indiceEditar;
        
        if(categoria == 0){
            System.out.println("Elija un valor entre 1 y " + contador[0] + " para editar ese paciente: ");
            indiceEditar = sc.nextInt() - 1;
            paciente.darAlta(indiceEditar);
            listaPacientes.set(indiceEditar, paciente);
        }else if(categoria == 1){
            System.out.println("Elija un valor entre 1 y " + contador[0] + " para editar ese tecnico: ");
            indiceEditar = sc.nextInt() - 1;
        }else{
            System.out.println("Elija un valor entre 1 y " + contador[0] + " para editar ese enfermero: ");
            indiceEditar = sc.nextInt() - 1;
        }
    }
}
