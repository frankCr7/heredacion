package herencia;

public class Main {

    public static void main(String args[])
    {
        /*Dispositivos dispositivo = new Dispositivos("Laptop", "ordenador portatil", "rectangular", 1500);*/

        System.out.println("*******DISPOSITIVO CELULAR******");
        Celular celular = new Celular("celular", "trabajos, juegos", "rectangular", 1800, 300);
        System.out.println("nombre: "+celular.getNombre()+"  funcion: "+celular.getFuncion()+"  figura: "+celular.getFigura()+"  costo: "+celular.getCosto()+"  descuento: "+celular.getDescuento());
    
        
        celular.setPrecioOriginal(1800);
        System.out.println("precio original: "+celular.getPrecioOriginal());

        System.out.println("porcentaje de descuento: "+celular.porcentajeDescuento());
        
        




    }
    
}
