import objetos.Producto;
import objetos.Usuario;
import objetos.Admin;
import objetos.PlatosFuertes;
import objetos.Bebida;
import objetos.Postres;
import objetos.Factura;

import java.util.*;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Factura> listaProductos = new ArrayList<Factura>();

        ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.ensureCapacity(10);
        listaUsuarios.add(new Usuario("Pedro", "pedro123"));
        listaUsuarios.add(new Usuario("Oscar", "oscar123"));

        ArrayList <Producto> listaEntradas = new ArrayList<Producto>();
        listaEntradas.ensureCapacity(10);
        listaEntradas.add(new Producto("Huevos Revueltos", 10.5, 3));
        listaEntradas.add(new Producto("Arepas", 7.2, 10));
        listaEntradas.add(new Producto("Empanadas", 8.1, 10));

        ArrayList <PlatosFuertes> listaPF = new ArrayList<PlatosFuertes>();
        listaPF.ensureCapacity(10);
        listaPF.add(new PlatosFuertes("Carne Asada", 20.5, 7));
        listaPF.add(new PlatosFuertes("Carne de Cerdo", 15.5, 8));
        listaPF.add(new PlatosFuertes("Pollo Guisado", 12.5, 10));

        ArrayList <Bebida> listaBebidas = new ArrayList<Bebida>();
        listaBebidas.ensureCapacity(10);
        listaBebidas.add(new Bebida("Coca-Cola", 4.9, 10));
        listaBebidas.add(new Bebida("Pepsi", 4.2, 10));
        listaBebidas.add(new Bebida("Horchata", 3.2, 10));

        ArrayList <Postres> listaPostres = new ArrayList<Postres>();
        listaPostres.ensureCapacity(10);
        listaPostres.add(new Postres("Helado", 5.5, 10));
        listaPostres.add(new Postres("Gelatina", 3.5, 5));
        listaPostres.add(new Postres("Yogurt", 5.0, 8));

        ArrayList <Admin> listaAdmins = new ArrayList<Admin>();
        listaAdmins.ensureCapacity(10);
        listaAdmins.add(new Admin("Eduardo", "euar123"));
        listaAdmins.add(new Admin("Javier", "xavier123"));
        boolean salir = false;
        while(!salir){
            System.out.println("-------Bienvenido-------\nPor favor, seleccione una opción:");
            System.out.println("1. Iniciar Sesión\n2. Registrarse\n3. Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Nombre de usuario:");
                sc.nextLine();
                String nu = sc.nextLine();
                System.out.println("Contraseña:");
                String c = sc.nextLine();
                for(Usuario lista1: listaUsuarios) {
                    for(Admin lista2: listaAdmins){
                        while(!salir){
                        if((nu.equals(lista1.getUsername())) && (c.equals(lista1.getPassword()))){
                            System.out.println("Bienvenido, " + lista1.getUsername());
                                System.out.println("¿Qué desea hacer?\n1. Ver el menú\n2. Crear factura\n3. Cerrar Sesión");
                                int option = sc.nextInt();
                                sc.nextLine();
                                switch(option){
                                    case 1:
                                    int num = 1;
                                    System.out.println("----------Entradas----------");
                                    while(num < listaEntradas.size()){
                                        for(Producto lista: listaEntradas){
                                            System.out.println((num++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio());
                                        }
                                    }
                                    int num2 = 1;
                                    System.out.println("----------Platos Fuertes----------");
                                    while(num2 < listaPF.size()){
                                        for(PlatosFuertes lista: listaPF){
                                            System.out.println((num2++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio());
                                        }
                                    }
                                    int num3 = 1;
                                    System.out.println("----------Bebidas----------");
                                    while(num3 < listaBebidas.size()){
                                        for(Bebida lista: listaBebidas){
                                            System.out.println((num3++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio());
                                        }
                                    }
                                    int num4 = 1;
                                    System.out.println("----------Postres----------");
                                    while(num4 < listaPostres.size()){
                                        for(Postres lista: listaPostres){
                                            System.out.println((num4++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio());
                                        }
                                    }
                                    break;
                                    case 2:
                                        Double total;
                                        double total3 = 0;
                                        String totalpro;
                                        String totalpro2 = "";
                                        int yon = 1;
                                        while (yon == 1){
                                            Factura a = new Factura();
                                        System.out.println("Ingrese el nombre del producto que desea ordenar");
                                        String productoO = sc.nextLine();
                                        for(int i=0;i< listaEntradas.size(); i++){
                                            for(i = 0;i<listaPF.size();i++){
                                                for(i=0;i<listaBebidas.size();i++){
                                                    for(i=0;i<listaPostres.size();i++){
                                                        Producto entrada = listaEntradas.get(i);
                                                        Producto platofuerte = listaPF.get(i);
                                                        Producto bebida = listaBebidas.get(i);
                                                        Producto postre = listaPostres.get(i);
                                                        if(productoO.equals(postre.getNombre())){
                                                            a.setName(postre.getNombre());
                                                            a.setPrice(postre.getPrecio());
                                                            listaProductos.add(a);
                                                            System.out.println("Añadido al carrito");
                                                            total = postre.getPrecio();
                                                            total3 = total3 + total;
                                                            totalpro = postre.getNombre();
                                                            totalpro2 = totalpro2 + totalpro;
                                                            System.out.println("¿Desea continuar con su factura?\n1. Sí\n2. No");
                                                            int o1 = sc.nextInt();
                                                            if(o1 == 1){
                                                                yon = 1;
                                                            }else{
                                                                System.out.println("Ingrese su Nit");
                                                                Long nit = sc.nextLong();
                                                                yon = 2;
                                                                System.out.println("-----Datos del cliente-----\nNombre: " + lista1.getUsername() + "\nNit del cliente: " + nit);
                                                                System.out.println("-----Productos ordenados-----\n");
                                                                int num5 = 1;
                                                                while(num5 < listaProductos.size()){
                                                                    for(Factura listaP: listaProductos){
                                                                        System.out.println((num5++) + ". Nombre: " + listaP.getName() + "\nPrecio: " + listaP.getPrice() + "\n");
                                                                    }
                                                                }
                                                                System.out.println("El total de su pedido es: " + total3);
                                                            }
                                                        }
                                                        if(productoO.equals(bebida.getNombre())){
                                                            a.setName(bebida.getNombre());
                                                            a.setPrice(bebida.getPrecio());
                                                            listaProductos.add(a);
                                                            System.out.println("Añadido al carrito");
                                                            total = bebida.getPrecio();
                                                            total3 = total3 + total;
                                                            System.out.println("¿Desea continuar con su factura?\n1. Sí\n2. No");
                                                            int o2 = sc.nextInt();
                                                            if(o2 == 1){
                                                                yon = 1;
                                                            }else{
                                                                System.out.println("Ingrese su Nit");
                                                                Long nit = sc.nextLong();
                                                                yon = 2;
                                                                System.out.println("-----Datos del cliente-----\nNombre: " + lista1.getUsername() + "\nNit del cliente: " + nit);
                                                                System.out.println("-----Productos ordenados-----\n");
                                                                int num5 = 1;
                                                                while(num5 < listaProductos.size()){
                                                                    for(Factura listaP: listaProductos){
                                                                        System.out.println((num5++) + ". Nombre: " + listaP.getName() + "\nPrecio: " + listaP.getPrice() + "\n");
                                                                    }
                                                                }
                                                                System.out.println("El total de su pedido es: " + total3);

                                                            }
                                                        }
                                                        if(productoO.equals(platofuerte.getNombre())){
                                                            a.setName(platofuerte.getNombre());
                                                            a.setPrice(platofuerte.getPrecio());
                                                            listaProductos.add(a);
                                                            System.out.println("Añadido al carrito");
                                                            total = platofuerte.getPrecio();
                                                            total3 = total3 + total;
                                                            System.out.println("¿Desea continuar con su factura?\n1. Sí\n2. No");
                                                            int o3 = sc.nextInt();
                                                            if(o3 == 1){
                                                                yon = 1;
                                                            }else{
                                                                System.out.println("Ingrese su Nit");
                                                                Long nit = sc.nextLong();
                                                                yon = 2;
                                                                System.out.println("-----Datos del cliente-----\nNombre: " + lista1.getUsername() + "\nNit del cliente: " + nit);
                                                                System.out.println("-----Productos ordenados-----\n");
                                                                int num5 = 1;
                                                                while(num5 < listaProductos.size()){
                                                                    for(Factura listaP: listaProductos){
                                                                        System.out.println((num5++) + ". Nombre: " + listaP.getName() + "\nPrecio: " + listaP.getPrice() + "\n");
                                                                    }
                                                                }
                                                                System.out.println("El total de su pedido es: " + total3);

                                                            }
                                                        }
                                                        if(productoO.equals(entrada.getNombre())){
                                                            a.setName(entrada.getNombre());
                                                            a.setPrice(entrada.getPrecio());
                                                            listaProductos.add(a);
                                                            System.out.println("Añadido al carrito");
                                                            total = entrada.getPrecio();
                                                            total3 = total3 + total;
                                                            System.out.println("¿Desea continuar con su factura?\n1. Sí\n2. No");
                                                            int o = sc.nextInt();
                                                            if(o == 1){
                                                                yon = 1;
                                                            }else{
                                                                System.out.println("Ingrese su Nit");
                                                                Long nit = sc.nextLong();
                                                                yon = 2;
                                                                System.out.println("-----Datos del cliente-----\nNombre: " + lista1.getUsername() + "\nNit del cliente: " + nit);
                                                                System.out.println("-----Productos ordenados-----\n");
                                                                int num5 = 1;
                                                                while(num5 < listaProductos.size()){
                                                                    for(Factura listaP: listaProductos){
                                                                        System.out.println((num5++) + ". Nombre: " + listaP.getName() + "\nPrecio: " + listaP.getPrice() + "\n");
                                                                    }
                                                                }
                                                                System.out.println("El total de su pedido es: " + total3);
                                                }
                                            }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                    case 3:
                                    salir = true;
                                    System.out.println("Tenga un buen día");
                                    break;
                                    default:
                                    System.out.println("Lo sentimos, esa opción no existe");
                                }
                            
                        }else if((nu.equals(lista2.getUsername())) && (c.equals(lista2.getPassword()))){
                            System.out.println("Bienvenido, " + lista2.getUsername());
                            while(!salir){
                            System.out.println("¿Qué desea hacer?\n1. Listar menú\n2. Listar Usuarios\n3. Agregar Producto\n4. Eliminar Producto\n5. Cerrar Sesión");
                            int opcionAdmin = sc.nextInt();
                            sc.nextLine();
                            switch(opcionAdmin){
                                case 1:
                                int num = 1;
                                    System.out.println("----------Entradas----------");
                                    while(num < listaEntradas.size()){
                                        for(Producto lista: listaEntradas){
                                            System.out.println((num++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio() + "\n   En Stock: " + lista.getStock());
                                        }
                                    }
                                    int num2 = 1;
                                    System.out.println("----------Platos Fuertes----------");
                                    while(num2 < listaPF.size()){
                                        for(PlatosFuertes lista: listaPF){
                                            System.out.println((num2++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio() + "\n   En Stock: " + lista.getStock());
                                        }
                                    }
                                    int num3 = 1;
                                    System.out.println("----------Bebidas----------");
                                    while(num3 < listaBebidas.size()){
                                        for(Bebida lista: listaBebidas){
                                            System.out.println((num3++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio() + "\n En Stock: " + lista.getStock());
                                        }
                                    }
                                    int num4 = 1;
                                    System.out.println("----------Postres----------");
                                    while(num4 < listaPostres.size()){
                                        for(Postres lista: listaPostres){
                                            System.out.println((num4++) + ". " + lista.getNombre() + "\n   Precio: " + lista.getPrecio() + "\n En Stock: " + lista.getStock());
                                        }
                                    }
                                break;
                                case 2:
                                System.out.println("-----Clientes-----");
                                int numero = 1;
                                while(numero < listaUsuarios.size()){
                                    for(Usuario list: listaUsuarios){
                                        System.out.println((numero++) + ". Nombre: " + list.getUsername());
                                    }
                                }
                                System.out.println("-----Administradores-----");
                                int numeraco = 1;
                                while(numeraco < listaAdmins.size()){
                                    for(Admin listaq: listaAdmins){
                                        System.out.println((numeraco++) + ". Nombre: " + listaq.getUsername());
                                    }
                                }
                                break;
                                case 3:
                                System.out.println("¿A qué categoría de producto desea añadir?\n1. Entrada\n2. Plato Fuerte\n3. Bebida\n4. Postre");
                                int np = sc.nextInt();
                                sc.nextLine();
                                switch(np){
                                    case 1:
                                    Producto a = new Producto();
                                    System.out.println("¿Cómo se llamará la nueva Entrada?");
                                    a.setNombre(sc.nextLine());
                                    System.out.println("¿Cuánto costará la nueva Entrada?");
                                    a.setPrecio(sc.nextDouble());
                                    System.out.println("Añada la cantidad de existencias de la nueva Entrada");
                                    a.setStock(sc.nextInt());
                                    listaEntradas.add(a);
                                    System.out.println("Producto añadido correctamente");
                                    break;
                                    case 2:
                                    PlatosFuertes a1 = new PlatosFuertes();
                                    System.out.println("¿Cómo se llamará el nuevo Plato Fuerte?");
                                    a1.setNombre(sc.nextLine());
                                    System.out.println("¿Cuánto costará el nuevo Plato Fuerte?");
                                    a1.setPrecio(sc.nextDouble());
                                    System.out.println("Añada la cantidad de existencias del nuevo Plato Fuerte");
                                    a1.setStock(sc.nextInt());
                                    listaPF.add(a1);
                                    System.out.println("Producto añadido correctamente");
                                    break;
                                    case 3:
                                    Bebida a2 = new Bebida();
                                    System.out.println("¿Cómo se llamará la nueva Bebida?");
                                    a2.setNombre(sc.nextLine());
                                    System.out.println("¿Cuánto costará la nueva Bebida?");
                                    a2.setPrecio(sc.nextDouble());
                                    System.out.println("Añada la cantidad de existencias de la nueva Bebida");
                                    a2.setStock(sc.nextInt());
                                    listaBebidas.add(a2);
                                    System.out.println("Producto añadido correctamente");
                                    break;
                                    case 4:
                                    Postres a3 = new Postres();
                                    System.out.println("¿Cómo se llamará el nuevo Postre?");
                                    a3.setNombre(sc.nextLine());
                                    System.out.println("¿Cuánto costará el nuevo Postre?");
                                    a3.setPrecio(sc.nextDouble());
                                    System.out.println("Añada la cantidad de existencias del nuevo Postre");
                                    a3.setStock(sc.nextInt());
                                    listaPostres.add(a3);
                                    System.out.println("Producto añadido correctamente");
                                    break;
                                    default:
                                    System.out.println("Lo sentimos, esa opción no existe");
                                }
                                break;
                                case 4:
                                System.out.println("Ingrese el nombre del producto que desea eliminar");
                                String ep = sc.nextLine();
                                for(int rp = 0; rp < listaEntradas.size(); rp++){
                                    for(rp = 0; rp < listaPF.size(); rp++){
                                        for(rp = 0; rp < listaBebidas.size();rp++){
                                            for(rp=0;rp<listaPostres.size();rp++){
                                                Producto entradaE = listaEntradas.get(rp);
                                                PlatosFuertes pfE = listaPF.get(rp);
                                                Bebida bebidaE = listaBebidas.get(rp);
                                                Postres postreE = listaPostres.get(rp);
                                                if(ep.equals(entradaE.getNombre())){
                                                    listaEntradas.remove(rp);
                                                    System.out.println("Entrada Eliminada");
                                                }
                                                if(ep.equals(pfE.getNombre())){
                                                    listaPF.remove(rp);
                                                    System.out.println("Plato Fuerte Eliminado");
                                                }
                                                if(ep.equals(bebidaE.getNombre())){
                                                    listaBebidas.remove(rp);
                                                    System.out.println("Bebida Eliminada");
                                                }
                                                if(ep.equals(postreE.getNombre())){
                                                    listaPostres.remove(rp);
                                                    System.out.println("Postre Eliminado");
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                                case 5:
                                    salir = true;
                                    System.out.println("Tenga un buen día");
                                break;
                                default:
                                System.out.println("Lo sentimos, esa opción no existe");
                            }
                        }
                    }
                        else{
                            salir = true;
                            System.out.println("Contraseña y/o usuario incorrectos");
                        }
                    }
                    }
                }
                break;
                case 2:
                System.out.println("¿Qué tipo de acceso desea tener?\n1. Cliente\n2. Administrador");
                int acceso = sc.nextInt();
                sc.nextLine();
                switch (acceso) {
                case 1:
                Usuario x = new Usuario();
                System.out.println("Ingrese su nombre");
                x.setUsername(sc.nextLine());
                System.out.println("Ingrese su contraseña");
                x.setPasword(sc.nextLine());
                listaUsuarios.add(x);
                System.out.println("Registro completado exitosamente");
                break;
                case 2:
                Admin y = new Admin();
                System.out.println("Ingrese su nombre");
                y.setUsername(sc.nextLine());
                System.out.println("Ingrese su contraseña");
                y.setPasword(sc.nextLine());
                listaAdmins.add(y);
                System.out.println("Registro completado exitosamente");
                break;
                default:
                    System.out.println("Lo sentimos, esa opción no existe");
                        break;
                }
                break;
                case 3: 
                salir = true;
                System.out.println("¡Gracias por visitar Wicho's!");
                break;
                default:
                System.out.println("Lo sentimos, esa opcoión no existe.");
            }
        }
    }
}