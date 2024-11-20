
package com.viu.cafegrupo1;

/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */
// KMC - acqui no estoy muy segura de que funcionalidades deberia tener
//DCI- Voy a ver si finalmente puedo modificar estas operaciones

class Operaciones {
    private List <Producto> inventario; //DCI: Generamos una lista de productos al que llamaremos inventario
    // Constructor
    public Operaciones() {
        this.inventario = new ArrayList<>();
    }
    
     // DCI: Método privado para añadir productos al inventario
    private void agregarProducto(Producto producto) {
        inventario.add(producto);
    }
    
     //DCI:  Método privado para eliminar productos del inventario
    private void eliminarProducto(String nombreProducto) {
        inventario.removeIf(producto -> producto.getNombreProducto().equals(nombreProducto));
    }

      // DCI:  Método público para realizar un pedido
    public boolean realizarPedido(String nombreProducto, int cantidad) {
        // Buscamos el producto en el inventario
        for (Producto producto : inventario) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                if (producto.getStock() >= cantidad) {
                    // Si hay suficiente stock, actualizamos el stock
                    producto.setStock(producto.getStock() - cantidad);
                    System.out.println("Pedido realizado: " + cantidad + " unidades de " + nombreProducto);
                    return true;
                } else {
                    // No hay suficiente stock
                    System.out.println("No hay suficiente stock para realizar el pedido.");
                    return false;
                }
            }
        }
        // Si no encontramos el producto
        System.out.println("Producto no encontrado en el inventario.");
        return false;
    } 

    // DCI: Método público para actualizar el stock de un producto
    public void actualizarStock(String nombreProducto, int nuevoStock) {
        // Buscamos el producto en el inventario
        for (Producto producto : inventario) {
            if (producto.getNombreProducto().equals(nombreProducto)) {
                producto.setStock(nuevoStock);
                System.out.println("Stock actualizado de " + nombreProducto + ": " + nuevoStock + " unidades.");
                return;
            }
        }
        // Si no encontramos el producto
        System.out.println("El producto no existe en el inventario.");
    }

    // DCI: Método público para mostrar los productos en el inventario
    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : inventario) {
                producto.describirProducto();
            }
        }
    }
}
    
