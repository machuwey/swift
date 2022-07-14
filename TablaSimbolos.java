import java.util.ArrayList;
import java.util.HashMap;


public class TablaSimbolos {

    private static HashMap<String, Registro> tablaSimbolos = new HashMap<String, Registro>();


    public static void add(String nombre, Object valor, int profundidad,Integer tipo, Integer esConstante_num, boolean asignado) {   
        
        boolean esConstante = false;
        
        if (valor != null && tipo==1){
           //If valor is an array loop and cast each element to Double
           if( valor instanceof ArrayList){
               ArrayList<Object> array = (ArrayList<Object>) valor;
               for(int i=0; i<array.size(); i++){
                   array.set(i, Double.parseDouble(array.get(i).toString()));
               }}else{
                valor = Double.parseDouble(valor.toString());
               }
            
        }
        if (valor != null && tipo==2){
            valor = Integer.parseInt(valor.toString());
        }
        //Comprobamos si es constante o no
        switch (esConstante_num) {
            case 1:
            esConstante = true;
                break;
            default:
            esConstante = false;
                break;
        } 
        


        if (!tablaSimbolos.containsKey(nombre)) {
            tablaSimbolos.put(nombre, new Registro(valor, profundidad, esConstante, asignado));
        } else {
            //Si la profundiad del neuvo es mayor que la del registro, se añade (es decir es una variable local)
            if (tablaSimbolos.get(nombre).getProfundidad() < profundidad) {
                tablaSimbolos.put(nombre, new Registro(valor, profundidad, esConstante, asignado));
            } else {
            //Se reemplaza el valor del registro
                //tablaSimbolos.get(nombre).setValor(valor);
                System.out.println("error");
                System.exit(0);
            }
        }
    }

    public static void replace(String nombre, Object valor, int profundidad, boolean asignado) {
        if (tablaSimbolos.containsKey(nombre)) {
            if(tablaSimbolos.get(nombre).getEsConstante() && tablaSimbolos.get(nombre).getAsignado()){
                System.out.println("error");
                System.exit(0);
            }

            tablaSimbolos.get(nombre).setValor(valor);
            tablaSimbolos.get(nombre).setProfundidad(profundidad);
            tablaSimbolos.get(nombre).setAsignado(asignado);
        }else{
            System.out.println("error");
            System.exit(0);
        }
    }


    public static Object get(String nombre) {
        if (tablaSimbolos.containsKey(nombre) && tablaSimbolos.get(nombre).getAsignado()) {
            return tablaSimbolos.get(nombre).getValor();
        } else {
            System.out.println("error");
            System.exit(0);
            return null;
        }
    }

    public static void modifyArray(String name, int index, Object valor) {
        if (tablaSimbolos.containsKey(name)) {
            if (tablaSimbolos.get(name).getValor() instanceof ArrayList) {
                ArrayList<Object> array = (ArrayList<Object>) tablaSimbolos.get(name).getValor();
                //Check if not out of bounds
                if (index < array.size()) {
                    array.set(index, valor);
                } else {
                    System.out.println("error");
                    System.exit(0);
                }
            } else {
                System.out.println("error");
                System.exit(0);
            }
        } else {
            System.out.println("error");
            System.exit(0);
        }
    }
    
}
