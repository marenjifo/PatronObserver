package com.example.estudiante.patronobserver;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment {

    //Observable

        //2.Crear objeto
    MiListener listener;

    //1.Crear interface
    interface MiListener {
        void onChangeColor(String color);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Cambiar Color");
        builder.setMessage("Seleccione un color");

        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Blanco");
            }
        });


        builder.setNegativeButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Negro");
            }
        });


        builder.setNeutralButton("Azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Azul");
            }
        });
        return builder.create();
    }

    //3.Metodo de set para listener

    public void setListener(MiListener listener) {
        this.listener = listener;
    }
}
