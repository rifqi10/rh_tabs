package info.androidhive.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {
    EditText s;
    Button hitung;
    Button keliling;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        toolbar = findViewById((R.id.toolbar1));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s = (EditText)findViewById(R.id.sisi);
        hitung = (Button) findViewById(R.id.button);
        keliling=(Button)findViewById(R.id.keliling);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0 && s.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (s.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
             else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(s,s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }

            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length()==0 && s.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else {
                    String isisisi1 = s.getText().toString();
                    double s = Double.parseDouble(isisisi1);
                    double hs = KelilingPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });


    }

    public  boolean onSupportNavigateUp(){

        finish();
        return true;
    }

    public double LuasPersegi(double s, double si){return s*si;}
    public  double KelilingPersegi(double s) {return  4*s;}
}

