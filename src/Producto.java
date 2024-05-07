public enum Producto {
    MANZANA("Manzana", "FRUTA", "FRUTAS_Y_VERDURAS", 2) {
        @Override
        public double calcularDescuento() {
            if (getPrecio() > 5) {
                return getPrecio() * 0.1;
            } else {
                return 0;
            }
        }
    },
    ARROZ("Arroz", "CEREAL", "ALMACEN", 5) {
        @Override
        public double calcularDescuento() {
            return getPrecio() * 0.05;
        }
    },
    LECHE("Leche", "LACTEO", "LACTEOS", 3) {
        @Override
        public double calcularDescuento() {
            return 0;
        }
    },
    POLLO("Pollo", "CARNE", "CARNES_Y_AVES", 8) {
        @Override
        public double calcularDescuento() {
            if (getPrecio() > 7) {
                return getPrecio() * 0.15;
            } else {
                return 0;
            }
        }
    };

    private String nombre;
    private String tipo;
    private String categoria;
    private  double precio;

    Producto(String nombre, String tipo, String categoria, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public static void imprimirInfoProducto(Producto producto) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Tipo: " + producto.getTipo());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("Precio: $" + producto.getPrecio());
    }

    public abstract double calcularDescuento();
}