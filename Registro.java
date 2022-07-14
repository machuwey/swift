public class Registro {

    private Object valor;
    private int profundidad;

    public Registro(Object valor, int profundidad) {
        this.valor = valor;
        this.profundidad = profundidad;
    }

    public Object getValor() {
        return valor;
    }
    public int getProfundidad() {
        return profundidad;
    }
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
}
