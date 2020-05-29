package com.uisrael.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etUsuario);
        et2 = findViewById(R.id.etPassword);
    }
    public void Start(View v ){
        if(et1.getText().toString().equals("estudiante2020") && et2.getText().toString().equals("uisrael2020")){
            Toast.makeText(getApplicationContext(),"Usuario correcto",Toast.LENGTH_SHORT).show();
           Intent i = new Intent(LoginActivity.this, RegistroActivity.class);
            i.putExtra("UserConnected", et1.getText().toString());
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(),"Datos erróneos. Por favor, inténtelo otra vez.",Toast.LENGTH_SHORT).show();
        }
    }
}
