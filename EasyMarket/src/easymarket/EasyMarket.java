
package easymarket;

import java.util.*;

public class EasyMarket {

    public static Scanner in = new Scanner(System.in); 
    
    public static Lista lista = new Lista();
    
    
    
    public static void main(String[] args) {         

        boolean exit = false;
        System.out.println("Bienvenido a Easy Market");
        while(!exit) {
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Actualizar Producto");
            System.out.println("5. Alacena");
            System.out.println("6. Salir");
            try {
                System.out.println("Escoge una opción del menú:");
                int menu = in.nextInt();
                switch (menu) {
                        case 1: 
                                newItem();
                                break;
                        case 2: 
                                deleteItem();
                                break;
                        case 3: 
                                //searchItem();
                                break;
                        case 4: 
                                //changeItem();
                                break;
                        case 5: 
                                allItems();
                                break;
                        case 6:                                 
                                System.out.println("\nHasta luego");
                                exit = true;
                        
                        default: System.out.println("\nNo es una opcion valida,\ndigite un numero entre 1 y 6\n");
                }
            }catch(InputMismatchException e) {
                    System.out.println("Presione Enter Para Continuar");
                    in.next();
                }
        }
    }
    
    public static void newItem(){
        long timei = System.nanoTime();
        System.out.println("\nDigite el nombre del producto que desea agregar a su alacena:");
        String nom = in.next();
        System.out.println("Digite la cantidad de unidades que desea agregar:");
        int cant = in.nextInt();
        System.out.println("¿Desea agregar "+cant+" unidades de "+nom+" a su alacena? Digite 1 para si, 2 para no");
        int temp = in.nextInt();
        if(temp == 1){
            producto newProduct = new producto(nom,cant);
            lista.insertarPrincipio(newProduct);
            System.out.println("");
        }
        else{
            System.out.println("\nNo se agregó este producto a su alacena, usted volvera al menú principal");
            System.out.println("");
        }
        long timef = System.nanoTime();
        System.out.println(timef);
    }

    public static void allItems(){
        lista.allList();
    }

    private static void deleteItem() {
        //System.out.println("\nDigite el nombre del producto que desea eliminar de su alacena:");
        //String nom = in.next();
        System.out.println(lista.obtener(0));


        //}
        
    }
    
}



    
    
    
    
    
    
    
    
    
    
    

