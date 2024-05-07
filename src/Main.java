public class Main {
    public static void main(String[] args) {
        for (Producto producto : Producto.values()) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: $" + producto.calcularDescuento());
            System.out.println("----------------------");
        }
    }
}
