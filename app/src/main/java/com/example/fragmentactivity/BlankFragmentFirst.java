package com.example.fragmentactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragmentFirst extends Fragment {
    Button button;
    TextView textView;

    @Override
    public void onAttach(@NonNull Context context){

        super.onAttach(context);

        Toast.makeText(context, "OnAttach() is called ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@NonNull Bundle saveInstanceState){

        super.onCreate(saveInstanceState);

        Toast.makeText(getActivity(), "OnCreate() is called ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume(){

        super.onResume();

        Toast.makeText(getActivity(), "OnResume() is called", Toast.LENGTH_SHORT).show();
    }

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_blank_first,container,false);

        button = view.findViewById(R.id.button);
        textView = view.findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Welcome to the Fragment 1", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}