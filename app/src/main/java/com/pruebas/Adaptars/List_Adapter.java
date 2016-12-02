package com.pruebas.Adaptars;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by ricar on 02/12/2016.
 */

public abstract class List_Adapter extends BaseAdapter {

    private ArrayList<?> entradas;
    private int R_Layout_idView;
    private Context contexto;

    public List_Adapter(Context contexto, int R_layout_IdView, ArrayList<?> entradas) {
        super();
        this.contexto = contexto;
        this.entradas = entradas;
        this.R_Layout_idView = R_layout_IdView;
    }

    @Override
    public int getCount() {
        return entradas.size();
    }

    @Override
    public Object getItem(int position) {
        return entradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R_Layout_idView,null);
        }
        onEntrada(entradas.get(position),convertView);
        return convertView;
    }

    public abstract void onEntrada(Object entrada, View view);
}
