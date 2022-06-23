package herencia;

public class Dispositivos 
{
    protected String nombre;

    protected String funcion;

    protected String figura;

    protected int costo;

    protected int descuento;

    
    

    protected Dispositivos(String nombre, String funcion, String figura, int costo, int descuento) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.figura = figura;
        this.costo = costo;
        this.descuento = descuento;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getFuncion() {
        return funcion;
    }

    protected void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    protected String getFigura() {
        return figura;
    }

    protected void setFigura(String figura) {
        this.figura = figura;
    }

    protected double getCosto() {
        return costo;
    }

    protected void setCosto(int costo) {
        this.costo = costo;
    }

    protected double getDescuento() {
        return descuento;
    }

    protected void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    protected double porcentajeDescuento()
    {
        return this.costo - this.descuento;

    }



    






}
