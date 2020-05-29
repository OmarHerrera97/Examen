package com.uisrael.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumenActivity extends AppCompatActivity {
    TextView resultado, usuario2, check1, Aplicacion,PagoTolal,Nombre;

    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        resultado = findViewById(R.id.tvRespuesta);
        check1 = findViewById(R.id.tvRespuestacheck);
        PagoTolal = findViewById(R.id.tvPagoTottal3);

        dato = getIntent().getExtras();
        Nombre = findViewById(R.id.textView9);
        String nombre = dato.getString("Nombre");
        Nombre.setText(nombre);
        usuario2 = findViewById(R.id.tvConectado2);
        Aplicacion = findViewById(R.id.tcAplicacion);
        String app = dato.getString("aplicacion");
        Aplicacion.setText(app);
        String pagototal = dato.getString("Pago");
        PagoTolal.setText(pagototal);
        String respuesta = dato.getString("Resultado");
        resultado.setText(respuesta);
        String respuesta2 = dato.getString("Resultado2");
        resultado.setText(respuesta2);
        String usuarioc = dato.getString("UserConnected");
        usuario2.setText(usuarioc);
        String check = dato.getString("Lenguaje");
        check1.setText(check);
        String check2 = dato.getString("Lenguaje2");
        check1.setText(check2);

        if (dato.containsKey("Resultado") && dato.containsKey("Lenguaje") ) {
            resultado.setText("Aprenderas otro idioma ? " + dato.getString("Resultado"));
            check1.setText("Practicas algun deporte: " + dato.getString("Lenguaje"));
        } else if (dato.containsKey("Resultado") && dato.containsKey("Lenguaje2")) {
            resultado.setText("Aprenderas otro idioma ? " + dato.getString("Resultado"));
            check1.setText("Practicas algun deporte: " + dato.getString("Lenguaje2"));
        } else if (dato.containsKey("Resultado2") && dato.containsKey("Lenguaje")) {
            resultado.setText("Aprenderas otro idioma ? " + dato.getString("Resultado2"));
            check1.setText("Practicas algun deporte" + dato.getString("Lenguaje"));
        } else if (dato.containsKey("Resultado2") && dato.containsKey("Lenguaje2")) {
            resultado.setText("Aprenderas otro idioma ? " + dato.getString("Resultado2"));
            check1.setText("Practicas algun deporte " + dato.getString("Lenguaje2"));
        }

    }
}
