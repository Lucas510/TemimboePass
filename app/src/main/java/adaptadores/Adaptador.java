package adaptadores;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.temimboepass.R;

import java.util.ArrayList;

import datos.Local;

//BaseAdapter nos provee de todos los metodos para generar el adaptador
public class Adaptador extends BaseAdapter {

    private final Activity actividad;
    private final ArrayList<Local> lista;

    //constructor
    public Adaptador(Activity actividad, ArrayList<Local> lista){
        super();
        this.actividad = actividad;
        this.lista = lista;
    }



    @Override
    //le ponemos i, para controlar la posicion cada que que se esta mandando cada vez que se genera
    public View getView(int i, View convertView, ViewGroup parent) {

        LayoutInflater inflater = actividad.getLayoutInflater();
        View view = inflater.inflate(R.layout.elemento_lista, null, true);

        TextView titulo1 = (TextView) view.findViewById(R.id.tvTitulo);
        titulo1.setText(lista.get(i).getN());

        TextView  modeloAuto = (TextView) view.findViewById(R.id.modelo_auto);
        modeloAuto.setText(""+lista.get(i).getModelo());

        TextView  colorAuto = (TextView) view.findViewById(R.id.color_auto);
        colorAuto.setText(""+lista.get(i).getColor());

//		ImageView fotoAuto = (ImageView) view.findViewById(R.id.foto_auto);
//		fotoAuto.setImageResource(lista.get(posicion).getImagen());

        /*
        //cuando le demos click en la imagen, esto agrega una etiqueta, es para saber en que columna
        //o fila se dio click
        imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorImagen.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });
         */
        //generar la vista y regresala para que contenga todos los elementos
        return vista;
    }



    //va a obtener el total de elementos que hay
    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}