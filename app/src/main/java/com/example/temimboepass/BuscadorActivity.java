package com.example.temimboepass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class BuscadorActivity extends AppCompatActivity
    implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
    }

    //Dentro de onCreateOptionsMenu() estamos cargando el archivo de recursos de menú utilizando inflate()
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);

        //A través del objeto Menu encontramos el MenuItem que contiene el asistente SearchView
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        //establecer un objeto OnQueryTextListener en SearchView, la app detecta dos eventos
        //onQueryTextChange es convocado cuando el usuario escribe cada carácter en el campo de texto;
        // onQueryTextSubmit se activa cuando se prime la búsqueda.
          searchView.setOnQueryTextListener(this);

          SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
          searchView.setSearchableInfo(searchManager.getSearchableInfo
                  (new ComponentName(this, SearchableActivity.class)));
          searchView.setIconifiedByDefault(false);

        return true;

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Toast.makeText(this, "Searching by: "+ query, Toast.LENGTH_SHORT).show();

        } else if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            String uri = intent.getDataString();
            Toast.makeText(this, "Suggestion: "+ uri, Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean onQueryTextSubmit(String query) {

        // El usuario presiona el boton buscar
        return false;

    }

    @Override
    public boolean onQueryTextChange(String newText) {

        // El usuario cambia el texto
        return false;

    }
}


