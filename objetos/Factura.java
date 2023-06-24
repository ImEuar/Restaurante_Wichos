package objetos;

public class Factura{
    private String name;
    private Double price;

    public Factura(){}
    public Factura(String nm, Double pr){
        this.name = nm;
        this.price = pr;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price= price;
    }
}