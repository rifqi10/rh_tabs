package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi;

    TextView txtHasil;

    double angkaPertama,angkaKedua;
    String sAngkaPertama,sAngkaKedua;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        super.onCreate(savedInstanceState);


        angka_pertama = (EditText)view.findViewById(R.id.txtAngka1);
        angka_kedua = (EditText) view.findViewById(R.id.txtAngka2);

        tambah = (Button) view.findViewById(R.id.btntambah);
        kurang = (Button)  view.findViewById(R.id.btnkurang);
        kali = (Button)  view.findViewById(R.id.btnkali);
        bagi = (Button)  view.findViewById(R.id.btnbagi);

        txtHasil = (TextView)  view.findViewById(R.id.txthasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    txtHasil.setText(Double.toString((result)));
                } else {
                    Toast toast = Toast.makeText( getContext(), "Angka 1 dan 2 tidak boleh kosong", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        final EditText txtangka_pertama, txtangka_kedua;
        Button btntambah, btnkurang, btnkali, btnbagi;

        final TextView txthasil = null;



        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_kedua.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    txtHasil.setText(Double.toString((result)));
                } else {
                    Toast toast = Toast.makeText(getContext(), "Tidak boleh 0", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    txtHasil.setText(Double.toString((result)));
                } else {
                    Toast toast = Toast.makeText(getContext(), "Tidak boleh 0", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka_pertama.getText().length() > 0) && (angka_kedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    txtHasil.setText(Double.toString((result)));
                } else {
                    Toast toast = Toast.makeText(getContext(), "Tidak boleh 0", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = angka_pertama.getText().toString();
                String angka2 = angka_kedua.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "Tidak boleh 0", Toast.LENGTH_LONG).show();

                }
                else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(angka_pertama.getText().toString());
                    angkas2 = Double.parseDouble(angka_kedua.getText().toString());
                    hasill = angkas1 / angkas2;
                    if (angkas2 != 0) {

                        txtHasil.setText("hasil dari " + angka1 + ":" + angka2 + "=" + hasill);
                    }
                    else
                    {
                        Toast.makeText(getContext(), ": dilarang 0", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        // Inflate the layout for this fragment
        return view;


        }

    }


