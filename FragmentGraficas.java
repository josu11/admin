package com.example.asuper.administracion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by super on 19/03/2018.
 */

public class FragmentGraficas extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_graficas, container, false);

        Bundle bundle = getArguments();
        if(bundle != null) {

            String car = bundle.getString("Carro");
            String name = bundle.getString("Nombre");
            String litters = bundle.getString("Litros");
            String price = bundle.getString("Costo");

            TextView firstText = (TextView) rootView.findViewById(R.id.car);
            TextView nameText = (TextView) rootView.findViewById(R.id.name);
            TextView littersText = (TextView) rootView.findViewById(R.id.litters);
            TextView priceText = (TextView) rootView.findViewById(R.id.price);

            firstText.setText(car);
            nameText.setText(name);
            littersText.setText(litters);
            priceText.setText(price);


        }
        return rootView;

    }

}
