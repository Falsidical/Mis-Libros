package com.fvt.mislibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Mostrar_Lista extends AppCompatActivity {

    ArrayList<String> categorias = new ArrayList<>();
    ArrayList<String> nombre_libros = new ArrayList<>();
    ArrayList<Integer> id_libros = new ArrayList<>();
    public final static int ACTUALIZAR_FAVORITOS_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar__lista);

        TextView TVtitulo = findViewById(R.id.titulo);
        ListView listView = findViewById(R.id.listView);

        Helper helper = new Helper(this, "MiBase", null, 2);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Categorias;", null);
        if (c.moveToFirst()) {
            do {
                String Categoria = c.getString(1);
                categorias.add(Categoria);
            } while (c.moveToNext());
        }c.close();

        Intent intent = getIntent();
        int accion = intent.getIntExtra("accion", -1);

        switch (accion){
            case 0:
                TVtitulo.setText("Categorias");

                ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categorias);
                listView.setAdapter(arrayAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(getApplicationContext(), Mostrar_Lista.class);
                        intent.putExtra("accion", 2);
                        intent.putExtra("categoria", i);
                        startActivity(intent);
                    }
                });
                break;

            case 1:
                TVtitulo.setText("Favoritos");

                c = db.rawQuery("SELECT * FROM Libro WHERE Favorito = 1;", null);
                if (c.moveToFirst()) {
                    do {
                        int id_libro = c.getInt(0);
                        String titulo = c.getString(1);
                        nombre_libros.add(titulo);
                        id_libros.add(id_libro);
                    } while (c.moveToNext());
                }c.close();

                if (nombre_libros.isEmpty()){
                    TVtitulo.setText("Sin Favoritos");
                }else {
                    arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nombre_libros);
                    listView.setAdapter(arrayAdapter);

                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(getApplicationContext(), Mostrar_Libro.class);
                            intent.putExtra("ID_Libro", id_libros.get(i));
                            startActivityForResult(intent, ACTUALIZAR_FAVORITOS_CODE);
                        }
                    });
                }
                break;

            case 2:
                int categoria = intent.getIntExtra("categoria", 0);
                TVtitulo.setText(categorias.get(categoria));
                categoria++;
                c = db.rawQuery("SELECT * FROM Libro L INNER JOIN Libro_Categoria J  ON L.ID_Libro  = J.ID_Libro INNER JOIN Categorias C ON J.ID_Categoria = C.ID_Categoria WHERE C.ID_Categoria = "+categoria+";", null);
                if (c.moveToFirst()) {
                    do {
                        int id_libro = c.getInt(0);
                        String titulo = c.getString(1);
                        id_libros.add(id_libro);
                        nombre_libros.add(titulo);
                    } while (c.moveToNext());
                }c.close();

                arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nombre_libros);
                listView.setAdapter(arrayAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(getApplicationContext(), Mostrar_Libro.class);
                        intent.putExtra("ID_Libro", id_libros.get(i));
                        startActivity(intent);
                    }
                });

                break;

            case -1:
            default:
                //Algo terrible ha sucedido
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ACTUALIZAR_FAVORITOS_CODE) {
            if (resultCode == RESULT_OK) {
                String result=data.getStringExtra("actualizarFavoritos");
                if (result.equalsIgnoreCase("si")){
                    Intent intent = new Intent(this, Mostrar_Lista.class);
                    intent.putExtra("accion", 1);
                    startActivity(intent);
                    finish();
                }
            }
        }
    }
}