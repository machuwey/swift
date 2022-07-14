import java.util.HashMap;


public class TablaSimbolos {

    private static HashMap<String, Registro> tablaSimbolos = new HashMap<String, Registro>();


    public static void add(String nombre, Object valor, int profundidad,Integer tipo) {   
        
        
        if (valor != null && tipo==1){
            valor = Double.parseDouble(valor.toString());
        }
        if (valor != null && tipo==2){
            valor = Integer.parseInt(valor.toString());
        }

        if (!tablaSimbolos.containsKey(nombre)) {
            tablaSimbolos.put(nombre, new Registro(valor, profundidad));
        } else {
            //Si la profundiad del neuvo es mayor que la del registro, se añade (es decir es una variable local)
            if (tablaSimbolos.get(nombre).getProfundidad() < profundidad) {
                tablaSimbolos.put(nombre, new Registro(valor, profundidad));
            } else {
            //Se reemplaza el valor del registro
                tablaSimbolos.get(nombre).setValor(valor);
            }
        }
    }

    public static void replace(String nombre, Object valor, int profundidad) {
        if (tablaSimbolos.containsKey(nombre)) {
            tablaSimbolos.get(nombre).setValor(valor);
            tablaSimbolos.get(nombre).setProfundidad(profundidad);
        }else{
            System.out.println("error");
            System.exit(0);
        }
    }


    public static Object get(String nombre) {
        if (tablaSimbolos.containsKey(nombre)) {
            return tablaSimbolos.get(nombre).getValor();
        } else {
            System.out.println("error");
            System.exit(0);
            return null;
        }
    }

    
}
