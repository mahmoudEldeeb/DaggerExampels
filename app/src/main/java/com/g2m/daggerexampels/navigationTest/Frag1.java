package com.g2m.daggerexampels.navigationTest;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.g2m.daggerexampels.R;

/**
 * A simple {@link Fragment} subclass.
 */
public  class Frag1 extends Fragment {


    public Frag1() {
        // Required empty public constructor
    }
Asdasd asd;
EditText num;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag1, container, false);
        asd= ViewModelProviders.of(this).get(Asdasd.class);
        num=view.findViewById(R.id.num);

Log.v("qqqqqq","sssssssssdf");



asd.get().observe(this, new Observer<Integer>() {
    @Override
    public void onChanged(Integer integer) {
        Log.v("qqqq",integer+"   d");
        num.setText(asd.a);
    }
});
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asd.a=num.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putInt("asd",34);
                Frag1Directions.ActionFrag1ToFrag2 fr=Frag1Directions.actionFrag1ToFrag2(1);

                Navigation.findNavController(view).navigate(fr);
            }
        });
        return view;
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.v("aaaa","eeeeeeeeee");
        outState.putString("asd","ddddd");
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.v("aaaa","ssssssss");
      try {
          if(savedInstanceState!=null) {
              String a = savedInstanceState.getString("asd");
              Log.v("aaaa", a);
          }
          else {
              Log.v("aaaa","false");
          }
      }
      catch (NullPointerException e){

      }

        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
