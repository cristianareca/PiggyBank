package com.example.piggybank;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CajaFuerteFragment extends Fragment {
    private Button Sumar;
    private Button Restar;
    private Button Guardar;
    private Button Atras;
    public CajaFuerteFragment() {

    }


    public static CajaFuerteFragment newInstance() {
        CajaFuerteFragment fragment = new CajaFuerteFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_caja_fuerte, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Sumar = view.findViewById(R.id.Sumar);
        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Se sumo con exito");
            }
        });
        Restar = view.findViewById(R.id.Restar);
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Se resto con exito");
            }
        });
        Guardar = view.findViewById(R.id.Guardar);
        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Se guardo");
            }
        });
        Atras = view.findViewById(R.id.Atras);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Chao pescao");
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, MenuFragment.newInstance());
                fragmentTransaction.commit();
            }
        });

    }
}