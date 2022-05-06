
package easymarket;

public class Lista {
    
    private Nodo cabeza = null;
    
    private int longitud = 0;
    
    private class Nodo {
        public producto Producto;
        public Nodo siguiente = null;
        
        public Nodo(producto Producto){
            this.Producto = Producto;
        }
    }
    
    public void insertarPrincipio(producto Producto){
        Nodo nodo = new Nodo(Producto);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }
    
    public void insertarFinal(producto Producto){
        Nodo nodo= new Nodo(Producto);
        if(cabeza == null){
            cabeza=nodo;
        }else{
            Nodo puntero=cabeza;
            while(puntero.siguiente != null){
                puntero = puntero.siguiente;
            } 
            puntero.siguiente = nodo;
        }
        longitud++;
    }
    
    public void insertarDespues(int n, producto Producto){
        Nodo nodo = new Nodo(Producto);
        if(cabeza == null){
            cabeza=nodo;
        }else{
            Nodo puntero=cabeza;
            int contador=0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            } 
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }
    
    public producto obtener(int n){
        if(cabeza == null){
            return null;
        }else{
            Nodo puntero=cabeza;
            int contador=0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            if(contador != n){
                return null;
            }else{
                return puntero.Producto;
            }
        }
    }
    
    public int contar(){
        return longitud;
    }
    
    public void allList(){
        Nodo puntero = cabeza;
        int contador = 0;
        while(contador < longitud){
            puntero = puntero.siguiente;
            System.out.println(obtener(contador));
            contador++;

        }
    }
    
    public void eliminarPrincipio(){
        if(cabeza!=null){
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente=null;
            longitud--;
        }
    }
    
    public void eliminarUltimo(){
        if(cabeza!=null){
            if(cabeza.siguiente == null){
                cabeza=null;
            }else{
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente != null){
                    puntero=puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }
    
    public void eliminarMedio(int n){
        if(cabeza!=null){
            if(n==0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente=null;
                longitud--;
            }else if(n<longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < (n-1)){
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }
    
    
}

