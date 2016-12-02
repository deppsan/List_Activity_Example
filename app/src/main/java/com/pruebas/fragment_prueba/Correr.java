package com.pruebas.fragment_prueba;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.pruebas.Adaptars.List_Adapter;
import com.pruebas.DTO.Lista_Entrada;

import java.util.ArrayList;

/**
 * Created by ricar on 01/12/2016.
 */

public class Correr extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_correr);

        ArrayList<Lista_Entrada> datos = new ArrayList<Lista_Entrada>();

        datos.add(new Lista_Entrada(R.drawable.person_1,"Buho","Búho es el nombre común de aves de la familia Strigidae, del orden de las estrigiformes o aves rapaces nocturnas. Habitualmente designa especies que, a diferencia de las lechuzas, tienen plumas alzadas que parecen orejas."));
        datos.add(new Lista_Entrada(R.drawable.person_1,"Buho","Búho es el nombre común de aves de la familia Strigidae, del orden de las estrigiformes o aves rapaces nocturnas. Habitualmente designa especies que, a diferencia de las lechuzas, tienen plumas alzadas que parecen orejas."));
        datos.add(new Lista_Entrada(R.drawable.person_1,"Buho","Búho es el nombre común de aves de la familia Strigidae, del orden de las estrigiformes o aves rapaces nocturnas. Habitualmente designa especies que, a diferencia de las lechuzas, tienen plumas alzadas que parecen orejas."));
        datos.add(new Lista_Entrada(R.drawable.person_1,"Buho","Búho es el nombre común de aves de la familia Strigidae, del orden de las estrigiformes o aves rapaces nocturnas. Habitualmente designa especies que, a diferencia de las lechuzas, tienen plumas alzadas que parecen orejas."));

        ListView lista = (ListView) findViewById(R.id.ListView_listado);

        lista.setAdapter(new List_Adapter(this,R.layout.entrada,datos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_Superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_Superior_entrada.setText(((Lista_Entrada)entrada).getTextoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((Lista_Entrada)entrada).getTextoDebajo());

                ImageView imagen_entrad = (ImageView) view.findViewById(R.id.imageView_Imagen);
                imagen_entrad.setImageResource(((Lista_Entrada) entrada).getIdImage());
            }
        });
    }

    public void clickEnBoton_IrAFlexiones(View view){
        Intent intent = new Intent(this,Flexiones.class);
        startActivity(intent);
    }
}
