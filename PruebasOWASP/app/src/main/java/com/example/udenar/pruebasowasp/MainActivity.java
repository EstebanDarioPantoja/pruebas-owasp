package com.example.udenar.pruebasowasp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void owasp(View view) {
        AlertDialog.Builder uBuilder2 = new AlertDialog.Builder(MainActivity.this);
        View aView2 = getLayoutInflater().inflate(R.layout.owasp, null);
        uBuilder2.setView(aView2);
        final AlertDialog dialog2 = uBuilder2.create();
        dialog2.show();
        Button close = (Button) aView2.findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.cancel();
            }
        });
    }
    public void pruebas(View view) {
        Intent i = new Intent(this, pruebas.class );
        startActivity(i);
    }

    public void acerca(View view) {
        AlertDialog.Builder uBuilder2 = new AlertDialog.Builder(MainActivity.this);
        View aView2 = getLayoutInflater().inflate(R.layout.ade, null);
        uBuilder2.setView(aView2);
        final AlertDialog dialog2 = uBuilder2.create();
        dialog2.show();
        Button close = (Button) aView2.findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog2.cancel();
            }
        });
    }
    }


