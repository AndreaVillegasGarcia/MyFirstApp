package com.example.myfirstapp;

///Prueba GitHub
/////PRUEBA
////PRUEBA 2
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Esto es la relación entre la parte gráfica y la parte lógica
        numero1 = (EditText)findViewById(R.id.num1);
        numero2 = (EditText)findViewById(R.id.num2);
        resultado = (TextView)findViewById(R.id.resultado);
        rb1 = (RadioButton)findViewById(R.id.rdButton1);
        rb2 = (RadioButton)findViewById(R.id.rdButton2);
    }

    public void calcular (View view){
        //Cuando pones getText no te lo devuelve de tipo string, entonces primero lo conviertes a String y después a int para poderlo sumar
        int valor1 = Integer.parseInt(numero1.getText().toString());
        int valor2 = Integer.parseInt(numero2.getText().toString());
        int result = 0;
        if(rb1.isChecked() == true){
            result = valor1 + valor2;
        }
        else if (rb2.isChecked() == true){
            result = valor1 - valor2;
        }

        //Como no podemos mandar un numero a la vista, lo parseamos a String
        String valor = String.valueOf(result);
        //Podemos combinar las dos ultimas lineas en String suma = String.valueOf(valor1 + valor2);

        //Esto es un comentario para hacer el segundo commit
        resultado.setText(valor);
    }
}
