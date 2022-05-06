
package easymarket;

public class producto {
    
    public String nombre;
    public int cantidad;
    
    public producto(String newNombre, int newCantidad){
        nombre=newNombre;
        cantidad=newCantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "Producto: " + this.nombre + "   Cantidad: " + this.cantidad;
    }
}
