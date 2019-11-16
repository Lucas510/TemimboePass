package com.example.temimboepass;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import adaptadores.Adaptador;

public class BeneficiosActivity extends ListActivity {

    //declaramos el listView
    ListView lista;

    //creamos una matriz, tipo string para almacenar los datos de los descuentos.
    //una matriz de dos dimensiones
    String [] [] datos = {
            //cada llave es una fila
            {"Pizza Hut", "10% de descuento en todas las pizzas", "Comida",
                    "Perfecto cuando estas en apuros-- 10% de descuento en todas las pizzas-- Como un " +
                            "portador de la tarjeta TemimboePass obtienes un descuento del 10%" +
                            "en todas las pizzas disponibles. Obten el codigo de tu voucher aqui" +
                            "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                            "TemimboePass en el mostrador para obtener el descuento."},

            {"Nuestra Señora de la Asunción", "10% de descuento en los pasajes a destinos internos del pais", "Viaje",
                    "Date el gusto de una escapada-- 10% de descuento en los pasajes a destinos internos del pais-- Como un " +
                            "portador de la tarjeta TemimboePass obtienes un descuento del 10%" +
                            "en todas los pasajes a desinos internos del pais. Obten el codigo de tu voucher aqui" +
                            "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                            "TemimboePass en el mostrador para obtener el descuento."},

            {"Cinemark", "2.00 $ de descuento en la entrada al cine", "Entretenimiento",
            "Para cuando no sabes que hacer un sabado por la noche-- 10% de descuento en entradas al cine-- Como un " +
                    "portador de la tarjeta TemimboePass obtienes un descuento de 2.00 $" +
                    "en las entradas al cine. Obten el codigo de tu voucher aqui" +
                    "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                    "TemimboePass en el mostrador para obtener el descuento."},

            {"Guido Academy", "20% de descuento en todas las lecciones de Java", "Aprendizaje",
                    "Aprender algo nuevo-- 20% de descuento en todas las lecciones de Java-- Como un " +
                            "portador de la tarjeta TemimboePass obtienes un descuento del 20% " +
                            "en todas las lecciones de Java. Obten el codigo de tu voucher aqui" +
                            "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                            "TemimboePass en el mostrador para obtener el descuento."},

            {"Guido Academy", "20% de descuento en todas las lecciones de Java", "Aprendizaje",
                    "Aprender algo nuevo-- 20% de descuento en todas las lecciones de Java-- Como un " +
                            "portador de la tarjeta TemimboePass obtienes un descuento del 20% " +
                            "en todas las lecciones de Java. Obten el codigo de tu voucher aqui" +
                            "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                            "TemimboePass en el mostrador para obtener el descuento."},

            {"Guido Academy", "20% de descuento en todas las lecciones de Java", "Aprendizaje",
                    "Aprender algo nuevo-- 20% de descuento en todas las lecciones de Java-- Como un " +
                            "portador de la tarjeta TemimboePass obtienes un descuento del 20% " +
                            "en todas las lecciones de Java. Obten el codigo de tu voucher aqui" +
                            "y muestra el email con el codigo del voucher junto con tu tarjeta" +
                            "TemimboePass en el mostrador para obtener el descuento."},

    };

    //vector entero llamado datosImg, obtiene de la carpeta drawable los id de las imagenes para poder
    //utilizarlos despues
    int[] datosImg = {R.drawable.pizzahut, R.drawable.nsa, R.drawable.cinemark, R.drawable.java, R.drawable.java, R.drawable.java};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);

        //instanciamos la vista
        lista = (ListView) findViewById(R.id.lvLista);

        //instanciamos un nuevo adaptador,asignandolo al ListView
        lista.setAdapter(new Adaptador(this, datos, datosImg));


//        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent visorDetalles = new Intent(view.getContext(), DetallesPelicula.class);
//                visorDetalles.putExtra("TIT", datos[position][0]);
//                visorDetalles.putExtra("DET", datos[position][4]);
//                startActivity(visorDetalles);
//            }
//        });
    }
}

