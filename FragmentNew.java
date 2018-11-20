package com.example.asuper.administracion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.example.asuper.administracion.R.id.button;

/**
 * Created by super on 19/03/2018.
 */

public class FragmentNew extends Fragment {

    EditText editText, editText2, editText4, editText5;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_new, container, false);
        editText = (EditText) rootView.findViewById(R.id.editText);
        editText2 = (EditText) rootView.findViewById(R.id.editText2);
        editText4 = (EditText) rootView.findViewById(R.id.editText4);
        editText5 = (EditText) rootView.findViewById(R.id.editText5);
        button = (Button) rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String car1 = editText.getText().toString();
                String name1 = editText2.getText().toString();
                String  litters1 = editText4.getText().toString();
                String price1 = editText5.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Carro", car1);
                bundle.putString("Nombre", name1);
                bundle.putString("Litros", litters1);
                bundle.putString("Costo", price1);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                FragmentGraficas fragmentGraficas = new FragmentGraficas();
                fragmentGraficas.setArguments(bundle);

                fragmentTransaction.replace(R.id.content_main, fragmentGraficas);
                fragmentTransaction.commit();

            }

        });

        return rootView;


    }

}


