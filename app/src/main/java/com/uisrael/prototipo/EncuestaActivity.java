package com.uisrael.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class EncuestaActivity extends AppCompatActivity {
    TextView userconected,PagoTotal,tv;
    Bundle dato;
    RadioButton rb1, rb2;
    CheckBox cb1, cb2;
    Button bt1;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        userconected = findViewById(R.id.tvUserConnected2);
        PagoTotal = findViewById(R.id.textView7);
        tv = findViewById(R.id.textView8);
        dato = getIntent().getExtras();
        String Pago = dato.getString("Pago");
        PagoTotal.setText(Pago);
        String nombre = dato.getString("Nombre");
        tv.setText(nombre);
        String UserConnected = dato.getString("usuarioEnviado");
        userconected.setText(UserConnected);
        rb1 = findViewById(R.id.rbSi);
        rb2 = findViewById(R.id.rbNo);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        bt1 = findViewById(R.id.btnPasar);
        et = findViewById(R.id.etCentro);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked() && cb1.isChecked()) {
                    Toast.makeText(EncuestaActivity.this, "Datos enviados", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(EncuestaActivity.this, ResumenActivity.class);
                    i.putExtra("Resultado", rb1.getText().toString());
                    i.putExtra("Lenguaje", cb1.getText().toString());
                    i.putExtra("aplicacion", et.getText().toString());
                    i.putExtra("UserConnected", userconected.getText().toString());
                    i.putExtra("Pago", PagoTotal.getText().toString());
                    i.putExtra("Nombre", tv.getText().toString());

                    //i.putExtra("Centro", et.getText().toString());
                    startActivity(i);

                } else if (rb1.isChecked() || cb2.isChecked()) {
                    Toast.makeText(EncuestaActivity.this, "Datos enviados", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(EncuestaActivity.this, ResumenActivity.class);
                    i.putExtra("Resultado", rb1.getText().toString());
                    i.putExtra("Lenguaje2", cb2.getText().toString());
                    i.putExtra("aplicacion", et.getText().toString());
                    i.putExtra("UserConnected", userconected.getText().toString());
                    i.putExtra("Pago", PagoTotal.getText().toString());
                    i.putExtra("Nombre", tv.getText().toString());
                  //  i.putExtra("Centro", et.getText().toString());
                    startActivity(i);

                } else if (rb2.isChecked() || cb1.isChecked()) {
                    Toast.makeText(EncuestaActivity.this, "Datos enviados", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(EncuestaActivity.this, ResumenActivity.class);
                    i.putExtra("Resultado2", rb2.getText().toString());
                    i.putExtra("Lenguaje", cb1.getText().toString());
                    i.putExtra("aplicacion", et.getText().toString());
                    i.putExtra("UserConnected", userconected.getText().toString());
                    i.putExtra("Pago", PagoTotal.getText().toString());
                    i.putExtra("Nombre", tv.getText().toString());
                 //   i.putExtra("Centro", et.getText().toString());
                    startActivity(i);

                } else if (rb2.isChecked() || cb2.isChecked()) {
                    Toast.makeText(EncuestaActivity.this, "Datos enviados", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(EncuestaActivity.this, ResumenActivity.class);
                    i.putExtra("Resultado2", rb2.getText().toString());
                    i.putExtra("Lenguaje2", cb2.getText().toString());
                    i.putExtra("aplicacion", et.getText().toString());
                    i.putExtra("UserConnected", userconected.getText().toString());
                    i.putExtra("Pago", PagoTotal.getText().toString());
                    i.putExtra("Nombre", tv.getText().toString());
                   // i.putExtra("Centro", et.getText().toString());
                    startActivity(i);
                }
            }
        });

    }
}

