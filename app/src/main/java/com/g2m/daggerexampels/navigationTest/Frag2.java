package com.g2m.daggerexampels.navigationTest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g2m.daggerexampels.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {


    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag2, container, false);
     //  int i= getArguments().getInt("asd",1);
       // Log.v("aaaaa",i+"");


        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Navigation.findNavController(view).navigate(R.id.action_frag2_to_blankFragment);
            }
        });
        return view;

    }

}
