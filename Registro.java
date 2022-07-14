public class Registro {

    private Object valor;
    private int profundidad;
    private boolean esConstante;
    private boolean asignado;

    public Registro(Object valor, int profundidad, boolean esConstante, boolean asignado) {
        this.valor = valor;
        this.profundidad = profundidad;
        this.esConstante = esConstante;
        this.asignado = asignado;
    }

    public Object getValor() {
        return valor;
    }
    public int getProfundidad() {
        return profundidad;
    }
    public boolean getEsConstante() {
        return esConstante;
    }
    public boolean getAsignado() {
        return asignado;
    }
    public void setValor(Object valor) {
        this.valor = valor;
    }
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    public void setEsConstante(boolean esGlobal) {
        this.esConstante = esGlobal;
    }
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }
    
}
