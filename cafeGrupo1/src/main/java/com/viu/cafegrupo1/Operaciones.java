
package com.viu.cafegrupo1;
/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */
// KMC - acqui no estoy muy segura de que funcionalidades deberia tener
// DCI- Realizamos una lista de productos y lo llamamos inventarios

class Operaciones {
    private  List<Producto> inventario;// tenemos un listado de productos?

    //Constructor
    public Operaciones (Producto[] prod){
        this.inventario = new ArrayList<>();
    }
    
    
   //Metodo privado par anadir productos al inventario
    private void agregarProducto (Producto producto) {
        inventario.add(producto)

}

//Metodo privado para eliminar prodccutctos del inventario
//Preguntamos que producto queremos eliminar para buscarlo en la lista
    private void eliminarProducto (string nombreProducto( string nombreProducto){
        inventario.removeIf(producto->producto.getNombreProducto().equals(nombreProducto);
    }

//Metodo publico para realizar un pedido
public void realizarPedido (string nombreProducto, int cantidad){
    //Buscamos si existe el producto en la lista inventario
    for (Producto producto : inventario){
        if(producto.getNombreProducto().equals(nombreProducto)){
            if(producto.getStock >= cantidad){ 
                //Si existe la suficiente cantidad de stock, actualizamos el stock
                producto.setStock(producto.getStock()-cantidad);
                System.out.println("Pedido realizado: " + cantidad + " unidades de " + nombreProducto); //Muestra por pantalla si se ha encontrado el producto
                    return true;
            }else {
                //No existe cantidad suficiente de stock
                System.out.println("No hay suficiente stock para realizar el pedido."); //Muestra por pantalla si no se ha encontrado el producto
                    return false;
            }
        }
    }
}


//Metodo publico para actualizar stock
public void actualizarStock (string nombreProducto, int nuevoStock){
    bool encontrado=false; //flag
    //Buscamos el producto en la lista inventario
    for (Producto producto : inventario){
        if(producto.getNombreProducto().equals(nombreProducto)){
            //Si encontramos el producto en el inventario
            producto.setStock(nuevoStock); //Actualizamos la cantidad del stock
            encontrado=true;
            System.out.println("Stock actualizado de " + nombreProducto + ": " + nuevoStock + " unidades."); //Muestra por pantalla si se ha podido actualizar el stock
                return;
        }
    }
    if (producto.equals(false){  //En caso de que no se encuentre en la lista
        System.out.println("El producto no existe en el inventario.");
    }
}


//Metodo para mostrar los productos en el inventario
    publick void mostrarInventario(){
        if(inventario.isEmpty()){ //Si esta vacio nos saltamos todo el proceso directamente
         System.out.println("El inventario está vacío.");
        } else { 
            for (Producto producto: inventario){ //Llamada al metodo implementado en clase producto
                producto.describirProducto();
            }
        }
    }
    






               
