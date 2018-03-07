package com.omarmurcia.perimetrosyareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rCuadro, rTriangulo, rCirculo, rCubo;
    EditText eRadio, eBase, eAltura, eLado, eArea, eCub, ePerimetro;
    Button bCalcular;
    LinearLayout lLa, lRad, lBas, lAlt, lAr, lVol, lPer;
    int selector = 1;
    String num, numm;
    Double Resultado, Resultadoo, Resultadooo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadro = findViewById(R.id.rCuadro);
        rTriangulo = findViewById(R.id.rTriangulo);
        rCirculo = findViewById(R.id.rCirculo);
        rCubo = findViewById(R.id.rCubo);
        eRadio = findViewById(R.id.eRadio);
        eBase = findViewById(R.id.eBase);
        eAltura = findViewById(R.id.eAltura);
        eLado = findViewById(R.id.eLado);
        eArea = findViewById(R.id.eArea);
        ePerimetro = findViewById(R.id.ePerimetro);
        eCub = findViewById(R.id.eCub);
        bCalcular = findViewById(R.id.bCalcular);
        lLa = findViewById(R.id.lLa);
        lRad = findViewById(R.id.lRad);
        lBas = findViewById(R.id.lBas);
        lAlt = findViewById(R.id.lAlt);
        lAr = findViewById(R.id.lAr);
        lVol = findViewById(R.id.lVol);
        lPer = findViewById(R.id.lPer);


        lRad.setVisibility(View.INVISIBLE);
        lBas.setVisibility(View.INVISIBLE);
        lAlt.setVisibility(View.INVISIBLE);
        lAr.setVisibility(View.INVISIBLE);
        lVol.setVisibility(View.INVISIBLE);
        lPer.setVisibility(View.INVISIBLE);
    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.rCuadro:
                lRad.setVisibility(View.INVISIBLE);
                lBas.setVisibility(View.INVISIBLE);
                lAlt.setVisibility(View.INVISIBLE);
                lAr.setVisibility(View.INVISIBLE);
                lVol.setVisibility(View.INVISIBLE);
                lPer.setVisibility(View.INVISIBLE);
                lLa.setVisibility(View.VISIBLE);
                selector = 1;
                eLado.setText("");
                break;
            case R.id.rCirculo:
                lRad.setVisibility(View.VISIBLE);
                lBas.setVisibility(View.INVISIBLE);
                lAlt.setVisibility(View.INVISIBLE);
                lAr.setVisibility(View.INVISIBLE);
                lVol.setVisibility(View.INVISIBLE);
                lPer.setVisibility(View.INVISIBLE);
                lLa.setVisibility(View.INVISIBLE);
                selector = 2;
                eRadio.setText("");
                break;
            case R.id.rTriangulo:
                lRad.setVisibility(View.INVISIBLE);
                lBas.setVisibility(View.VISIBLE);
                lAlt.setVisibility(View.VISIBLE);
                lAr.setVisibility(View.INVISIBLE);
                lVol.setVisibility(View.INVISIBLE);
                lPer.setVisibility(View.INVISIBLE);
                lLa.setVisibility(View.INVISIBLE);
                selector = 3;
                eAltura.setText("");
                eBase.setText("");
                break;
            case R.id.rCubo:
                lRad.setVisibility(View.INVISIBLE);
                lBas.setVisibility(View.INVISIBLE);
                lAlt.setVisibility(View.INVISIBLE);
                lAr.setVisibility(View.INVISIBLE);
                lVol.setVisibility(View.INVISIBLE);
                lPer.setVisibility(View.INVISIBLE);
                lLa.setVisibility(View.VISIBLE);
                selector = 4;
                eLado.setText("");
                break;
        }


    }

    public void Calcular(View view) {
        if (selector == 1){
            if(eLado.getText().toString().isEmpty()) {
                Toast.makeText(this,"Ingrese el valor del Lado",Toast.LENGTH_SHORT).show();
            }else{
                lAr.setVisibility(View.VISIBLE);
                lPer.setVisibility(View.VISIBLE);
                num = eLado.getText().toString();
                Resultado = Double.valueOf(num) * Double.valueOf(num);
                Resultadoo = Double.valueOf(num) * 4;
                eArea.setText(String.format("%.1f", Resultado));
                ePerimetro.setText(String.format("%.1f", Resultadoo));
            }
        }else if (selector == 2){
            if(eRadio.getText().toString().isEmpty()) {
                Toast.makeText(this,"Ingrese el valor del Radio",Toast.LENGTH_SHORT).show();
            }else {
                lAr.setVisibility(View.VISIBLE);
                lPer.setVisibility(View.VISIBLE);
                num = eRadio.getText().toString();
                Resultado = Double.valueOf(num) * Double.valueOf(num) * 3.1416;
                Resultadoo = Double.valueOf(num) * 6.2832;
                eArea.setText(String.format("%.1f", Resultado));
                ePerimetro.setText(String.format("%.1f", Resultadoo));
            }
        }else if (selector == 3) {
            if(eBase.getText().toString().isEmpty() || eAltura.getText().toString().isEmpty()) {
                Toast.makeText(this,"Ingrese Todos los valores",Toast.LENGTH_SHORT).show();
            }else {
                lAr.setVisibility(View.VISIBLE);
                lPer.setVisibility(View.VISIBLE);
                num = eBase.getText().toString();
                numm = eAltura.getText().toString();
                Resultado = (Double.valueOf(num) * Double.valueOf(numm)) / 2;
                Resultadoo = Double.valueOf(num) + Double.valueOf(numm) + Math.sqrt(Math.pow(Double.valueOf(num), 2) + Math.pow(Double.valueOf(numm), 2));
                eArea.setText(String.format("%.1f", Resultado));
                ePerimetro.setText(String.format("%.1f", Resultadoo));
            }
        }else{
            if(eLado.getText().toString().isEmpty()) {
                Toast.makeText(this,"Ingrese el valor del lado",Toast.LENGTH_SHORT).show();
            }else {
                lAr.setVisibility(View.VISIBLE);
                lPer.setVisibility(View.VISIBLE);
                lVol.setVisibility(View.VISIBLE);
                num = eLado.getText().toString();
                Resultado = Double.valueOf(num) * Double.valueOf(num);
                Resultadoo = 4 * Double.valueOf(num);
                Resultadooo = Double.valueOf(num) * Double.valueOf(num) * Double.valueOf(num);
                eArea.setText(String.format("%.1f", Resultado));
                ePerimetro.setText(String.format("%.1f", Resultadoo));
                eCub.setText(String.format("%.1f", Resultadooo));
            }
        }
    }

}
