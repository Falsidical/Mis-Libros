package com.fvt.mislibros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static{
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrar_categorias(View view){
        Intent intent = new Intent(this, Mostrar_Lista.class);
        intent.putExtra("accion", 0);
        startActivity(intent);
    }

    public void mostrar_favoritos(View view){
        Intent intent = new Intent(this, Mostrar_Lista.class);
        intent.putExtra("accion", 1);
        startActivity(intent);
    }
}
