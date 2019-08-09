package info.androidhive.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public  class  Lingkaran extends  AppCompatActivity{
    
    
    EditText txtJariJari;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    TextView txthasil;
    Button keliling;
    Button luas;
    String num;
    int jari;
    int hasil1;
    
    
    protected void  onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        toolbar = findViewById((R.id.toolbar1));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        txtJariJari = findViewById(R.id.txtJariJari);
        txthasil = findViewById(R.id.txt_hasil);
        keliling= findViewById(R.id.btnkeliling);
        luas = findViewById(R.id.btnluas);
        
        luas.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View view){
                num =txtJariJari.getText().toString();
                if (num.isEmpty()){
                    Toast.makeText(getApplicationContext(),"tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    jari = Integer.parseInt((txtJariJari.getText().toString()));
                    hasil1 = 22*jari/7;
                    txthasil.setText(String.valueOf(hasil1));
                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View view){
                num=txtJariJari.getText().toString();
                if (num.isEmpty()){
                    Toast.makeText(getApplicationContext(),"tidak bisa beroperasi",Toast.LENGTH_LONG).show();
                }else {
                    jari= Integer.parseInt(txtJariJari.getText().toString());
                    hasil1= 2*22*jari/7;
                    txthasil.setText(String.valueOf(hasil1));
                }
            }
            
        });
    }

    public  boolean onSupportNavigateUp(){

        finish();
        return true;
    }
}
