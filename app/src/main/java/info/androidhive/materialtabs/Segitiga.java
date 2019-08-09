package info.androidhive.materialtabs;

import android.app.Fragment;
import android.support.constraint.Placeholder;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Segitiga extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;

    TextView txthasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        toolbar = findViewById((R.id.toolbar));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText alas = (EditText) findViewById(R.id.alas);
        final EditText tinggi = (EditText)findViewById(R.id.tinggi);
        Button hitung = (Button) findViewById(R.id.btnhitung);
        Button keliling = (Button) findViewById(R.id.keliling);
        txthasil = (TextView)findViewById(R.id.txthasil);
        hitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    txthasil.setText(output.toString());
                }
            }
        });


        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }

                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }

                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = alas.getText().toString();
                    String isilebar = tinggi.getText().toString();
                    double a = Double.parseDouble(isipanjang);
                    double t = Double.parseDouble(isilebar);
                    double hs = KelilingSegitiga(a,t);
                    String output = String.valueOf(hs);
                    txthasil.setText(output.toString());
                }

            }
        });


    }

    public  boolean onSupportNavigateUp(){

        finish();
        return true;
    }



    public double LuasSegitiga(double a, double t){return a*t/2;}
    public double KelilingSegitiga(double a, double t){return  a+2*t;}
}

