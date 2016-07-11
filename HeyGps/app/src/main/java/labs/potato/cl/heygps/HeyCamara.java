package labs.potato.cl.heygps;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Leo on 10-07-16.
 */
public class HeyCamara extends Activity{
    ImageView imagen_capturada;
    Button btn_camara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hey_camara);
        inicializar();//aqui inicializamos


        //este es el metodo on click, aqui se captura el evento de presionar el boton camara de nuestra vista
        btn_camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);


            }
        });


    }
    // en este metodo inicializamos todos los componentes de nuestra vista
    //esto es para que nuestra clase (activity) sepa que controles usamos
    private void inicializar(){
        btn_camara=(Button)findViewById(R.id.btn_init_camara);
        imagen_capturada=(ImageView)findViewById(R.id.image_picture);
    }

    //este metodo captura la respuesta de la aplicacion camara de android

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        //aqui convertimos la data recivida en un bitmap para posteriormente  setearlo a nuestro image view
        Bitmap bp = (Bitmap) data.getExtras().get("data");
        imagen_capturada.setImageBitmap(bp);
    }
}
