package datos;

import com.example.temimboepass.R;

import java.util.ArrayList;

public class Local {

    private int id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private int descuento;
    private static int imagen;

    private ArrayList<Local> localesTotal;

    public static ArrayList<Local> locales = new ArrayList<>();

    static {
        Local local1 = new Local(1, "Pizza Hut", "10% de descuento en todas las pizzas", "Comida", 10, R.drawable.pizzahut);
        Local local2 = new Local(2, "Cinemark", "30% de descuento en la entrada al cine", "Entretenimiento", 30, R.drawable.nsa);
        Local local3 = new Local(3, "Nuestra Señora de la Asunción", "10% de descuento en los pasajes a destinos internos del pais", "Viajes", 10, R.drawable.cinemark);
        Local local4 = new Local(4, "Guido Academy", "20% de descuento en todas las lecciones de Java", "Aprendizaje", 20, R.drawable.java);
        Local local5 = new Local(5, "Uber", "15% de descuento en viajes pagando con la app TemimboePass", "Viajes", 15, R.drawable.uber);
        locales.add(local1);
        locales.add(local2);
        locales.add(local3);
        locales.add(local4);
        locales.add(local5);

}

    public Local(int id, String nombre, String descripcion, String categoria, int descuento, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.descuento = descuento;
        this.imagen = imagen;

    }
    public Local(){

    }

    public boolean estaAlFinalDeLaListaDeLocales(){
        if( id == (locales.size() - 1)){
            return true;
        }else {
            return false;
        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public static int getImagen() {
        return imagen;
    }

    public static void setImagen(int imagen) {
        Local.imagen = imagen;
    }

    public ArrayList<Local> getLocalesTotal() {
        return localesTotal;
    }

    public void setLocalesTotal(ArrayList<Local> localesTotal) {
        this.localesTotal = localesTotal;
    }

    public static ArrayList<Local> getLocales() {
        return locales;
    }

    public static void setLocales(ArrayList<Local> locales) {
        Local.locales = locales;
    }