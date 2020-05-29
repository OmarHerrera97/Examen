package com.uisrael.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class RegistroActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    TextView tv1,tv2;
    DecimalFormat df = new DecimalFormat("#.00");
    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        et1 = findViewById(R.id.etOmar);
        et2 = findViewById(R.id.etPago);
        et3 = findViewById(R.id.tvMonto);
        tv2 = findViewById(R.id.tvPagoTottal3);
        tv1 = findViewById(R.id.tvUserConnected);
        dato = getIntent().getExtras();
        String UserConnected = dato.getString("UserConnected");
        tv1.setText(UserConnected);
    }

    public void Save(View v) {
        Toast.makeText(getApplicationContext(), "Elementos guardados con exito", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(RegistroActivity.this, EncuestaActivity.class);
        i.putExtra("usuarioEnviado", tv1.getText().toString());
        i.putExtra("Pago", tv2.getText().toString());
        i.putExtra("Nombre", et1.getText().toString());
        startActivity(i);
    }

    public void Calculate(View v) {
        float Monto, Resultado,Pago,Iva,Mensual,PagoTotal;
        Monto = Float.parseFloat(et3.getText().toString());
        Resultado = (float) (1800 - Monto);
        Pago =  (Resultado / 3);
        Iva = (float) (Pago * 0.05);
        Mensual = Pago + Iva;
        PagoTotal = (Mensual * 3)+Monto;
        tv2.setText("Pago total del curso: "+df.format(PagoTotal));
        et2.setText("Su pago mensual es : $"+df.format(Mensual));
    }
}
