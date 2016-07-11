package labs.potato.cl.heygps.listas;

import android.content.Context;

/**
 * Created by Leo on 12-06-16.
 */
public class ListaOpciones {
    private int id_imagen;
    private String texto, titulo;
    Context context;


    public ListaOpciones() {

    }

    public ListaOpciones(int id_imagen, String texto, String titulo) {
        this.id_imagen = id_imagen;
        this.texto = texto;
        this.titulo = titulo;
    }


    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
