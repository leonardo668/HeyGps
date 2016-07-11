package labs.potato.cl.heygps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import labs.potato.cl.heygps.adapter.HeyAdapter;
import labs.potato.cl.heygps.listas.ListaOpciones;

/**
 * Created by Leo on 10-07-16.
 */
public class HeyGaleria extends Activity{

    private List<ListaOpciones> opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hey_galery);
        inicializaListaOpciones();
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        HeyAdapter adapter = new HeyAdapter(opciones);
        rv.setAdapter(adapter);
    }

    private void inicializaListaOpciones(){

        opciones= new ArrayList<>();
        opciones.add(new ListaOpciones(R.drawable.carpinteria,this.getString(R.string.madera_carpinteria),this.getString(R.string.title_madera_carpinteria)));
        opciones.add(new ListaOpciones(R.drawable.mecanica,this.getString(R.string.mecanica_automotriz),this.getString(R.string.title_mecanica_automotriz)));
        opciones.add(new ListaOpciones(R.drawable.electronica,this.getString(R.string.electronica),this.getString(R.string.title_electronica)));
        opciones.add(new ListaOpciones(R.drawable.computacion,this.getString(R.string.computacion),this.getString(R.string.title_computacion)));
        opciones.add(new ListaOpciones(R.drawable.lectura,this.getString(R.string.lectura),this.getString(R.string.title_lectura)));
        opciones.add(new ListaOpciones(R.drawable.jardineria,this.getString(R.string.jardineria),this.getString(R.string.title_jardineria)));
    }
}
