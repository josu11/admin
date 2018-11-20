package com.example.asuper.administracion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by super on 19/03/2018.
 */

public class FragmentManage extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_manage, container, false);

        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in = new Intent(getActivity(), Main3Activity.class);
                startActivity(in);
            }
        });
        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in = new Intent(getActivity(), Main3Activity.class);
                startActivity(in);
            }
        });

        Button button4 = (Button) view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in = new Intent(getActivity(), Main3Activity.class);
                startActivity(in);
            }
        });


        return view;
    }
}
