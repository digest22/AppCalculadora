package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btnSoma;
    public Button btnSubt;
    public Button btnMult;
    public Button btnLimp;
    public EditText edTxt1;
    public EditText edTxt2;
    public TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSoma = (Button) findViewById(R.id.buttonSoma);
        btnSubt = (Button) findViewById(R.id.buttonSubtracao);
        btnMult = (Button) findViewById(R.id.buttonMultiplicacao);
        btnLimp = (Button) findViewById(R.id.buttonLimpar);
        edTxt1 = (EditText) findViewById(R.id.editTextNum1);
        edTxt2 = (EditText) findViewById(R.id.editTextNum2);
        txtResult = (TextView) findViewById(R.id.textViewResultado);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double num1 = Double.parseDouble(edTxt1.getText().toString());
                    double num2 = Double.parseDouble(edTxt2.getText().toString());
                    txtResult.setText("Resultado: "+(num1+num2));
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double num1 = Double.parseDouble(edTxt1.getText().toString());
                    double num2 = Double.parseDouble(edTxt2.getText().toString());
                txtResult.setText("Resultado: "+(num1-num2));
                }catch (Exception e){
                    Toast.makeText( MainActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double num1 = Double.parseDouble(edTxt1.getText().toString());
                    double num2 = Double.parseDouble(edTxt2.getText().toString());
                    txtResult.setText("Resultado: "+(num1*num2));
                }catch (Exception e){
                    Toast.makeText( MainActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    edTxt1.setText("");
                    edTxt2.setText("");
                    txtResult.setText("Resultado: ");

                }catch (Exception e){
                    Toast.makeText( MainActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
