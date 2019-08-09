package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.Lingkaran;
import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.Segitiga;
import info.androidhive.materialtabs.persegi;


public class TwoFragment extends Fragment {

    Button btnSEGITIGA;
    Button btnPERSEGI;
    Button btnPERSEGIPANJANG;
    Button btnLINGKARAN;

    public TwoFragment() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        View view = inflater.inflate(R.layout.fragment_two, container, false);
        // Inflate the layout for this fragment

        btnSEGITIGA = view.findViewById(R.id.btnSEGITIGA);
        btnSEGITIGA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Segitiga.class);
                startActivity(in);
            }
        });
        btnPERSEGI = view.findViewById(R.id.btnPERSEGI);
        btnPERSEGI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), persegi.class);
                startActivity(in);
            }
        });
        btnPERSEGIPANJANG = view.findViewById(R.id.btnPERSEGIPANJANG);
        btnPERSEGIPANJANG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(in);
            }
        });
        btnLINGKARAN = view.findViewById(R.id.btnLINGKARAN);
        btnLINGKARAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Lingkaran.class);
                startActivity(in);
            }
        });
        return view;

    }

}
