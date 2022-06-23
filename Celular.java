package herencia;

public class Celular extends Dispositivos {

    private int precioOriginal;

    public Celular(String nombre, String funcion, String figura, int costo, int descuento)
    {
       super(nombre, funcion, figura, costo, descuento);

    }

    public double getPrecioOriginal()
    {
        return precioOriginal;
    }

    public void setPrecioOriginal(int  precioOriginal)
    {
        this.precioOriginal = precioOriginal;
    }
    

    @Override
    public double porcentajeDescuento()
    {
        return this.precioOriginal - this.descuento;

    }

    

    

    
    
}
