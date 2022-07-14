public class operations {
    public static Object sumar(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 + (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 + (Double) valor2;
        } else if (valor1 instanceof String && valor2 instanceof String) {
                return (String) valor1 + (String) valor2;
        } else {
                return null;
        }
}
public static Object restar(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 - (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 - (Double) valor2;
        } else {
                return null;
        }
}
public static Object multiplicar(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 * (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 * (Double) valor2;
        } else {
                return null;
        }
}
public static Object dividir(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 / (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 / (Double) valor2;
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
}

public static Object lt(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 < (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 < (Double) valor2;
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
}
public static Object gt(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 > (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 > (Double) valor2;
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
    }
public static Object le(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 <= (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 <= (Double) valor2;
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
    }
public static Object ge(Object valor1, Object valor2) {
        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return (Integer) valor1 >= (Integer) valor2;
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return (Double) valor1 >= (Double) valor2;
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
    }
public static Object eq(Object valor1, Object valor2) {

        if (valor1 instanceof Integer && valor2 instanceof Integer) {
                return valor1.equals( valor2);
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
                return valor1.equals( valor2);
        } else if (valor1 instanceof String && valor2 instanceof String) {
                return valor1.equals( valor2);
        } else {
                System.out.println("error");
                System.exit(0);
                return null;
        }
    }

}
