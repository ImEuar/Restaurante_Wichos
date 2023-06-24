package objetos;

public class Producto{
    private String nombre;
    private Double precio;
    private int stock;

    public Producto(){}
    public Producto(String n, Double p, int s){
        this.nombre = n;
        this.precio = p;
        this.stock = s;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getPrecio(){
        return precio;
    }
    public void setPrecio(Double precio){
        if(precio < 0){
            System.out.println("Lo sentimos, no aceptamos números negativos");
            return;
        }
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        if(stock < 0){
            System.out.println("Lo sentimos, no aceptamos números negativos");
            return;
        }
        this.stock = stock;
    }
}